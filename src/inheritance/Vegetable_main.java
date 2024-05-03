package inheritance;

public class Vegetable_main {

	public static void main(String[] args) 
	{
		Carrot c1 = new Carrot(50,25.0,"red");
		
		Vegetable v1 = new Vegetable(70,80.0);
		
		v1.details();
		System.out.println("-------------------");
		c1.details();
		
		Tomato t = new Tomato(50,2.5);
		t.price = 60 ;
		
		System.out.println(v1.price);
		
		
		
	}

}
