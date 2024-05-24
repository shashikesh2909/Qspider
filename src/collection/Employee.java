package collection;

public class Employee
{
	int eid ;
	String ename ;
	double sal ;
	int deptno ;
	
	/*
	@Override
	public int compareTo(Employee e) 
	{
		// sort by eid 
	/*	if(this.eid > e.eid)
			return 1 ;
		else if(this.eid < e.eid)
			return -1 ;
		else 
			return 0 ;
		
			//sort by ename
		 return this.ename.compareTo(e.ename);
		
		// sort by salary
		if(this.sal > e.sal)
			return 1 ;
		else if(this.sal < e.sal)
			return -1 ;
		else 
			return 0 ;
		
		
		
		
		// sort by deptno
				if(this.deptno > e.deptno)
					return 1 ;
				else if(this.deptno < e.deptno)
					return -1 ;
				else 
					return 0 ;
	 */
	

public Employee(int eid,String ename,double sal,int deptno)
{
	this.eid = eid ;
	this.ename = ename ;
	this.sal = sal ;
	this.deptno = deptno ;
}

}
