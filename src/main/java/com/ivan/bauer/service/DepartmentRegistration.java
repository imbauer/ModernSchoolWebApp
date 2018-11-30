package com.ivan.bauer.service;

import com.ivan.bauer.model.Department;
import com.ivan.bauer.model.Student;
import com.ivan.bauer.dao.PostgreSQLdatabase;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DepartmentRegistration {

    static PostgreSQLdatabase conn = new PostgreSQLdatabase();
    static Connection connection = conn.postgreSQLConnection();

    public static void enroll(Department department, Student student, String date) {

        String SQLregistration = "INSERT INTO postgres.records.department_enrollment (dept_no, student_id, from_date) VALUES ('"+department.getDept_no()+"', '"+student.getStudent_id()+"', '"+date+"');";
        try {
            Statement stmt = connection.createStatement();
            stmt.executeUpdate(SQLregistration);
        } catch (
        SQLException e) {
            e.printStackTrace();
        }
    }

}
