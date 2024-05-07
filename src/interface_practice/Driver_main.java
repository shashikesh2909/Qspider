package interface_practice;

public class Driver_main
{
	public static void main(String [] args) 
	{
		Havells h = new Fan () ;
		h.powersupplyoff();
		h.powersupplyoff();
		
		Fan f = new Fan() ;
		f.h_fanlightoff();
		f.h_fanlighton();
		f.light_fan();
		f.powersupplyoff();
		f.powersupplyon();
		f.Rotate_left();
		f.Rotate_right();
		f.switch_off();
		f.switch_on();
		
		
		
	}
}

