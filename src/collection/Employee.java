package collection;

public class Employee implements Comparable<Employee>
{
	int eid ;
	String ename ;
	double sal ;
	int deptno ;
	
	
public Employee(int eid,String ename,double sal,int deptno)
{
	this.eid = eid ;
	this.ename = ename ;
	this.sal = sal ;
	this.deptno = deptno ;
}

@Override
public int compareTo(Employee o)
{
	return this.ename.compareTo(o.ename);
}
}
