--  waqtd Ename and dname fo emp where sal > 2000 
select ename , dname from emp , dept where emp.deptno = dept.deptno and sal > 2000 ;

-- waqtd ename and loc of emp working in chicago 
select ename , loc from emp , dept where emp.deptno = dept.deptno and loc = 'chicago' ;

-- waqtd ename , job and dname of emp working as clerk in research department 
select ename , job,dname from emp , dept where emp.deptno = dept.deptno and dname = 'research' and job = 'clerk' ;

-- waqtd ename , deptno and dname of emp working in department number 20 
select ename , emp.deptno, dname from emp , dept where emp.deptno = dept.deptno and emp.deptno = 20  ;

use qspider;

-- waqtd ename and dname of emp working as a manager in newyork 
select ename , dname from emp,dept where emp.deptno = dept.deptno and job = 'manager' and loc = 'new york' ; 

-- waqtd ename and loc of emp working as a cleark in sales dept
select ename , loc from emp,dept where emp.deptno = dept.deptno and job = 'clerk' and dname = 'sales' ; 

-- waqtd ename and dname of emp hired in year 82 in newyork 
select ename , dname from emp,dept where emp.deptno = dept.deptno and hiredate like '%82%' and loc = 'new york'; 

-- waqtd ename hired date dname of emp where emp is hired in month of dec in chicago 
select ename , dname, hiredate from emp,dept where emp.deptno = dept.deptno and hiredate like '_____12%' and loc = 'chicago'; 

-- waqtd ename , dname of emp hired after miller in dallas
select ename , dname, hiredate from emp,dept where emp.deptno = dept.deptno and hiredate > (select hiredate from emp where ename = 'miller') and loc = 'dallas'; 

-- waqtd ename, dname of emp hired after 82 in miller's designation 
select ename , dname from emp,dept where emp.deptno = dept.deptno and hiredate > '1983-01-01' and job = (select job from emp where ename = 'miller'); 

-- waqtd ename , dname of emp earning less than scott and more than allen in new york or chicago
select ename , dname from emp,dept where emp.deptno = dept.deptno and sal < (select sal from emp where ename = 'scott') and sal > (select sal from emp where ename = 'allen') and loc in ('new york','chicago'); 

-- waqtd ename and dname of emp working as a salesman in sales dept and hired in month of september
select ename , dname,hiredate from emp,dept where emp.deptno = dept.deptno and job = 'salesman' and dname = 'sales' and hiredate like '_____09%'; 

-- waqtd ename and dname of emp earning more than all the managers in new york.
select ename , dname from emp,dept where emp.deptno = dept.deptno and sal > all( select sal from emp where job = 'manager') and loc = 'new york' ; 

-- waqtd ename and loc of emp working in same designation as that of james excluding the emp hired in year 81 and his name must have character i in research or sales department
select ename , loc from emp,dept where emp.deptno = dept.deptno and job = (select job from emp where ename = 'james') and hiredate not like '%81%' and ename like '%i%' and dname in ('research','sales') ; 

-- waqtd ename and dname of emp earning max salary 
select ename , dname from emp,dept where emp.deptno = dept.deptno and sal = (select max(sal) from emp) ; 

-- waqtd ename and location an emp hired first 
select ename , dname from emp,dept where emp.deptno = dept.deptno and hiredate = (select min(hiredate) from emp) ; 

-- waqtd ename and dname of emp earning 3rd max salary 
select ename , dname from emp,dept where emp.deptno = dept.deptno and sal = (select max(sal) from emp where sal < (select max(sal) from emp where sal < (select max(sal) from emp))) ; 

-- waqtd ename and loc of emp hired 2nd last
select ename , loc from emp,dept where emp.deptno = dept.deptno and hiredate = (select max(hiredate) from emp where hiredate < (select max(hiredate) from emp)) ; 

-- waqtd ename and dname of smith's manager
select ename , dname from emp,dept where emp.deptno = dept.deptno and empno = (select mgr from emp where ename = 'smith') ; 

-- waqtd ename and dname of miller's manager's manager 
select ename , dname from emp,dept where emp.deptno = dept.deptno and empno = (select mgr from emp where empno = (select mgr from emp where ename = 'miller')) ; 

-- waqtd ename and dname of emp earning less than all the sales man in chicago
select ename , dname from emp,dept where emp.deptno = dept.deptno and sal < all (select sal from emp where job = 'salesman') and loc = 'chicago';

-- waqtd second max sal in each department
select max(sal),deptno from emp where sal < (select max(sal) from emp as e2 where e2.deptno = emp.deptno) group by deptno ;

-- waqtd second max sal in new york
select max(sal) from emp,dept where emp.deptno = dept.deptno and sal < (select max(sal) from emp) and loc = 'new york';

-- waqtd ename and dname of emp earning second max salary in chicago.
select ename , dname from emp,dept where emp.deptno = dept.deptno and sal = (select max(sal) from emp where sal < (select max(sal) from emp)) and loc = 'chicago';

select * from emp where deptno = 30;