package exception_handling;

import java.util.Scanner;

public class Delhi_metro {
	static Scanner sc = new Scanner(System.in);
	
	public static void tap(int balance)
	{
		if (balance > 10)
		{
			System.out.println("open gate");
		}
		else 
		{
			throw new Low_balance_exception () ;
		}
	}

	public static void main(String[] args) {
		
		System.out.println("Enter the balance");
		int amt = sc.nextInt();
		try 
		{
		tap(amt);
		}
		catch (Low_balance_exception lb)
		{
			System.out.println(lb.getMessage());
			lb.printStackTrace();
			System.out.println(lb);
		}
		

	}

}
