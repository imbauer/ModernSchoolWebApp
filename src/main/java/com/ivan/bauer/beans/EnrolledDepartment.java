package com.ivan.bauer.beans;

public class EnrolledDepartment {

    private String dept_no;     // first name
    private String student_id;      // last name
    private String from_date;

    // construct a new student with given fields
    public EnrolledDepartment(String dept_no, String student_id, String from_date) {
        this.dept_no   = dept_no;
        this.student_id    = student_id;
        this.from_date = from_date;
    }

    public String getDept_no() {
        return dept_no;
    }

    public String getStudent_id() {
        return student_id;
    }

    public String getFrom_date() {
        return from_date;
    }

    // return a string representation of the invoking object
    public String toString() {
        return dept_no + " " + student_id + " " + from_date;
    }

}
