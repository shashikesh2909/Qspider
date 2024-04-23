select * from dept ;
select * from emp ;

-- loc of miller
select loc from dept where deptno = (select deptno from emp where ename = 'miller' ) ;

-- name of emp working in sales department 
select ename from emp where deptno  = (select deptno from dept where dname = 'sales' ) ;

-- details of an employee working in chicage
select ename from emp where deptno  = (select deptno from dept where loc = 'chicago' ) ;

-- Waqtd number of employees working in operations department 
select count(*) from emp where deptno = (select deptno from dept where dname = 'operations');

-- Waqtd names of emp working in newyork
select ename from emp where deptno  = (select deptno from dept where loc = 'new york' ) ;

-- Waqtd location of president
select loc from dept where deptno = (select deptno from emp where job = 'president' );

-- Waqtd the dept name of adams
select dname from dept where deptno = (select deptno from emp where ename = 'adams' );

-- Waqtd dept name of an employee hired in year 1982
select dname from dept where deptno = (select deptno from emp where hiredate like '%82%' );

-- Waqtd the name of an emp working as a manager in newyork 
select ename from emp where job = 'manager' and deptno = (select deptno from dept where loc = 'new york');

-- Waqtd names of an emp earning more than 2000 in research dept
select ename from emp where sal > 2000 and deptno = (select deptno from dept where dname  = 'research');

-- Waqtd the max sal in sales dept
select max(sal) from emp where deptno = (select deptno from dept where dname = 'sales');

-- Waqtd the min sal in newyork
select min(sal) from emp where deptno = (select deptno from dept where loc = 'new york');

-- Waqtd number of emp hired in year 81 in accounting dept
select count(*) from emp where hiredate like '%81%' and deptno = (select deptno from dept where dname = 'accounting');

-- Waqtd name of an emp working in same designation as that of smith in newyork 
select ename from emp where job = (select job from emp where ename = 'smith') and deptno = (Select deptno from dept where loc = 'new york');

-- Waqtd names of an emp earning less than martin in chicago
select ename from emp where sal < (select sal from emp where ename = 'martin') and deptno = (Select deptno from dept where loc = 'chicago');

-- Waqtd number of emp hired after smith but before miller in research department
select count(*) from emp where hiredate > (select hiredate from emp where ename = 'smith') and hiredate < (select hiredate from emp where ename = 'miller') and deptno = (Select deptno from dept where dname = 'research');

-- Waqtd department name of an emp who is earning more than scott
select dname from dept where deptno = (select deptno from emp where sal > (select sal from emp where ename = 'scott'));

-- Waqtd names of an emp hired in month of december and working in same designation as that of miller in chicago 
select ename from emp where hiredate like '_____12%' and job = (select job from emp where ename = 'miller') and deptno = (select deptno from dept where loc = 'chicago');

-- Waqtd names of an emp working in same designation as that of jones and hired before miller and earning less than jones in newyork 
select ename from emp where job = (select job from emp where ename = 'jones') and 
hiredate < (select hiredate from emp where ename = 'miller') and
sal < (select sal from emp where ename = 'jones') and 
deptno = (select deptno from dept where loc = 'new york');
 
 -- Waqtd dept name of an employee earning the max salary 
 select dname from dept where deptno = (select deptno from emp where sal = (select max(sal) from emp ));
 
 -- Waqtd the location of an emp earning second minimum salary
select loc from dept where deptno = (select distinct deptno from emp where sal = (select min(sal) from emp where sal > (select min(sal) from emp))) ;
 
-------------------------------------  Assignment for subqueries ----------------------------------------------------------

-- 1. DISPLAY ALL THE EMPLOYEES WHOSE DEPARTMENT NAMES ENDING 'S'
select ename from emp where deptno in (select deptno from dept where dname like '%s') ;

-- 2. QUERY TO DISPLAY THE EMPLOYEE NAMES WHO IS HAVING MAXIMUM SALARY IN DEPT NAME "ACCOUNTING"
select ename from emp where sal = (select max(sal) from emp where deptno = (select deptno from dept where dname in ('accounting')));

