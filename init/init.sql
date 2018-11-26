CREATE SCHEMA records;
SET search_path TO records;

CREATE TABLE students (
    student_id varchar(50) NOT NULL,
    name varchar(50) NOT NULL,
    fin varchar(50) NOT NULL,
    age varchar(50) NOT NULL,
    PRIMARY KEY(student_id)
);

INSERT INTO students (student_id, name, fin, age) VALUES ('regeheref', 'jared', 'bauer', 'twentytwo');
INSERT INTO students (student_id, name, fin, age) VALUES ('ewtehtrjhd', 'alec', 'softie', 'twentysix');
