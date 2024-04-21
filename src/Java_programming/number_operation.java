package Java_programming;

import java.util.Scanner;

public class number_operation {
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in) ;
		System.out.println("Enter the number");
		int n = sc.nextInt();
		
		numopr(n);
		
		sc.close();
	}
	
	public static void numopr(int n)
	{

//		1. take input from user and extract the last digit.
//		2. take input from user and remove the last digit .
//		3. take input from user and count no. of digit.  
		
		System.out.println("The last digit of a number : " + n%10);
		System.out.println("The number after removing last digit: " +n/10);
		int count = 0;
		while (n>0)
		{
			n = n/10 ;
			count++;
		}
		System.out.println("Number of digit : " + count);
	}

}
