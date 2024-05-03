package inheritance;

public class Tomato extends Vegetable
{
	public void make_ketchup()
	{
		System.out.println("Making ketch up");
	}
	
	@Override
	public void details()
	{
		super.details();
		make_ketchup();
	}
	
	
	
	Tomato(int price, double weight)
	{
		super(price,weight) ;
	}
	
	Tomato()
	{
		super() ;
	}

}
