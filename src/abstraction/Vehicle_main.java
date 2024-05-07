package abstraction;

public class Vehicle_main {

	public static void main(String[] args)
	{
		Vehicle v = new Mercedes(250000,20.5,'A',"Maybach") ;
		v.details(v);
		
		System.out.println("--------------------------------");
		
		Vehicle v1 = new Bike(250000,20.5,"Yamaha","R1") ;
		v.details(v1);
	}
	

}
