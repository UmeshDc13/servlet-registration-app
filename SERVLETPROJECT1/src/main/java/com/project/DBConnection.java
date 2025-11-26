package com.project;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    private static final String URL  =
            "jdbc:mysql://localhost:3306/userdb?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC";
    private static final String USER = "root";      // change if needed
    private static final String PASS = "sql123";    // <- your MySQL password

    public static Connection getConnection() throws Exception {

        // Load driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        // Create and return connection
        return DriverManager.getConnection(URL, USER, PASS);
    }
}
