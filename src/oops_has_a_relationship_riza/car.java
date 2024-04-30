package oops_has_a_relationship_riza;

public class car 
{
	String brand , model ;
	
	Engine e ;
	ac a ;
	music_player mp ;
	music_player mp1 ;

	
	public void insertMusicPlayer(music_player mp)
	{
		this.mp = mp ;	
		System.out.println("Music player Added");
	}
	
	public void insertMusicPlay   (music_player mp1)
	{
		this.mp1 = mp1 ;	
		System.out.println("Music player Added");
	}
	
	public void removeMusicPlayer()
	{
		if (this.mp != null)
		{
			this.mp = null ;
			System.out.println("Music player removed");
		}
		else
		{
			System.out.println("there is no object existing");
		}
		
	}
	
	{
		e = new Engine(1100,21.5);
		a = new ac(24);
	}
	
	car()
	{
		
	}
	
	car(String brand , String model)
	{
		this.brand = brand ;
		this.model = model ;
	}
	
	car(String brand , String model,Engine e , ac a)
	{
		this.brand = brand ;
		this.model = model ;
		this.e = e ;
		this.a = a; 
	}
}
