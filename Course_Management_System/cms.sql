drop database cms;
create database cms;

use cms;

create table student(name varchar(20), email varchar(20), srn varchar(20), phone varchar(15),  course varchar(10), branch varchar(20));

create table teacher(name varchar(20), empid int, email varchar(20), phone varchar(15),  course varchar(10), branch varchar(20));

create table course(courseid int, coursename varchar(20));

create table teaches(empid int, courseid int);

create table is_student(srn varchar(20), courseid int);

create table notes(courseid int, notes varchar(10000));

create table assignment(courseid int, title varchar(20), assignment varchar(10000));


create table courseinfo(courseid int, info varchar(10000));

create table marks(courseid int, srn varchar(20), grade char(1));

create table homework(courseid int, submission varchar(10000));