-- 3.QUERY TO DISPLAY THE DEPT NAME WHO IS HAVING HIGHEST COMMISSION
select dname from dept where deptno = (select deptno from emp where comm = (select max(comm) from emp));

-- 4. QUERY TO DISPLAY THE EMPLOYEE NAMES WHOSE DEPARTMENT NAME HAS 2ND CHARACTER AS 'O'
select ename from emp where deptno in (select deptno from dept where dname like '_o%');

-- 5. QUERY TO DISPLAY ALL THE EMPLOYEES WHOSE DEPT NUMBER IS SAME AS SCOTT
select ename from emp where deptno = ( select deptno from emp where ename = 'scott');

-- 6.QUERY TO DISPLAY ALL THE EMPLOYEES IN 'OPERATIONS AND ACCOUNTING' DEPT
select * from emp where deptno in (select deptno from dept where dname in ('OPERATIONS','ACCOUNTING'));

-- 7.LIST THE EMPLOYEES WHO HAS SALARY GREATER THAN MILLER
select * from emp where sal > (select sal from emp where ename = 'miller');

-- 8. LIST DEPARTMENT NAME HAVING AT LEAST 3 SALESMAN
select dname from dept where deptno in (select deptno from emp where job = 'salesman' group by deptno having count(*) > 3) ;

-- 9. DISPLAY THE DNAME OF AN EMPLOYEES WHO HAS NO REPORTING MANAGER.
select dname from dept where deptno in (select deptno from emp where mgr is null) ;

-- 10. LIST ALL THE EMPLOYEES WHO ARE REPORTING TO JONES MANAGER
select ename from emp where mgr = (select mgr from emp where ename = 'jones');

-- 11. LIST EMPLOYEES FROM RESEARCH AND ACCOUNTING HAVING AT LEAST 2 REPORTING
select ename from emp where deptno in (select deptno from dept where dname in ('research','accounting')) and empno in ( select mgr from emp group by mgr having count(*) >= 2 );

-- 12. DISPLAY THE DEPART NAME OF THE EMPLOYEE WHOSE NAME DOES NOT STARTS WITH S AND SALARY BETWEEN 1500 TO 3000.
select dname from dept where deptno = any (select deptno from emp where ename not like 's%' and sal between 1500 and 3000 ) ;

-- 13. DISPLAY LOCATION OF EMPLOYEE WHOSE SALARY IS MINIMUM SALARY BUT SALARY IS GREATER THAN 2000
select loc from dept where deptno = (select deptno from emp where sal = (select min(sal) from emp where sal > 2000));

-- 14.DISPLAY THE LOCATION OF AN EMPLOYEE IN ACCOUNTING DEPARTMENT
select loc from dept where dname = 'accounting' ;

-- 15. DISPLAY THE DEPARTMENT ‘S LOCATION THAT IS HAVING GREATER THAN FOUR EMPLOYEES IN IT.
select loc from dept where deptno in (select deptno from emp group by deptno having count(*) > 4) ;

-- 16. WRITE A QUERY TO DISPLAY ALL THE EMPLOYEE WHOSE JOB NOT SAME AS ALLEN AND SALARY IS GREATER THAN MARTIN
select * from emp where job != (select job from emp where ename = 'allen' ) and sal > (select sal from emp where ename = 'martin');

-- 17. DISPLAY ALL THE EMPLOYEES WHO IS HAVING LOCATION IS SAME AS ADAM'S MANAGER?
select loc from dept where deptno = (select deptno from emp where empno = (select mgr from emp where ename = 'adams'));

-- 18. DISPLAY THE JOB, MANAGER NUMBER OF EMPLOYEES WHO IS WORKING FOR JONES?
select job, mgr from emp where mgr = (select empno from emp where ename = 'jones');

-- 19. DISPLAY THE EMPLOYEE NAMES, HIGHER DATE, COMMISSION OF FORD'S MANAGER?
select ename , hiredate, comm from emp where empno = (select mgr from emp where ename = 'ford');

-- 20. DISPLAY THE NUMBER OF EMPLOYEES WHO ARE GETTING SALARY LESS THAN THE BLAKE'S MANAGER
select count(*) from emp where sal < (select sal from emp where empno = (select mgr from emp where ename = 'blake'));

