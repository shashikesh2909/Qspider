package collection;

import java.util.LinkedList;

public class LinkedListWorking {

	public static void main(String[] args) 
	{
		LinkedList<String> l = new LinkedList();
		l.add("Hello");
		l.add("Apple");
		l.addFirst("Mango");
		l.addLast("Strawberry");
		l.add(2,"Banana");
		System.out.println(l);
		l.remove(3);
		System.out.println(l);



	}

}
