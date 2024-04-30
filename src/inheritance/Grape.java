package inheritance;

public class Grape extends Fruit
{
	String color ;
	public void makeWine()
	{
		System.out.println("wine is making");
	}
	
	Grape( int price , double weight ,String color)
	{
		super(price,weight);
		this.color = color ;
	}
	
	
}
