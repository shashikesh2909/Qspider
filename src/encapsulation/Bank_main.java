package encapsulation;

import java.util.Scanner;

public class Bank_main {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the account no : ");
		long acno = sc.nextLong();
		System.out.println("Enter the Balance");
		double bal = sc.nextDouble();
		System.out.println("Enter the pin");
		int pin = sc.nextInt();
		
		Bank cx1 = new Bank(acno ,bal,pin);
		
		System.out.println(cx1.getaccno());
		System.out.println(cx1.getbalance());
		System.out.println(cx1.getpin());
		
		cx1.setdepositbalance(5000);
		System.out.println(cx1.getbalance());
		cx1.setwithdrawlbalance(2000);
		System.out.println(cx1.getbalance());
		
		cx1.setpin(6969);
		System.out.println(cx1.getpin());
		
	}

}
