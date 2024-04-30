package encapsulation;

import java.util.Scanner;

public class Bank_main 
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{		
		Bank cx1 = new Bank("shashikesh2909","enter","Shashi",3698521444L ,21000,9898);
		cx1.login();
	}
}
