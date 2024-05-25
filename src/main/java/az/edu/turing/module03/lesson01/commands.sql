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
       ('Audi', 'Q8', 2023),
       ('FORD','Mustang',null);

-- ALL SELECET IS HERE
SELECT *FROM cars;

SELECT *
FROM cars
WHERE year > 2010;

SELECT DISTINCT brand
FROM cars;
SELECT brand
FROM cars;

SELECT DISTINCT model
FROM cars;

SELECT *
FROM cars
WHERE year > 2010
  AND brand = 'BMW';

SELECT *
FROM cars
WHERE brand = 'Audi'
  AND year = 2020;


SELECT *
FROM cars
WHERE NOT brand = 'Mercedes';

SELECT *FROM cars
ORDER BY year DESC;

SELECT *FROM cars
WHERE year IS NULL;

SELECT *FROM cars
WHERE year=2020 OR brand='Audi';

SELECT *FROM cars
WHERE year=1999 OR brand='BMW';

SELECT *FROM cars
WHERE NOT brand='BMW';



-- ORDER BY EXAMPLE IS HERE
SELECT *
FROM cars
ORDER BY year;

SELECT *
FROM cars
ORDER BY year DESC;

-- AND OR OPERATOR IS HERE
SELECT *
FROM cars
WHERE model = 'BMW'
  AND year LIKE 2010;

SELECT *
FROM cars
WHERE year > 2010
  AND brand = 'BMW';

SELECT *
FROM cars
WHERE brand = 'Audi'
  AND year = 2020;


-- NEW TABLE IS HERE

CREATE TABLE personTest
(
    person_id      int,
    person_name    varchar(255),
    person_surname varchar(255),
    person_grade   int
);

INSERT INTO personTest

VALUES (1, 'Ali', 'Agasiyev', 85.2),
       (2, 'Vaqif', 'Islamov', 89.4),
       (3, 'Akif', 'Salamov', 77.4),
       (4, 'Semed', 'Agasiyev', 88.3);
-- ALTER TABLE EXAMPLE IS HERE
ALTER TABLE personTest
    ADD COLUMN person_age int;



DROP TABLE personTest;