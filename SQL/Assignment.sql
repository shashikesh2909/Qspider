use qspider;

select * from emp;

---------- DOC 1 --------------------------------------
-- 1) LIST ALL THE EMPLOYEES WHOSE COMMISSION IS NULL
select * from emp where COMM IS NULL ;

-- 2) LIST ALL THE EMPLOYEES WHO DON’T HAVE A REPORTING MANAGER
select * from emp where mgr is NULL;

-- 3) LIST ALL THE SALESMEN IN DEPT 30
select * from emp where job = 'SALESMAN' and deptno = 30;

-- 4) LIST ALL THE SALESMEN IN DEPT NUMBER 30  AND HAVING SALARY GREATER THAN 1500
select * from emp where job = 'SALESMAN' and deptno = 30 and sal > 1500;

-- 5) LIST ALL THE EMPLOYEES WHOSE NAME STARTS  WITH ‘S’ OR ‘A’
select * from emp where ename like 'S%' or ename like 'A%' ;

-- 6) LIST ALL THE EMPLOYEES EXCEPT THOSE WHO  ARE WORKING IN DEPT 10 & 20. 
select * from emp where deptno not in (10,20) ;

-- 7) LIST THE EMPLOYEES WHOSE NAME DOES NOT  START WITH ‘S’
select * from emp where ename not like 'S%' ;

-- 8) LIST ALL THE EMPLOYEES WHO ARE HAVING  REPORTING MANAGERS IN DEPT 10
select * from emp where deptno = 10 and mgr is not NULL ;

-- 9) LIST ALL THE EMPLOYEES WHOSE COMMISSION  IS NULL AND WORKING AS CLERK
select * from emp where comm is NULL and job = 'CLERK';

-- 10) LIST ALL THE EMPLOYEES WHO DON’T HAVE A  REPORTING MANAGER IN DEPTNO 10 OR 30
select * from emp where mgr is NULL and deptno in (10,30);

-- 11) LIST ALL THE SALESMEN IN DEPT 30 WITH SAL  MORE THAN 2450
select * from emp where job = 'SALESMAN'and deptno = 30 and sal > 2450 ;

-- 12) LIST ALL THE ANALYST IN DEPT NUMBER 20 AND HAVING SALARY GREATER THAN 2500
select * from emp where job = 'ANALYST'and deptno = 20 and sal > 2500 ;

-- 13) LIST ALL THE EMPLOYEES WHOSE NAME  STARTS WITH ‘M’ OR ‘J’
select * from emp where ename like 'M%' or ename like 'J%' ;

-- 14) LIST ALL THE EMPLOYEES WITH ANNUAL  SALARY EXCEPT THOSE WHO ARE WORKING IN  DEPT 30 
select *,sal *12 from emp where deptno not in (30);

-- 15) LIST THE EMPLOYEES WHOSE NAME DOES NOT  END WITH ‘ES’ OR ‘R’
select * from emp where ename not like '%ES' and ename not like '%R';

-- 16) LIST ALL THE EMPLOYEES WHO ARE HAVING  REPORTING MANAGERS IN DEPT 10 ALONG WITH  10% HIKE IN SALARY
select * , sal+sal*0.1 from emp where mgr is not NULL ;

-- 17) DISPLAY ALL THE EMPLOYEE WHO ARE  ‘SALESMAN’S HAVING ‘E’ AS THE LAST BUT ONE  CHARACTER IN ENAME BUT SALARY HAVING  EXACTLY 4 CHARACTER
select * from emp where job = 'SALESMAN' and ename like '%E%' and sal like '____';

-- 18) DISPLAY ALL THE EMPLOYEE WHO ARE JOINED  AFTER YEAR 81
select * from emp where hiredate > ('1982-01-01') ;

-- 19) DISPLAY ALL THE EMPLOYEE WHO ARE JOINED  IN FEB
select * from emp where hiredate like '%02%';

-- 20) LIST THE EMPLOYEES WHO ARE NOT WORKING  AS MANAGERS AND CLERKS IN DEPT 10 AND 20  WITH A SALARY IN THE RANGE OF 1000 TO 3000
select * from emp where job not in ('MANAGER','CLERK') and deptno in (10,20) and sal between 1000 and 3000 ;

-- 21) LIST THE EMPLOYEES WHOSE SALARY NOT IN  THE RANGE OF 1000 TO 2000 AND WORKING IN DEPT  10,20 OR 30 EXCEPT ALL SALESMEN
select * from emp where sal not between 1000 and 2000 and deptno in (10,20,30) and job not like 'SALESMAN' ;

