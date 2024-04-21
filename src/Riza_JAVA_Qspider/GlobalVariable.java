package Riza_JAVA_Qspider;

public class GlobalVariable {
	
	static int a=10;  		// global variable initialized
	static int p ;   		 // int global variable not initialized
	static double d;		// double global variable not initialized
	static boolean f;		// boolean global variable not initialized
	static String s;		// String global variable not initialized
	static char c;			// char global variable not initialized
	
	static int x ;
	
	public static void main(String[] args) 
	{
		
		int b =20;				// local variable 
		System.out.println(a);
		System.out.println(a+b);
		{
			int c = 30;
			System.out.println(a+b+c);
		}
		
		System.out.println(p);
		System.out.println(d);
		System.out.println(f);
		System.out.println(s);
		System.out.println(c);                   // no initial value for char
		
		int x = 10;				// local variable with same name as global
		
		System.out.println(x+b);       //preference given to local variable
		System.out.println(x+x);		// 20
		System.out.println(GlobalVariable.a);  // refereing to the global variable
		
		char a = 'a';
		System.out.println(x+a);
		
		//  6  13   a = 8
		
		
		
		
	}

}
