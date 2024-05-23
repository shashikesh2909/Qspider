package exception_handling;

import java.io.File;
import java.io.IOException;

public class Exception_practice {

	public static void main(String[] args) 
	{
		// this is unchecked exception
		int num1 =0 ;
		// arithmetic exception
		try
		{
			num1 = 10/0 ;
		}
		catch(Exception a)
		{
			System.out.println(a.getMessage());
			System.out.println(a.getStackTrace());
			a.printStackTrace();
		}
		finally
		{
			System.out.println("Try catch ends here");
		}
		
		// null pointer exception
		Delhi_metro a1 = new Delhi_metro() ;
		a1 = null ;
				try
				{
					a1.toString();
				}
				catch(Exception a)
				{
					System.out.println(a.getMessage());
					System.out.println(a.getStackTrace());
					a.printStackTrace();
				}
				finally
				{
					System.out.println("Try catch ends here");
				}
		
		// checked exception
		File f = new File ("D:\\git reop\\a1.java");
		try 
		{
		f.createNewFile();
		System.out.println("file created");
		}
		catch (IOException a)
		{
			System.out.println(a.getMessage());
		}	
	}
}
