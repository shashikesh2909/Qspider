package Java_programming;
import java.util.Scanner;

public class Java_programming_class {
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of row ");
		int r  = sc.nextInt();
		
		patter_no_user_input(r);
		
		sc.close();
	}
	
	public static void patter_no_user_input(int row)
	{ 
		
	/*
		 
		  5 
        5 4 
      5 4 3 
    5 4 3 2 
  5 4 3 2 1 
		 
	*/
	
	System.out.println();
	System.out.println("---------------------------");
	int a = 5;
	for(int i=1;i<=row; i++)
	{
		for(int j=row; j>=i; j--) 
		{
			System.out.print("  ");
		}
		for(int k = 1; k<=i; k++) 
		{
			System.out.print(a+ " ");
			a--;	
		}
		a = 5;
		System.out.println();
	}
	
	/*
	 
	 	x 
       x x 
      x x x 
     x x x x 
    x x x x x 
	
	*/
	
	System.out.println("--------------------------------");
	a=9;
	for(int i=1;i<a;i++)
	{
		for(int j=i;j<a;j++)
		{
			System.out.print(" ");
		}
		for(int k=1;k<(i+1);k++)
		{
			System.out.print("x ");
		}
	
	System.out.println();
	}
						
	}
}
