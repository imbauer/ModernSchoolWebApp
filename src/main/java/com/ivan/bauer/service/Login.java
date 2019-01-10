package com.ivan.bauer.service;

import com.ivan.bauer.model.Student;
import com.ivan.bauer.dao.PostgreSQLdatabase;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Login {

    static PostgreSQLdatabase conn = new PostgreSQLdatabase();
    static Connection connection = conn.postgreSQLConnection();

    public static Student login(Student student) {
        String strSelect = "SELECT * FROM postgres.records.students WHERE name = '"+student.getName()+"' AND fin = '"+student.getFin()+"';";

        try {
            Statement stmt = connection.createStatement();
            ResultSet rset = stmt.executeQuery(strSelect);
            while(rset.next()) {   // Move the cursor to the next row, return false if no more row
                Student returnStudent = new Student(
                        rset.getString("student_id"),
                        rset.getString("name"),
                        rset.getString("fin"),
                        rset.getString("age")
                );
                return returnStudent;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
        return null;
    }




}