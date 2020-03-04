use indogulf;

create table admin
(
adminname varchar(30) primary key,
password varchar(10)
);

insert into admin values('abhishek','1234');

create table user
(
id int(5) primary key auto_increment,
candidatename varchar(30),
qualification varchar(20),
referncename varchar(30),
location varchar(20),
professionalskill varchar(100),
appliedfor varchar(20),
cvfound varchar(10),
experience varchar(30),
contact varchar(10),
emailid varchar(30)
);

create table client
(
id int(5) primary key auto_increment,
companyname varchar(30),
location varchar(20),
typeofjob varchar(100),
salary varchar(20)
);


create table selecteduser
(
id int(5) primary key auto_increment,
candidateid varchar(5),
candidatename varchar(30),
appliedfor varchar(20),
selectedfor varchar(30),
selectedcompany varchar(30),
companylocation varchar(10),
date varchar(50)
);

create table selectforinterview
(
id int(5) primary key auto_increment,
candidateid varchar(5),
candidatename varchar(30)
);