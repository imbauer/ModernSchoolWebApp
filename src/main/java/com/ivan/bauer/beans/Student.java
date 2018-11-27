/******************************************************************************
 *  Compilation:  javac Student.java StdIn.java
 *  Execution:    java Student n < students.txt
 *
 *  Read in an integer command-line argument n. Then, read in a list
 *  of n student records from standard input into a Student data type.
 *  Each record consists of four fields, separated by whitespace:
 *      - first name
 *      - last name
 *      - email address
 *      - which section they're in
 *
 *  Then, print out the list of the first N students in sorted order,
 *  according to their section number.
 *
 ******************************************************************************/

package com.ivan.bauer.beans;

// Foreign key student id: holds all of their current courses, completed courses
// Inheritance for person, having profs, undergrads faculty

public class Student {
    private String student_id;     // first name
    private String name;      // last name
    private String fin;     // email address
    private String age;      // section number

    // construct a new student with given fields
    public Student(String student_id, String name, String fin, String age) {
        this.student_id   = student_id;
        this.name    = name;
        this.fin   = fin;
        this.age = age;
    }

    public String getStudent_id() {
        return student_id;
    }

    public String getName() {
        return name;
    }

    public String getFin() {
        return fin;
    }

    public String getAge() {
        return age;
    }

    // return a string representation of the invoking object
    public String toString() {
        return student_id + " " + name + " " + fin + " " + age;
    }
}