-- 22) LIST THE DEPARTMENT NAMES WHICH ARE  HAVING LETTER ‘O’ IN THEIR LOCATIONS AS WELL  AS THEIR DEPARTMENT NAMES
select * from dept where loc like '%O%' and dname like '%O%';

-- 23) DISPLAY ALL THE EMPLOYEES WHOSE JOB HAS  STRING ‘MAN’ IN IT.
select * from emp where job like'%MAN%' ;

-- 24)LIST THE EMPLOYEES WHO ARE HIRED AFTER 82  AND BEFORE 87.
select * from emp where hiredate between '1982-01-01' and '1987-12-31' ;

-- 25)WAQTD ALL THE DETAILS OF EMPLOYEES HIRED  IN NOVEMBER AND DECEMBER.
select * from emp where hiredate like '%11%' or hiredate like '%12%' ; 

-- 26)LIST ALL THE EMPLOYEE NAMES AND  COMISSION FOR THOSE EMPLOYEES WHO EARN  COMISSION MORE THAN THEIR SALARY
select ename,sal,comm from emp where comm > sal ;

-- 27)WAQTD NAME AND DESIGNATION FOR ALL THE  EMPLOYEES HAVING REPORTING MANAGERS AND  ALSO THRIE NAMES STARTING WITH ‘S’
select ename , job from emp where mgr is not NULL and ename like 'S%' ; 

-- 28)WAQTD NAME AND SALARY OF ALL THE  EMPLOYEES IF THEIR ANNUAL SALARY ENDS WITH  ‘0’ .
select ename , sal from emp where sal like '%0' ;

-- 29)WAQTD NAME OF THE EMPLOYEE HAVING  ATLEAST 2L’s IN HIS NAME .
select ename from emp where ename like '%L%L%' ;

-- 30)WAQTD NAME OF THE EMPLOYEES WHOS NAME  STARTS WITH A ‘VOWEL’
select ename from emp where ename like 'A%' ;

---------------- DOC 2 -------------------------------------------

-- 1. WAQTD THE NAMES OF THE EMPLOYEES WORKING AS A CLERK OR MANAGER IN DEPT 10.
select * from emp where job in ('CLERK' , 'MANAGER') and deptno = 10 ;

-- 2. WAQTD THE DETAILS OF THE EMPLOYEE ALONG WITH ANNUAL SAL IF THE EMPLOYEE WORKS IN DEPT 10 AND 20.
select * , 12*sal from emp where deptno = 10 or deptno = 20 ; 

-- 3. WAQTD THE ENAME , SAL OF THE EMPLOYEES IF THE EMPLOYEES ARE EARNING SAL MORE THAN 2000 IN DEPT 30
select ename , sal from emp where sal > 2000 and deptno = 30 ; 

-- 4.WAQTD THE DETAILS OF THE EMPLOYEE ALONG WITH 20 % HIKE IN ANNUAL SAL IF THE EMPLOYEE IS EARNING 
select * , sal+0.2*sal from emp where comm > 200 and job in('SALESMAN') ;

-- 5.WAQTD THE NAME , JOB , DEPTNO OF THE EMPLOYEES IF THE EMPLOYEE IS WORKING IN DEPT 10 OR 20 OR 30 AS A SALESMAN 
select ename, job,deptno from emp where deptno in (10,20,30) and job = 'SALESMAN' ; 

-- 6.WAQTD THE DETAILS OF THE EMPLOYEES WORKING AS A MANAGER IN DEPT 10 OR 20 
select * from emp where job = 'MANAGER' and deptno in (10,20) ;

-- 7.WAQTD THE JOB AND DEPTNO OF THE EMPLOYEES IF THE EMPLOYEES ARE EARNING SAL MORE THAN 1000 AND LESS THAN 3000 
select job, deptno, sal from emp where sal > 1000 and sal < 3000 ; 

-- 8. WAQTD THE ENAME OF THE EMPLOYEE WHO ARE EARNING SAL 1250 AND 3000
select ename from emp where sal in (1250,3000) ;

-- 9. WAQTD THE DETAILS OF THE EMPLOYEE WORKING AS AN ANALYST AND EARNING SAL MORE THAN 2000
select * from emp where job in ('ANALYST') and sal > 2000 ; 

-- 10. WAQTD THE NAMES OF THE EMPLOYEES WORKING AS A SALESMAN OR EARNING SAL MORE THAN 1250
select ename, sal, job from emp where job in ('SALESMAN') or sal > 1250 ; 

-- 11. WAQTD THE DETAILS OF THE EMPLOYEE WHOSE NAME IS KING AND EARNING SAL EQUAL TO 5000 AND DESIGNATION IS PRESIDENT 
select * from emp where ename in ('king') and sal = 5000 and job in ('president') ; 

