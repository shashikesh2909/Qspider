package collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashsetWorking {

	public static void main(String[] args) 
	{
		HashSet<Car> hs = new HashSet<Car>() ;
		Car c1 = new Car("Suzuki","Baleno",7.8,22.0);
		Car c2 =new Car("Suzuki","Fronx",7.8,22.0);
		Car c3 =new Car("Mahindra","XUV700",17.5,15.0);
		Car c4 =new Car("Suzuki","Dzire",7.8,22.0);
		
		hs.add(c1);
		hs.add(c2);
		hs.add(c3);
		hs.add(c4);
		
		for (Car x : hs)
		{
			System.out.println(x.Brand +" "+x.Model+" "+x.Price+ " " + x.mileage);
		}
		
		hs.add(c1)	;
		System.out.println("-----------------");
		Iterator<Car> hsi = hs.iterator();
		while(hsi.hasNext())
		{
			Car x = hsi.next();
			System.out.println(x.Brand +" "+x.Model+" "+x.Price+ " " + x.mileage);
		}
	}
}

class Car
{
	String Brand ;
	String Model ;
	double Price ;
	double mileage ; 
	
	Car(String b , String m ,double p , double mil)
	{
		Brand = b ;
		Model = m ;
		Price = p ;
		mileage = mil ;
	}
}
