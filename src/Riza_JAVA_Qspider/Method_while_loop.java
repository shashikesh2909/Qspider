package Riza_JAVA_Qspider;

import java.util.Scanner;

public class Method_while_loop 
{	
//////////////////////////////////////////////////////////////////////////////////////////

//MAIN OF CLASS method_while_loop
public static void main(String[] args) 
{

Scanner sc = new Scanner(System.in);
System.out.println("Enter the number ");
int a = sc.nextInt();

System.out.println("---------------------------------------");
boolean b = disarium (a);
if (b == true)
{
System.out.println("This is disarium Number");
}
else
{
System.out.println("This is not a disarium Number");
}


System.out.println("---------------------------------------");
b = pallindrome (a);
if (b == true)
{
System.out.println("This is pallindrome Number");
}
else
{
System.out.println("This is not a pallindrome Number");
}


System.out.println("---------------------------------------");

System.out.println("The list of first 12 prime number is: ");
prime12() ;


System.out.println("\n---------------------------------------");
b = emirp (a);
if (b == true)
{
System.out.println("This is EMIRP Number");
}
else
{
System.out.println("This is not a EMIRP Number");
}



System.out.println("---------------------------------------");
b = harshad (a);
if (b == true)
{
System.out.println("This is harshad Number");
}
else
{
System.out.println("This is not a harshad Number");
}


System.out.println("---------------------------------------");
b = happy(a);
if (b == true)
{
System.out.println("This is happy Number");
}
else
{
System.out.println("This is not a happy Number");
}



sc.close();
}

//////////////////////////////////////////////////////////////////////////////////////////

// Method to calculate the sum of digit of a number.
	public static int digit_sum  (int n)
	{
		int sum = 0, ld =0;
		
		while (n>0)
		{
			ld = n%10 ;
			sum = sum + ld;
			n = n/10;
		}
		return sum;
	}

//////////////////////////////////////////////////////////////////////////////////////////

// Method to count the digit of a sum
	public static int digit_count  (int n)
	{
		int count=0, ld=0;
		
		while (n>0)
		{
			ld = n%10 ;
			count++;
			n = n/10;
		}
		return count;
	}

//////////////////////////////////////////////////////////////////////////////////////////

// Write a method to check whether the number is prime or not
	public static boolean prime(int n)
	{
		boolean res = false ;
		for (int i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
				return true;
			}
		}
			return false ;
	}

//////////////////////////////////////////////////////////////////////////////////////////

// WAJP to check whether the number is SPY number (if sum of digit is equal to product of digits in a number)
	public static boolean spy (int n)
	{
		int sum =0 , pro = 1, ld =0 ;		
		while(n>0)
		{
			ld = n%10;
			sum = sum+ld ;
			pro = pro*ld ;
			n = n/10 ;
		}
		if (sum == pro)
		{
		return true ;
		}
		else
		{
			return false ;
		}
	}

//////////////////////////////////////////////////////////////////////////////////////////

// WAJP to find the number is NEOM (sum of digit of a square of number = number)
	public static boolean neom(int n)
	{
		int sum =0 ,ld =0 ;
		int sqr = n*n;
		while(sqr>0)
		{
			ld = sqr%10;
			sum = sum + ld ;
			sqr = sqr/10 ;
		}
		if (sum == n)
		{
		return true;
		}
		else
		{
			return false ;
		}
	}

//////////////////////////////////////////////////////////////////////////////////////////

// WAJP to find the FACTORIAL of the number
	public static int factorial(int n)
	{
		int fact=1;
		for (int i=n;i>0;i--)
		{
			fact = fact*i;
		}
		return fact;
	}

//////////////////////////////////////////////////////////////////////////////////////////

// WAJP to find the FACTORS of the number
	public static void factor(int n)
	{
		for (int i=1;i<n;i++)
		{
			if(n%i == 0)
			{
				System.out.println(i);
			}
		}
	}
	
//////////////////////////////////////////////////////////////////////////////////////////
	
// Wajp to create a method to return SUM of FACTORIAL of digits of a number
	public static int factorial_digit_same (int n)
	{
		int sum = 0;
		int ld =0;
		 while (n>0)
		 {
			ld = n%10 ;
			sum = sum + factorial(ld);
			n = n/10 ;
		 }
		return sum ;
	}
	
//////////////////////////////////////////////////////////////////////////////////////////

