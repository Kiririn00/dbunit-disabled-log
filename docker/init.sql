DROP DATABASE IF EXISTS MyDataBase;
CREATE DATABASE MyDataBase;

USE MyDataBase;

DROP TABLE IF EXISTS custommer;

create table customer
(
    id int auto_increment,
    name varchar(100) not null,
    age int not null,
    address varchar(200) null,
    constraint customer_pk primary key (id)
);

insert into
    customer (name, age, address)
VALUES
('TestUserName1', 19, 'TestUserAddress1'),
('TestUserName2', 19, 'TestUserAddress2'),
('TestUserName3', 32, 'TestUserAddress3'),
('TestUserName4', 41, 'TestUserAddress4');