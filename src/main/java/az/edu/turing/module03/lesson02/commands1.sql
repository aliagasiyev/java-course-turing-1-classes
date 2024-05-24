CREATE database lesson02;

CREATE TABLE cars
(
    car_number int,
    car_name   varchar(255),
    car_model  varchar(255),
    car_year   int,
    car_price  int
);

INSERT INTO cars
VALUES (1, 'Audi', 'Q7', 2011, 19500),
       (2, 'BMW', '528', 2011, 28700),
       (3, 'BMW', '535', 2015, 35700),
       (4, 'Mercedes', 'C-250', 2008, 19400),
       (5, null, null, null, null);

-- UPDATE IS HERE
UPDATE cars
SET car_name='Volkswagen',
    car_model='Passat'
WHERE car_number = 2;


UPDATE cars
SET car_price =26900
WHERE car_number = 4;

UPDATE cars
SET car_model ='Q8'
WHERE car_number = 1;

SELECT *
FROM cars
ORDER BY car_number;

--DELETE IS HERE

DELETE
FROM cars
WHERE car_number = 4;

DELETE
FROM cars
WHERE car_name = 'BMW';

SELECT *
FROM cars;

-- MIN AND MAX values is here
DROP TABLE cars;

SELECT MAX(car_price)
FROM cars
WHERE car_name = 'BMW';

SELECT MIN(car_price)
FROM cars;


SELECT COUNT(*)
FROM cars;

SELECT COUNT(car_name)
FROM cars
WHERE car_name = 'BMW';


SELECT AVG(car_price)
FROM cars
WHERE car_year = 2011;

