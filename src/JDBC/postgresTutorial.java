package JDBC;

import java.sql.*;

public class postgresTutorial {
    public final String url = "jdbc:postgresql://localhost:5433/northwind";
    public final String user = "postgres";
    public final String password = "1";

    // Connect To PostgreSQL Database
    public Connection connect(){
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to Postgresql server successfully!");
        } catch (SQLException e) {
            System.out.println("Connection failed!");
            System.out.println(e.getMessage());
        }
        return conn;
    }

/*    public Connection connect() throws SQLException {             // альтернативный способ задания этого метода
        return DriverManager.getConnection(url, user, password);
    }*/

    // Call PostgreSQL Stored Function
    // call a built-in string function initcap() that capitalizes each word in a string.
    public String properCase(String s){
        String result = s;
        try
                (Connection conn = this.connect();
                 CallableStatement properCase = conn.prepareCall( "{? = call initcap(?)}" ))
        {
            properCase.registerOutParameter(1, Types.VARCHAR);
            properCase.setString(2, s);
            properCase.execute();
            result = properCase.getString(1);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }
        return result;
    }



    public static void main(String[] args) {
        postgresTutorial pgt1 = new postgresTutorial();
        pgt1.connect();
        System.out.println(pgt1.properCase("This is the actor list: "));

    }
}
