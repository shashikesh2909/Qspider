package non_primitive_casting;

public class Dog extends Animal
{
	@Override 
	public void make_noise ()
	{
		System.out.println("Bow Bow");
	}
	
	public void guard_house()
	{
		System.out.println("Guarding the house");
	}
}
