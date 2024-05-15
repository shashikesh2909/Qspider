package object_class;

public class Car 
{
	String brand , model ;
	double price ; 
	
	@Override
	public String toString()
	{
		return this.brand + " " + this.model + " " + this.price ;
	}
	
	
	Car(String brand , String model , double price)
	{
		this.brand = brand ;
		this.model = model ;
		this.price = price ; 
	}
}
