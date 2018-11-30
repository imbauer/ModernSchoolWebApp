package com.ivan.bauer.service;

import com.ivan.bauer.model.Department;
import com.ivan.bauer.model.Student;
import com.ivan.bauer.dao.PostgreSQLdatabase;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConfirmRecords {

    static PostgreSQLdatabase conn = new PostgreSQLdatabase();
    static Connection connection = conn.postgreSQLConnection();

    public static Student confirmStudent(String student_id) {

        String strSelect = "SELECT * FROM postgres.records.students where student_id = " + "'" + student_id + "'";

        try {
            Statement stmt = connection.createStatement();
            ResultSet rset = stmt.executeQuery(strSelect);
            while(rset.next()) {   // Move the cursor to the next row, return false if no more row
                Student student = new Student(
                        rset.getString("student_id"),
                        rset.getString("name"),
                        rset.getString("fin"),
                        rset.getString("age")
                );
                return student;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
        return null;
    }

    public static Department confirmDepartment(String dept_no) {
        String strSelect = "SELECT * FROM postgres.records.departments where dept_no = " + "'" + dept_no + "'";
        try {
            Statement stmt = connection.createStatement();
            ResultSet rset = stmt.executeQuery(strSelect);
            while(rset.next()) {   // Move the cursor to the next row, return false if no more row
                Department department = new Department(
                        rset.getString("dept_no"),
                        rset.getString("dept_name")
                );
                return department;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
        return null;
    }

}
