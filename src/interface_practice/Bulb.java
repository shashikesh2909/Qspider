package interface_practice;

public class Bulb implements Switch_board
{
	@Override
	public void switch_on()
	{
		System.out.println("Bulb is switched on ");
	}
	@Override
	public void switch_off()
	{
		System.out.println("Bulb is switched off ");
	}
	
	public void powersupplyon() 
	{
		System.out.println("havells power in Bulb is on ");
	}
	public void powersupplyoff() 
	{
		System.out.println("havells power in Bulb is off ");
	}
}
