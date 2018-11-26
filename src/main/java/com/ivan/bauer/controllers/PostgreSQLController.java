package com.ivan.bauer.controllers;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;

import com.ivan.bauer.dao.PostgreSQLdatabase;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

@RestController
@EnableAutoConfiguration
public class PostgreSQLController {

    @RequestMapping(method = RequestMethod.GET, value="/database/records")

    @ResponseBody
    public ArrayList<String> getStudents() {

        String strSelect = "SELECT * FROM postgres.records.students";
        PostgreSQLdatabase conn = new PostgreSQLdatabase();
        Connection connection = conn.postgreSQLConnection();

        ArrayList<String> records = new ArrayList<>();

        try {
            Statement stmt = connection.createStatement();
            ResultSet rset = stmt.executeQuery(strSelect);

            int rowCount = 0;
            while(rset.next()) {   // Move the cursor to the next row, return false if no more row
                String student_id = rset.getString("student_id");
                String name = rset.getString("name");
                String fin = rset.getString("fin");
                String age = rset.getString("age");
                records.add(student_id + ", " + name + ", " + fin + ", " + age);
                ++rowCount;
            }

            return records;

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

}


