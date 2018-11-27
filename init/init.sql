CREATE SCHEMA records;
SET search_path TO records;

CREATE TABLE students (
    student_id varchar(50) NOT NULL,
    name varchar(50) NOT NULL,
    fin varchar(50) NOT NULL,
    age varchar(50) NOT NULL,
    PRIMARY KEY(student_id)
);

CREATE TABLE departments (
    dept_no varchar(50) NOT NULL,
    dept_name varchar(50) NOT NULL,
    PRIMARY KEY (dept_no),
    UNIQUE (dept_name)
);

CREATE TABLE department_enrollment (
    dept_no varchar(50) NOT NULL,
    student_id varchar(50) NOT NULL,
    from_date varchar(50) NOT NULL,
    FOREIGN KEY (student_id) REFERENCES students (student_id) ON DELETE CASCADE,
    FOREIGN KEY (dept_no) REFERENCES departments (dept_no) ON DELETE CASCADE,
    PRIMARY KEY (student_id, dept_no)
);

INSERT INTO students (student_id, name, fin, age) VALUES ('001415473', 'Jared', 'Bauer', '24');
INSERT INTO students (student_id, name, fin, age) VALUES ('001420596', 'Alec', 'Bauer', '26');
INSERT INTO students (student_id, name, fin, age) VALUES ('001413956', 'Daniel', 'Currie', '23');

INSERT INTO departments (dept_no, dept_name) VALUES ('101', 'Software Engineering');
INSERT INTO departments (dept_no, dept_name) VALUES ('20', 'Mathematics');
INSERT INTO departments (dept_no, dept_name) VALUES ('45', 'Sport Science');
INSERT INTO departments (dept_no, dept_name) VALUES ('102', 'Mechanical Engineering');

INSERT INTO department_enrollment (dept_no, student_id, from_date) VALUES ('45', '001420596', 'September 2010');
INSERT INTO department_enrollment (dept_no, student_id, from_date) VALUES ('20', '001415473', 'September 2012');
INSERT INTO department_enrollment (dept_no, student_id, from_date) VALUES ('102', '001413956', 'September 2014');
