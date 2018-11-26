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
    public ArrayList<String> getUniqueResults() {

        String strSelect = "SELECT firstname, surname, age FROM postgres.records.customers";
        PostgreSQLdatabase conn = new PostgreSQLdatabase();
        Connection connection = conn.postgreSQLConnection();

        ArrayList<String> records = new ArrayList<>();

        try {
            Statement stmt = connection.createStatement();
            ResultSet rset = stmt.executeQuery(strSelect);
            
            int rowCount = 0;
            while(rset.next()) {   // Move the cursor to the next row, return false if no more row
                String firstname = rset.getString("firstname");
                String surname = rset.getString("surname");
                int age = rset.getInt("age");
                records.add(firstname + ", " + surname + ", " + age);
                ++rowCount;
            }

            return records;

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

}


