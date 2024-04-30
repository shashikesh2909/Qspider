package oops_has_a_relationship_riza;

public class mobile_main {

	public static void main(String[] args) 
	{
		Mobile m1 = new Mobile ("Moto" , 50000 , new Battery (5000,85));
		
		m1.details();
		
		m1.insertSim1(new sim_slot("Airtel",500)) ;
		
		m1.insertSim2(new sim_slot("jio",500)) ;

		m1.details();
		
		m1.insertSim1(new sim_slot("vi",500)) ;
		
		m1.removesim2();
		
		m1.removesim2();
		
		m1.insertSim2(new sim_slot("BSNL",500)) ;
		
		m1.details();






	}

}
