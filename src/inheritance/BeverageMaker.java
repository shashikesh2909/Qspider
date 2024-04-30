package inheritance;

public class BeverageMaker {

	public static void main(String[] args) 
	{
		Fruit f1 = new Fruit(200,3) ;
		System.out.println(f1.price);
		System.out.println(f1.weight);
		f1.makeJuice();
		
		Apple a1 = new Apple(300,3,"kashmiri");
		System.out.println(a1.price);
		System.out.println(a1.weight);
		System.out.println(a1.type);
		a1.makeJuice();
		a1.makeVodka();
		
		Grape g1 = new Grape(500,5,"green");
		System.out.println(g1.price);
		System.out.println(g1.weight);
		System.out.println(g1.color);
		g1.makeJuice();
		g1.makeWine();	
	}

}
