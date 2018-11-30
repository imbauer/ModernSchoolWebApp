package com.ivan.bauer.model;

public class Department {

    private String dept_no;     // first name
    private String dept_name;      // last name

    // construct a new student with given fields
    public Department(String dept_no, String dept_name) {
        this.dept_no   = dept_no;
        this.dept_name    = dept_name;
    }

    public String getDept_no() {
        return dept_no;
    }

    public String getDept_name() {
        return dept_name;
    }

    // return a string representation of the invoking object
    public String toString() {
        return dept_no + " " + dept_name;
    }

}
