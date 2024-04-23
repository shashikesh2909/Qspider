-- INSTR single row function 

--  WAQTD details of emp having at least 1 ‘M’ in their name 
select * from emp where instr(ename,'M',1) != 0 ;

-- Q2) WAQTD details of emp having at least 2 ‘A’ in their name 
select * from emp where instr(ename,'A',1,2) != 0 ;

-- Q3) WAQTD details of emp having exactly 1  ‘L’ in their name 
select * from emp where instr(ename,'L',1,1)  !=0  and  instr(ename,'L',1,2) = 0 ;

-- Q4) WAQTD details of emp having character ‘L’ for 2nd time in 3rd position 
select ename from emp where instr (ename,'L',1,2) = 3; 

-- details of emp hired in year 82 : Miller
select ename from emp where instr (ename,'L',1,2) = 3; 

-- details of emp hired in month of feb 
select ename from emp where instr (hiredate,'82',1,1) != 0 ;

-- details of emp hired on saturday 
select ename from emp where to_char(hiredate , 'D') = 7 ;



