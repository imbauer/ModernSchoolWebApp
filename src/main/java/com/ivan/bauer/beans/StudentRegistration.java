package com.ivan.bauer.beans;

import com.ivan.bauer.dao.PostgreSQLdatabase;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class StudentRegistration {


    static PostgreSQLdatabase conn = new PostgreSQLdatabase();
    static Connection connection = conn.postgreSQLConnection();

    public static void register(Student student) {

        String SQLregistration = "INSERT INTO postgres.records.students (student_id, name, fin, age) VALUES ('"+student.getStudent_id()+"', '"+student.getName()+"', '"+student.getFin()+"', '"+student.getAge()+"');";
//                "VALUES ('001418765', 'Ivan', 'Bauer', 22);";
        try {
            Statement stmt = connection.createStatement();
            stmt.executeUpdate(SQLregistration);


        } catch (SQLException e) {
            e.printStackTrace();
        }



    }

}