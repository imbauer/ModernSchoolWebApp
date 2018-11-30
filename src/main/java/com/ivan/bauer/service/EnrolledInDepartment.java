package com.ivan.bauer.service;

import com.ivan.bauer.dao.PostgreSQLdatabase;
import com.ivan.bauer.model.EnrolledDepartment;
import org.springframework.web.bind.annotation.PathVariable;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class EnrolledInDepartment {

    static PostgreSQLdatabase conn = new PostgreSQLdatabase();
    static Connection connection = conn.postgreSQLConnection();

    public static ArrayList<EnrolledDepartment> listEnrolled(@PathVariable("dept_no") String dept_no) {

        String strSelect = "SELECT * FROM postgres.records.department_enrollment where dept_no = " + "'" + dept_no + "'";

        ArrayList<EnrolledDepartment> enrolled = new ArrayList<>();

        try {
            Statement stmt = connection.createStatement();
            ResultSet rset = stmt.executeQuery(strSelect);

            while(rset.next()) {   // Move the cursor to the next row, return false if no more row
                EnrolledDepartment enrolledstudent = new EnrolledDepartment(
                        rset.getString("dept_no"),
                        rset.getString("student_id"),
                        rset.getString("from_date")
                );
                enrolled.add(enrolledstudent);
            }

            return enrolled;

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

}
