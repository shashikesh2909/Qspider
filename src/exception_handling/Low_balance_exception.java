package exception_handling;

public class Low_balance_exception extends RuntimeException
{
	@Override
	public String toString() 
	{
		return "Your delhi metro card needs o be recharged" ;
	}
	@Override
	public String getMessage() {
		
		return "Low Balance" ;
	}
	@Override
	public void printStackTrace() 
	{
		System.out.println("Issue is on line number");
		super.printStackTrace();
	}
}
