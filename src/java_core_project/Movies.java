package java_core_project;

public class Movies extends BookMyShow
{
	String movie ;
	String seat_type ;
	int no_seat ;
	int amount ;
	String popcorn_size ;
	int pop_quant ;
	int pop_amt ;
	String pepsi_size ;
	int pepsi_quant ;
	int pep_amt ;
	int nachos_quant ;
	String nachos_size ;
	int nacho_amt ;
	int total ;

	
	public void selectMovies ()
	{
		System.out.println(super.l);
		if (super.l.equalsIgnoreCase("Delhi"))
		{
			System.out.println("\n\nPlease select the movie");
			System.out.println("1. for Dor");
			System.out.println("2. for 3 Idiot");
			System.out.println("3. for Furiosa");
			System.out.println("4. for Demon slayer");
			int a = sc.nextInt();
			if(a==1)
			{
				this.movie = "Dor" ;
			}
			else if(a==1)
			{
				this.movie = "3 Idiot" ;
			}
			else if(a==1)
			{
				this.movie = "Furiosa" ;
			}
			else if(a==1)
			{
				this.movie = "Demon Slayer" ;
			}
			else 
			{
				System.out.println("Invalid choice");
				selectMovies() ;
			}
		}
		
		else if (super.l.equalsIgnoreCase("Mumbai"))
		{
			System.out.println("\n\nPlease select the movie");
			System.out.println("1. for singham");
			System.out.println("2. for munna bhai");
			System.out.println("3. for le bhari");
			System.out.println("1. for lunch box");
			int a = sc.nextInt();
			if(a==1)
			{
				this.movie = "Singham" ;
			}
			else if(a==1)
			{
				this.movie = "Munna Bhai" ;
			}
			else if(a==1)
			{
				this.movie = "le bhari" ;
			}
			else if(a==1)
			{
				this.movie = "lunch box" ;
			}
			else 
			{
				System.out.println("Invalid choice");
				selectMovies() ;
			}
		}
		
		else if (super.l.equalsIgnoreCase("Bangalore"))
		{
			System.out.println("\n\nPlease select the movie");
			System.out.println("1. for KGF");
			System.out.println("2. for KGF 2");
			System.out.println("3. for pushpa");
			System.out.println("1. for Kantara");
			int a = sc.nextInt();
			if(a==1)
			{
				this.movie = "KGF" ;
			}
			else if(a==1)
			{
				this.movie = "KGF 2" ;
			}
			else if(a==1)
			{
				this.movie = "Pushpa" ;
			}
			else if(a==1)
			{
				this.movie = "Kantara" ;
			}
			else 
			{
				System.out.println("Invalid choice");
				selectMovies() ;
			}
		}
		
		else if (super.l.equalsIgnoreCase("Chennai"))
		{
			System.out.println("\n\nPlease select the movie");
			System.out.println("1. for Kantara");
			System.out.println("2. for  vikram");
			System.out.println("3. for Raja Rani");
			System.out.println("1. for Leo");
			int a = sc.nextInt();
			if(a==1)
			{
				this.movie = "Kantara" ;
			}
			else if(a==1)
			{
				this.movie = "Vikram" ;
			}
			else if(a==1)
			{
				this.movie = "Raja Rani" ;
			}
			else if(a==1)
			{
				this.movie = "Leo" ;
			}
			else 
			{
				System.out.println("Invalid choice");
				selectMovies() ;
			}
		}
	}
	
	public void selectSeat()
	{
		System.out.println("\nPleae select the seat type");
		System.out.println("1. for Recliner   :  500 Rs ");
		System.out.println("2. for Executive  :  300 Rs ");
		System.out.println("3. for Normal     :  200 Rs ");
		int a = sc.nextInt();
		int amt = 0 ;
		if (a==1)
		{
			this.seat_type = "Recliner" ;
			amt = 500 ;
		}
		if (a==2)
		{
			this.seat_type = "Executive" ;
			amt = 300 ;
		}
		if (a==3)
		{
			this.seat_type = "Normal" ;
			amt = 200;
		}
		
		System.out.println("\n\nPlease select number of seats");
		this.no_seat = sc.nextInt();
		
		this.amount = this.no_seat*amt ;
		
		System.out.println("The total amount for " + this.seat_type + " seat for " + this.no_seat +" seats are "+ this.amount);
		
		System.out.println("Do you want the add on (y/n) ");
		char c = sc.next().charAt(0);
		if (c =='y' || c=='y')
		{
			addOn() ;
		}
	}
	
