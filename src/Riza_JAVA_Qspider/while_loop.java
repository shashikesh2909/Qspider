package Riza_JAVA_Qspider;

public class while_loop {

	public static void main(String[] args) 
	{
		/*
		// Q1 : WAP to print numbers from 1- 10
		int i = 1;
		while (i<11)
		{
			System.out.println(i);
			i++;
		}
		
		// Q2 : WAP to print numbers from 30-15 
		
		int i = 30;
		while (i>=15)
		{
			System.out.println(i);
			i--;
		}
		
		
		// Q3 : wap to print odd numbers till 50 
		
		int i = 1; 
		while ( i<=50)
		{
			if (i%2!=0)
			{
				System.out.println(i);
			}
			i++;
		}
	
		// Q4 : wap to print alphabet from A-Z 
		
		int a = 65 ;
		while (a<91)
		{
			System.out.println((char)a);
			a++;
		}
		
		//Q5 : wap to print alphabet from z-a
		int a = 122 ;
		while (a>=97)
		{
			System.out.println((char)a);
			a--;
		}
			
		
		// Q6 : wap to print multiplication table of any number 
		
		int i = 1;
		while ( i< 11)
		{
			System.out.println("5 * "+i + " = " + 5*i);
			i++;
		}
*/
		
		
		//  Using for loop 
		
		 //  Q1 : WAP to print numbers from 1- 10
		
		for ( int i=0;i<11;i++)
		{
			System.out.println(i);
		}
		
		System.out.println("---------------------------------------------");
		
		// Q2 : wap to print numbers from 30 - 15
		
		for (int i=30 ; i>=15 ; i--)
		{
			System.out.println(i);
		}
		
		System.out.println("--------------------------------------------------");
		
		// Q3 : wap to print odd numbers till 50 
		
		for ( int i =0; i<50 ; i++)
		{
			if (i%2==1)
			{
				System.out.println(i);
			}
		}
		
		// Q4 : wap to print alphabet from A-Z 
		
		for (int i = 65 ; i<91 ; i++)
		{
			System.out.println((char)i);
		}
		
		System.out.println("---------------------------------------------------------");
		
		// Q5 : wap to print alphabet from z-a
		
		for (int i = 122 ; i>=97 ; i--)
		{
			System.out.println((char)i);
		}
		
		System.out.println("---------------------------------------------------------");

		// Q6 : wap to print multiplication table of any number 
		
		int n = 5 ;
		for ( int i=1 ; i<11;i++)
		{
			System.out.println(n + " * " + i + " = " + 5*i);
		}
		
		System.out.println("---------------------------------------------------------");

		// factorial of a number 
		int m = 5 , fact = 1;
		 for(int i = m ; i> 0; i--)
		 {
			 fact = fact *i;
		 }
		 System.out.println("Factorial for "+m+" : "+fact);
		 
		 System.out.println("---------------------------------------------------------");
		 
		 

		  
	}

}
