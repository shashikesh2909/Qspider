package String_practice_Riza;

import java.util.Scanner;

public class String_practice 
{	
	static Scanner sc = new Scanner(System.in);
	public static void main (String [] args)
	{
		System.out.println("Enter email");
		String s = sc.nextLine();
		
		System.out.println("Enter Password");
		String p = sc.nextLine();
		if(s.endsWith(p))
		{
			System.out.println("Email and password cannot be same");
		}
		else
		{
			email(s) ;
			pwd(p);
		}
		
	}
//	Q WAJP takes any input from the user as a password and that string must have minimum 8 characters and uppercase , a lower case , a symbol and a number.Also enter email id : It should end with .com , it should contain @ , it should not not have space , return the email id in lower case  , not start with @ , email and password cannot be same
	

	public static boolean splchar(String a)
	{
		char [] c = a.toCharArray();
		if(a.contains("!") || a.contains("#") || a.contains("$") || a.contains("%")
				||a.contains("^") || a.contains("&") || a.contains("*") || a.contains("(") || a.contains(")") || a.contains("=") || a.contains("+") 
				|| a.contains("|") || a.contains("?")|| a.contains("/")||a.contains(">")|| a.contains("<") || a.contains(",") || a.contains("~")
				|| a.contains("`")|| a.contains(" "))
		{
			return true ;
		}
		else
		{
			return false ;
		}
	}
	
	public static void email(String email)
	{
		char [] c = email.toCharArray();
		
		if(email.length()>3 && email.substring(email.length()-4).equalsIgnoreCase(".com") && 
				!email.substring(0,1).equals("@") && email.contains("@") && 
				!email.contains(" ") && splchar(email) == false)
			{
			int c1 = 0 ,c2 = 0;
			for(int i=0;i<email.length();i++)
			{
				if (c[i] == '@')
				{
					c1++ ;
				}
				if (email.length()>1)
				{
					if (c[i] == '.' && c[i+1]=='.')
					{
						c2++ ;
					}
				}
			}
			if (c1<=1 & c2<=1)
			{
				{
					String sub = email.substring(0,email.length()-4) ;
					if (!sub.contains(".com"))
					{
						if (c[email.indexOf('@')+1] != '.' )
						{
							System.out.println("Vaild email: " + email.toLowerCase());
						}
						else
						{
							error();

						}
					}
					else
					{
						error();
					}
				}
			}
			else{
				error();
				}
		}
		else
		{
			error();
		}
		
	}
	
	public static void error ()
	{
		System.out.println("Entered email is of invalid format !! \n please enter correct email");
		String nstr = sc.nextLine();
		email(nstr);
	}
	
	public static void pwd(String pwd)
	{
		char [] c = pwd.toCharArray();
		int upper = 0 , lower = 0 , splchar = 0 , num =0 ;
		if(pwd.length()>=8)
		{
			for(int i=0 ;i<pwd.length() ; i++)
			{
				if(c[i]>=65 && c[i]<=90)
				{
					upper++;
				}
				else if (c[i]>=97 && c[i]<=122)
				{
					lower++;
				}
				else if (c[i]>=48 && c[i]<=57)
				{
					num++;
				}
				else if ((c[i]>=33 && c[i]<=47) || (c[i]>=58 && c[i]<=64)||(c[i]>=91 && c[i]<=96)||(c[i]>=123 && c[i]<=127) )
				{
					splchar++ ;
				}
					
			}
			if (upper >=1 && lower >=1 && splchar >=1 && num >= 1)
			{
				System.out.println("Valid password : " + pwd);
			}
			else
			{
				pwderror();
			}
		}
		else
		{
			pwderror();
		}
	}
	
	public static void pwderror ()
	{
		System.out.println("Entered passwordd is of invalid format !! \n please enter correct password");
		String nstr = sc.nextLine();
		pwd(nstr);
	}
}
