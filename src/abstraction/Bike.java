package abstraction;

public class Bike extends Vehicle 
{
	String brand ;
	String model ;
	
	{
		System.out.println("Bike non static initalizer");
	}
	
	static
	{
		System.out.println("Bike static initalizer");
	}
	
	Bike ()
	{
		System.out.println("This is Bike empty constructor");
	}
	
	Bike (String brand , String model)
	{
		this.brand = brand ;
		this.model = model ;
	}
	
	Bike(int price , double mileage,String brand , String model)
	{
		super(price,mileage);
		this.brand = brand ;
		this.model = model ;
	}
	
	@Override
	public void start_engine()
	{
		System.out.println("Bike is starting");
	}
	
	public void wheely()
	{
		System.out.println("Bike is wheelying");
	}
}
