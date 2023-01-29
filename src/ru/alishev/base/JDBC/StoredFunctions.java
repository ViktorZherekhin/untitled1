package ru.alishev.base.JDBC;

import java.sql.*;

public class StoredFunctions {
    private final String url = "jdbc:postgresql://localhost:5433/northwind";
    private final String user = "postgres";
    private final String password = "1";

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
    // call a built-in string function initcap() that capitalizes EACH WORD in a string.
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

    // Call the user-defined stored function in "dvdrental" database
    // We will use the get_film stored function
    // that we developed in the "PL/pgSQL Function That Returns A Table tutorial".
    public void getFilms(String pattern, int releaseYear){
        String sql1 = "SELECT * FROM getfilm (?, ?)";

        try (  Connection conn = this.connect();
                PreparedStatement pstmt = conn.prepareStatement(sql1)) {
            pstmt.setString(1, pattern);
            pstmt.setInt(2, releaseYear);
            ResultSet rs = pstmt.executeQuery();  // вызывает хранимую функцию, или, другими словами
                                                // выполняет запрос, чтобы получить объект класса "ResultSet"
            while (rs.next()) {
                System.out.println(String.format("%s, %d",
                        rs.getString("film title"),
                        rs.getInt("film_release_year")));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
           // throw new RuntimeException(e);
        }
    }


    public static void main(String[] args) {
        StoredFunctions sf1 = new StoredFunctions();
        sf1.connect(); // работает

        // найти фильмы 2006 года, заканчивающиеся на "er".  - НЕ ПРОВЕРИЛ ЕЩЕ
        sf1.getFilms("%er", 2006);

        System.out.println(sf1.properCase("This is the actor list: ")); // работает

    }
}
