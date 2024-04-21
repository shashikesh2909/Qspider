package Riza_JAVA_Qspider;

import java.util.Scanner;

public class While_Loop_Digit_Number_Question 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
	// Q1 : WAJP to find the product of digit of a number 
		//	System.out.println("Enter the number");
		int n = 58123;
		int p = 1 , ld = 0;
		
		while (n>0)
		{
			ld = n%10;
			p = p*ld;
			n = n/10;
		}
		System.out.println("Product of digit of number is :" + p);
		
System.out.println("-------------------------------------------");
		
	// WAJP to print sum of odd digit of number
		//	System.out.println("Enter the number");
		n = 12345678 ;
		int sum =0;
		
		while (n>0)
		{
			ld = n%10;
			if(ld%2==1)
			{
			sum = sum+ld;
			}
			n = n/10;
		}
		System.out.println("sum of odd digit of number is :" + sum);
		
System.out.println("-------------------------------------------");
		
	// WAJP to print product of even digit of number
		//System.out.println("Enter the number");
		n = 7654321 ;
		p=1;
		while(n>0)
		{
			ld = n%10;
			if(ld%2==0)
			{
				p = p*ld;
			}
			n = n/10;
		}
		System.out.println("product of even digit of number is :" + p);
		
System.out.println("-------------------------------------------");

	// WAJP to print number of digit in a number
		//System.out.println("Enter the number");
		n = 9876543;
		int count=0 ;
		while(n>0)
		{
			ld = n%10;
			n = n/10;
			count++;
		}
		System.out.println("Total number of digits in number :"+count);
		
System.out.println("-------------------------------------------");

		// WAJP to print number of even and odd digit in a number
			//System.out.println("Enter the number");
			n = 963855;
			int even =0 , odd = 0;
			while (n>0)
			{
				ld = n%10;
				if(ld%2==0)
				{
					even++;
				}
				else
				{
					odd++;
				}
				n = n/10;
			}
			System.out.println("Number of even digit:" + even + "\nNumber of odd number digit: " + odd);
		
System.out.println("-------------------------------------------");

		// WAJP to print first digit of a number
			//System.out.println("Enter the number");
			n = 951357;
			
			while (n>9)
			{
				n = n/10;
			}
			System.out.println("The first digit of a number is: "+n);

System.out.println("-------------------------------------------");

			// WAJP to print sum of first and last digit of a number
			//	System.out.println("Enter the number");
				n = 987654;
				int a = n%10 ;
				while (n>9)
				{
					n = n/10;
				}
				System.out.println("The sum of first and last digit of a number is: "+ (n+a));
				
System.out.println("-------------------------------------------");

			// WAJP to print sum of digit excluding first and last digit of a number
		       //   System.out.println("Enter the number");
					n = 976431;
					sum =0;
					ld =0;
					n = n/10 ;
					while (n>9)
					{
						ld = n%10;
						sum = sum +ld;
						n = n/10;
					}
					System.out.println("The sum of all digit excluding first and last digit of a number is: "+ sum);
					
System.out.println("-------------------------------------------");

					// WAJP to check whether the number is xylem or phloem (the sum of exterior number is equal to sum of rest of the number)
					  // System.out.println("Enter the number");
					   n = 1234;
					   a = n%10;
					   n = n/10;
					   sum =0;
					   ld =0;
					   while(n>9)
					   {
						  ld = n%10;
						  sum = sum+ld;
						  n = n/10;
					   }
					   if (sum == (n+a))
					   {
						   System.out.println("The number is Xylem");
					   }
					   else 
					   {
						   System.out.println("The number is Phloem");
					   }
					   ;
System.out.println("-------------------------------------------");

					// WAJP to check whether the number is spy number ( if sum of digit is equal to product of digits in a number)
						 //System.out.println("Enter the number");
						 n = 1124;
						 sum =0;
						 ld = 0;
						 p = 1;
						 
						 while(n>0)
						 {
							 ld = n%10;
							 sum = sum+ld;
							 p = p*ld ;
							 n = n/10;
						 }
						 if (sum == p)
						 {
							 System.out.println("This is spy number");
						 }
						 else 
						 {
							 System.out.println("not a spy number");
						 }
						 
System.out.println("-------------------------------------------");

				// Wajp to find the factors of a number
					// System.out.println("Enter the number");
					n = 12;
					int i=1;
					System.out.println("factor of "+n+" are : ");
					while (i<n)
					{
						if(n%i==0)
							System.out.print(i+" ");
						i++;
					}
					System.out.println();

System.out.println("-------------------------------------------");

					// Wajp to find the number is neom (sum of digit of a square of number = number
						//System.out.println("Enter the number");
						n = 9;
						int sqr = n*n;
						a =sqr ;
						ld=0;
						sum = 0;
						while(sqr>0)
						{
							ld = sqr%10;
							sum = sum+ld;
							sqr = sqr/10;
						}
						if ( sum == n)
						{
							System.out.println("Number is neon");
						}
						else
						{
							System.out.println("Number is not neon");
						}
						 
						
System.out.println("-------------------------------------------");

						// Wajp to check whether the number is prime or not
							System.out.println("Enter the number");
							
							count = 0;
							i = 1;
							while (i<n)
							{
								if(n%i==0)
								{
									count++;
								}
								i++;		
							}
							if (count >1)
							{
								System.out.println("Numbr is not prime");
							}
							else 
							{
								System.out.println("Number is prime");
							}
							
							int num = sc.nextInt();
						boolean result = prime(num);
						if(result == true)
						{
							System.out.println("Its not a prime number");
						}
						else
						{
							System.out.println("Its a prime number");
						}
						
							
	sc.close();	
	}
	// Write a method to check whether the number is prime or not
	public static boolean prime(int n)
	{
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		boolean res = false ;
		for (int i=0;i<=n/2;i++)
		{
			if(n%i==0)
			{
				return true;
			}
		}
		return false ;
	}

}
