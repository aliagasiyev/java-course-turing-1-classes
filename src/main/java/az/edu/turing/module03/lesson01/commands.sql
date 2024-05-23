-- Commands:
-- CREATE DATABASE / SCHEMA / TABLE
-- DROP DATABASE / SCHEMA / TABLE
-- ALTER DATABASE / SCHEMA / TABLE
-- SELECT / SELECT DISTINCT / INSERT INTO
CREATE DATABASE lesson01;

CREATE TABLE cars
(
    brand varchar(15),
    model varchar(20),
    year  int
);
INSERT INTO cars
VALUES ('Mercedes', 'C-180', 1999),
       ('Mercedes', 'C-200', 1992),
       ('BMW', '520D', 2010),
       ('BMW', '530i', 2020),
       ('Audi', 'Q7', 2010),
       ('Audi', 'Q8', 2023);

-- ALL SELECET IS HERE
SELECT *
FROM cars;
SELECT model, year
FROM cars;

SELECT *FROM cars
WHERE year > 2010;

SELECT DISTINCT brand FROM cars;
SELECT brand FROM cars;

SELECT DISTINCT model FROM cars;


-- ORDER BY EXAMPLE IS HERE
SELECT * FROM cars
ORDER BY year;

SELECT *FROM cars
ORDER BY year DESC;

-- AND OR OPERATOR IS HERE
SELECT *FROM cars
WHERE model='BMW' AND year LIKE 2010;


-- NEW TABLE IS HERE

CREATE TABLE personTest(
                           person_id int,
                           person_name varchar(255),
                           person_surname varchar(255),
                           person_grade int
);

INSERT INTO personTest

VALUES (1,'Ali','Agasiyev',85.2),
       (2,'Vaqif','Islamov',89.4),
       (3,'Akif','Salamov',77.4),
       (4,'Semed','Agasiyev',88.3);

SELECT *FROM personTest
WHERE person_name='Ali' AND person_surname LIKE 'A%';


