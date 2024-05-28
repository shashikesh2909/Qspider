package collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetWorking 
{
	public static void main(String[] args) 
	{
		TreeSet<Employee> ts = new TreeSet<Employee>();
		Employee e1 = new Employee(101,"Smith",1000,10);
		Employee e2 =new Employee(102,"Jones",1100,10);
		Employee e3 =new Employee(103,"James",1200,10);
		Employee e4 =new Employee(104,"Clark",1300,10);
		Employee e5 =new Employee(101,"Smith",1000,10);
		
		ts.add(e1);
		ts.add(e2);
		ts.add(e3);
		ts.add(e4);
		ts.add(e5);

		for(Employee x : ts)
		{
			System.out.println(x.deptno + " " + x.eid+" " + x.ename +" "+x.sal);
		}
		
		ts.remove(e5);
		System.out.println("------------------------");
		Iterator<Employee> i = ts.iterator();
		while(i.hasNext())
		{
			Employee x = i.next();
			System.out.println(x.deptno + " " + x.eid+" " + x.ename +" "+x.sal);
		}
	}
}