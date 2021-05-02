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
    ('ルーク・スカイウォーカー', 19, 'タトゥイーン'),
    ('レイア・オーガナ', 19, 'オルデラン'),
    ('ハン・ソロ', 32, 'コレリア'),
    ('ダース・ベイダー', 41, 'タトゥイーン');