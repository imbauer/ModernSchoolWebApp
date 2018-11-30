package com.ivan.bauer.service;

import com.ivan.bauer.model.Student;
import com.ivan.bauer.dao.PostgreSQLdatabase;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentRegistration {

    static PostgreSQLdatabase conn = new PostgreSQLdatabase();
    static Connection connection = conn.postgreSQLConnection();

    public static void register(Student student) {
        String SQLregistration = "INSERT INTO postgres.records.students (student_id, name, fin, age) VALUES ('"+student.getStudent_id()+"', '"+student.getName()+"', '"+student.getFin()+"', '"+student.getAge()+"');";
        try {
            Statement stmt = connection.createStatement();
            stmt.executeUpdate(SQLregistration);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}