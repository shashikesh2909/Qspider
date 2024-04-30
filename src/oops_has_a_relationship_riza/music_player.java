package oops_has_a_relationship_riza;

public class music_player 
{
	String brand ;
	int price ;
	
	public void display ()
	{
		System.out.println(this.brand + " " + this.price);
	}
	
	music_player ()
	{
		System.out.println("exit");
	}
	
	music_player (String brand , int price)
	{
		this.brand = brand ;
		this.price = price ;
	}
}