-- 12. WAQTD THE DETAILS OF THE EMPLOYEE EARNING COMM MORE THAN 300 OR EARNING SAL MORE THAN 1500
select * from emp where comm > 300 or sal > 1500 ;

-- 13. WAQTD THE NAMES OF THE EMPLOYEE WHOSE MGR NO IS 7566 OR 7839
select ename from emp where mgr = 7566 or mgr = 7839 ;

-- 14. WAQTD THE DETAILS OF THE EMPLOYEE WHOSE JOB IS CLERK AND EARNING SAL MORE THAN 1000
select * from emp where job in ('CLERK') and sal > 1000 ; 

-- 15. WAQTD THE ENAME , JOB , SAL ALONG WITH ANNUAL SAL IF THE EMPLOLYEES ARE WORKING AS A CLERK OR ANALYST IN DEPT 10 OR 20
select ename, job,sal,12*sal from emp where job in ('CLERK','ANALYST') and deptno in (10,20);

-- 16. WAQTD THE DETAILS OF THE EMPLOYEE IF THE EMPLOYEE EARNS MORE THAN  1000 AND ALSO EARNS COMM  MORE THAN 500 OR THE EMPLOYEE EARNS SAL MORE THAN 2000 IN DEPTNO 20
select * from emp where sal > 1000 and comm > 500 or sal > 2000 and deptno = 20 ; 

-- 17. WAQTD THE NAMES OF THE EMPLOYEES ALONG WITH 2.25% HIKE IN HALF TERM SAL IF THE EMPLOYEES ARE HIRED IN THE YEAR 81 AND EARNING SAL = 1250
select ename , sal+0.0225*(sal/2) , sal, hiredate from emp where hiredate like '%81%' and sal = 1250 ; 

-- 18. WAQTD THE DETAILS OF THE EMPLOYEE EARNING SAL MORE THAN 3000 OR EARNING SAL EQUAL TO 5000 
select * from emp where sal > 3000 or sal = 5000 ; 

-- 19. WAQTD THE JOB , DEPTNO OF THE EMPLOYEES WORKING IN DEPT 10 AND EARNING SAL 2450 OR WORKING IN DEPT 30 AND SAL EQUAL TO 1500
select job , deptno from emp where deptno = 10 and sal = 2450 or deptno = 30 and sal =1500 ;

-- 20. WAQTD THE DETAILS OF THE EMPLOYEE ALONG WITH ANNUAL SAL , ANNUAL SAL WITH 1% HIKE IF THE EMPLOYEE IS HIRED AFTER 81 INTO DEPT NO 20
select * , sal*12 as annual_salary , sal*12+0.01*sal as Hike_Annual_Sal from emp where hiredate > '1981-12-31' and deptno = 20; 

-- 21. WAQTD THE EMPLOYEE NAMES IF THE EMPLOYEE IF THE EMPLOYEES ARE NOT WORKING AS CLERK IN DEPT 10 
select ename,job,deptno from emp where job not like 'CLERK'and deptno = 10;

-- 22. WAQTD THE NAMES OF THE EMPLOYEES WORKING AS A MANAGER AND EARNING SAL MORE THAN 2000
select ename from emp where job in ('MANAGER') and sal > 2000 ;

-- 23. WAQTD THE DETAILS OF THE EMPLOYEE WHOSE EMPNO IS 7369 OR 7566 AND NAME OF THE EMPLOYEE IS SMITH 
select * from emp where empno = 7369 or empno = 7566 and ename = 'SMITH' ;

-- 24. WAQTD THE DETAILS OF THE EMPLOYEE EARNING COMM LESSER THAN  300 AND WORKING AS SALESMAN 
select * from emp where comm < 300 and job = 'SALESMAN' ; 

-- 25. WAQTD THE ENAME , HIREDATE OF THE EMPLOYEES WHOSE JOB IS ANALYST AND HIRED ON 03-DEC-81
select ename, hiredate from emp where job = 'ANALYST' and hiredate = '1981-12-03' ;

----------------------- Multi Row Function  ----------------------------------------

-- 1.WAQTD NUMBER OF EMPLOYEES GETTING SALARY LESS THAN 2000 IN DEPTNO 10
select count(*) from emp where sal < 2000 and deptno = 10 ;

-- 2.WAQTD TOTAL SALARY NEEDED TO PAY EMPLOYEES WORKING AS CLERK
select sum(sal) from emp where job = 'CLERK';

