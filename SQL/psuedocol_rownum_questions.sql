-- waqtd first five records from emp table 
select * from emp where rownum <6 ;

-- Waqd first 7 records
select * from emp where rownum <8 ;

-- Waqtd first 3 records 
select * from emp where rownum <4 ;

-- Waqtd 3rd  record 
select * from (select rownum as colnum ,emp.* from emp) where colnum = 3;

-- Waqd first 5 records
select * from emp where rownum <6 ;

-- waqtd to show all the enteries with their row number 
select rownum, emp.* from emp ;

-- WAQTD 2nd, 4th and 6th record 
select * from (select rownum as colno ,emp.* from emp ) where colno = 2 or colno = 4 or colno = 6;

-- Waqtd last 3 records 
select * from (select rownum as colno ,emp.* from emp ) where colno between (select count(*) from emp)-2 and (select count(*) from emp);

-- Waqtd second last records 
select * from (select rownum as colno ,emp.* from emp ) where colno = (select count(*) from emp)-1 ;

-- Waqtd depart name of 4th records 
select dname from (select rownum as colno ,emp.* ,dept.* from emp,dept where dept.deptno = emp.deptno) where colno = 4 ;

-- Waqtd , ename and dname of 7th records 
select ename,dname,colno from (select rownum as colno ,emp.* ,dept.* from emp,dept where dept.deptno = emp.deptno) where colno = 7 ;

-- Waqtd first half records 
select * from (select rownum as colno ,emp.* from emp ) where colno between 1 and (select count(*) from emp)/2;

-- Waqtd second half records
select * from (select rownum as colno ,emp.* from emp ) where colno between (select count(*) from emp)/2 and  (select count(*) from emp) ;


-- Waqtd 5th max salary 
 select sal from (select rownum as colno ,sal from (select distinct sal from emp order by sal desc )) where colno = 5;

-- Waqtd 3rd min salary 
 select sal from (select rownum as colno ,sal from (select distinct sal from emp order by sal asc )) where colno = 3;

-- Waqtd 3rd hired date
 select hiredate from (select rownum as colno ,hiredate from (select distinct hiredate from emp order by hiredate asc )) where colno = 3;

-- Waqtd 5th last hired date
 select hiredate from (select rownum as colno ,hiredate from (select distinct hiredate from emp order by hiredate desc )) where colno = 5;

-- Waqtd name of emp earning 6th min salary
-- Waqtd name of emp earning 6th min salary
select ename from emp where sal = ( select sal from (select rownum as colno ,sal from (select distinct sal from emp order by sal asc )) where colno = 6);

-- Dept name of an employee earning 4th max salary. 
select dname from emp , dept where emp.deptno = dept.deptno and sal = ( select sal from (select rownum as colno ,sal from (select distinct sal from emp order by sal asc )) where colno = 6);

-- Location of an employee hired 6th
 select loc from emp , dept where dept.deptno = emp.deptno and hiredate = (select hiredate from (select rownum as colno ,hiredate from (select distinct hiredate from emp order by hiredate asc )) where colno = 6);

-- Ename , deptno and dname of employees earning 7th min salary
select ename,dept.deptno, dname from emp ,dept where dept.deptno = emp.deptno and sal = any(select sal from (select rownum as colno , sal from (select distinct sal from emp order by sal asc)) where colno = 7 );


















