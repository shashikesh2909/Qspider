package abstraction;

public class Mercedes extends Car 
{
	String model ;
	
	{
		System.out.println("Mercedes non static initalizer");
	}
	
	static
	{
		System.out.println(" Mercedes Car static initalizer");
	}
	
	Mercedes ()
	{
		System.out.println("This is Mercedes empty constructor");
	}
	
	Mercedes (String model)
	{
		this.model = model ;
	}
	
	Mercedes (char type,String model)
	{
		super(type) ;
		this.model = model ;
	}
	
	Mercedes(int price , double mileage, char type , String model)
	{
		super(price,mileage,type);
		this.model = model ;
	}
	
	@Override
	public void start_engine()
	{
		System.out.println("Mercedes is starting");
	}
	
	@Override
	public void stop_engine()
	{
		System.out.println("mercedes is stopping");
	}
	
	public void show_baazi()
	{
		System.out.println("mercedes is showbazzing");
	}
	

}


