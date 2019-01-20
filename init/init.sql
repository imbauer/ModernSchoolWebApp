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
INSERT INTO students (student_id, name, fin, age) VALUES ('743940289', 'Mike', 'Tucker', '19');
INSERT INTO students (student_id, name, fin, age) VALUES ('173628475', 'Byron', 'Spencer', '18');
INSERT INTO students (student_id, name, fin, age) VALUES ('019474638', 'Alexander', 'Mason', '22');
INSERT INTO students (student_id, name, fin, age) VALUES ('373628940', 'Eleanor', 'Johnson', '21');
INSERT INTO students (student_id, name, fin, age) VALUES ('235254264', 'Frederick', 'Cunningham', '23');
INSERT INTO students (student_id, name, fin, age) VALUES ('765854333', 'Evelyn', 'Sullivan', '24');
INSERT INTO students (student_id, name, fin, age) VALUES ('745654637', 'Amelia', 'Crawford', '25');
INSERT INTO students (student_id, name, fin, age) VALUES ('253456477', 'Vanessa', 'Wells', '27');
INSERT INTO students (student_id, name, fin, age) VALUES ('985746375', 'Rafael', 'Montgomery', '24');
INSERT INTO students (student_id, name, fin, age) VALUES ('465685684', 'Edgar', 'Brooks', '25');
INSERT INTO students (student_id, name, fin, age) VALUES ('347854378', 'Kellan', 'Payne', '24');
INSERT INTO students (student_id, name, fin, age) VALUES ('156782562', 'Maximilian', 'Parker', '26');
INSERT INTO students (student_id, name, fin, age) VALUES ('684367532', 'Victoria', 'Brooks', '21');
INSERT INTO students (student_id, name, fin, age) VALUES ('127745625', 'Audrey', 'Allen', '19');
INSERT INTO students (student_id, name, fin, age) VALUES ('243726432', 'Jordan', 'Carroll', '17');
INSERT INTO students (student_id, name, fin, age) VALUES ('167321564', 'Briony', 'Jones', '18');
INSERT INTO students (student_id, name, fin, age) VALUES ('123625673', 'Oscar', 'Crawford', '19');
INSERT INTO students (student_id, name, fin, age) VALUES ('135647815', 'Chester', 'Craig', '17');
INSERT INTO students (student_id, name, fin, age) VALUES ('126437354', 'Madaline', 'Gray', '22');
INSERT INTO students (student_id, name, fin, age) VALUES ('156754326', 'Lily', 'Edwards', '21');
INSERT INTO students (student_id, name, fin, age) VALUES ('152364753', 'Penelope', 'Cole', '22');
INSERT INTO students (student_id, name, fin, age) VALUES ('123647585', 'Patrick', 'Phillips', '19');
INSERT INTO students (student_id, name, fin, age) VALUES ('765843573', 'Lily', 'Stewart', '18');
INSERT INTO students (student_id, name, fin, age) VALUES ('864535647', 'Max', 'Baker', '18');
INSERT INTO students (student_id, name, fin, age) VALUES ('243785674', 'Ryan', 'Ferguson', '');
INSERT INTO students (student_id, name, fin, age) VALUES ('243758654', 'Carl', 'Martin', '21');
INSERT INTO students (student_id, name, fin, age) VALUES ('768574637', 'Lyndon', 'Hall', '22');
INSERT INTO students (student_id, name, fin, age) VALUES ('435865435', 'Antony', 'Cunningham', '23');
INSERT INTO students (student_id, name, fin, age) VALUES ('236473263', 'Rubie', 'Smith', '20');
INSERT INTO students (student_id, name, fin, age) VALUES ('236784326', 'Tony', 'Hayes', '20');



INSERT INTO departments (dept_no, dept_name) VALUES ('101', 'Software Engineering');
INSERT INTO departments (dept_no, dept_name) VALUES ('20', 'Mathematics');
INSERT INTO departments (dept_no, dept_name) VALUES ('45', 'Sport Science');
INSERT INTO departments (dept_no, dept_name) VALUES ('102', 'Mechanical Engineering');

INSERT INTO department_enrollment (dept_no, student_id, from_date) VALUES ('45', '001420596', 'September 2010');
INSERT INTO department_enrollment (dept_no, student_id, from_date) VALUES ('20', '001415473', 'September 2012');
INSERT INTO department_enrollment (dept_no, student_id, from_date) VALUES ('102', '001413956', 'September 2014');
