package inheritance;

public class Fruit 
{
	int price ;
	double weight ;
	 
	public void makeJuice()
	{
		System.out.println("Making a juice");
	}
	
	Fruit(int price ,double weight)
	{
		this.price = price ;
		this.weight = weight ;
	}
	
	Fruit ()
	{
		System.out.println("This is parent empty constructor");
	}
}
