package com.example.ballsort.da;

import com.example.ballsort.da.entity.User;
import com.example.ballsort.db.Connect;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDao {

    private Connection connection;

    public UserDao(Connection connection) {
        this.connection = connection;
    }
    public static void addUser(User user) throws SQLException {
        String SQL = """
                INSERT INTO users(name, password) 
                VALUES (?,?) 
                """;
        Connect connect = new Connect();
        try (Connection connection = connect.getConnection();
             PreparedStatement statement = connection.prepareStatement(SQL, Statement.RETURN_GENERATED_KEYS)) {
             statement.setString(1, user.getName());
             statement.setString(2, user.getPassword());
             statement.executeUpdate();
             connect.closeConnection();
        }
    }

    public static List<User> getAllUsers() throws SQLException {
        String SQL = """
                SELECT * FROM users
                """;
        Connect connect = new Connect();
        try (Connection connection = connect.getConnection();
            PreparedStatement statement = connection.prepareStatement(SQL, Statement.RETURN_GENERATED_KEYS)) {
            ResultSet rs = statement.executeQuery();
            List<User> users = new ArrayList<>();
            while (rs.next()) {
                users.add(new User( rs.getString("name"), rs.getString("password")));
            }
            connect.closeConnection();
            return users;
        }
    }
}