	public void addOn()
	{
		System.out.println("Do you want popcorn (y/n) ");
		char c = sc.next().charAt(0) ;
		if (c == 'y' || c == 'Y')
		{
			System.out.println("1. for large Popcorn  : Rs 900");
			System.out.println("2. for Medium Popcorn  : Rs 600");
			System.out.println("3. for Small Popcorn  : Rs 400");	
			int a = sc.nextInt();
			if (a == 1)
			{
				System.out.println("Select for quantity");
				this.pop_quant = sc.nextInt();
				this.popcorn_size = "Large popcorn" ;
				this.pop_amt = 900*this.pop_quant ;
 			}
			
			else if (a == 2)
			{
				System.out.println("Select for quantity");
				this.pop_quant = sc.nextInt();
				this.popcorn_size = "Medium popcorn" ;
				this.pop_amt = 600*this.pop_quant ;
 			}
			
			else if (a == 3)
			{
				System.out.println("Select for quantity");
				this.pop_quant = sc.nextInt();
				this.popcorn_size = "Small popcorn" ;
				this.pop_amt = 400*this.pop_quant ;
 			}
		}
		
		System.out.println("Do you want Pepsi (y/n) ");
		c = sc.next().charAt(0) ;
		if (c == 'y' || c == 'Y')
		{
			System.out.println("1. for large Pepsi  : Rs 180");
			System.out.println("2. for Medium Pepsi  : Rs 120");
			System.out.println("3. for Small Pepsi  : Rs 80");	
			int a = sc.nextInt();
			if (a == 1)
			{
				System.out.println("Select the quantity");
				this.pepsi_quant = sc.nextInt();
				this.pepsi_size = "Large pepsi" ;
				this.pep_amt = 180*this.pepsi_quant ;
 			}
			
			else if (a == 2)
			{
				System.out.println("Select the quantity");
				this.pepsi_quant = sc.nextInt();
				this.pepsi_size = "medium Pepsi" ;
				this.pep_amt = 120*this.pepsi_quant ;
 			}
			
			else if (a == 3)
			{
				System.out.println("Select the quantity");
				this.pepsi_quant = sc.nextInt();
				this.pepsi_size = "Small Pepsi" ;
				this.pep_amt = 80*this.pepsi_quant ;
 			}
		}
		
		System.out.println("Do you want Nachos (y/n) ");
		c = sc.next().charAt(0) ;
		if (c == 'y' || c == 'Y')
		{
			this.nachos_size = "Nachos" ;
			System.out.println("Select the quantity");
			this.nachos_quant = sc.nextInt();
			this.nacho_amt = this.nacho_amt + 80*this.nachos_quant ;
		}
		
		System.out.println("your order is for :");
		if (this.popcorn_size != null )
		{
		System.out.println(this.popcorn_size + "  " + this.pop_quant + " " + this.pop_amt + "\n" );
		}
		if(this.pepsi_size !=null)
		{
		System.out.println(this.pepsi_size + "  " + this.pepsi_quant + " " + this.pop_amt + "\n" );
		}
		if (this.nachos_size != null)
		{
		System.out.println(this.nachos_size + "  " + this.nachos_quant + " " + this.pop_amt + "\n" );
		}
		this.total = this.amount + this.pop_amt +this.pep_amt +this.nacho_amt ;
		System.out.println("Total Bill is for : " + this.total );
		invoice() ;
		}

	public void invoice()
	{
		System.out.println("        Boom my show Invoice\n\n");
		System.out.println("			    " + super.l);	
		System.out.println("GST : 1239876543              UID : " + super.uid +"\n");
		System.out.println("---------------------------------------------------------");
		System.out.println("---------------------------------------------------------\n");
		System.out.println("Content               quantity            Amount");
		System.out.println(this.movie + " " + this.seat_type + " " + this.no_seat + " " + this.amount );
		System.out.println(this.popcorn_size + "  " + this.pop_quant + " " + this.pop_amt + "\n" );
		System.out.println(this.pepsi_size + "  " + this.pepsi_quant + " " + this.pep_amt + "\n" );
		System.out.println(this.nachos_size + "  " + this.nachos_quant + " " + this.nacho_amt + "\n\n\n\n\n" );
		System.out.println("---------------------------------------------------------\n");
		System.out.println("                               Sub Total : " + this.total);
		double cgst = this.total * 0.025 ;
		System.out.println("                              CGST  2.5% : " + cgst);
		System.out.println("                              CGST  2.5% : " + cgst);


		
		




		
	}
	
}
