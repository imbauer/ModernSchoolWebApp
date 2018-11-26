package com.ivan.bauer.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class PostgreSQLdatabase {

    public static Connection postgreSQLConnection() {

        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }

        Connection connection = null;
        Statement stmt = null;
        try {
            connection = DriverManager.getConnection(
                    "jdbc:postgresql://192.168.99.100:5432/postgres", "user",
                    "password");
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }

        return connection;

    }

}
