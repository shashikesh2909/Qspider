package oops_has_a_relationship_riza;

public class car_main {

	public static void main(String[] args) 
	{
		
//		car c = new car();
//		
//		System.out.println(c);
//		
//		System.out.println(c.e.cc);
//		System.out.println(c.e.mileage);
//		
//		c.e.startengine();
//
//		
//		System.out.println(c.a.temp);
//		c.a.display();
//
//		System.out.println(c.mp);
//		
		car c2 = new car("Bugati","veyron",new Engine(800,35),new ac(33.5));
		
		System.out.println(c2.brand);
		
		c2.insertMusicPlayer(new music_player ("sony",8500));
		
		System.out.println(c2.mp.brand);
		
		c2.removeMusicPlayer();

		c2.insertMusicPlayer(new music_player ("JBL",8900));
		
		System.out.println(c2.mp1.brand);


		



	}

}
