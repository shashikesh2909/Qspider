package inheritance;

public class Carrot extends Vegetable
{
	String color ;
	public void make_halwa()
	{
		System.out.println("Making halwa");
	}
	
	@Override
	public void details()
	{
		super.details();
		System.out.println(this.color);
		make_halwa();
	}
	
	Carrot(int price, double weight ,String color)
	{
		super(price,weight) ;
		this.color = color ;
	}
}
