package com.ivan.bauer.controllers;

import com.ivan.bauer.beans.EnrolledDepartment;
import com.ivan.bauer.dao.PostgreSQLdatabase;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

@RestController
@EnableAutoConfiguration
public class EnrolledInDepartment {

    @RequestMapping(method = RequestMethod.GET, value="/check/enrolled/{dept_no}")

    @ResponseBody
    public ArrayList<EnrolledDepartment> listEnrolled(@PathVariable("dept_no") String dept_no) {

        String strSelect = "SELECT * FROM postgres.records.department_enrollment where dept_no = " + "'" + dept_no + "'";
        PostgreSQLdatabase conn = new PostgreSQLdatabase();
        Connection connection = conn.postgreSQLConnection();

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
