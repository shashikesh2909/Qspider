package object_class;

public class Boxing_unboxing 
{
	
	
	public static void main (String [] args)
	{
		int a = 0;
		System.out.println(a=5);
	}
	
	public static void practice()
	{
		short a = 10;
		
		Short b = Short.valueOf(a);
		short c = Short.valueOf(a);
		short d = Short.valueOf(b);
		
		char e = 'A' ;
		Character f = Character.valueOf(e);
		char g = Character.valueOf(e);
		int h = Character.valueOf(e);
		int i = Character.valueOf(f) ;
		
		Character j = 'A' ;
		char k = (char) j ;
		int l = (int)(char)j ;
		
//		Integer m = 'A' ;
		
		


	}
	
	public static void conversion()
	{
		String a = "10" ;
		Integer b = Integer.parseInt(a) ;
		System.out.println(b);
		System.out.println(b.hashCode());
		System.out.println("---------------------");
		
		Double c = Double.parseDouble(a) ;
		System.out.println(c);
		System.out.println(c.hashCode());
		System.out.println("---------------------");
		
		Character d = a.charAt(0);
		System.out.println(d);
		System.out.println(d.hashCode()); 
		System.out.println("---------------------");


		int e = Integer.parseInt(a) ;
		System.out.println(e);
		System.out.println("---------------------");

		
		double f = Double.parseDouble(a) ;
		System.out.println(f);
		System.out.println("---------------------");

		char g = a.charAt(0) ;
		System.out.println(g);
	}
}
