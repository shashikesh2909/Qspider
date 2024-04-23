select * from emp e1 , emp e2 where e1.mgr = e2.empno ;
use qspider;
-- Sub join

-- Waqtd emp name and manager name along with manager’s designation if emp name starts with character a and manager is working in dept no 20 
select e1.ename as Emp_Name , e2.ename as Mgr_Name 
from emp e1 , emp e2 
where e1.mgr = e2.empno and e1.ename like 'a%' and e2.deptno = 20 ;
-- ADAMS	SCOTT

-- Waqtd emp name emp hire date manager name  and manager’s hire date after 81 and manager hired in month of april 
select e1.ename as Emp_Name ,e1.hiredate ,  e2.ename as Mgr_Name , e2.hiredate
from emp e1 , emp e2 
where e1.mgr = e2.empno and e1.hiredate > '1982-01-01' and e2.hiredate like '_____04%' ;
-- result : SCOTT	1987-06-28	JONES	1981-04-02

-- Waqtd emp name and manager name if employee is working as clerk and salesman and manager working as  president or analyst
select e1.ename as Emp_Name ,e1.job ,  e2.ename as Mgr_Name , e2.job
from emp e1 , emp e2 
where e1.mgr = e2.empno and e1.job in ('clerk','salesmman') and e2.job in ('president' , 'analyst') ;
-- SMITH	CLERK	FORD	ANALYST   ADAMS	CLERK	SCOTT	ANALYST

-- Waqtd empname and manager name if emp name has 4 character and mananger name has 4 character
select e1.ename as Emp_Name , e2.ename as Mgr_Name
from emp e1 , emp e2 
where e1.mgr = e2.empno and e1.ename like '____' and e2.ename like '____' ;
-- 0 row selected

-- Waqtd manager name and employee name if emp name starts with vowel and manager’s name has third last character as vowel 
select e1.ename as Emp_Name , e2.ename as Mgr_Name
from emp e1 , emp e2 
where e1.mgr = e2.empno and (e1.ename like 'a%' or e1.ename like 'e%' or e1.ename like 'i%'or e1.ename like 'o%'or e1.ename like 'u%') and (e2.ename like '%a__' or e2.ename like '%e__' or e2.ename like '%i__' or e2.ename like '%o__' or e2.ename like '%u__') ; 
-- ALLEN	BLAKE   ADAMS	SCOTT

-- Waqtd emp name and manager name if employee in not in 81 and manager hired in year 81
select e1.ename as Emp_Name , e1.hiredate , e2.ename as Mgr_Name , e2.hiredate
from emp e1 , emp e2 
where e1.mgr = e2.empno and e1.hiredate not like '%81%' and e2.hiredate like '%81%' ;
-- SMITH	1980-12-17	FORD	1981-12-03  SCOTT	1987-06-28	JONES	1981-04-02 MILLER	1982-01-23	CLARK	1981-06-09

-- Waqtd emp name , emp hiredate manager name manager hiredate if emp is hired in the month of jan feb or march and manager hired in the month of october , nov or dec
select e1.ename as Emp_Name , e1.hiredate , e2.ename as Mgr_Name , e2.hiredate
from emp e1 , emp e2 
where e1.mgr = e2.empno and (e1.hiredate like '_____01%' or e1.hiredate like '_____02%' or e1.hiredate like '_____03%') and (e2.hiredate like '_____10%' or e2.hiredate like '_____11%' or e2.hiredate like '_____12%') ; 
-- 0 row selected

-- Waqtd emp name and mgr name along with sal if emp is earning more than his managers
select e1.ename as Emp_Name , e1.sal , e2.ename as Mgr_Name , e2.sal
from emp e1 , emp e2 
where e1.mgr = e2.empno and e1.sal > e2.sal ; 
-- SCOTT	3000	JONES	2975  FORD	3000	JONES	2975

-- Waqtd emp name and manager name if emp is earning more than 1000 but less than 2000 and manager earning more than 2000 but less than 3000 and manager’s designation is manager.
select e1.ename as Emp_Name , e1.sal , e2.ename as Mgr_Name , e2.sal , e2.job
from emp e1 , emp e2 
where e1.mgr = e2.empno and e1.sal between 1000 and 2000 and e2.sal between 2000 and 3000 and e2.job = 'manager' ;
-- Result : ALLEN	1600	BLAKE	2850	MANAGER --  WARD	1250	BLAKE	2850	MANAGER -- MARTIN	1250	BLAKE	2850	MANAGER -- TURNER	1500	BLAKE	2850	MANAGER -- TURNER	1500	BLAKE	2850	MANAGER  MILLER	1300	CLARK	2450	MANAGER

-- Waqtd emp name , emp loc, mgr name and mgr loc of employees working as clerk 
select e1.name , e1.loc , e2.name , e2.loc
from emp e1, emp e2 , dept d1 , dept d2
where e1.mgr = e2.empno ;

-- waqtd emp name and mgr name if emp is working in same designation as that of miller and mgr hired before miller
select e1.ename as Emp_Name , e2.ename as Mgr_name
from emp e1, emp e2
where e1.mgr = e2.empno and e1.job = (select job from emp where ename = 'miller') and e2.hiredate <  (select hiredate from emp where ename = 'miller');

