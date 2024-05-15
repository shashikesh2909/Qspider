package Java_programming_loop_array_String;

public class pattern_personal_practice extends String_practice_ravi 
{
	
	public static void main(String[] args) 
	{		
		a = 200 ;
		System.out.println(a);
	}
	
	public static void pattern_practice()
	{
		
	 /*
	  
	    *
        **
        ***
        ****
        *****
        
     */	
		
	for (int i=0;i<5;i++)
	{
		for (int j=0;j<=i;j++)
		{
			System.out.print("* ");
		}
		System.out.println();
	}
	System.out.println();
	System.out.println("---------------------------");
		
	///////////////////////////////////////////////////////////////////////////////////////
	
	/*
		
		   *
          ***
         *****
        *******
        
	*/	
		
	for (int i=0;i<5;i++)
	{
		for (int j=4;j>=i;j--)
		{
			System.out.print("  ");
		}		
		for (int j=0;j<=i;j++)
		{
			System.out.print("* ");
		}	
		for (int j=1;j<=i;j++)
		{
			System.out.print("* ");
		}
		System.out.println();
	}
	System.out.println();
	System.out.println("---------------------------");
	
	///////////////////////////////////////////////////////////////////////////////////////

	/*
 
		*******
         *****
          ***
           *
           
	 */	
	
	for (int i=0;i<5;i++)
	{
		for (int j=0;j<=i;j++)
		{
			System.out.print("  ");
		}
		
		for (int j=4;j>=i;j--)
		{
			System.out.print("* ");
		}
		
		for (int j=3;j>=i;j--)
		{
			System.out.print("* ");
		}
		System.out.println();
	}
	System.out.println();
	System.out.println("---------------------------");
	
	///////////////////////////////////////////////////////////////////////////////////////

	/*
	 
	*
    **
    ***
    ****
    *****
    ****
    ***
    **
    *
    
    */
	
	for (int i=0;i<5;i++)
	{
		for (int j=0;j<=i;j++)
		{
			System.out.print("* ");
		}
		System.out.println();
	}
	for (int i =0;i<4;i++)
	{
		for (int j=3;j>=i;j--)
		{
			System.out.print("* ");
		}
		System.out.println();
	}
	System.out.println();
	System.out.println("---------------------------");
	
	///////////////////////////////////////////////////////////////////////////////////////

	/*
	
    *
   **
  ***
 ****
  ***
   **
    *

	*/	
	
	for (int i=0;i<5;i++)
	{
		for (int j=4;j>=i;j--)
		{
			System.out.print("  ");
		}
		for (int j = 0;j<=i;j++)
		{
			System.out.print("* ");
		}
		System.out.println();
	}
	for (int i=1;i<5;i++)
	{
		for (int j=0;j<=i;j++)
		{
			System.out.print("  ");
		}
		for (int j=4;j>=i;j--)
		{
			System.out.print("* ");
		}
		System.out.println();
	}
	System.out.println();
	System.out.println("---------------------------");
	
	///////////////////////////////////////////////////////////////////////////////////////

	/*
	 
     *
    ***
   *****
  *******
   *****
    ***
     *
		
	*/
	
	for (int i=0;i<5;i++)
	{
		for (int j=4;j>=i;j--)
		{
			System.out.print("  ");
		}
		
		for (int j=0;j<=i;j++)
		{
			System.out.print("* ");
		}
		
		for(int j=1;j<=i;j++)
		{
			System.out.print("* ");
		}
		System.out.println();
	}
	
	for (int i=1;i<5;i++)
	{
		for (int j=0;j<=i;j++)
		{
			System.out.print("  ");
		}
		for (int j=4;j>=i;j--)
		{
			System.out.print("* ");
		}
		for (int j=3;j>=i;j--)
		{
			System.out.print("* ");
		}
		System.out.println();
	}
	System.out.println();
	System.out.println("---------------------------");
	
	///////////////////////////////////////////////////////////////////////////////////////
	
	/*
	
	1
    2 3
    4 5 6
    7 8 9 10
	 
	*/
	
	int n=1;
	for (int i =0;i<5;i++)
	{
		for (int j=0;j<i;j++)
		{
			System.out.print(n + " ");
			n++;
		}
		System.out.println();
	}
	System.out.println();
	System.out.println("---------------------------");
	
	///////////////////////////////////////////////////////////////////////////////////////

	/*
    
    10 9 8 7
	4 5 6
	3 2
	1
	
	*/	
	
	n =9;
	for (int i=0;i<4;i++)
	{
		for (int j=3;j>=i;j--)
		{
			System.out.print(n+ "  ");
			n--;
		}
		System.out.println();
	}		
	System.out.println();
	System.out.println("---------------------------");
	
	///////////////////////////////////////////////////////////////////////////////////////

	/*
    
    6666
	555
	44
	3
	
	*/	
	
	n=6;
	for (int i=0;i<4;i++)
	{
		for (int j=4;j>i;j--)
		{
			System.out.print(n+ " ");
		}
		n--;
		System.out.println();
	}
	System.out.println();
	System.out.println("---------------------------");
	
	}
	///////////////////////////////////////////////////////////////////////////////////////

