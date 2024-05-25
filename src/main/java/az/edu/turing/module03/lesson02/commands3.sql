CREATE TABLE orders
(
    order_id       int,
    customer_id    int,
    order_date     varchar(64),
    delivery_daate varchar(64),
    amount         int
);

INSERT INTO orders
VALUES (101, 1, '2024-01-15', '2024-01-20', 150.00),
       (102, 2, '2024-01-17', NULL, 200.00),
       (103, 3, '2024-01-18', '2024-01-22', 300.00),
       (104, 1, '2024-01-19', '2024-01-25', 250.00);

