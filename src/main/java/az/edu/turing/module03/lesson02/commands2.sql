CREATE database lesson02;

CREATE TABLE employees
(
    EmployeeID int,
    FirstName  varchar(255),
    LastName   varchar(255),
    JobTitle   varchar(255),
    Salary     int,
    Department varchar

);

INSERT INTO employees
VALUES (1, 'John', 'Doe', 'Analyst', 45000, 'HR'),
       (2, 'Jane', 'Smith', 'Manager', 60000, 'IT'),
       (3, 'Emily', 'Johnson', 'Analyst', 47000, 'HR'),
       (4, 'Michael', 'Brown', 'Developer', 55000, 'IT'),
       (5, 'Sarah', 'Davis', 'Analyst', 48000, 'HR');

DROP TABLE employees;
--1
SELECT *
FROM employees
WHERE Department IS NULL;
--2
UPDATE employees
SET Salary=70000
WHERE Department = 'IT';
--3
UPDATE employees
SET JobTitle='Senior Analyst'
WHERE EmployeeID = 1;
--4
DELETE
FROM employees
WHERE Salary < 46000;
--5
DELETE
FROM employees
WHERE EmployeeID = 4;
--6
SELECT *
FROM employees
LIMIT 2;
--7
SELECT COUNT(*)
FROM employees;
--8
SELECT AVG(Salary)
FROM employees;
--9
SELECT MIN(Salary)
FROM employees;
--10
SELECT MAX(Salary)
FROM employees;
--11
SELECT COUNT(Department)
FROM employees
WHERE Department = 'HR';

--13
--SELECT COUNT(JobTitle)
--FROM employees

--14
SELECT SUM(Salary)
FROM employees;

--15
SELECT SUM(Salary)
FROM employees
WHERE Department = 'IT';

--16
SELECT AVG(Salary)
FROM employees
WHERE Department = 'HR';
--17
SELECT AVG(Salary)
FROM employees
WHERE Department = 'IT';
--18
SELECT *
FROM employees
WHERE FirstName LIKE 'J%';
--19
SELECT *
FROM employees
WHERE LastName LIKE '%son%';

SELECT
FROM employees
WHERE Department IN ('HR','IT');

SELECT FirstName  employer_name
FROM employees;

SELECT * FROM employees;