// Wajp to find whether the number is PETERSON number (strong number) or not  ( if sum of factorial of a digit of a number is equal to the number itself is known as Peterson number.
	public static boolean  Peterson_number (int n)
	{
		int a = n; 
		int sum = 0;
		int ld =0;
		 while (n>0)
		 {
			ld = n%10 ;
			sum = sum + factorial(ld);
			n = n/10 ;
		 }
		 return sum==a ; 
		 
	}

//////////////////////////////////////////////////////////////////////////////////////////

	// Wajp to find whether the number is AUTO-BIOGRAPHICAL number or not Its the sum of digit of number is equal to number of digits it is known as autobiographical number
	public static boolean Auto_biography (int n)
	{
		if (digit_sum(n) == digit_count(n))
		{
		return true ;
		}
		else
		{
			return false ;
		}
	}

//////////////////////////////////////////////////////////////////////////////////////////

// 	Wajp to find whether the number is a SMITH number ( if sum of digit of a number is equal to the sum of digit of the prime factors of a number)
	public static boolean smith(int n)
	{
		// to find the sum of digit of number
		int sum1 = digit_sum(n);
		// to find the sum of prime factor of a number
		int sum2 = 0;
		for (int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				sum2 = sum2 + digit_sum(i);
			}	
		}
		
		if(sum1 == sum2)
		{
		return true;
		}
		else
		{
			return false;
		}
	}

//////////////////////////////////////////////////////////////////////////////////////////

// Wajp to find whether the number is AUTOMORPHIC number ( square ends in the same digits as the number itself	
public static boolean automorphic (int n)
{
	int a = n;
	int sqr = n*n ;
	int nod = digit_count(n);
	int denm = 0;
	switch (nod)
	{
	case 1 : denm = 10 ;
	break;
	case 2 : denm = 100 ;
	break;
	case 3 : denm = 1000;
	break;
	case 4 : denm = 10000;
	break;
	case 5 : denm = 100000;
	break;
	case 6 : denm = 1000000;
	break;
	case 7 : denm = 10000000;
	break;
	case 8 : denm = 100000000;
	break;
	case 9 : denm = 1000000000;
	break;
	}
	int ld = sqr%denm;
	
	if (a == ld)
	{
	return true;
	}
	else 
	{
		return false ;
	}
}

//////////////////////////////////////////////////////////////////////////////////////////

// WAJP to print ISBN number in java( ten digit number, if we sum of product of digit to the digit place and finally divide by 11, the remainder is zero)
public static boolean isbn (long n)
{
	int i = 1;
	long sum = 0;
	while (n > 0)
	{
		sum = sum + (i*(n%10)) ;
		n = n/10;
		i++;
	}
	
	if (sum%11 == 0)
	{
	return true ;
	}
	else
	{
		return false ;
	}
}

//////////////////////////////////////////////////////////////////////////////////////////

// WAJP to find the number is perfect square number or not
public static boolean persqr(int n)
{
	for (int i=1;i<n/2;i++)
	{
		if (i*i == n)
			return true;

	}
	return false;
}

//////////////////////////////////////////////////////////////////////////////////////////

// wajp to reverse a number
public static int reverse (int n)
{
	int rev =0 ;
	int ld = 0;
	
	while (n>0)
	{
	ld = n%10 ;
	rev = (rev*10) + ld ;
	n = n/10 ;
	}
	return rev ;
}

//////////////////////////////////////////////////////////////////////////////////////////

// wajp to check whether the number is arm strong or not

// program to check the number of digit in number
public static int no_digit(int n)
{
	int count = 0;
	while (n>0)
	{
		n= n/10 ;
		count ++;
	}
	return count ;
}

//program to return power of number for given number and given power
public static int pow(int n , int t)
{
	int pro = 1;
	for (int i=0 ; i<t;i++)
	{
		pro = n*pro ;
	}
	return pro;
}

 public static boolean armstrong(int n)
 {
	 int a = n;
	 int sum =0, ld =0 ;
	int num = no_digit(n);
	while (n>0)
	{
		ld = n%10 ;
		sum = sum + pow(ld,num);
		n = n/10 ;
	}
	if (a == sum )
	{
		return true ;
	}
	else 
	{
		return false ;
	}
	
 }
 
