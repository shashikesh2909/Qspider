package Riza_JAVA_Qspider;
import java.util.Scanner;
public class ifelse_practice {

		    public static void main(String args[]) 
		    {
		        Scanner sc = new Scanner(System.in);
		   /*   int x,y,z;
		      System.out.print("Enter three number");
		      x = sc.nextInt();
		      y= sc.nextInt();
		      z = sc.nextInt();
		      
		      if (x>y && x>z)
		      {
		          System.out.println("greater number is " + x);
		      }
		      else if ( y>x && y>z)
		       {
		          System.out.println("greater number is " + y);
		      }
		      else 
		      {
		          System.out.println("greater number is " + z);
		      }
		      */
		        
		        double p,c,m,b ;
			     System.out.println("Enter physics marks ");
			     p = sc.nextDouble();
			     System.out.println("Enter chemistry marks ");
			     c = sc.nextDouble();
			     System.out.println("Enter maths marks ");
			     m = sc.nextDouble();
			     System.out.println("Enter biology marks ");
			     b = sc.nextDouble();
			     
			     double per = ((p+c+m+b)/400)*100 ;
			     
			     if ( (0<=p && p<= 100) && (0<=c && c<= 100) &&  (0<=m && m<= 100)&& (0<=b && b<= 100))
			     {
			         if ((p < 35) && (c < 35) && (m < 35) && (b < 35))
			         {
			             System.out.println("Failed");
			         }
			         else
			         {
			             if (per >= 85)
			             {
			                 System.out.println("Distinction");
			             }
			             else if ( (per < 85) && (per >= 60))
			             {
			                 System.out.println("First Class") ;
			             }
			             else if ( (per < 60) && (per >= 50))
			             {
			                 System.out.println("Second Class") ;
			             }
			             else if ( (per < 50)  && (per >= 35))
			             {
			                 System.out.println("Third Class") ;
			             }
			              else
			             {
			                 System.out.println("Failed");
			             } 
			         }
			     }
		    }
	}
