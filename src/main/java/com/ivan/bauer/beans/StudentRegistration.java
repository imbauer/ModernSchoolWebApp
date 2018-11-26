package com.ivan.bauer.beans;

import com.ivan.bauer.dao.PostgreSQLdatabase;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class StudentRegistration {

    public static void register(String student_id, String name, String fin, String age) {

        Connection connection = PostgreSQLdatabase.postgreSQLConnection();
        String SQLregistration = "INSERT INTO postgres.records.students (student_id, name, fin, age) VALUES ('"+student_id+"', '"+name+"', '"+fin+"', '"+age+"');";
//                "VALUES ('001418765', 'Ivan', 'Bauer', 22);";
        try {
            Statement stmt = connection.createStatement();
            stmt.executeUpdate(SQLregistration);


        } catch (SQLException e) {
            e.printStackTrace();
        }



    }

}