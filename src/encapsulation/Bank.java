package encapsulation;

import java.util.Scanner;

public class Bank 
{
	
	static Scanner sc = new Scanner (System.in);
	
	private String userid ;
	private String pwd ;
	String name ;
	private long accno ;
	private double balance ;
	private int pin ;
		
	public void login()
	{
		System.out.println("-----------------------------------------------------------------");
		System.out.println("-----------------------------------------------------------------");
		System.out.println("-----------------------------------------------------------------");
		System.out.println("-----------------------------------------------------------------");
		System.out.println("*************WELCOME TO ENCAPSULATION BANK*********************\n");
		
		System.out.println("\n      Enter user ID");
		String uid = sc.next();
		System.out.println("\n");
		System.out.println("        Enter user Password");
		String pwd = sc.next();
		
		if (getuserid().equals(uid) && getpwd().equals(pwd))
		{
			operation();
		}
		else
		{
			System.out.println("Invalid userid or password");
			login();
		}
	}
	
	public void operation()
	{
		System.out.println("************************************************************************");
		System.out.println("************************************************************************");
		System.out.println("-----------Welcome to Encapsulation bank operations page --------------\n\n");
		
		System.out.println("       User Name : " + getname() + "         Account Numer : "+ getaccno());
		
		System.out.println(" \n\nSelect the operation you want to perform \n");
		
		System.out.println( "1.    Show Balance");
		System.out.println( "2.    Deposit Balance");
		System.out.println( "3.    Withdraw Balance");
		System.out.println( "4.    Change pin");
		System.out.println( "5.    update userid");
		System.out.println( "6.    update pwd ");
		System.out.println( "7.    Exit Balance");	
		
		System.out.println("\nEnter the option number");
		int n = sc.nextInt();
		
		System.out.println("---------------------------------------------------------");
		if (n==1)
		{
			System.out.println("Enter the Pin");
			int p = sc.nextInt();
			System.out.println(getbalance(p));
			System.out.println("------------------------------------------------------");
			cont() ;
		}
			
		else if (n==2)
		{
			System.out.println("Enter the Amount to deposit");
			double amt = sc.nextDouble();
			setdepositbalance(amt);
			System.out.println("------------------------------------------------------");
			cont() ;	
		}
		
		else if (n==3)
		{ 
			System.out.println("Enter the Pin");
			int p = sc.nextInt();
			setwithdrawlbalance(p);
			System.out.println("------------------------------------------------------");
			cont() ;
		}
		
		else if (n==4)
		{
			System.out.println("Please enter the old pin ");
			int pin = sc.nextInt();
			setpin(pin);
			System.out.println("------------------------------------------------------");
			cont() ;
		}
		
		else if (n==5)
		{
			System.out.println("Please enter the old pin ");
			int pin = sc.nextInt();
			setuserid(pin);
			System.out.println("------------------------------------------------------");
			cont() ;
		}
		
		else if (n==6)
		{
			System.out.println("Please enter the old pin ");
			int pin = sc.nextInt();
			setpwd(pin);
			System.out.println("------------------------------------------------------");
			cont() ;
		}
		
		else if(n==7)
		{
			login();
		}
		else
		{
			System.out.println("Invalid input");
			operation();
		}
	}
	
	public void cont ()
	{
		System.out.println("want to perform any other action (Y/N)");
		char per = sc.next().charAt(0);
		if (per == 'y' || per == 'Y')
		{
			operation() ;
		}
		else 
		{
			System.out.println("Thank you for using online banking service !");
		}	
	}
	Bank (String userid , String pwd, String name,long accno ,double balance ,int pin)
	{
		this.userid = userid;
		this.pwd = pwd ;
		this.name= name ;
		this.accno = accno ;

		if (pin > 999 && pin <=9999)
		{
			this.pin = pin ;
		}
		else
		{
			this.pin = 1234 ;
		}
		
		if (balance > 0)
		{
		this.balance = balance ;
		}
		else 
		{
			this.balance = 0 ;
		}
			
	}
	
	public void display(int pin)
	{
		if (this.pin == pin )
		{
			System.out.println(this.name +" " + accno + " " + balance + " " + pin);
		}
	}
	
	public String getuserid()
	{
		return this.userid;
	}
	
	public void setuserid(int pin)
	{
		if (this.pin == pin)
		{
			System.out.println("Enter new User id");
			sc.nextLine();
			String uid = sc.nextLine();
			this.userid = uid ;
		}
		else 
		{
			System.out.println("Wrong pin entered! ");
			System.out.println("Please eneter the correct pin");
			int npin = sc.nextInt();
			setuserid(npin);
			System.out.println("userid is updated");
		}
	}
	
	public String getpwd()
	{
		return this.pwd;
	}
	
	public void setpwd(int pin)
	{
		if (this.pin == pin)
		{
			System.out.println("Enter new Password");
			sc.nextLine();
			String pwd = sc.next();
			this.pwd = pwd ;
			System.out.println("Password is updated");
		}
		else 
		{
			System.out.println("Wrong pin entered! ");
			System.out.println("Please eneter the correct pin");
			int npin = sc.nextInt();
			setuserid(npin);
		}
	}
	
 	public String getname()
	{
		return this.name ;
	}
	
	public void setname (String name)
	{
		this.name = name;
		System.out.println("Name is updated");
	}
	
	public long getaccno()
	{
		return  this.accno ;
	}
	
	public double getbalance(int pin )
	{
		if (this.pin == pin)
		{
			System.out.print("The Balance is : ");
		return this.balance ;
		}
		else 
		{
			System.out.println("Wrong pin entered! ");
			System.out.println("Please eneter the correct pin");
			int npin = sc.nextInt();
			getbalance(npin);
			return this.balance ;
		}
	}
	
	public void setdepositbalance(double balance)
	{
		this.balance = this.balance + balance ;
		System.out.println("Your amount of " + balance +  " is deposited");
	}
	
	
	public void setwithdrawlbalance(int pin)
	{
		if (this.pin == pin)
		{
			System.out.println("Enter the amount to withdraw");
			double amt = sc.nextDouble();
			if (this.balance > amt )
			{
				this.balance = this.balance - amt ;
				System.out.println("The withdrwal of Rs : " + amt + " is done" );
			}
			else
			{
				System.out.println("There is no enough balance! ");
			}
		}
		else 
		{
			System.out.println("Wrong pin!");
			System.out.println("Please eneter the correct pin");
			int npin = sc.nextInt();
			setwithdrawlbalance(npin);
		}
	}
	
	public void setpin (int op)
	{
		if (this.pin == op)
		{
			System.out.println("Enter the new pin: ");
			int pin = sc.nextInt();
			
			if (pin > 999 && pin <=9999 && this.pin != pin)
			{
			this.pin = pin ;
			System.out.println("pin is updated");
			}
			else 
			{
				System.out.println("Incorrect format ! Try again");
				System.out.println("---------------------------------");
				System.out.println("please enter the old pin ");
				int npin = sc.nextInt();
				setpin(npin);
			}
		}
		else
		{
			System.out.println("entered old pin is incorrect");
		}
		
	}
	
	public int getpin()
	{
		return this.pin ;
	}
}
