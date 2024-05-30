package collection;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapsWorking {

	public static void main(String[] args) 
	{
		
		method1();
	}
	
	public static void method1()
	{
		HashMap<Integer,String> hm = new HashMap();
		hm.put(1,"My");
		hm.put(2,"Name");
		hm.put(3,"is");
		hm.put(4,"Shashikesh");
		
		Collection<String> c = hm.values() ;
		for(String x : c)
		{
			System.out.print(reverse(x) + " ");
		}
	}
	
	public static String reverse(String s)
	{
		char [] c = s.toCharArray();
		char [] r = new char[s.length()];
		for (int i=0;i<s.length();i++)
		{
			r[c.length-1-i] = c[i];
		}
		String rev = new String(r);
		return rev ;
	}
	
	public static void method()
	{
		HashMap<String,String> hm = new HashMap() ;
		
		hm.put("RCB", "Virat");
		hm.put("MI", "Rohit");
		hm.put("LSG", "Rahul");
		hm.put("CSK", "Dhoni");
		hm.put("SRH", "Cummins");
		
		Set<String>s =  hm.keySet();
		for(String x : s)
		{
			System.out.println(x);
		}
		
		Collection<String> c =  hm.values();
		for(String x : s)
		{
			System.out.println(x);
		}
		
		Set<Entry<String,String>> s1 = hm.entrySet();
		
		for(Map.Entry<String,String> x : s1 ) 
		{
			System.out.println(x.getKey() + " " + x.getValue()) ;
		}
		
		System.out.println("---------------------------------------");
		
		Set<String>si =  hm.keySet();
		Iterator<String> i = si.iterator();
		while(i.hasNext())
		{
			String a = i.next();
			System.out.println(a);
		}
		
		Collection<String>si2 =  hm.values();
		Iterator<String> i2 = si2.iterator();
		while(i2.hasNext())
		{
			String a = i2.next();
			System.out.println(a);
		}
    
		Set<Entry<String,String>> si3 = hm.entrySet();
		Iterator<Entry<String, String>> i3 = si3.iterator();
		while(i3.hasNext())
		{
			Entry<String, String> s2 = i3.next();
			System.out.println(s2.getKey() + " " + s2.getValue());
			
		}
	}

}
