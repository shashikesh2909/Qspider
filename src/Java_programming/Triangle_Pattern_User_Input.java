package Java_programming;

import java.util.Scanner;

public class Triangle_Pattern_User_Input 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of row of triangle: ");
		int n = sc.nextInt();
		
		triangle(n);
		sc.close();
	}
	
	public static void triangle(int row)
	{
		
	/*
	 
		♥ 
		♥ ♥ 
		♥ ♥ ♥ 
		♥ ♥ ♥ ♥ 
		♥ ♥ ♥ ♥ ♥ 
		 
	*/
	
	System.out.println();
	System.out.println("---------------------------");	
	
	for(int i=0;i<row;i++)
	{
		for(int j=0;j<=i;j++)
		{
			System.out.print("♥ ");
		}
		System.out.println();
	}
	
	//////////////////////////////////////////////////////////////////////////////////////////////////
	
	/*
	 
	1 
	1 2 
	1 2 3 
	1 2 3 4 
	1 2 3 4 5
	  
	*/
	
	System.out.println();
	System.out.println("---------------------------");	
	
	int a =1;
	for(int i=0;i<row;i++)
	{
		for(int j=0;j<=i;j++)
		{
			System.out.print(a +" ");
			a++;
		}		
		a = 1;
		System.out.println();
	}
	
	//////////////////////////////////////////////////////////////////////////////////////////////////

	/*
	 
	Z 
	Z Y 
	Z Y X 
	Z Y X W 
	Z Y X W V 	
	 
	 */
	
	System.out.println();
	System.out.println("---------------------------");
	
	char c = 'Z';
	for(int i=0;i<row;i++)
	{
		for(int j=0;j<=i;j++)
		{
			System.out.print(c +" ");
			c--;
		}
		c = 'Z';
		System.out.println();
	}
	
	/////////////////////////////////////////////////////////////////////////////////////////////////
	
	/*
	 
	5 
	5 4 
	5 4 3 
	5 4 3 2 
	5 4 3 2 1 

	*/
		
	System.out.println();
	System.out.println("---------------------------");
	
	a = 5;
	for(int i=0;i<row;i++)
	{
		for(int j=0;j<=i;j++)
		{
			System.out.print(a +" ");
			a--;
		}
		a = 5;
		System.out.println();
	}
	
	/////////////////////////////////////////////////////////////////////////////////////////////////

	/*
	 
	A 
	A B 
	A B C 
	A B C D 
	A B C D E 

	*/
	
	c ='A';
	
	System.out.println();
	System.out.println("---------------------------");

	for(int i=0;i<row;i++)
	{
		for(int j=0;j<=i;j++)
		{
			System.out.print(c +" ");
			c++;
		}
		c ='A';
		System.out.println();
	}
	
	/////////////////////////////////////////////////////////////////////////////////////////////////
	
	/*
 	
	1						 1  
	2  3  
	4  5  6  
	7  8  9  10 
	11 12 13 14 15
							
	*/
	
	a = 1;
	System.out.println();
	System.out.println("---------------------------");

	for(int i=1;i<=row;i++)
	{
		for(int j=0;j<i;j++)
		{
			System.out.print(a+ " ");
		}
		System.out.println();
	}

	/////////////////////////////////////////////////////////////////////////////////////////////////

	/*
	  
	* * * * * 
	* * * * 
	* * * 
	* * 
	*
													
	*/
	
	System.out.println();
	System.out.println("---------------------------");

	for(int i=1;i<=row;i++)
	{
		for(int j=row;j>=i;j--)
		{
			System.out.print("* ");
		}
		System.out.println();
	}
		
	/////////////////////////////////////////////////////////////////////////////////////////////////

	/*
	 
	l 
	m n 
	o p q 
	r s t u 
	v w x y z
													
	*/
	
	c = 'L';
	System.out.println();
	System.out.println("---------------------------");

	for(int i=0;i<row;i++)
	{
		for(int j=0;j<=i;j++)
		{
			System.out.print(c+ " ");
			c++;
			if (c > 'Z')
			{
				c = 'L';
			}
		}
		System.out.println();
	}
	
	/////////////////////////////////////////////////////////////////////////////////////////////////

	/*
	
	5 4 3 2 1 
	5 4 3 2 
	5 4 3 
	5 4 
	5 						 
																									
	*/
	
	a = 5;
	System.out.println();
	System.out.println("---------------------------");

	for (int i =1 ; i<=row ;i++)
	{
		for (int j = row; j>=i ; j--)
		{
			System.out.print(a+ " ");
			a-- ;
		}
		a = 5;
		System.out.println();
	}
	
	/////////////////////////////////////////////////////////////////////////////////////////////////

	/*
	 
	1 1 1 1 1 
	2 2 2 2 
	3 3 3 
	4 4 
	5 											
																									
	*/
	
	a = 1;
	System.out.println();
	System.out.println("---------------------------");

	for (int i =1 ; i<=row ;i++)
	{
		for (int j = row; j>=i ; j--)
		{
			System.out.print(a+ " ");
			 ;
		}
		a++;
		
		System.out.println();
	}
	
	/////////////////////////////////////////////////////////////////////////////////////////////////

	/*
	 
	 		*
	 	   **
	 	  ***
	 	 ****
	    *****
	   ******														
																												
*/

	a = 1;
	System.out.println();
	System.out.println("---------------------------");

	for (int i =1 ; i<=row ;i++)
	{
		for (int j = row; j>=i ; j--)
		{
			System.out.print("  ");
		}
		for(int j =0;j<2*i-1 ; j++)
		{
			System.out.print("* ");
		}
		
		
		System.out.println();
	}
	
	/////////////////////////////////////////////////////////////////////////////////////////////////

	/*
	 
	  * * * * * 
	    * * * * 
	      * * * 
	        * * 
	          *																																	
	*/
	
	System.out.println();
	System.out.println("---------------------------");
	for (int i =0;i<row;i++ )
	{
		for (int j=0; j<=i;j++)
		{
			System.out.print("  ");
		}
		
		for (int j=row ; j>i;j--)
		{
			System.out.print("* ");
		}
		System.out.println();
	}
	
	/////////////////////////////////////////////////////////////////////////////////////////////////
								
/*
  
 			*
          * * 
        * * * 
      * * * * 
    * * * * * 
      * * * * 
        * * * 
          * * 
            * 
						 				          																																	
*/	
	
	System.out.println();
	System.out.println("---------------------------");
	for (int i=0;i<row;i++)
	{
		for (int j=row; j>=i ; j--)
		{
			System.out.print("  ");
		}
		
		for (int k=0 ; k<=i; k++)
		{
			System.out.print("* ");
		}
		System.out.println();
	}
	for (int i=0;i<row-1;i++)
	{
		for (int j=-2; j<=i ; j++)
		{
			System.out.print("  ");
		}
		
		for (int k=row-1 ; k>i; k--)
		{
			System.out.print("* ");
		}
		 System.out.println();
	}
	
	/////////////////////////////////////////////////////////////////////////////////////////////////
					
/*
 
  	  * 
     * * 
    * * * 
   * * * * 
  * * * * * 
 									 				          																																	
*/	
	
	
	System.out.println("---------------------------");
	for (int i=0 ;i<row ; i++)
	{
		for ( int j=row; j>= i;j--)
		{
			System.out.print(" ");
		}
		for (int j =0;j<=i*1 ;j++)
		{
			System.out.print("* ");
		}
		System.out.println();
	}
	
	/////////////////////////////////////////////////////////////////////////////////////////////////
										
/*		
          *
        *
      *
    *
  *
  
 */
	
	System.out.println("---------------------------");
	
	for (int i=0 ; i<row ; i++)
	{
		for (int j=row ;j>=i ;j--)
		{
			System.out.print("  ");
		}
		System.out.print("*");
		System.out.println();
	}
		
	/////////////////////////////////////////////////////////////////////////////////////////////////
					
/*
 
*       * 
  *   *   
    *     
  *   *   
*       * 
 
 */
	
	System.out.println("---------------------------");
	
	
	for (int i=0;i<row;i++)
	{
		for (int j=0 ;j<row; j++ )
		{
			if ((i+j==row-1) || (i == j) || (i == 0) || (i == row-1)  || (j == 0) || (j == row-1) )
			{
				System.out.print("* ");
			}
			else
			{
				System.out.print("  ");
			}
		}
		System.out.println();
	}
	
	/////////////////////////////////////////////////////////////////////////////////////////////////							
						
/*							
 							   *	
							 *   *     
						   *       *   
						 *           * 
*/	
	
	System.out.println();
	System.out.println("---------------------------");
	
	
	for (int i=0;i<row;i++)
	{
		for (int j=0 ;j<row; j++ )
		{
			if ((i+j==row-1 || (i == j)) && i >= row/2)
			{
				System.out.print("* ");
			}
			else
			{
				System.out.print("  ");
			}
		}
		System.out.println();
	}
	
	/////////////////////////////////////////////////////////////////////////////////////////////////							
					
	/*	
 			
	54321
	4321
	321
	21
	1

	 */	
	
	a = 5 ;
	System.out.println();
	System.out.println("---------------------------");
	
	for (int i=1 ;i<=row;i++)
	{
		for (int j = row ; j>=i ; j--)
		{
			System.out.print(a+" ");
			a-- ;
		}
		a = 5-i ;
		System.out.println();
	}
	
	/////////////////////////////////////////////////////////////////////////////////////////////////							
								
	/*	

	10101
	1010
	101
	10
	1						

	*/	
	
	System.out.println();
	System.out.println("---------------------------");
	for (int i=1 ;i<=row;i++)
	{
		for (int j = row ; j>=i ; j--)
		{
			if (j%2==1)
			{
			System.out.print(1+" ");
			}
			else
			{
				System.out.print(0+" ");
			}
		}
		System.out.println();
	}
	
	/////////////////////////////////////////////////////////////////////////////////////////////////							
									
	/*	

	10101
	0101
	101
	01
	1						
											
	*/	
	
	a=1 ;
	System.out.println();
	System.out.println("---------------------------");
	for (int i=1 ;i<=row;i++)
	{
		for (int j = row ; j>=i ; j--)
		{
			
			System.out.print(a%2 + " ");
			a++ ;
		}
		a = 1+i ;
		System.out.println();
	}
	
	/////////////////////////////////////////////////////////////////////////////////////////////////							

	/*
	 
	A B C D E 
	A B C D 
	A B C 
	A B 
	A 
							
	*/
	
	c = 'A' ;
	System.out.println();
	System.out.println("---------------------------");
	for (int i=1 ;i<=row;i++)
	{
		for (int j = row ; j>=i ; j--)
		{
			
			System.out.print(c +" ");
			c++ ;
		}
		c = 'A' ;
		System.out.println();
	}
	
	/////////////////////////////////////////////////////////////////////////////////////////////////	
	
	/*
	
	E D C B A 
	E D C B 
	E D C 
	E D 
	E
	
	*/
	
	c = (char)(64+row) ;
	System.out.println();
	System.out.println("---------------------------");
	for (int i=1 ;i<=row;i++)
	{
		for (int j = row ; j>=i ; j--)
		{
			
			System.out.print(c +" ");
			c-- ;
		}
		c = (char)(64+row);
		System.out.println();
	}
	
	/////////////////////////////////////////////////////////////////////////////////////////////////												
					
	/*
 
          5 
        5 4 
      5 4 3 
    5 4 3 2 
  5 4 3 2 1
  
  */
	
	System.out.println();
	System.out.println("---------------------------");
	a = 5 ;
	for(int i=0;i<row;i++)
	{
		for (int j=row;j>=i;j--)
		{
			System.out.print("   ");
		}
		for (int k=0;k<=i;k++)
		{
			if (a>=0)
			{
				System.out.print(a+ "  ");
				a-- ;
			}
			else
			{
				System.out.print(a+ " ");
				a-- ;
			}
		}
		a = 5;
		System.out.println();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	}
}