-- 21. LIST EMPLOYEES WHO LOCATED IN CHICAGO AND THEIR COMMISSION IS ZERO
select ename from emp where deptno in (select deptno from dept where loc = 'chicago') and comm = 0; 

-- 22. LIST EMPLOYEES WHO WORK FOR SALES DEPARTMENT AND THEIR SALARY GREATER THAN AVERAGE SALARY OF THEIR DEPARTMENT.
select ename from emp where deptno in (select deptno from dept where dname = 'sales') and sal > (select avg(sal) from emp);

-- 23. LIST EMPLOYEES WHO ARE WORKING IN RESEARCH DEPARTMENT AND THEY ARE MANAGER.
select ename from emp where deptno in (select deptno from dept where dname = 'research') and job = 'manager' ;

-- 24. DISPLAY DEPARTMENT NAME OF THE EMPLOYEES WHO EARN COMMISSION.
select dname from dept where deptno in (select deptno from emp where comm is not null);

-- 25. DISPLAY DEPARTMENT NAME OF THE EMPLOYEE WHO EARN MAXIMUM SALARY AND HAVE NO REPORTING MANAGER
select dname from dept where deptno in ( select deptno from emp where sal = (select max(sal) from emp) and mgr is null) ;

-- 26.LIST ALL THE DEPT NAME AND LOC OF ALL THE SALESMAN MANAGER MANAGER'S
select loc,dname from dept where deptno = (select deptno from emp where empno = (select mgr from emp where empno = any (select mgr from emp where job = 'salesman'))) ;

-- 27. LIST THE EMPLOYEE DEPT NAME AND LOC OF ALL THE EMPLOYEES WHO ARE CLERK REPORTING TO BLAKE AND SALARY IS LESSER THAN MARTIN SALARY
select dname , loc from dept where deptno in (select deptno from emp where job = 'clerk' and mgr = (select empno from emp where ename = 'blake') and sal < (select sal from emp where ename = 'martin'));

-- 28. DISPLAY LOCATION OF ALL THE EMPLOYEES WHO REPORTING TO BLAKE
 select loc from dept where deptno = any (select deptno from emp where mgr = (select empno from emp where ename = 'blake'));

-- 29. LIST ALL THE EMPLOYEES WHOSE JOB IS SAME AS JONES AND THEIR SALARY LESSER THAN SCOTT
select ename from emp where job = (select job from emp where ename = 'jones') and sal < ( select sal from emp where ename = 'scott');

-- 30. LIST ALL THE EMPLOYEES WHOSE JOB IS SAME AS JONES AND THEIR SALARY LESSER THAN SCOTT
select ename from emp where job = (select job from emp where ename = 'jones') and sal < (select sal from emp where ename = 'scott') ;

-- 31.DISPLAY ALL THE EMPLOYEES OF DEPARTMENT 30, 20 WITH THERE ANUAL SALARY AND HAVING ATLEAST 3 EMPLOYEES
select ename , sal*12 as Annual_Salary from emp where deptno in  (select deptno from emp where deptno in (30,20) group by deptno having count(*) > 2)  ;

-- 32.DISPLAY ALL THE EMPLOYEES WHO ARE EARN LESS THAN ANY OF THE SALESMAN?
select ename , sal from emp where sal < any (select sal from emp where job = 'salesman');

-- 33.DISPLAY ALL THE EMPLOYEES WHO ARE JOINED BEFORE THE LAST PERSON?
select ename from emp where hiredate > ( select min(hiredate) from emp );

-- 34.FIND 3RD MINIMUM SALARY IN THE EMPLOYEE TABLE.
select min(sal) from emp where sal > (select min(sal) from emp where sal > (select min(Sal) from emp)) ;

-- 35.DISPLAY ALL THE EMPLOYEES WHO ARE EARNING MORE THAN ANY OF THE MANAGER.
select * from emp where sal > all ( select sal from emp where job = 'manager' );

-- 36. DISPLAY LOCATION OF EMPLOYEES, WHOSE NAME DOESN'T START WITH A AND SALARY BETWEEN 1000 AND 3000.
select loc from dept where deptno in (select deptno from emp where ename not like 'a%' and sal between 1000 and 3000 ) ;

