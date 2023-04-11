package com.example.ballsort.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connect {
    private Connection connection;

    public  Connect() {
        try {
            // Реєструємо драйвер
            Class.forName("org.sqlite.JDBC");

            // Задаємо шлях до бази даних
            String url = "jdbc:sqlite:C:/Users/Ваня" +
                    "/IdeaProjects/BallSort" +
                    "/src/main/resources" +
                    "/com/example/ballsort/db/sortballDB.db";

            // Встановлюємо з'єднання
            connection = DriverManager.getConnection(url);

            System.out.println("Connection to SQLite has been established.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("SQLite JDBC driver not found.");
        }
    }


    public Connection getConnection() {
        return connection;
    }

    public void closeConnection() {
        try {
            connection.close();
            System.out.println("Connection to SQLite has been closed.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }


}
