package non_primitive_casting;

public class Animal
{
	public void make_noise ()
	{
		System.out.println("Animal make noise");
	}
	
	public void eat()
	{
		System.out.println("Animal eat");
	}

	public void fulldata(Animal a)
	{
		
		if (a instanceof Puppy)
		{
			a.make_noise();
			Puppy d = (Puppy)a;
			d.play();	
			
		}
		
		else if (a instanceof Dog)
		{
			a.make_noise();
			Dog d = (Dog)a;
			d.guard_house();	
		}
		
		else if (a instanceof Cat)
		{
			a.make_noise();
			Cat d = (Cat)a;
			d.play();	
		}
		
		else if (a instanceof Animal)
		{
			a.make_noise();
			a.eat();
		}
		
		
	}
	
	
}
