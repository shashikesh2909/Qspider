package Java_programming_loop_array_String;
import java.util.Arrays;
import java.util.Scanner ;


public class Array_ravi 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the size of Array: ");
//		int size = sc.nextInt();
//
//		int [] arr1 = new int [size];
//		
//		for(int i=0;i<size;i++)
//		{
//			System.out.println("Enter the value at "+i+" index  : ");
//			arr1[i] = sc.nextInt();
//		}
//		System.out.println("---------------");	
//		
//		System.out.println("Enter the size of second array");
//		int size2 = sc.nextInt();
//		int [] arr2 = new int [size2];
//		System.out.println("Enter the element of 2nd array");
//		for(int i=0;i<size2;i++)
//		{
//			System.out.println("Enter the value at "+i+" index : ");
//			arr2[i] = sc.nextInt();
//		}
//		System.out.println("enter the element which needs to be searched");
//		int n = sc.nextInt();
		
		int a[] = {1,2,2,4,5,2,3} ; int b[] = {2,3};
		System.out.println(Arrays.toString(arrayDiff(a,b)));
		sc.close();
	}
	
	// remove all the elements from 1st array which are existing in array 2 
	public static int[] arrayDiff (int []a , int [] b)
	{
		int c =0 , n = 0 , tem=0 ;
		int [] temp = new int [a.length];
		for (int i=0 ;i<a.length ;i++) 
		{
			for (int j=0 ;j<b.length ;j++)
			{
				System.out.println("value of a[i]:" + a[i]);
				if (a[i] == b[j])
				{
					System.out.println("equal condition" + a[i]);
					c++ ;
				}
				else
				{
					n++ ;
					System.out.println("value of n " +n);
				}
			}
			if(n == b.length)
			{
				System.out.println("not equal array insert " + a[i]) ;
				temp[tem] = a[i];
				tem++ ;
				n=0 ;
			}
			n=0;
		}
		int [] out = new int [a.length-c];
		int i=0;
		while(i<out.length)
		{
			out[i] = temp[i];
			i++ ;
		}
		return out ;
	}
	
	//WAP to display missing element in a given sorted array in a range
	public static void missing(int [] arr)
	{
		Arrays.sort(arr);
		int n = arr[0];
		System.out.println(Arrays.toString(arr));
		for (int i=0;i<arr.length;i++)
		{
			if (arr[i]!=n)
			{
				System.out.println(n++);
				break;
			}
			n++;
		}
	}
	
	// WAP to find highest contiguous sum of the two elements in given array
	public static void highest_sum(int [] arr)
	{
		int sum = 0,high=0;
		for (int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				if (i!=j)
				{
					sum = arr[i]+arr[j];
					if(sum > high)
					{
						high = sum ;
					}
				}
			}
		}
		System.out.println("Highest contiguous sum is : " + high);
		
	}
	
	// WAP to display the common elements between two arrays
	public static void common_element(int [] arr1 , int [] arr2)
	{
		for (int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr2.length;j++)
			{
				if(arr1[i] == arr2[j])
				{
					System.out.println(arr1[i]);
				}
			}
		}
	}
	
	// WAP to exchange of first part element to second part element between two arrays
	public static void swap_part(int [] arr1 , int [] arr2)
	{
		int temp [] = new int [arr1.length+arr2.length];
		for (int i=0;i<arr1.length/2;i++)
		{
			temp[i] = arr1[i];
			arr1[i] = arr2[i+arr2.length/2];
			arr2[arr2.length/2+i]=temp[i];			
		}
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
	}
	
	// wap to display distinct elements from given two arrays
	public static void distinct_display(int [] arr1 , int [] arr2)
	{
		int [] merge = new int[arr1.length+arr2.length];
		int s=0;
		
		for (int i=0;i<merge.length;i++)
		{
			if (i<arr1.length)
			{
				merge[i]=arr1[i];
			}
			else
			{
				merge[i]=arr2[s];
				s++ ;
			}
		}
		System.out.println(Arrays.toString(merge));
		int count=0 ;
		for (int i=0;i<merge.length;i++)
		{
			for (int j=0;j<merge.length;j++)
			{
				if(merge[i]==merge[j])
				{
					count++;
				}
			}
			if(count==1)
			{
				System.out.println(merge[i]);
			}
			count = 0;
		}
	
	}
	
	// wap to merge two arrays 
	public static void merge(int [] arr1 , int [] arr2)
	{
		int [] zigzag = new int [arr1.length + arr2.length] ;
		int s = 0 ;	
		for (int i=0;i<zigzag.length;i++)
		{
			if(i< arr1.length)	
			{
			zigzag[i] = arr1[i];
			}
			else 
			{
				zigzag[i] = arr2[s];
				s++ ;
			}
		}
		System.out.println(Arrays.toString(zigzag));
	}
	
	// WAP to combine two arrays in zigzag manner
	public static void zigzag(int [] arr1 , int [] arr2)
	{
		int [] zigzag = new int [arr1.length + arr2.length] ;
		
		int e=0 , o=0;
		for (int i=0;i<zigzag.length;i++)
		{
			if (i%2==0)
			{
				zigzag[i] = arr1[e];
				e++ ;
			}
			else
			{
				zigzag[i] = arr2[o];
				o++ ;
			}
		}
		System.out.println(Arrays.toString(zigzag));
	}
	
	// wap to check which all elements are common between two arrays
	public static void common(int [] arr1 , int [] arr2)
	{
		System.out.println("The common elements between two array are : ");
		for (int i=0;i<arr1.length;i++)
		{
			for (int j=0;j<arr2.length;j++)
			{
				if (arr1[i]==arr2[j])
				{
					System.out.print(arr1[i]+" ");
				}
			}
		}
	}
	
	// wap to check the number of occurence in an array for a number 
	public static void occurence(int [] arr, int n)
	{
		int count = 0 ;
		int i =0 ;
		for (i = 0;i<arr.length;i++)
		{
			if (n==arr[i])
			{	
				count++;
			}
		}
		System.out.println("Numbmer of occurence for "+n + " is : " + count);
	}
	
	// wap to search an element in an array 
	public static void search(int [] arr, int n)
	{
		boolean b = false ;
		int i =0 ;
		for (i = 0;i<arr.length;i++)
		{
			if (n==arr[i])
			{	
				b = true;
				break;
			}
		}
		if (b==true)
		{
			System.out.println("this is present at index :" + i);
		}
		else
		{
			System.out.println("this is not present");
		}
	}
	
	// WAP to print second max and second min element in an array 
	public static void secMaxMin(int[] arr)
	{
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println("Second max : "+arr[arr.length-2]+"\nSecond min: "+ arr[1]);
		System.out.println("Third max : "+arr[arr.length-3]+"\nThird min: "+ arr[2]);

	}

	// WAP to check and print all the pairs of element having sum 10
	public static void sum_10(int []arr)
	{
		for (int i=0;i<arr.length;i++)
		{
			for (int j=0;j<arr.length;j++)
			{
				if (arr[i]+arr[j]==10)
				{
					if (i!=j)
					{
					System.out.println(arr[i] +" " + arr[j]);
					}
				}
			}
		}
		
	}
	
	//WAP to check if all the elements of one array present in another array or not 
	public static void element_checker(int [] arr1 , int [] arr2)
	{
		int count = 0;
		for (int i=0;i<arr1.length;i++)
		{
			for (int j=0;j<arr2.length;j++)
			{
				if (arr1[i]!=arr2[j])
				{
					
				}
				else 
				{
					count++;
				}
			}
		}
		if (count != arr1.length)
		{
			System.out.println("All the element is not their");
		}
		else
		{
			System.out.println("All the element is their");
		}
	}
	
	// WAP to reverse an array without using another array
	public static void revarr(int [] arr)
	{
		int temp = 0;
		for (int i=0;i<arr.length/2;i++)
		{
			temp = arr[i];
			arr[i] = arr[arr.length-1-i];
			arr[arr.length-1-i] = temp ;
		}
		System.out.println(Arrays.toString(arr));
	}
	
	public static void arrdisplay(int [] arr)
	{
		// display element of array
		System.out.println("element of array are : ");
		for (int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		} 
	}
	
	public static void arrsum(int [] arr)
	{
		// sum all the numbers in array 
		int sum = 0;
		for (int i=0;i<arr.length ;i++)
			{
			sum = sum + arr[i] ;
			}
		System.out.println("Sum of element of array is :" +sum);
	}
	
	public static void evepro(int [] arr)
	{
		int pro = 1;
		for (int i=0;i<arr.length;i++)
		{
			if(i%2==0) 
			{
			pro = pro*arr[i];
			}
		}
		System.out.println("product of even index values are :"+pro );
	}
	
	public static void oddsum (int [] arr)
	{
		int sum = 0;
		for (int i=0;i<arr.length;i++)
		{
			if(i%2==1) 
			{
			sum = sum+arr[i];
			}
		}
		System.out.println("Sum of odd index values are :"+sum );
	}
	
	public static void arrsort(int[] arr)
	{
		// sort an array 
		Arrays.sort(arr);
		System.out.println("Sorted array is :");
		for (int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void reversearr(int[] arr)
	{
		// reverse of an array 
		System.out.println("reversed array is :");
		for (int i=arr.length-1;i>-1;i--)
		{
			System.out.print(arr[i]+" ");
		}
	}
	public static void arrpalin (int [] arr)
	{
		int revarr [] = new int[arr.length];
		for(int i=arr.length-1;i>-1;i--)
		{
			revarr[arr.length-1-i] = arr[i];
		}
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(revarr));

		boolean b = false ;
		for (int i=0;i<arr.length-1;i++)
		{
			if (arr[i] != revarr[i])
			{
				b = false ;
				break;
			}
			else
			{
				b = true;
			}
		}
		
		if(b == false )
		{
			System.out.println("This is not a pallindrome");
		}
		else
		{
			System.out.println("This is a pallindrome");
		}
	}
	
	public static void arrident (int []arr1 , int []arr2)
	{
		boolean b = false ;
		for (int i=0;i<arr1.length-1;i++)
		{
			if (arr1[i] != arr2[i])
			{
				b = false ;
				break;
			}
			else
			{
				b = true;
			}
		}
		if(b == false )
		{
			System.out.println("Arrays are not identical");
		}
		else
		{
			System.out.println("Arrays are idential");
		}
	}
	
	public static void chapal(char [] c)
	{
		char [] rev = new char [c.length];
		
		for (int i=0;i<c.length;i++)
		{
			rev[i] = c[c.length-1-i];
		}
		
		System.out.println(Arrays.toString(c));
		System.out.println(Arrays.toString(rev));
		
		boolean b = false ;
		for (int i=0;i<c.length-1;i++)
		{
			if (c[i] != rev[i])
			{
				b = false ;
				break;
			}
			else
			{
				b = true;
			}
		}
		
		if(b == false )
		{
			System.out.println("This is not a pallindrome");
		}
		else
		{
			System.out.println("This is a pallindrome");
		}

	}
	

}
