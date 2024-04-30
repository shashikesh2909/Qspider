package inheritance;

public class Apple extends Fruit
{
	String type ;
	
	public void makeVodka()
	{
		System.out.println("Making vodka");
	}
	
	Apple(int price, double weight,String type) 
	{
		super(price,weight);
		this.type = type ;	
	}
	
}