-- wqtd emp name, mgr name if emp is hired after miller and mgr is works in same designation as that of ford 
select e1.ename as Emp_Name , e2.ename as Mgr_name
from emp e1, emp e2
where e1.mgr = e2.empno and e2.job = (select job from emp where ename = 'ford') and e2.hiredate >  (select hiredate from emp where ename = 'miller');

-- waqtd emp name, mgr name if emp is working in same dept as that of king and manager is working in same designation as that of jones
select e1.ename as Emp_Name , e2.ename as Mgr_name
from emp e1, emp e2
where e1.mgr = e2.empno and e1.deptno = (select deptno from emp where ename = 'king') and e2.job =  (select job from emp where ename = 'jones');

-- waqtd emp name and mgr name if emp is earning more than allen and mgr is earning less than king
select e1.ename as Emp_Name , e2.ename as Mgr_name
from emp e1, emp e2
where e1.mgr = e2.empno and e1.sal > (select sal from emp where ename = 'allen') and e2.sal <  (select sal from emp where ename = 'king');

-- waqtd emp name and mgr name if emp is hired in the year of 81 and mgr hired after miller 
select e1.ename as Emp_Name , e2.ename as Mgr_name
from emp e1, emp e2
where e1.mgr = e2.empno and e1.hiredate like '%81%' and e2.hiredate > (select hiredate from emp where ename = 'miller');

-- Waqtd emp name and mgr name if ename has more than 4 characters and mgr name has less than 6 characters 
select e1.ename as Emp_Name , e2.ename as Mgr_name
from emp e1, emp e2
where e1.mgr = e2.empno and length(e1.ename) > 4  and length(e2.ename) < 6;

-- Waqtd emp name , emp loc, mgr name and mgr loc of employees working as clerk 
select e1.ename , d1.loc , e2.ename , d2.loc
from emp e1, emp e2 , dept d1 , dept d2 
where e1.mgr = e2.empno and e1.deptno = d1.deptno and e2.deptno = d2.deptno and e1.job = 'clerk' ;

-- Waqtd emp name , mgr name emp loc , mgr loc if emp is earning more than smith in chicago and or new york and working in same designation as that of adams and mgr is working in same designation as that of jones in sales department.
select e1.ename , d1.loc , e2.ename , d2.loc
from emp e1, emp e2 , dept d1 , dept d2 
where e1.mgr = e2.empno and e1.deptno = d1.deptno and e2.deptno = d2.deptno and 
e1.sal > (select sal from emp where ename = 'smith') and d1.loc in ( 'chicago' ,'new york') 
and e1.job = (Select job from emp where ename = 'adams') 
and e2.job = (select job from emp where ename = 'jones') and d2.dname = 'sales' ;

-- Waqtd emp name , mgr name, along with their department name if emp is hired before miller and after smith , emp is earning more than james in dallas or new york and manager has second character as vowel and hired after allen in research , sales , operation department 
select e1.ename , d1.dname , e2.ename , d2.dname
from emp e1, emp e2 , dept d1 , dept d2 
where e1.mgr = e2.empno and e1.deptno = d1.deptno and e2.deptno = d2.deptno and
e1.hiredate < (select hiredate from emp where ename = 'miller') and  e1.hiredate > (select hiredate from emp where ename = 'smith') and
e1.sal > (Select  sal from emp where ename = 'james') and
d1.loc in ('new york' , 'dallas') and
substr(e2.ename ,2,1) in ('a','e','i','o','u') and 
e2.hiredate > (select hiredate from emp where ename = 'allen') and
d2.dname in ('research' , 'sales' , 'operation') ;

-- waqtd ename , mgr name and mgr's mgr name 
select e1.ename as Employee, e2.ename as Emp_mgr , e3.ename as Mgr_mgr
from emp e1 , emp e2 , emp e3
where e1.mgr = e2.empno and e2.mgr = e3.empno ;

-- waqtd emp name , mgr name and manager's manager name along with loc 
select e1.ename as Employee, d1.loc , e2.ename as Emp_mgr , d2.loc ,e3.ename as Mgr_mgr , d3.loc
from emp e1 , emp e2 , emp e3 , dept d1 , dept d2, dept d3
where e1.mgr = e2.empno and e2.mgr = e3.empno and e1.deptno = d1.deptno and e2.deptno = d2.deptno and e3.deptno = d3.deptno ;


-- waqtd empname , mgr name, mgr's mgr name along with loc if emp is working in same designation of 'james' amd earning less than miller in chicago or dallas and its manager earning more than 'clark and hired before 'miller' in 'research' or sales department and mgr's mgr is having second char as vowel and earning more than blake in reseach or sales.
select e1.ename as Employee, d1.loc , e2.ename as Emp_mgr , d2.loc ,e3.ename as Mgr_mgr , d3.loc
from emp e1 , emp e2 , emp e3 , dept d1 , dept d2, dept d3
where e1.mgr = e2.empno and e2.mgr = e3.empno and e1.deptno = d1.deptno and e2.deptno = d2.deptno and e3.deptno = d3.deptno
and e1.job = (select job from emp where ename = 'james') 
and e1.sal < (select sal from emp where ename = 'miller')
and d1.loc in ('chicago' , 'dallas')
and e2.sal > (select sal from emp where ename = 'clark')
and e2.hiredate < (select hiredate from emp where ename = 'miller')
and d2.dname in ('sales', 'research')
and substr(e3.ename,2,1) in ('a','e','i','o','u')
and e3.sal > (select sal from emp where ename = 'blake')
and d3.dname in ('research','sales') ;