	public static void arti()
	{
	for (int i=1;i<=5;i++)
	{
		for (int j=1 ; j<=9 ;j++)
		{
			if((i+j == 6) || (j== i+4)||((i==3)&& (j==4))|| ((i==3)&& (j==5))|| ((i==3)&& (j==6)))
			{
			System.out.print("*");
			}
			else 
			{
				System.out.print(" ");
			}
		}
		System.out.print ("  ");
		
		for (int j=1 ; j<=9 ;j++)
		{
			if ((j==1)|| (i==1)|| (i==3)|| ((i==2)&& (j==9)) || ((i==3)&& (j==4))|| ((i==4)&& (j==6))|| ((i==5)&& (j==9)))
			{
				System.out.print("*");
			}
			else
			{
				System.out.print(" ");
			}
			
		}
		System.out.print ("  ");
		
		for (int j=1 ; j<=9 ;j++)
		{
			if ((i==1) || (j==5))
			{
				System.out.print("*");
			}
			else 
			{
				System.out.print(" ");
			}
		}
		System.out.print ("  ");
		
		for (int j=1 ; j<=9 ;j++)
		{
			if ((i==1) || (i==5)||(j==5))
			{
				System.out.print("*");
			}
			else
			{
				System.out.print(" ");

			}
		}
		
		
		System.out.print ("\t");
		
		
		for (int j=1 ; j<=9 ;j++)
		{
			if(j==1 || ((i==3)&& (j==3))|| ((i==4)&&(j==6))|| ((i==5)&& (j==9))||((i==2)&&(j==6))|| ((i==1)&& (j==9)))
			{
			System.out.print("*");
			}
			else
			{
				System.out.print(" ");
			}
		}
		System.out.print ("  ");
		
		for (int j=1 ; j<=9 ;j++)
		{
			if((j==1)||(i==5)||j==9)
			{
			System.out.print("*");
			}
			else
			{
				System.out.print(" ");
			}
		}
		
		System.out.print ("  ");
		
		for (int j=1 ; j<=9 ;j++)
		{
			if((j==1)||(j==9) || (i==j) || (i+j==10))
			{
			System.out.print("*");
			}
			else
			{
				System.out.print(" ");
			}
		}
		System.out.print ("  ");
		
		for (int j=1 ; j<=9 ;j++)
		{
			if((i+j == 6) || (j== i+4)||((i==3)&& (j==4))|| ((i==3)&& (j==5))|| ((i==3)&& (j==6)))
			{
			System.out.print("*");
			}
			else 
			{
				System.out.print(" ");
			}
		}
		System.out.print ("  ");

		for (int j=1 ; j<=9 ;j++)
		{
			if ((j==1)|| (i==1)|| (i==3)|| ((i==2)&& (j==9)) || ((i==3)&& (j==4))|| ((i==4)&& (j==6))|| ((i==5)&& (j==9)))
			{
				System.out.print("*");
			}
			else
			{
				System.out.print(" ");
			}
		}
		System.out.print ("  ");
		
		
		for (int j=1 ; j<=9 ;j++)
		{
			if ((i==1) || (i==5)||(j==5))
			{
				System.out.print("*");
			}
			else
			{
				System.out.print(" ");

			}
		}
		System.out.println();
	}
	}

}
