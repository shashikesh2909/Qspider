package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListWorking 
{

	public static void main(String[] args) 
	{
		ListIteratorWorking();
	}
	
	public static  void ArrayListmethod(ArrayList actor,ArrayList actress)
	{
		actor.add("Salman");
		actor.add("Sharukh");
		actor.add("AAmir");
		actor.add(2,"Ranbir");
		
		actress.add("Alia");
		actress.add("Deepika");
		actress.add("Katrina");
		actor.addAll(1, actress);
//		System.out.println(actor);
//		System.out.println(actor.get(2));
	}
	
	public static void foriteration(ArrayList actor)
	{
		for(int i=0 ;i<actor.size();i++)
		{
			System.out.println(actor.get(i));
		}
	}
		
		 
	public static void foreachiterating()
	{
		ArrayList<String> actress = new ArrayList<String>();
		actress.add("Alia");
		actress.add("Deepika");
		actress.add("Katrina");
		for(String x : actress)
		{
			System.out.println(x);
		}
	}
	
	// using iterator
	
	public static void hasNextNextIteration()
	{
		ArrayList<String> actress = new ArrayList<String>();
		actress.add("Alia");
		actress.add("Deepika");
		actress.add("Katrina");
		Iterator<String> i = actress.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}
	
	public static void ListIteratorWorking()
	{
		ArrayList<String> actress = new ArrayList<String>();
		actress.add("Alia");
		actress.add("Deepika");
		actress.add("Katrina");
		ListIterator<String> i = actress.listIterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
			i.add("Jadeja");
		}         
		System.out.println("----------------------");
		while(i.hasPrevious())
		{
			System.out.println(i.previous());
		}
	}
}
