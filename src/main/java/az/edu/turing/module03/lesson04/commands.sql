CREATE DATABASE lesson04;
-- FOREIGN KEY
-- Relational database modeling
-- Entity Relationship Diagrams (ERDs)

-- One-to-one
-- One-to-many & many-to-one
-- Many-to-many
-- Joins
-- INNER / LEFT / RIGHT / FULL OUTER
-- Cartesian Products
-- UNION / GROUP BY / HAVING / EXISTS / ANY-ALL
-- Booking app database structure development


DROP TABLE Customers;
DROP TABLE Orders;
-- First  Table is here
CREATE TABLE Customers
(
    CustomerID   int,
    CustomerName varchar(255),
    ContactName  varchar,
    Country      varchar
);

INSERT INTO Customers (CustomerID, CustomerName)
VALUES (1, 'Alfreds Futterkiste'),
       (2, 'Ana Trujillo Emparedados y helados');


CREATE TABLE Orders
(
    OrderID    int,
    CustomerID int,
    OrderDate  date
);

INSERT INTO Orders (OrderID, CustomerID, OrderDate)
VALUES (10308, 2, '2023-04-15'),
       (10309, 1, '2023-04-16'),
       (10310, 1, '2023-04-17');

SELECT Customers.CustomerName, Orders.OrderID, Orders.OrderDate
FROM Customers
 INNER JOIN Orders ON Customers.CustomerID = Orders.CustomerID;

















