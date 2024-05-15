package Java_programming_loop_array_String;

import java.util.Arrays;
import java.util.Scanner;

public class String_practice_ravi 
{
	static int a = 595 ;
	
	public static void main(String[] args)
	{
		String_practice_ravi obj = new String_practice_ravi() ;
	}
	
	public static String highAndLow(String num)
	{
		String [] s = num.split(" ");
		int [] n = new int [s.length];
		for (int i =0 ;i<s.length ;i++)
		{
			n[i] = Integer.parseInt(s[i]);
		}
		Arrays.sort(n);
		String low = String.valueOf(n[0]);
		String high = String.valueOf(n[n.length-1]);
		String out = String.join(" " , high , low ) ; 
		return out ;
	}
	public static int findIt(int [] a)
	{
		int count = 1 ;
		for(int i=0 ; i<a.length ; i++)
		{
			for (int j=0 ;j<a.length ;j++)
			{
				if (i != j)
				{
					if (a[i]==a[j])
					{
						count++ ;
					}
				}
			}
			if (count %2 != 0)
			{
				return a[i];
			}
			count = 1 ;
		}
		return 0 ;
	}
	
	public static String reverse(String s)
    {
        char c[] = s.toCharArray() ;
        char [] rev = new char[c.length];
        for(int i=c.length-1 ; i>-1 ; i--)
        {
            rev[c.length-1-i] = c[i] ;
        }
        String reverse = new String(rev);
        System.out.println(reverse);
        return reverse; 
    }
	
	public static String spinWords(String sentence) 
	  {
	    String [] s = sentence.split(" ");
	    for(int i=0 ; i<s.length ; i++)
	      {
	        if (s[i].length() >= 5)
	          {
	          s[i] = reverse(s[i]);
	        }
	    }
	    String output = String.join(" ", s);
	    return output ;
	  }
	
	public static String stringPallin(String s)
		{
			if (s.equals(reverse(s)))
				{
					return "Yes" ;
				}
			else
			{
				return "No" ;
			}
		}
	 
	public static String disemvowel(String str) 
    {
      char [] c = str.toCharArray() ;  // converting the string to char array 
      
      for(int i=0 ; i<c.length ; i++)
        {
          if (c[i] == 'a' || c[i] == 'e' || c[i] == 'i' || c[i] == 'o' || c[i] == 'u' )
            {
            c[i] = '$';
          }
      }
       String s = new String(c) ;
       return  s.replace("$","");
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

