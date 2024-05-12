package java_core_project;

import java.util.Scanner;

public class BookMyShow implements Bms 
{
	static Scanner sc = new Scanner(System.in) ;
	String uid;
	String pwd ;
	String l ;
	String movie ;
	String seat_type ;
	int no_seat ;
	int amount ;
	
	public void signup() 
	{
		System.out.println("\n\n*******************|| Welcome to Book my show Sign up page || *********************\n\n");
		System.out.println("Enter the Email ID");
		this.uid = sc.next();
		System.out.println("Enter the Password");
		this.pwd = sc.next();
		
		System.out.println("Sign up completed !\n\n");
		System.out.println("-------------------------------------------------------------------------------------------");
		login () ;
	}
	public Boolean login()

	{
		System.out.println("\n\n*******************|| Welcome to BooK my show || **********************************\n\n");
		System.out.println("Do you Already have an account (Y/N) ? ") ;
		char c =sc.next().charAt(0);
		if (c == 'Y' || c== 'y')
		{
			System.out.println("Please enter your registered email id");
			String s = sc.next();
			System.out.println("Please enter your password");
			String p = sc.next();
			
			if (s.equalsIgnoreCase(this.uid) && p.equalsIgnoreCase(this.pwd))
			{
				System.out.println("Login succesfully");
				System.out.println("\n\n\n --------------------------------------------------------------------------------");
			return true ;
			}
			else
			{
				System.out.println("Incorrect credential, please enter the valid input\n\n\n");
				System.out.println("------------------------------------------------------------------------------------------");
				login();
				return false ;
			}
			
		}
		else
		{
			signup();
			return false ;
		}
		
	}
	public String loc(BookMyShow b)
	{
		if (b instanceof Movies)
		{
			System.out.println("\n\nPlease select the location : ");
			System.out.println("1. for Delhi");
			System.out.println("2. for Mumbai");
			System.out.println("3. for Bangalore");
			System.out.println("4. for chennai");
		
			int loc = sc.nextInt();
			if(loc == 1)
			{
				System.out.println("Delhi location is selected");
				this.l = "Delhi" ;
				return "Delhi" ;
			}
			else if(loc == 2)
			{
				System.out.println("Mumbai location is selected");
				this.l = "Mumbai" ;
				return "Mumbai" ;
			}
			else if(loc == 3)
			{
				System.out.println("Bangalore location is selected");
				this.l = "Bangalore" ;
				return "Bangalore" ;
			}
			else if(loc == 4)
			{
				System.out.println("Kolkata location is selected");
				this.l = "Chennai" ;
				return "Chennai" ;
			}
			else 
			{
				System.out.println("Invalid input, Enter the calid input");
				return " ";
			}
		}
		
		else if (b instanceof Comedy)
		{
			System.out.println("\n\nPlease select the location : ");
			System.out.println("1. for Delhi");
			System.out.println("2. for Patiala");
			System.out.println("3. for Rajasthan");
			System.out.println("4. for Chandigadh");
			
			int loc = sc.nextInt();
			if(loc == 1)
			{
				System.out.println("Delhi location is selected");
				return "Delhi" ;
			}
			else if(loc == 2)
			{
				System.out.println("Patiala location is selected");
				return "Patiala" ;
			}
			else if(loc == 3)
			{
				System.out.println("Rajasthan location is selected");
				return "Rajasthan" ;
			}
			else if(loc == 4)
			{
				System.out.println("Chandigadh location is selected");
				return "Chandigadh" ;
			}
			else 
			{
				System.out.println("Invalid input, Enter the calid input");
				return " ";
			}
		}
		else
		{
			return " " ;
		}	
	}
	
	public String selectOperation()
	{
		System.out.println("\n\n Please select the option");
		System.out.println("1. for Movies");
		System.out.println("2. for Comedy Show");
		int ch = sc.nextInt();
		
		if(ch == 1)
		{
			return "Movie" ;
		}
		
		if(ch == 2)
		{
			return "Comedy" ;
		}
		else
		{
			System.out.println("Invalid selection1 , please select the correct choice");
			selectOperation();
			return " " ;
		}
	}
	
	public void fullBookings()
	{
		login();
		String op = selectOperation();
		
		if (op.equalsIgnoreCase("movie"))
		{
			Movies m = new Movies();
			this.l = loc(m);
		}
		else if (op.equalsIgnoreCase("comedy"))
		{
			Comedy c = new Comedy() ;
			this.l = loc(c);
		}
	}
	
	
}