//////////////////////////////////////////////////////////////////////////////////////////

 // Tech number ( a 4 digit number divided by 2 and sum of both side and its square is equal to number )
 public static boolean tech (int n)
 {
	 int dig = no_digit(n);
	 if (dig != 4)
	 {
		 System.out.println("Invalid input");
	 }
	 int a = n ;
	 int num1 = n%100;
	 n = n/100;
	 int num2 = n%100;
	 
	 int sum1 = num1 + num2 ;	 
	 int sqr = sum1*sum1 ;
	 if  (sqr == a)
	 {
		 return true ;
	 }
	 else 
	 {
		 return false ;
	 }
 }
 
//////////////////////////////////////////////////////////////////////////////////////////

 // WAJP to find check whether the number is pallindrome or not .
 // WAJP to check whether the number is pallindrome or not ( reverse of a number is equal to actual number 
 
 public static boolean pallindrome (int n)
 {
	 int a = n ; 
	 int rev = 0 , ld =0 ;
	 
	 while (n>0)
	 {
		 ld = n%10 ;
		 rev = rev*10 + ld ;
		 n = n/10 ;
	 }
	 
	 if ( a == rev)
	 {
		 return true ;
	 }
	 
	 else
	 {
		 return false ;
	 }
	 
 }
 ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
 
 // WAJP to find whether number is disarium or not  ( when the sum of its digit raised to the power of their respective positions is equal to number itself. )
 public static int digCount (int n)
 {
	 int count = 0;
	 
	 while (n> 0)
	 {
	 n = n/10 ;
	 count ++ ;
	 }
	 return count ;
 }
 
 public static int digPow(int n , int t)
 {
	 int product = 1; 
	 
	 for (int i=0; i<t ; i++)
	 {
		 product = product * n ;
	 }
	
	 return product ;
 }
 public static boolean disarium (int n)
 {
	 int a = n ;
	 int nod = digCount(n);
	 int sum = 0 , ld =0 ;
	 
	 while (n>0)
	 {
		ld = n%10 ;
		sum = sum + digPow(ld,nod) ;
		nod-- ;
		n = n/10 ;
	 }
	 
	 if (a == sum)
	 {
		 return true ;
	 }
	 else 
	 {
		 return false ;
	 }
 }
 /////////////////////////////////////////////////////////////////////////////////

 //WAJP to print first 12 prime number. 
 
public static boolean primecheck(int n)
{
	int count = 0;
	for (int i=1;i<n;i++)
	{
		if (n%i == 0)
		{
			count++;
		}
	}
	if (count>1)
	{
		return false ;
	}
	else
	{
		return true ;
	}
	
}

public static void prime12()
{
	int count = 0 , n = 2;
	while (count < 12)
	{
		if (primecheck(n) == true )
		{
			System.out.print(n +" ");
			count++;
		}
		
		n++ ;
	}
}
////////////////////////////////////////////////////////////////////////////////////////////////////////////////

// WAJP to check whether number is EMIRP or not ( number is prime also its reverse is prime

public static boolean emirp (int n)
{
	int rev = 0, ld =0 ;
	
	boolean isprime = primecheck(n);
	
	while (n>0)
	{
		ld = n%10 ;
		rev = rev*10+ld ;
		n = n/10 ;
	}
	
	boolean isprime2 = primecheck(rev);
	if (isprime == true && isprime2 == true)
	{
	return true ;
	}
	else
	{
		return false ;
	}
}
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

// WAJP HARSHAD number ( if it is divisible by the sum of its digit.) 

public static boolean harshad(int n)
{
	int sum =0 ;
	int a = n; 
	while (n>0)
	{
		sum = sum + n%10 ;
		n = n/10 ;
	}
	
	if ( a % sum == 0)
	{
	return true ;
	}
	else
	{
		return false ;
	}
}
/////////////////////////////////////////////////////////////////////////////////////////////////////

// WAJP to check whether the number is happy number or not. 
// to find the sum of square of a number.

public static int ssd(int n)
{
	int sum = 0 , ld =0;
	while (n>0)
	{
		ld = n%10 ;
		sum = sum + ld*ld ;
		n = n/10 ;
	}
	return sum ;
}
public static boolean happy(int n)
{
	int sum = ssd(n), i=1;
	while (ssd(n)!=1)
	{
		if (ssd(n)== 1 && i<10)
		{
			return true ;
		}
		else 
		{
			sum = ssd(sum);
			n = sum ;
			if(i==9)
			{
				return false ;
			}
		}
		
		i++ ;
	}
	return true ;
}

}
