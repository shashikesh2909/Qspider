package collection;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

public class LinkedHashSetWorking
{
	public static void main(String[] args) 
	{
		LinkedHashSet<fruits> lhs = new LinkedHashSet<fruits>();
		fruits f1 = new fruits("Apple",1,50,"red");
		fruits f2 =new fruits("Apple",1,60,"red");
		fruits f3 =new fruits("Orange",1,100,"Orange");
		fruits f4 =new fruits("Mango",1,70,"Yellow");
		
		lhs.add(f1);
		lhs.add(f2);
		lhs.add(f3);
		lhs.add(f4);

		for(fruits x : lhs)
		{
			System.out.println(x.name+" "+x.weight+" "+x.price +" "+x.colour);
		}

		lhs.remove(f1);
		lhs.add(new fruits("Strawberry",1,80,"red"));
		
		System.out.println("--------------------------");
		Iterator<fruits> lhsi = lhs.iterator();
		while(lhsi.hasNext())
		{
			fruits f = lhsi.next();
			System.out.println(f.colour+" "+f.name +" "+f.price +" "+f.weight);
		}
	}
}

class fruits implements Comparable<fruits>
{
	String name ;
	int weight ;
	int price ;
	String colour ;
	
	fruits(String name , int weight , int price , String colour)
	{
		this.name = name ;
		this.weight = weight ;
		this.price = price ;
		this.colour = colour ;
	}
	
	@Override
	public int compareTo(fruits o) 
	{
		if(this.price > o.price)
			return 1 ;
		
		else if (this.price < o.price)
			return -1 ;
		
		else return 0 ;
	}
}

