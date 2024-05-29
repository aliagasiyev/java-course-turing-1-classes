CREATE TABLE Customers
(
    CustomerID   INT,
    CustomerName VARCHAR(255),
    Country      VARCHAR(255)
);

INSERT INTO Customers (CustomerID, CustomerName, Country)
VALUES (1, 'John Doe', 'USA'),
       (2, 'Jane Smith', 'UK'),
       (3, 'Max Brown', 'Canada'),
       (4, 'Emily Davis', 'Australia'),
       (5, 'Lucas White', 'USA');

CREATE TABLE Orders
(
    OrderID    INT PRIMARY KEY,
    OrderDate  DATE,
    CustomerID INT,
    Amount     DECIMAL(10, 2)
);
INSERT INTO Orders (OrderID, OrderDate, CustomerID, Amount)
VALUES (101, '2023-05-01', 1, 150.00),
       (102, '2023-05-03', 2, 200.00),
       (103, '2023-05-05', 1, 300.00),
       (104, '2023-05-07', 3, 400.00),
       (105, '2023-05-09', 5, 500.00);

--SELECT Customers.CustomerID, Customers.CustomerName, Orders.OrderID, Orders.OrderDate, Orders.Amount
--FROM Customers
-- JOIN Orders ON Customers.CustomerID=Orders.CustomerID;

--SELECT Customers.CustomerID, Customers.CustomerName, Orders.OrderID, Orders.OrderDate, Orders.Amount
--FROM Customers
--LEFT JOIN Orders ON Customers.CustomerID=Orders.CustomerID;

SELECT Customers.CustomerID, Customers.CustomerName, Orders.OrderID, Orders.OrderDate, Orders.Amount
FROM Customers
INNER JOIN Orders ON Customers.CustomerID=Orders.CustomerID
WHERE Customers.Country='USA';

