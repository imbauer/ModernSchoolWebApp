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


public class Student {
    private String first;     // first name
    private String last;      // last name
    private String email;     // email address
    private int section;      // section number

    // construct a new student with given fields
    public Student(String first, String last, String email, int section) {
        this.first   = first;
        this.last    = last;
        this.email   = email;
        this.section = section;
    }

    // return true if the invoking object's section is less than that of b
    public boolean less(Student b) {
        Student a = this;
        return a.section < b.section;
    }

    // return a string representation of the invoking object
    public String toString() {
        return section + " " + first + " " + last + " " + email;
    }
}


