package abstraction;

public abstract class Vehicle 
{
	int price ;
	double mileage ;

	{
		System.out.println("This is vehicle initalizer") ;
	}
	
	static 
	{
		System.out.println("This is static vehicle initalizer") ;
	}
	
	Vehicle ()
	{
		System.out.println("Thiis Vehicle empty constructor");
	}
	
	Vehicle (int price  , double mileage)
	{
		this.price = price ;
		this.mileage = mileage ;
	}
	
	public abstract void start_engine() ;
	
	public void stop_engine()
	{
		System.out.println("Vehicle is stopping");
	}
	
	public void details (Vehicle v)
	{
		if (v instanceof Mercedes)
		{
			System.out.println(this.price + " " + this.mileage);
			v.start_engine();
			v.stop_engine();
			Mercedes obj = (Mercedes) v ;
			obj.show_baazi();
		}
		
		if (v instanceof Bike)
		{
			System.out.println(this.price + " " + this.mileage);
			v.start_engine();
			Bike obj = (Bike) v ;
			obj.wheely();
		}
	}
}
