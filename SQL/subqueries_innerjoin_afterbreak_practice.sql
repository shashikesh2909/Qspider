use qspider ;

select ename, dname from emp , dept where emp.deptno = dept.deptno and dname like '%s' ;

select ename from emp , dept where emp.deptno = dept.deptno and sal = (select max(sal) from emp) and dname = 'accounting' ;

select dname from emp , dept where emp.deptno = dept.deptno and comm = (select max(comm) from emp) ;

select ename,dname from emp, dept where emp.deptno = dept.deptno and dname like 'o%' ;

select ename from emp where emp.deptno = (select deptno from emp where ename = 'scott') ;

select ename, dname from emp , dept where emp.deptno = dept.deptno and dname in ('operations' , 'accounting') ;

select ename from emp where sal > (select sal from emp where ename = 'miller') ;

-- list department name having atleast 3 salesman
select dname from dept , emp where emp.deptno = dept.deptno and job = 'salesman' group by dname having count(*)>3 ;

select dname from emp , dept where dept.deptno = emp.deptno and mgr is null ;

select ename from emp , dept where dept.deptno = emp.deptno and mgr = (select mgr from emp where ename = 'jones') ;

select ename,mgr,empno from emp, dept where emp.deptno = dept.deptno and dname in ('accounting' , 'research') and empno = any (select mgr from emp group by mgr having count(*)>1);

select dname, ename from emp , dept where emp.deptno = dept.deptno and ename not like 's%' and sal between 1500 and 3000 ;

select loc, sal from emp , dept where emp.deptno = dept.deptno and sal = (select min(sal) from emp where sal > 2000 ) ;

select loc from emp , dept where emp.deptno = dept.deptno and dname = 'accounting' ;

select loc from emp, dept where emp.deptno = dept.deptno group by loc having count(*) >4 ;

select ename , sal , job from emp , dept where dept.deptno = emp.deptno and job != (select job from emp where ename = 'allen') and sal > (select sal from emp where ename = 'martin');

select ename , loc from emp , dept where emp.deptno = dept.deptno and loc = (select loc from dept,emp where emp.deptno = dept.deptno and  empno = (select mgr from emp where ename = 'adams'));

select ename ,job , mgr from emp where mgr = (select empno from emp where ename = 'jones') ;

select ename , hiredate, comm from emp where empno = (select mgr from emp where ename = 'ford');

select count(*) from emp where sal < (select sal from emp where empno = (select mgr from emp where ename = 'blake'));

select ename from emp ,dept where loc = 'chicago' and comm is null ;

select ename , sal from emp , dept where dept.deptno = emp.deptno and dname = 'sales' and sal > any (select avg(Sal) from emp group by dname );

select ename from emp, dept where dept.deptno = emp.deptno and dname = 'research' and job = 'manager' ;

select dname from emp, dept where dept.deptno = emp.deptno and comm is not null ;

select dname from emp, dept where dept.deptno = emp.deptno and sal = (select max(sal) from emp) and mgr is null ;

select dname , loc from emp, dept where dept.deptno = emp.deptno and empno = (select mgr from emp where empno = any(select mgr from emp where job = 'salesman'));

select dname , loc from emp, dept where dept.deptno = emp.deptno and job = 'cleark' and mgr = (select empno from emp where ename = 'blake') and sal < (select sal from emp where ename = 'martin');








