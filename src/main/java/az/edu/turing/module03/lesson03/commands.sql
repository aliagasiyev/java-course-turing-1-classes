CREATE DATABASE lesson03;

CREATE TABLE students
(
    id bigserial not null unique,
    name      varchar(255) not null check ( name!= ' ' ),
    create_at timestamp default now(),
    is_female boolean   default true,
    pin       varchar(7) unique,
    age int check ( age>=16 )
);

drop table students;

select *
from students;

-- new lesson test is here



