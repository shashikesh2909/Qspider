package Java_programming_loop_array_String;

import java.util.Arrays;

public class Digit_loop_practice 
{
	public static void main(String[] args) 
	{
		System.out.println(sortDesc(145263));
	}
		
	public static int digCount(int n)
	{
		int count = 0 ;
		while (n > 0)
		{
			n = n/10 ;
			count++ ;	
		}
		return count ;
	}
	// make a function that can take any non-negative integer as an argument and return it with its digits in descending order. Essentially, rearrange the digits to create the highest possible number.
	public static int sortDesc(final int num)
	{
		int n = num;
		int out = 0;
		int [] a = new int[digCount(n)];
		
		int ld =0 , i=0;
		while(n>0)
		{
			ld = n%10 ;
			a[i] = ld ;
			n = n/10;
			i++;
		}
		Arrays.sort(a);
		
		for( i=a.length-1;i>-1;i--)
		{
			out = out*10+a[i];
		}
		return out ;
	}
}
