package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class postgresTutorial {
    public final String url = "jdbc:postgresql://localhost:5433/northwind";
    public final String user = "postgres";
    public final String password = "1";

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

    public static void main(String[] args) {
        postgresTutorial pgt1 = new postgresTutorial();
        pgt1.connect();

    }
}
