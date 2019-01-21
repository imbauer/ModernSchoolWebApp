package com.ivan.bauer.service;

import com.ivan.bauer.dao.PostgreSQLdatabase;
import com.ivan.bauer.model.Student;
import com.ivan.bauer.model.StudentWithGrade;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class EnrolledInUniversity {

    static PostgreSQLdatabase conn = new PostgreSQLdatabase();
    static Connection connection = conn.postgreSQLConnection();

    public ArrayList<StudentWithGrade> getStudents() {

        String strSelect = "SELECT students.student_id, students.name, students.fin, students.age, grades.gpa " +
                "FROM postgres.records.students " +
                "JOIN postgres.records.grades grades " +
                "ON grades.student_id = students.student_id";

        ArrayList<StudentWithGrade> students = new ArrayList<>();

        try {
            Statement stmt = connection.createStatement();
            ResultSet rset = stmt.executeQuery(strSelect);

            while(rset.next()) {   // Move the cursor to the next row, return false if no more row
                StudentWithGrade student = new StudentWithGrade(
                        rset.getString("student_id"),
                        rset.getString("name"),
                        rset.getString("fin"),
                        rset.getString("age"),
                        rset.getString("gpa")
                );
                students.add(student);
            }

            return students;

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }



    public static ArrayList<StudentWithGrade> getStudentsDept(String dept) {

        String strSelect = "SELECT students.student_id, students.name, students.fin, students.age, grades.gpa " +
                "FROM postgres.records.students students " +
                "JOIN postgres.records.department_enrollment department_enrollment " +
                "ON students.student_id = department_enrollment.student_id " +
                "JOIN postgres.records.departments departments " +
                "ON departments.dept_no = department_enrollment.dept_no " +
                "JOIN postgres.records.grades grades " +
                "ON grades.student_id = students.student_id " +
                "WHERE departments.dept_name = " + "'" + dept + "'";

        ArrayList<StudentWithGrade> students = new ArrayList<>();

        try {
            Statement stmt = connection.createStatement();
            ResultSet rset = stmt.executeQuery(strSelect);

            while(rset.next()) {   // Move the cursor to the next row, return false if no more row
                StudentWithGrade student = new StudentWithGrade(
                        rset.getString("student_id"),
                        rset.getString("name"),
                        rset.getString("fin"),
                        rset.getString("age"),
                        rset.getString("gpa")
                );
                students.add(student);
            }

            return students;

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

}