-- 3.WAQTD AVERAGE SALARY NEEDED TO PAY ALL EMPLOYEES
select avg(sal) from emp ;

-- 4.WAQTD NUMBER OF EMPLOYEES HAVING 'A' AS THEIR FIRST CHARACTER
select count(*) from emp where ename like 'A%' ; 

-- 5.WAQTD NUMBER OF EMPLOYEES WORKING AS CLERK OR MANAGER
select count(*) from emp where job in ('CLERK','MANAGER');

-- 6.WAQTD TOTAL SALARY NEEDED TO PAY EMPLOYEES HIRED IN FEB
select sum(sal) from emp where hiredate like '_____02%' ;

-- 7.WAQTD NUMBER OF EMPLOYEES REPORTING TO 7839 (MGR)
select count(*) from emp where mgr = 7839 ;

-- 8.WAQTD NUMBER OF EMPLOYEES GETTING COMISSION IN DEPTNO 30
select count(*) from emp where comm is not NULL and deptno = 30 ;

-- 9.WAQTD AVG SAL , TOTAL SAL , NUMBER OF EMPS AND MAXIMUM SALARY GIVEN TO EMPLOYEES WORKING AS PRESIDENT
select avg(sal), sum(sal) , count(*), max(sal) from emp where job = 'PRESIDENT';

-- 10.WAQTD NUMBER OF EMPLOYEES HAVING 'A' IN THEIR NAMES 
select count(*) from emp where ename like '%A%' ; 

-- 11.WAQTD NUMBER OF EMPS AND TOTAL SALARY NEEDED TO PAY THE EMPLOYEES WHO HAVE 2 CONSECUTIVE L's IN THEIR NAMES
select count(*), sum(sal) from emp where ename like '%LL%' ; 

-- 12.WAQTD NUMBER OF DEPARTMENTS PRESENT IN EMPLOYEE TABLE 
select count(distinct deptno) as Number_of_Department from emp ;

-- 13.WAQTD NUMBER OF EMPLOYEES HAVING CHARACTER 'Z' IN THEIR NAMES 
select count(*) from emp where ename like'%Z%' ;

-- 14.WAQTD NUMBER OF EMPLOYEES EARNING SALARY MORE THAN 2500 AND HAVING CHAR 'E' IN THEIR NAME .
select count(*) from emp where sal > 2500 and ename like '%E%' ;

-- 15.WAQTD TOTAL SALARY GIVEN TO EMPLOYEES WORKING AS CLERK IN DEPT 30 
select sum(sal) from emp where job = 'CLERK' and deptno = 30 ;

-- 16.WAQTD MAXIMUM SALARY GIVEN TO THE EMPLOYEES WORKING AS ANALYST 
select max(sal) from emp where job = 'ANALYST' ;

-- 17.WAQTD NUMBER OF DISTINCT SALARIES PRESENT IN EMPLOYEE TABLE 
select count(distinct sal) from emp ;

-- 18.WAQTD NUMBER OF JOBS PRESENT IN EMPLOYEE TABLE 
select count(distinct job) from emp ;

--  19.WATQD AVG SALARY GIVEN TO THE CLERK 
select avg(sal) from emp where job = 'CLERK' ; 

-- 20.WAQTD MINIMUM SALARY GIVEN TO THE EMPLOYEES WHO WORK IN DEPT 10 AS MANAGER OR A CLERK
select min(sal) from emp where deptno = 10 and job in ('MANGER' , 'CLERK') ;

-------------- group by ----------------------------
-- 1.WAQTD NUMBER OF EMPLOYEES WORKING IN EACH DEPARTMENT EXCEPT PRESIDENT.
select count(*),deptno from emp where job != 'PRESIDENT' group by deptno;

-- 2.WAQTD TOTAL SALARY NEEDED TO PAY ALL THE EMPLOYEES IN EACH JOB. 
select sum(sal), job from emp group by job ;

-- 3.WAQTD NUMBER OF EMPLOYEES WORKING AS MANAGER IN EACH DEPARTMENT
select count(*),deptno from emp where job = 'MANAGER' group by deptno ;

-- 4.WAQTD AVG SALARY NEEDED TO PAY ALL THE EMPLOYEES IN EACH DEPARTMENT EXCLUDING THE EMPLOYEES OF DEPTNO 20.
select avg(sal),deptno from emp where deptno !=20 group by deptno ;

-- 5.WAQTD NUMBER OF EMPLOYEES HAVING CHARACTER 'A' IN THEIR NAMES IN EACH JOB .
select count(*),job from emp where ename like '%A%' group by job ;

