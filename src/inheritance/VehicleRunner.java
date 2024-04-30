package inheritance;

public class VehicleRunner {

	public static void main(String[] args) 
	{
		Vehicle v1 = new Vehicle();
		Bike b1 = new Bike() ;
		Car c1 = new Car();
		
		c1.drift();
		c1.startEngine();
		c1.stopEngine();
		System.out.println(c1.brand);
		System.out.println(c1.mileage);
		System.out.println(c1.model);
		System.out.println(c1.price);
		System.out.println(c1.no_door);
		System.out.println("---------bike boject---------");
		b1.wheelie();
		b1.startEngine();
		b1.stopEngine();
		System.out.println(b1.brand);
		System.out.println(b1.mileage);
		System.out.println(b1.model);
		System.out.println(b1.price);	
	}

}
