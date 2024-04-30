package oops_has_a_relationship_riza;

public class Mobile 
{
	String brand ; 
	int price ;
	
	Battery b1 ;
	sim_slot sim1 ;
	sim_slot sim2 ;
	
//	Mobile m1 = new Mobile ("Moto" , 50000 , new Battery (5000,85));
	
	Mobile (String brand , int price , Battery b1)
	{
		this.brand = brand ;
		this.price = price ;
		this.b1 = b1 ;
	}
	
	public void insertSim1(sim_slot sim1)
	{
		if (this.sim1 == null)
		{
			this.sim1 = sim1 ;
			System.out.println("Sim1 is inserted");
		}
		else
		{
			System.out.println("Sim1 is already inserted");
		}
	}
	
	public void removesim1()
	{
		if (this.sim1 != null )
		{
			this.sim1 = null ;
			System.out.println("This is removed");
		}
		else
		{
			System.out.println("There is no sim in slot1 to remove");
		}
	}
	
	public void insertSim2(sim_slot sim2)
	{
		if (this.sim2 == null)
		{
			this.sim2 = sim2 ;
			System.out.println("Sim2 is inserted");
		}
		else
		{
			System.out.println("Sim2 is already inserted");
		}
	}
	
	public void removesim2()
	{
		if (this.sim2 != null )
		{
			this.sim2 = null ;
			System.out.println("This is removed");
		}
		else
		{
			System.out.println("There is no sim in slot1 to remove");
		}
	}
	
	public void details ()
	{
		System.out.println(brand);
		System.out.println(price);
		System.out.println(b1.batt_per);
		System.out.println(b1.mah);
		if(this.sim1!=null)
		{
		System.out.println(sim1.oper);
		System.out.println(sim1.bal);
		}
		else
		{
			System.out.println("Sim1 does not exist");
		}
		
		if (this.sim2 != null)
		{
		System.out.println(sim2.oper);
		System.out.println(sim2.bal);
		}
		else
		{
			System.out.println("sim2 does not exist");
		}
	}
}