-- 37. DISPLAY DEPARTMENT NAME OF ALL THE EMPLOYEES WHO ARE REPORTING TO BLAKE.
select dname from dept where deptno in ( select deptno from emp where mgr = (select empno from emp where ename = 'blake')) ;

-- 38. DISPLAY MARTIN'S MANAGER'S MANAGER'S DEPARTMENT NAME AND LOCATION.
select dname , loc from dept where deptno = (select deptno from emp where empno = (select mgr from emp where empno = (select mgr from emp where ename = 'martin')));

-- 39.DISPLAY THE MANAGER NUMBER, JOB AND DEPARTMENT NUMBER FOR THOSE WHO DON'T HAVE COMMISSION IN THE LOCATION CHICAGO OR DALLAS
select mgr , job, deptno from emp where comm is null and deptno in (select deptno from dept where loc in  ('chicago','dallas'));

-- 40.DISPLAY THE EMPLOYEE DETAILS WITH THEIR ANNUAL SALARY WHO EARN MAXIMUM COMMISSION
select *, sal*12 as Annual_Sal from emp where comm = (select max(comm) from emp) ;

-- 41.DISPLAY ALL THE EMPLOYEE WHOSE DEPARTMENT IS SALES AND WHO IS EARNING SOME COMMISSION (I.E COMMISSION IS NOT NULL OR ZERO)AND WHO IS HIRED BEFORE THE LAST PERSON HIRED.
select * from emp where deptno = (select deptno from dept where dname = 'sales') and comm is not null and hiredate > ( select min(hiredate) from emp) ;

-- 42.DISPLAY ALL THE DEPARTMENT NAMES FOR WARD'S MANAGER'S MANAGER 
 select dname from dept where deptno in (select deptno from emp where empno = ( select mgr from emp where empno = (select mgr from emp where ename = 'ward')));

-- 43.DISPLAY DEPARTMENT NAMES OF EMPLOYEE'S WHOSE SALARY IS GREATER THAN AVERAGE SALARY OF ALL THE CLERK'S
select dname from dept where deptno in (select deptno from emp where sal > ( select avg(sal) from emp where job = 'clerk'));

-- 44.DISPLAY THE LAST EMPLOYEE RECORD WITH 25% HIKE IN SALARY.
select ename , sal*0.25+sal as Hike from emp where hiredate = (select max(hiredate) from emp);

-- 45.DISPLAY THE DEPARTMENT NUMBER WHO WORKING IN SALES DEPARTMENT AND THEY ARE MANAGER
select deptno from dept where deptno in (select deptno from emp where job = 'manager') and dname = 'sales';

-- 46.DISPLAY DEPARTMENT NAME OF THE EMPLOYEE WHO EARN MINMUM SALARY AND HAVE REPORTING MANAGER.
select dname from dept where deptno in (select deptno from emp where sal = (select min(sal) from emp) and mgr is not null);

-- 47.DISPLAY HIREDATE AND JOB OF ALL THE EMPLOYEES WORKING FOR SALES
select hiredate , job from emp where deptno in (select deptno from dept where dname = 'sales');

-- 48.DISPLAY THE DNAME OF EMPLOYEES WHOES SALARY IS MAXIMUM SALARY BUT LESSER THAN 3000
select dname from dept where deptno in ( select deptno from emp where sal < 3000 and sal = (select max(sal) from emp));

-- 49.DISPLAY THE NUMBER OF EMPLOYEES WHO WORK FOR RESEARCH DEPT AND THEIR SALARY IS LESSER THAN ONE OF THE SALARY IN DEPARTMENT IN 10.
select count(*) from emp where deptno in (select deptno from dept where dname = 'research') and sal < all (select sal from emp where deptno = 10 );

-- 50.LIST EMPLOYEES FROM RESEARCH AND ACCOUNTING DEPARTMENT HAVING ATLEAST TWO REPORTING
select ename from emp where deptno in (select deptno from dept where dname in ('research' ,'accounting') and empno in (select mgr from emp group by mgr having count(*) > 1)) ;




use qspider ;
select * from dept ;
select * from emp order by deptno ;













