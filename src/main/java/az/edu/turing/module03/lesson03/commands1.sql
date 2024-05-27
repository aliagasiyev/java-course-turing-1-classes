CREATE TABLE users(
    id BIGSERIAL,
    username varchar(50),
    email varchar
);
INSERT INTO users (username, email) VALUES ('john_doe', 'john@example.com');
INSERT INTO users (username, email) VALUES ('jane_doe', 'jane@example.com');

SELECT *FROM users;

DROP TABLE users;