use qspider ;


-- Q Waqtd Names of employee who are earning more than ford
Select ename from emp where sal > (select sal from emp where ename = 'ford');

-- Waqtd details of an employee who are earning more than jones
Select * from emp where sal > (select sal from emp where ename = 'jones');

-- Waqtd details of an employee who are earning same salary as that of scott
Select * from emp where sal =  (select sal from emp where ename = 'scott');

-- waqtd details of an employee earning less than james
Select * from emp where sal <  (select sal from emp where ename = 'james');

-- Waqtd details of an empoyee hired after miller
Select * from emp where hiredate >  (select hiredate from emp where ename = 'miller');

-- Waqtd details of an employee hired before allen
Select * from emp where hiredate <  (select hiredate from emp where ename = 'allen');

-- Waqtd number of employees working in same designation as that of martin
Select count(*) from emp where job = (select job from emp where ename = 'martin');

-- Waqtd maximum sal given to the employee working in same designation as that of blake
Select max(sal) from emp where job = (select job from emp where ename = 'blake');

-- Waqtd number of employees working in adams designation 
Select count(*) from emp where job = (select job from emp where ename = 'adams');

-- Waqtd number of employees working in smith’s department
Select count(*) from emp where deptno = (select deptno from emp where ename = 'smith');

-- Waqtd minimum salary in king’s department
Select min(sal) from emp where deptno = (select deptno from emp where ename = 'king');

-- Waqtd name of an employee earning the commision more than ward
select ename from emp where comm > (select comm from emp where ename = 'ward');

-- Waqtd details of an employee working as a manager in smith’s department 
select ename from emp where job = 'manager' and deptno = (select deptno from emp where ename = 'smith');

-- Waqtd details of an employee earning more than 2500 in millers departmet 
select ename from emp where sal > 2500 and deptno = (select deptno from emp where ename = 'miller');

-- Waqtd details of an employee earning more than 1000 in adams designation
select ename from emp where sal > 1000 and job = (select job from emp where ename = 'adams');

-- Waqtd details of an employee hired after 81 in king’s department
select * from emp where hiredate >='1982-01-01' and deptno = (select deptno from emp where ename = 'king');

-- Waqtd details of an employee working in smith’s department excluding the employees hired in year 81
select * from emp where hiredate not like'%81%' and deptno = (select deptno from emp where ename = 'smith');

-- Waqtd details of an employee hired in month of december in scott’s department 
select * from emp where hiredate like'____-12%' and deptno = (select deptno from emp where ename = 'scott');

-- Waqtd details of an employee having character A in miller’s designation
select * from emp where ename like '%a%' and job = (select job from emp where ename = 'miller');

-- Waqtd name of an employee earning maximum salary 
select ename from emp where sal =  (select max(sal) from emp ) ;

-- Waqtd name of an employee earning minium salary 
select ename from emp where sal =  (select min(sal) from emp ) ;

-- Waqtd name of an employee hired first 
select ename from emp where hiredate =  (select min(hiredate) from emp ) ;

-- Waqtd name of an employee hired last
select ename from emp where hiredate =  (select max(hiredate) from emp ) ;

-- Waqtd hired after 81 but before scott
select ename from emp where hiredate >='1982-01-01' and hiredate < (select hiredate from emp where ename = 'scott') ;

-- Waqtd earning more than blake and less than ford 
select ename from emp where sal > (select sal from emp where ename = 'blake') and sal < (select sal from emp where ename = 'ford');

-- Waqtd names of an employee hired after miller before adams
select ename from emp where hiredate > (select hiredate from emp where ename = 'miller') and hiredate < (select hiredate from emp where ename = 'adams');

-- Waqtd earning more than blake in miller's department
select ename from emp where sal > (select sal from emp where ename = 'blake') and deptno = (select deptno from emp where ename = 'miller');

-- Waqtd details of an employee working in same designation as that of smith in martin's department 
select * from emp where job = (select job from emp where ename = 'smith') and deptno = (select deptno from emp where ename = 'martin');

-- Waqtd details of an employee earning more than james in scott’s department 
select * from emp where sal > (select sal from emp where ename = 'james') and deptno = (select deptno from emp where ename = 'scott');

-- waqtd details of an employee earning more than martin in smith’s designation 
select * from emp where sal > (select sal from emp where ename = 'martin') and job = (select job from emp where ename = 'smith');

