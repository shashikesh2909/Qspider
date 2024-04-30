package oops_has_a_relationship_riza;

public class Engine 
{

	int cc ;
	double mileage ;
	
	public void startengine()
	{
		System.out.println("Chak de fatte");
	}
	
	Engine ()
	{
		System.out.println("empty");
	}
	
	Engine (int cc , double mileage)
	{
		this.cc = cc ;
		this.mileage = mileage ;
	}
}
