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

CREATE TABLE grades (
    gpa varchar(50) NOT NULL,
    student_id varchar(50) NOT NULL,
    FOREIGN KEY (student_id) REFERENCES students (student_id) ON DELETE CASCADE,
    PRIMARY KEY (student_id)
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
INSERT INTO students (student_id, name, fin, age) VALUES ('243785674', 'Ryan', 'Ferguson', '20');
INSERT INTO students (student_id, name, fin, age) VALUES ('243758654', 'Carl', 'Martin', '21');
INSERT INTO students (student_id, name, fin, age) VALUES ('768574637', 'Lyndon', 'Hall', '22');
INSERT INTO students (student_id, name, fin, age) VALUES ('435865435', 'Antony', 'Cunningham', '23');
INSERT INTO students (student_id, name, fin, age) VALUES ('236473263', 'Rubie', 'Smith', '20');
INSERT INTO students (student_id, name, fin, age) VALUES ('236784326', 'Tony', 'Hayes', '20');

INSERT INTO grades (gpa, student_id) VALUES ('86', '001415473');
INSERT INTO grades (gpa, student_id) VALUES ('64', '001420596');
INSERT INTO grades (gpa, student_id) VALUES ('45', '001413956');
INSERT INTO grades (gpa, student_id) VALUES ('90', '743940289');
INSERT INTO grades (gpa, student_id) VALUES ('95', '173628475');
INSERT INTO grades (gpa, student_id) VALUES ('65', '019474638');
INSERT INTO grades (gpa, student_id) VALUES ('56', '373628940');
INSERT INTO grades (gpa, student_id) VALUES ('87', '235254264');
INSERT INTO grades (gpa, student_id) VALUES ('75', '765854333');
INSERT INTO grades (gpa, student_id) VALUES ('57', '745654637');
INSERT INTO grades (gpa, student_id) VALUES ('97', '253456477');
INSERT INTO grades (gpa, student_id) VALUES ('69', '985746375');
INSERT INTO grades (gpa, student_id) VALUES ('62', '465685684');
INSERT INTO grades (gpa, student_id) VALUES ('71', '347854378');
INSERT INTO grades (gpa, student_id) VALUES ('54', '156782562');
INSERT INTO grades (gpa, student_id) VALUES ('68', '684367532');
INSERT INTO grades (gpa, student_id) VALUES ('51', '127745625');
INSERT INTO grades (gpa, student_id) VALUES ('88', '243726432');
INSERT INTO grades (gpa, student_id) VALUES ('50', '167321564');
INSERT INTO grades (gpa, student_id) VALUES ('76', '123625673');
INSERT INTO grades (gpa, student_id) VALUES ('66', '135647815');
INSERT INTO grades (gpa, student_id) VALUES ('78', '126437354');
INSERT INTO grades (gpa, student_id) VALUES ('80', '156754326');
INSERT INTO grades (gpa, student_id) VALUES ('42', '152364753');
INSERT INTO grades (gpa, student_id) VALUES ('55', '123647585');
INSERT INTO grades (gpa, student_id) VALUES ('81', '765843573');
INSERT INTO grades (gpa, student_id) VALUES ('83', '864535647');
INSERT INTO grades (gpa, student_id) VALUES ('86', '243785674');
INSERT INTO grades (gpa, student_id) VALUES ('87', '243758654');
INSERT INTO grades (gpa, student_id) VALUES ('88', '768574637');
INSERT INTO grades (gpa, student_id) VALUES ('53', '435865435');
INSERT INTO grades (gpa, student_id) VALUES ('77', '236473263');
INSERT INTO grades (gpa, student_id) VALUES ('59', '236784326');

INSERT INTO departments (dept_no, dept_name) VALUES ('101', 'Software Engineering');
INSERT INTO departments (dept_no, dept_name) VALUES ('121', 'Computer Science');
INSERT INTO departments (dept_no, dept_name) VALUES ('45', 'Business');
INSERT INTO departments (dept_no, dept_name) VALUES ('30', 'Kinesiology');
INSERT INTO departments (dept_no, dept_name) VALUES ('55', 'Philosophy');

INSERT INTO department_enrollment (dept_no, student_id, from_date) VALUES ('45', '001420596', 'September 2010');
INSERT INTO department_enrollment (dept_no, student_id, from_date) VALUES ('30', '001415473', 'September 2012');
INSERT INTO department_enrollment (dept_no, student_id, from_date) VALUES ('45', '001413956', 'September 2014');

INSERT INTO department_enrollment (dept_no, student_id, from_date) VALUES ('101', '743940289', 'September 2011');
INSERT INTO department_enrollment (dept_no, student_id, from_date) VALUES ('101', '173628475', 'September 2009');
INSERT INTO department_enrollment (dept_no, student_id, from_date) VALUES ('101', '019474638', 'September 2010');
INSERT INTO department_enrollment (dept_no, student_id, from_date) VALUES ('101', '373628940', 'September 2010');
INSERT INTO department_enrollment (dept_no, student_id, from_date) VALUES ('101', '235254264', 'September 2010');
INSERT INTO department_enrollment (dept_no, student_id, from_date) VALUES ('101', '765854333', 'September 2010');
INSERT INTO department_enrollment (dept_no, student_id, from_date) VALUES ('101', '745654637', 'September 2010');
INSERT INTO department_enrollment (dept_no, student_id, from_date) VALUES ('101', '253456477', 'September 2010');
INSERT INTO department_enrollment (dept_no, student_id, from_date) VALUES ('101', '985746375', 'September 2010');
INSERT INTO department_enrollment (dept_no, student_id, from_date) VALUES ('101', '465685684', 'September 2008');
INSERT INTO department_enrollment (dept_no, student_id, from_date) VALUES ('101', '347854378', 'September 2013');
INSERT INTO department_enrollment (dept_no, student_id, from_date) VALUES ('101', '156782562', 'September 2014');
INSERT INTO department_enrollment (dept_no, student_id, from_date) VALUES ('121', '684367532', 'September 2012');
INSERT INTO department_enrollment (dept_no, student_id, from_date) VALUES ('121', '127745625', 'September 2011');
INSERT INTO department_enrollment (dept_no, student_id, from_date) VALUES ('121', '243726432', 'September 2014');
INSERT INTO department_enrollment (dept_no, student_id, from_date) VALUES ('121', '167321564', 'September 2013');
INSERT INTO department_enrollment (dept_no, student_id, from_date) VALUES ('121', '123625673', 'September 2010');
INSERT INTO department_enrollment (dept_no, student_id, from_date) VALUES ('45', '135647815', 'September 2010');
INSERT INTO department_enrollment (dept_no, student_id, from_date) VALUES ('45', '126437354', 'September 2010');
INSERT INTO department_enrollment (dept_no, student_id, from_date) VALUES ('45', '156754326', 'September 2011');
INSERT INTO department_enrollment (dept_no, student_id, from_date) VALUES ('45', '152364753', 'September 2010');
INSERT INTO department_enrollment (dept_no, student_id, from_date) VALUES ('45', '123647585', 'September 2009');
INSERT INTO department_enrollment (dept_no, student_id, from_date) VALUES ('45', '765843573', 'September 2010');
INSERT INTO department_enrollment (dept_no, student_id, from_date) VALUES ('45', '864535647', 'September 2010');
INSERT INTO department_enrollment (dept_no, student_id, from_date) VALUES ('30', '243785674', 'September 2012');
INSERT INTO department_enrollment (dept_no, student_id, from_date) VALUES ('30', '243758654', 'September 2010');
INSERT INTO department_enrollment (dept_no, student_id, from_date) VALUES ('30', '768574637', 'September 2013');
INSERT INTO department_enrollment (dept_no, student_id, from_date) VALUES ('30', '435865435', 'September 2010');
INSERT INTO department_enrollment (dept_no, student_id, from_date) VALUES ('55', '236473263', 'September 2010');
INSERT INTO department_enrollment (dept_no, student_id, from_date) VALUES ('55', '236784326', 'September 2010');