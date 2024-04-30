use qspider ;

show tables;
drop table student ;

set sql_safe_updates = 1 ;

create table student (
sid int(3) not null ,
name  varchar (30)  not null ,
age int (2)  ,
perc  double (5,2) ,
Phno bigint not null ,

constraint siduni unique(sid),
constraint sidpk primary key (sid),
constraint ageuplim check(age <= 90),
constraint agelwlim check(age > 0),
constraint percuplim check(perc <= 100),
constraint perclwlim check(age >= 0),
constraint phnouni unique(phno),
constraint phnolen check (length(phno) = 10 )
);

create table teacher (
tid int(3) not null ,
name  varchar (30)  not null ,
subject varchar(30) not null
);

create table manager as select * from emp where job = 'manager' ;

rename table students to student;

select * from manager ;

insert into student values (101,'aman', null ,87.77,9638521471);
insert into student values (null,'aman',null ,87.77,9638521473);
insert into student values (103,'shyam',102 ,105.00,9638521475);
insert into student values (104,'ram',110 ,115.00,963852151151475);



	delete from student where age is null ;

select*from student ;
