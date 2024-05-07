package interface_practice;

public class Fan extends light_wala_fan  implements Regulator, Switch_board 
{
	@Override
	public void Rotate_right()
	{
		System.out.println("Fan is rotated right");
	}
	
	@Override
	public void Rotate_left()
	{
		System.out.println("Fan is rotated left");
	}
	
	@Override
	public void switch_on()
	{
		System.out.println("fan is switched on ");
	}
	
	@Override
	public void switch_off()
	{
		System.out.println("fan is switched off ");
	}
	
	public void light_fan()
	{
		
	}
	
	public void powersupplyon() 
	{
		System.out.println("havells power fan is switched on ");
	}
	public void powersupplyoff() 
	{
		System.out.println("havells power fan is switched off ");
	}
}
