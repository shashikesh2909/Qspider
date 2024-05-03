package inheritance;

public class Vegetable 
{
	int price;
	double weight ;
	public void make_food()
	{
		System.out.println("Making food");
	}
	
	public void details()
	{
		System.out.println(this.price);
		System.out.println(this.weight);
		make_food();
	}
	
	Vegetable(int price , double weight)
	{
		this.price = price;
		this.weight = weight;
	}
	
	Vegetable()
	{
		
	}
}
