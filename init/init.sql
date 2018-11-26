CREATE SCHEMA records;
SET search_path TO records;

CREATE TABLE customers (
    customer_id UUID NOT NULL,
    firstname   varchar(50) NOT NULL,
    surname     varchar(100) NOT NULL,
    age         integer NOT NULL,
    PRIMARY KEY(customer_id)
);

INSERT INTO customers (customer_id, firstname, surname, age) VALUES ('57d71b05-0829-41ff-816a-280f7e496649', 'Archie', 'Jab', 19);
INSERT INTO customers (customer_id, firstname, surname, age) VALUES ('69052d83-aa19-4b83-84f3-ce452b4bce91', 'Jake', 'Lays', 33);
