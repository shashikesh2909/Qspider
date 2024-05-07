package abstraction;

public abstract class Car extends Vehicle
{
	char type ;
	
	{
		System.out.println("Car non static initalizer");
	}
	
	static
	{
		System.out.println("Car static initalizer");
	}

	Car ()
	{
		System.out.println("This is car empty constructor");
	}
	
	Car (char type)
	{
		this.type = type ;
	}
	
	Car(int price , double mileage,char type)
	{
		super(price,mileage);
		this.type = type ;
	}
	
	public void drift()
	{
		System.out.println("Car is drifting");
	}
	
	@Override
	public abstract void start_engine() ;
	
}
