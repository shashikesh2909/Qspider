package interface_practice;

public class light_wala_fan implements Havells
{
	public  void h_fanlighton() 
	{
		System.out.println("Havells fan light on");
	}
	public  void h_fanlightoff() 
	{
		System.out.println("Havells fan light off");
	}
	
	public void powersupplyon() 
	{
		System.out.println("pwer supply havells on");
	}
	public void powersupplyoff() 
	{
		System.out.println("pwer supply havells off");
	}
}
