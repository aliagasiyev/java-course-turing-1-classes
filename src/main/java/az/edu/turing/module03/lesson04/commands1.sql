CREATE TABLE Customers(
    customer_id int,
    customer_name varchar(255)
);
insert into Customers (customer_id, customer_name)
values (1,'Ahmet'),
       (2,'Mehmet'),
       (3,'Ayse');

CREATE TABLE Orders(
    order_id int,
    customer_id int,
    product varchar(255)
    );
INSERT INTO Orders (order_id, customer_id, product)
VALUES
    (101, 1, 'Telefon'),
    (102, 2, 'Tablet'),
    (103, 1, 'Laptop');



-- NEW TABLE INNER JOIN
CREATE TABLE istifadeciler(
    istifadeci_id int,
    istifadeci_adi varchar
);
INSERT INTO istifadeciler
VALUES (1,'Ali'),
       (2,'Vaqif'),
       (3,'Sadiq'),
       (4,'Tofiq');


CREATE TABLE sifarisler(
    sifarisin_id int,
    istifadeci_id int,
    sifarisin_adi varchar(255)
);

INSERT INTO sifarisler
VALUES(100,1,'Apple Iphone Case'),
      (101,4,'AXE'),
      (103,2,'Asus Rog G15'),
      (104,2,'Engilsh Grammar Book');


SELECT * FROM istifadeciler;
--INNER JOIN sifarisler ON istifadeciler.istifadeci_id=sifarisler.istifadeci_id;

    DROP table istifadeciler;
DROP TABLE sifarisler;



--NEW TABLE LEFT JOIN

CREATE TABLE employee(
    empolyee_id int,
    name varchar(255),
    department_id int
);
INSERT INTO employee
VALUES (1,'Ali',101),
       (2,'Vaqif',102),
       (3,'Asif',103),
       (4,'Tofiq',null);

CREATE TABLE departments(
    department_id int,
    name varchar(255)
);

INSERT INTO departments
VALUES (101,'HR'),
       (102,'Finance'),
       (103,'Marketing');

SELECT  employee.name, departments.name
FROM employee
LEFT JOIN departments ON employee.department_id=departments.department_id;

SELECT employee.name, departments.name
FROM employee
RIGHT JOIN departments ON employee.department_id=departments.department_id