-- 6.WAQTD NUMBER OF EMPLOYEES AND AVG SALARY NEEDED TO PAY THE EMPLOYEES WHO SALARY IN GREATER THAN 2000 IN EACH DEPT.
select count(*),avg(sal),deptno from emp where sal > 2000 group by deptno ;

-- 7.WAQTD TOTAL SALARY NEEDED TO PAY AND NUMBER OF SALESMANS IN EACH DEPT.
select sum(sal),count(*), deptno from emp where job = 'SALESMAN' group by deptno ;

-- 8.WAQTD NUMBER OF EMPLOYEES WITH THEIR MAXIMUM SALARIES IN EACH JOB.
select count(*) , max(sal), job from emp group by job ;

-- 9.WAQTD MAXIMUM SALARIES GIVEN TO AN EMPLOYEE WORKING IN EACH DEPT.
select max(sal),deptno from emp group by deptno ; 

-- 10.WAQTD NUMBER OF TIMES THE SALARIES PRESENT IN EMPLOYEE TABLE .
select sal , count(sal) from emp group by sal ;

-- 11.WAQTD NO.OF EMPS HIRED ON THE SAME DAY INTO THE SAME DEPT
select count(*),hiredate from emp group by hiredate having count(hiredate) > 1 ;

-- 12.WAQTD NO.OF EMP'S GETTING THE SAME SALARY IN THE SAME DEPT
select count(*),sal,deptno from emp group by sal,deptno having count(sal) > 1 ;

-- 13.WAQTD NO.OF EMP'S HAVING THE SAME NAME IN THE SAME DEPT.
select count(*),ename from emp group by ename having count(ename) > 1 ; 

-- 14.WAQTD NO.OF EMP'S GETTING THE SAME SALARY IN THE SAME DEPT AND HAVING THE SAME NAME. 
select count(*) , sal,ename from emp group by sal,ename having count(sal) > 1 and count(ename) > 1; 


-- 15.WAQTD NO.OF EMP'S GETTING THE SAME SALARY IN THE SAME DEPT AND HIRED ON THE SAME DAY.
select count(*) , sal , hiredate from emp group by sal,hiredate having count(sal) > 1 and count(hiredate) > 1 ;

--------------------------- Having clause ----------------------------------------------
-- 1.WAQTD DNO AND NUMBER OF EMP WORKING IN EACH DEPT IF THERE ARE ATLEAST 2 CLERKS IN EACH DEPT 
select deptno , count(*) from emp where job = 'CLERK' group by deptno having count(job) > 1 ;

-- 2.WAQTD DNO AND TOTAL SAALARYNEEDED TO PAY ALL EMP IN EACH DEPT IF THERE ARE ATLEAST 4 EMP IN EACH DEPT 
select deptno , sum(sal) from emp group by deptno having count(*) >3 ;

-- 3.WAQTD NUMBER OF EMP EARNING SAL MORE THAN 1200 IN EACH JOB AND THE TOTAL SAL NEEDED TO PAY EMP OF
select count(*),job from emp where sal > 1200 group by job having sum(sal) > 3800;

-- 4.WAQTD DEPTNO AND NUMBER OF EMP WORKING ONLY IF THERE ARE 2 EMP WORKING IN EACH DEPT AS MANAGER .
select deptno , count(*) from emp where job = 'MANAGER' group by deptno having count('job') > 2 ;

-- 5.WAQTD JOB AND MAX SAL OF EMP IN EACH JOB IF THE MAX SAL EXCEEDS 2600
select max(sal),job from emp group by job having max(sal) > 2600 ;

-- 6.WAQTD THE SALARIES WHICH ARE REPEATED IN EMP TABLE
select count(*), sal from emp group by sal having count(*)>1 ;

-- 7.WAQTD THE HIREDATE WHICH ARE DUPLICATED IN EMP TABLE 
select count(*), hiredate from emp group by hiredate having count(*)>1 ;

-- 8.WAQTD AVG SALARY OF EACH DEPT IF AVG SAL IS LESS THAN 3000
select avg(sal) from emp group by deptno having avg(sal) <3000 ;

-- 9.WAQTD DEPTNO IF THERE ARE ATLEAST 3 EMP IN EACH DEPT WHOS NAME HAS CHAR 'A' OR 'S' .
select deptno from emp where ename like '%A%' or ename like '%S%'group by deptno having count(*) >2 ;

-- 10.WAQTD MIN AND MAX SALARIES OF EACH JOB IF MIN SAL IS MORE THAN 1000 AND MAX SAL IS LESS THAN 5000 .
select min(sal) , max(sal) , job from emp group by job having min(sal) >1000 and max(sal) < 5000 ; 