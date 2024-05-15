package object_class;

public class Ev_car extends Car
{
	int battery_per ;
	
	
	
	public Ev_car(String brand, String model, double price , int battery_per) 
	{
		super(brand, model, price);
		this.battery_per = battery_per ;
	}

	public static void main (String [] args)
	{
		Car c = new Car("kia" , "carens" , 25.9) ;
		System.out.println(c);
		
		Ev_car c1 = new Ev_car("kia" , "carens" , 25.9,26) ;
		System.out.println(c1);
		
		Car c2 = new Ev_car("kia" , "carens" , 25.9 , 25) ;
		System.out.println(c2);
		
		Object  c3 = new Ev_car("kia" , "carens" , 25.9,26) ;
		System.out.println(c1);
	}
}
