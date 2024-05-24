package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Employee_Runner  {

	public static void main(String[] args) 
	{
		ArrayList<Employee> al = new ArrayList<Employee>();
		al.add(new Employee(101 ,"Miller",1000,10));
		al.add(new Employee(102 ,"Clark",1500,20));
		al.add(new Employee(103 ,"James",2000,30));
		al.add(new Employee(104 ,"Stephen",2500,40));
		al.add(new Employee(105 ,"John",1200,10)); 
	
		for(int j=0;j<al.size();j++)
		{
			System.out.println(al.get(j).eid +" " + al.get(j).ename + " " + al.get(j).sal + " " + al.get(j).deptno);
		}
		System.out.println("----------------");
		
		for (Employee x : al)
		{
			System.out.println(x.eid +" " + x.ename + " " + x.sal + " " + x.deptno);
		}
		System.out.println("----------------");
		
		Iterator<Employee> i = al.iterator();
		while(i.hasNext())
		{
			Employee e = (Employee)i.next();
			System.out.println(e.eid +" " + e.ename + " " + e.sal + " " + e.deptno ) ;
		}
		System.out.println("----------------");
		
		ListIterator<Employee> l = al.listIterator();
		l.add(new Employee(105,"Shashi",1500,30));
		while (l.hasNext())
		{
			Employee e = l.next();
			System.out.println(e.eid +" " + e.ename + " " + e.sal + " " + e.deptno ) ;
		}
		System.out.println("-----------------");
		l.add(new Employee(106,"Mandeep",200,20));
		while (l.hasPrevious())
		{
			Employee e = l.previous();
			System.out.println(e.eid +" " + e.ename + " " + e.sal + " " + e.deptno ) ;
		}
		Collections.sort(al,new EmployeeComparatorEidSort());
		System.out.println("------------------");
		for (Employee x : al)
		{
			System.out.println(x.eid +" " + x.ename + " " + x.sal + " " + x.deptno);
		}
	}
	
	
}