-- Waqtd details of an employee hired after james in kings department 
select * from emp where hiredate > (select hiredate from emp where ename = 'james') and deptno = (select deptno from emp where ename = 'king');

-- Waqtd details of an employee earning more than smith in same designation as that of james in scott’s department
select * from emp where sal > (select sal from emp where ename = 'smith') and job = (select job from emp where ename = 'james') and  deptno = (select deptno from emp where ename = 'scott');

-- Waqtd details of an employee hired before miller but after smith  in scott’s department 
select * from emp where hiredate < (select hiredate from emp where ename = 'miller') and hiredate > (select hiredate from emp where ename = 'smith') and deptno = (select deptno from emp where ename = 'scott');

-- Waqtd details of an employee earning less than miller and hired before adams and working in same designation as that of jame in jones department 
select * from emp where sal < (select sal from emp where ename = 'miller') and hiredate < (select hiredate from emp where ename = 'adams') and deptno = (select deptno from emp where ename = 'jones') and job = (select job from emp where ename = 'james');

-- Waqtd the maximum salary in employee table 
select max(Sal) from emp;

-- Waqrd second max salary in employee table
select max(sal) from emp where sal != (select max(sal)from emp) ;

-- Waqtd min salary in employee table
select min(sal)m from emp ;

-- Waqtd 2nd min salary in emp table
select min(sal) from emp where sal != (select min(sal) from emp ) ;

-- Waqtd second last hire date 
select max(hiredate) from emp where hiredate != (select max(hiredate) from emp ) ;

-- Waqtd name of employee earning 2nd maximum salary 
select ename from emp where sal = (Select max(sal) from emp where sal < (select max(sal) from emp));

-- Waqtd name of employee earning 2nd minimum salary 
select ename from emp where sal = (Select min(sal) from emp where sal > (select min(sal) from emp));

-- Waqrd third max salary in employee table
select max(Sal) from emp where sal < (select max(sal) from emp where sal < (select max(sal)from emp) );

-- waqtd name of an employee earning 3rd minimum salary
select ename from emp where sal = (select min(sal) from emp where sal > (select min(sal) from emp where sal > (select min(sal) from emp))) ;

-- waqtd name of an employee hired 3rd 
select ename from emp where hiredate = (select min(hiredate) from emp where hiredate > (select min(hiredate) from emp where hiredate > (select min(hiredate) from emp))) ;

-- waqtd hired 3rd last
select ename from emp where hiredate = (select max(hiredate) from emp where hiredate < (select max(hiredate) from emp where hiredate < (select max(hiredate) from emp))) ;

-- waqtd name of an employee earning 5th min salary 
select ename from emp where sal = (select min(sal) from emp where sal > (select min(sal) from emp where sal > (select min(sal) from emp where sal > (select min(sal) from emp where sal > (select min(sal) from emp))))) ;

select ename, sal from emp order by sal asc ; 


-- mgr emp relation sub queries ------------------------------

-- Waqtd name of smith’s manager
select ename from emp where empno = (Select mgr from emp where ename = 'smith');

-- Waqtd designation of adam’s manager
select job from emp where empno = (Select mgr from emp where ename = 'adams');

-- Waqtd location of ford’s manager
select loc from dept where deptno = (select deptno from emp where empno = (Select mgr from emp where ename = 'ford'));

-- Waqtd name of martin’s manager’s manager 
select ename from emp where empno = (select mgr from emp where empno = (select mgr from emp where ename = 'martin'));

-- Waqtd dept name of miller’s manager’s manager
select dname from dept where deptno = (Select deptno from emp where empno = (select mgr from emp where empno = (select mgr from emp where ename = 'martin')));

-- Waqtd names of employee reporting to king
select ename from emp where mgr = (select empno from emp where ename = 'king') ;

-- Waqtd number of employee reporting to blake
select count(*) from emp where mgr = (select empno from emp where ename = 'blake') ;

-- Waqtd details of an employee who are earning more than all the managers 
select * from emp where sal > (select sal from emp where sal = (select max(sal) from emp where job = 'manager'));

-- Waqtd name of an employee hired after all the analyst 
select ename from emp where hiredate > all (select hiredate from emp where job = 'analyst');

-- Waqtd details of an employee earning less than any of the salesman
select * from emp where sal < any (select sal from emp where job = 'salesman');

-- Waqtd details of an employee hired before all the sales man
select * from emp where hiredate < all (select hiredate from emp where job = 'salesman');
























select * from emp ;