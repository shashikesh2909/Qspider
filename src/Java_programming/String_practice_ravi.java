package Java_programming;

import java.util.Arrays;

public class String_practice_ravi 
{
	public static void main(String[] args)
	{
		practice_string_method();
	}
	
	public static void practice_string_method()
	{
		String s = "Hello Coumputer Program";
		String s1 = "Hello" ;
		String s2 = new String ("Hello");
		String s3 = new String ("HELLO");
		String s4 = "Hello" ;
		
		System.out.println("In literals using == " + (s == s1));

		System.out.println("\nIn object using == " + (s2 == s3));
		
		System.out.println("\ntoUpperCase :  " + (s.toUpperCase()));
		
		System.out.println("\ntoLowerCase : " + (s.toLowerCase()));
		
		System.out.println("\ntoCharArray() concat with string:  " + (s.toCharArray()));
		
		System.out.println("\nPrint toCharArray()");
		System.out.println(s.toCharArray());
		
		char [] c = s.toCharArray();
		
		System.out.println("\nPrint a c char array stored the s.toCharArray() : ");
		System.out.println(c);
		
		System.out.println("\nChar Array length : "+ s.length());
		
		System.out.println( "\nto charArray length : " +  (s.toCharArray()).length);
		
		System.out.println("\ns.charAt() : " + s.charAt(1));
		
		System.out.println("\ns.substring() : " + s.substring(1));
		
		System.out.println("\ns.substring() : " + s.substring(1,4));
		
		System.out.println("\ns.indexof() : " + s.indexOf('o'));
		
		System.out.println("\ns.indexof() : " + s.indexOf('o',5));
		
		System.out.println("\ns.indexof() : " + s.isEmpty());
		
		System.out.println("\ns.concat(s1) : " + s.concat(" " +s1));
		
		System.out.println("\ns.contains(hello) : " + s.contains("Hello"));
		
		System.out.println("\ns.equals(s4) : " + s.equals(s4));
		
		System.out.println("\ns.equals(s4) : " + s1.equalsIgnoreCase(s4));
		
		System.out.println("\ns.equals(s4) : " + s1.equalsIgnoreCase(s4));
		
		System.out.println("\ns.equals(s4) : " + s1.endsWith("He"));
		
		System.out.println("\ns.equals(s4) : " + s1.startsWith("He"));
		
	}
}
