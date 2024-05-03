package Java_programming_loop_array_String;
import java.util.Scanner;
public class pattern_with_user_input {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of Row : ");
		int r = sc.nextInt();
		System.out.println("Enter the number of Column : ");
		int c = sc.nextInt();
		
		patternWithUserInput(r , c);
		
		patternWithNoUserInput();
		
		sc.close();
	}
	
	public static void patternWithUserInput(int r , int c )
	{
		
		/*
		
		Z Z Z Z Z
		Y Y Y Y Y
		X X X X X 
		W W W W W 
		V V V V V

		*/	
		
		char x = 'Z';	
		for (int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{	
				System.out.print(x+" ");
			}
			if (x=='A')
			{
			x = 'Z';
			x++;
			}
			x-- ;
							
			System.out.println();
		}				
		System.out.println();
		System.out.println("---------------------------");
		
		//////////////////////////////////////////////////////////////////////////////

		/*
		
		1  2  3  4  5  6  
		7  8  9  10 11 12 
		13 14 15 16 17 18 	
		19 20 21 22 23 24 
		25 26 27 28 29 30 
		31 32 33 34 35 36 
		 
		*/
							
		int a=1;
		for (int i=0; i<r;i++)
		{
			for (int j=0;j<c;j++)
			{
			if (a<=9) 
			{
				System.out.print(a + "  ");
			}
			else
			{
				System.out.print(a + " ");
			}
			a++;
			}
			System.out.println();
		}
		
		//////////////////////////////////////////////////////////////////////////////

		/*
		
		1 0 1 0 1 
		0 1 0 1 0 
		1 0 1 0 1 
		0 1 0 1 0 
		1 0 1 0 1 
		 
		*/	
							
		System.out.println();
		System.out.println("---------------------------");					
		char b = 'A';
		for (int i=1;i<=r;i++)
		{ 
			for( int j=1;j<=c;j++)
			{
				System.out.print(b%2+ " ");
				b++;
			}
			System.out.println();	
		}
		
		//////////////////////////////////////////////////////////////////////////////

		/*
		
		A B C D E F G H 
		I J K L M N O P 
		Q R S T U V W X 
		Y Z A B C D E F 
		G H I J K L M N 
		O P Q R S T U V 
		W X Y Z A B C D 
		E F G H I J K L
	 
		*/
		
		System.out.println();
		System.out.println("---------------------------");			
		b = 'A';
		for(int i=0;i<r;i++)
		{
			for (int j=0;j<c;j++)
			{
				System.out.print(b+ " ");
				b++;						
				if(b >'Z')
				{
				b = 'A';
				}
			}
			System.out.println();								
		}
	
	}

	public static void patternWithNoUserInput()
	{
		/*
		 
	 	*****
	 	
	 	*/
		
		for ( int i=0 ; i<5 ; i++)
		{
			System.out.print("* ");
		}
		
		//////////////////////////////////////////////////////////////////////////////
		
		/*
		 
		*
		*
		*
		*
		*
		
		*/
		
		System.out.println();
		System.out.println("---------------------------");
		for ( int i=0 ; i<5 ; i++)
		{
			System.out.println("*");
		}
	
		//////////////////////////////////////////////////////////////////////////////////
		
		/*
			 
			 	1 2 3 4 5
			 
		 */
				
		System.out.println();
		System.out.println("---------------------------");
		for ( int i=1 ; i<=5 ; i++)
		{
			System.out.print(i +" ");
		}
		
		///////////////////////////////////////////////////////////////////////////////////
		
		/*
				 
				1
				3
				5
				7
				9
						
		*/
		
		System.out.println();
		System.out.println("---------------------------");
		for ( int i=1 ; i<10 ; i++,i++)
		{
			System.out.println(i);
		}
					
		///////////////////////////////////////////////////////////////////////////////////
					
		/*
					 
					Shashi Shashi Shashi Shashi Shashi 
					Shashi Shashi Shashi Shashi Shashi 
					Shashi Shashi Shashi Shashi Shashi 
					Shashi Shashi Shashi Shashi Shashi 
					Shashi Shashi Shashi Shashi Shashi 
		
		*/
		
		System.out.println();
		System.out.println("---------------------------");
		for (int i =0;i<5 ;i++)
		{
			for (int j=0;j<5;j++)
			{
				System.out.print("Shashi ");
			}
			System.out.println();
		}	
					
		///////////////////////////////////////////////////////////////////////////////////
		
		/*
		 
					* * * * * 
					* * * * * 
					* * * * * 
					* * * * * 
					* * * * * 
		 
		 */
		
		System.out.println();
		System.out.println("---------------------------");
		for (int i =0;i<5 ;i++)
		{
			for (int j=0;j<5;j++)
			{
				System.out.print("♥ ");
			}
			System.out.println();
		}
							
		///////////////////////////////////////////////////////////////////////////////////
		
		/*

							1	2	3	4	5	
							6	7	8	9	10	
							11	12	13	14	15	
							16	17	18	19	20	
							21	22	23	24	25
		
		 */
									
		System.out.println();
		System.out.println("---------------------------");
		int r = 1;
		for (int i=0;i<5 ;i++)
		{
			for (int j=0;j<5;j++)
			{
				System.out.print(r+"\t");
				r++;
			}
			System.out.println();
		}
						
		///////////////////////////////////////////////////////////////////////////////////

		/*
						 
						A	B	C	D	E	
						F	G	H	I	J	
						K	L	M	N	O	
						P	Q	R	S	T	
						U	V	W	X	Y
								 
		 */
		
		System.out.println();
		System.out.println("---------------------------");
		int a = 65;
		for (int i=0;i<5 ;i++)
		{
			for (int j=0;j<5;j++)
			{
				System.out.print((char)a+"\t");
				a++;
			}
			System.out.println();
		}
						
		///////////////////////////////////////////////////////////////////////////////////
				
						
		/*
						 
						   ****
				            ****
				             ****
				              ****
		*/
				
		for (int i=0;i<5 ;i++)
		{
			for (int j=0;j<i;j++)
			{
				System.out.print("  ");
			}		
			for (int j=0;j<5;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("---------------------------");
						
		///////////////////////////////////////////////////////////////////////////////////

		/*
						
						 ****
				        ****
				       ****
				      ****
				      
		*/	
						
		for (int i=0;i<5;i++)
		{
			for (int j=4;j>i;j--)
			{
				System.out.print("  ");
			}			
			for (int k=0;k<5;k++)
			{
			System.out.print("*");
			}
			System.out.println();
		 }
		 System.out.println();
		 System.out.println("---------------------------");
		 
		 ///////////////////////////////////////////////////////////////////////////////////
		 
		 /*
		   
		 1111
         1111
         1111
         1111
         
		  */	
		
		for(int i=0;i<5;i++)
		{
			for (int j=0;j<5;j++)
			{
				System.out.print(1);
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("---------------------------");
		
		///////////////////////////////////////////////////////////////////////////////////
		
		/*
		 
	  		1111
      		2222
      		3333
      		4444
      
		 */	
	
		for(int i=1;i<6;i++)
		{
			for (int j=0;j<5;j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("---------------------------");
		
		///////////////////////////////////////////////////////////////////////////////////

		/*
		 
	     	3333
      		3113
      		3223
      		3333
		 
		 */	
	
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				if (i==0 || i==4 || j==0 || j==4 )
				{
					System.out.print(3 +" ");
				}
				else
				{
					System.out.print(i + " ");
				}
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("---------------------------");
							
		///////////////////////////////////////////////////////////////////////////////////

		/*
	 
			1 2 3 4 5
			1 2 3 4 5
			1 2 3 4 5
			1 2 3 4 5 
			1 2 3 4 5
	
	 */
		
		int n=1;
		for (int i=0;i<4;i++)
		{
			for (int j=0;j<5;j++)
			{
				System.out.print(n +" ");
				n++;
			}
			System.out.println();
			n=1;
		}
		System.out.println();
		System.out.println("---------------------------");
		
		///////////////////////////////////////////////////////////////////////////////////

		/*
		 
		1 1 1 1 1
		2 2 2 2 2
		3 3 3 3 3
		4 4 4 4 4 
		5 5 5 5 5
		
		 */		
		
		for (int i=1;i<6;i++)
		{
			for (int j=0;j<5;j++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
		
		///////////////////////////////////////////////////////////////////////////////////

		/*	
		   
		5 4 3 2 1 
		5 4 3 2 1 
		5 4 3 2 1 
		5 4 3 2 1 
		5 4 3 2 1 		 
	
		 */
			
		System.out.println();
		System.out.println("---------------------------");	
		for (int i=1;i<6;i++)
		{
			for (int j=5;j>0;j--)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		///////////////////////////////////////////////////////////////////////////////////

		/*	  
		
		5 5 5 5 5 
		4 4 4 4 4 
		3 3 3 3 3 
		2 2 2 2 2 
		1 1 1 1 1  				 
	
		 */
					
		System.out.println();
		System.out.println("---------------------------");			
		for (int i=5;i>0;i--)
		{
			for (int j=5;j>0;j--)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
		
		///////////////////////////////////////////////////////////////////////////////////

		/*	  
		
		A B C D E 
		A B C D E 
		A B C D E 
		A B C D E 
		A B C D E 				 
	
		 */ 
								
		System.out.println();
		System.out.println("---------------------------"); ;
		int x = 65;				
		for (int i=0;i<5;i++)
		{
			for (int j=0;j<5;j++)
			{
				System.out.print((char)x +" ");
				x++ ;
			}
			System.out.println();
			x=65;
		}
		
		///////////////////////////////////////////////////////////////////////////////////

		/* 
		
		 A A A A A
		 B B B B B 
		 C C C C C
		 D D D D D
		 E E E E E
		
		 */
								
		System.out.println();
		System.out.println("---------------------------");		
		for (int i = 'A';i<'F';i++)
		{
			for(int j=0;j<5;j++)
			{
				System.out.print((char)i+" ");				
			}
			System.out.println();
		}
		
		///////////////////////////////////////////////////////////////////////////////////

		/*
		
		Z Z Z Z Z
		Y Y Y Y Y
		X X X X X 
		W W W W W 
		V V V V V
		
		*/	
										
		System.out.println();
		System.out.println("---------------------------");
		char c = 'Z';
		for (int i=0 ; i<5 ;i++)
		{
			for (int j=0 ; j<5; j++)
			{
				System.out.print(c + " ");
			}
			System.out.println();
			c--;
		}
	}

}
