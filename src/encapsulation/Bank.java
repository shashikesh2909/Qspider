package encapsulation;

public class Bank 
{
	private long accno ;
	private double balance ;
	private int pin ;
	
	Bank (long accno ,double balance ,int pin)
	{
		this.accno = accno ;
		this.balance = balance ;
		this.pin = pin ;		
	}
	
	public long getaccno()
	{
		return this.accno ;
	}
	
	public double getbalance()
	{
		return this.balance ;
	}
	
	public void setdepositbalance(double balance)
	{
		this.balance = this.balance + balance ;
	}
	
	public void setwithdrawlbalance(double balance)
	{
		this.balance = this.balance - balance ;
	}
	
	public void setpin (int pin)
	{
		this.pin = pin ;
		System.out.println("Pin updated");
	}
	
	public int getpin()
	{
		return this.pin ;
	}
}
