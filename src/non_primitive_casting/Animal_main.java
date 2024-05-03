package non_primitive_casting;

public class Animal_main {

	public static void main(String[] args) 
	{
		Animal a = new Animal();
		Animal a1 = new Dog() ;
		Animal a2 = new Cat() ;
		Animal a3 = new Puppy() ;
		
		a.fulldata(a);
		System.out.println("-----------");
		a.fulldata(a1);
		System.out.println("-----------");
		a.fulldata(a2);
		System.out.println("-----------");
		a.fulldata(a3);
		
	}

}
