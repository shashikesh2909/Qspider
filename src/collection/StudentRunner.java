package collection;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class StudentRunner {

	public static void main(String[] args) 
	{
		// creating the linked list of Student type
		LinkedList<Student> sl = new LinkedList<Student>() ;
		
		//Adding 4 student object using add, add last, offer , offerLast method
		sl.add(new Student(1,"Mandeep",22,'M',60.5));
		sl.addLast(new Student(2,"Mayank",25,'M',90.7));
		sl.offer(new Student(4,"Ujjwal",18,'F',95.7));
		sl.offerLast(new Student(5,"Jebin",31,'F',52.7));
		sl.add(2, new Student(3,"Shafaudin",21,'M',91.7));
		
		// Fetching data using iterator method 
		Iterator<Student> si = sl.iterator() ;
		int i=0;
		System.out.println("-----------using iterator------------------------");
		while (si.hasNext())
		{
			Student s = si.next();
			System.out.println(s.sid+" " + s.sname + " " + s.age + " " + s.gender + " " + s.perc);
		}
		System.out.println("-------------usin list iterator----------------------");
		
		// Fetching the data using listiterator by adding an element to the list before starting has next and using previous 
		ListIterator<Student> li = sl.listIterator();
		li.add(new Student(6,"Himanshu",22,'M',93.5));
		while (li.hasNext())
		{
			Student s = li.next();
			System.out.println(s.sid+" " + s.sname + " " + s.age + " " + s.gender + " " + s.perc);
		}
		li.add(new Student(7,"Shubham",21,'M',99.5));
		System.out.println("--------------using list iterator previous--------------------");
		while(li.hasPrevious())
		{
			Student s = li.previous();
			System.out.println(s.sid+" " + s.sname + " " + s.age + " " + s.gender + " " + s.perc);
		}
		System.out.println("-----------using descendingIterator------------------------");

		// Fetching using the descending iterator 
		Iterator<Student> sdi = sl.descendingIterator();
		sl.reversed();
		while(sdi.hasNext())
		{
			Student s = sdi.next();
			System.out.println(s.sid+" " + s.sname + " " + s.age + " " + s.gender + " " + s.perc);
		}
		System.out.println("-----------sorting as per percentage -----------------------");

		// sort as per percentage decreasing
		Collections.sort(sl);
		for(Student x : sl)
		{
			System.out.println(x.sid + " " + x.sname + " " + x.age + " " + x.gender + " " + x.perc);
		}
		System.out.println("-----------sorting as per percentage descending-----------------------");
		// sort as per percentage decreasing
		Collections.sort(sl);
		LinkedList<Student> descperc = sl.reversed();
		for(Student x : descperc)
		{
			System.out.println(x.sid + " " + x.sname + " " + x.age + " " + x.gender + " " + x.perc);
		}
		System.out.println("-----------sorting as per sid -----------------------");
		// sort as per SID 
		Collections.sort(sl,new SortSidStudent());
		for(Student x : sl)
		{
			System.out.println(x.sid + " " + x.sname + " " + x.age + " " + x.gender + " " + x.perc);
		}
		System.out.println("-----------sorting as per sname -----------------------");
		// sort as per SID 
		Collections.sort(sl,new SortSnameStudent());
		for(Student x : sl)
		{
			System.out.println(x.sid + " " + x.sname + " " + x.age + " " + x.gender + " " + x.perc);
		}
		System.out.println("-----------sorting as per Age -----------------------");
		// sort as per SID 
		Collections.sort(sl,new SortAgeStudent());
		for(Student x : sl)
		{
			System.out.println(x.sid + " " + x.sname + " " + x.age + " " + x.gender + " " + x.perc);
		}
		System.out.println("-----------displayfemale friend-----------------------");
		// sort as per SID 
		for(Student x : sl)
		{
			if (x.gender == 'F')
			{
			System.out.println(x.sid + " " + x.sname + " " + x.age + " " + x.gender + " " + x.perc);
			}
		}
		System.out.println("-----------display studentwith perc greater than 75 friend-----------------------");
		// sort as per SID 
		for(Student x : sl)
		{
			if (x.perc > 75.0)
			{
			System.out.println(x.sid + " " + x.sname + " " + x.age + " " + x.gender + " " + x.perc);
			}
		}
		System.out.println("-----------display studentwith perc age less than 20-----------------------");
		// sort as per SID 
		for(Student x : sl)
		{
			if (x.age < 20)
			{
			System.out.println(x.sid + " " + x.sname + " " + x.age + " " + x.gender + " " + x.perc);
			}
		}
	}

}
