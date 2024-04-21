package OOP_riza_qspider;

import java.util.Scanner;

public class Student_thismethod 
{
	int sid;
	String sname;
	int age;
	char gender;
	long phone_num ;
	double perc;
	
	public void print()
	{
		System.out.println(this.sid+"\t"+this.sname+"\t"+this.age+"\t"+this.gender+"\t"+this.phone_num+"\t"+this.perc);
	}
	
	Student_thismethod()
	{
		
	}
	
	Student_thismethod(int sid , String name)
	{
		if (sid < 999 || sid > 9999 || sid %2 != 0 )
		{
			System.out.println("Invalid ID");
			this.sid = 0;
		}
		else 
		{
			this.sid = sid;
		}
		this.sname = name;
	}
	
	Student_thismethod(int sid , String name , int age)
	{
		this(sid , name);
		
		if (age < 15 || age > 25)
		{
			this.age = 0;
		}
		else
		{
			this.age = age;
		}
	}
	
	Student_thismethod(int sid , String name , int age,char gender)
	{
		this(sid , name, age);
		
		if (gender == 'M' || gender == 'm' || gender == 'F' || gender == 'f')
		{
			this.gender = gender;
		}
		else
		{
			this.gender = 'T';
		}
	}
	
	public static int dig(long n)
	{
		int count = 0;
		while(n>0)
		{
		n = n/10;
		count++ ;
		}
		return count ;
	}
	
	Student_thismethod(int sid , String name , int age,char gender , long phone_num)
	{
		this(sid , name, age,gender);
		
		if (dig(phone_num) == 10 || phone_num/1000000000 ==9 || phone_num/1000000000 == 8 || phone_num/1000000000 ==7 || phone_num/1000000000 ==6)
		{
			this.phone_num = phone_num;
		}
		else
		{
			this.phone_num = 0;
		}
	}
	
	Student_thismethod(int sid , String name , int age,char gender , long phone_num,double perc)
	{
		this(sid , name, age,gender,phone_num);
		
		if (perc < 40 || perc > 100)
		{
			this.perc = 0;
		}
		else
		{
			this.perc = perc;
		}
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter student ID: ");
		int sid = sc.nextInt();
		
		sc.nextLine();
		System.out.println("Enter student Name: ");
		String sname = sc.nextLine();
		
		System.out.println("Enter student Age: ");
		int age = sc.nextInt();
		
		System.out.println("Enter student gender: ");
		char gender = sc.next().charAt(0);
		
		System.out.println("Enter student Phone number: ");
		long phone_num = sc.nextLong();
		
		System.out.println("Enter student percentage: ");
		double perc = sc.nextDouble();
		
		Student_thismethod s1 = new Student_thismethod();
		Student_thismethod s2 = new Student_thismethod(sid,sname);
		Student_thismethod s3 = new Student_thismethod(sid,sname,age);
		Student_thismethod s4 = new Student_thismethod(sid,sname,age,gender);
		Student_thismethod s5 = new Student_thismethod(sid,sname,age,gender,phone_num);
		Student_thismethod s6 = new Student_thismethod(sid,sname,age,gender,phone_num,perc);

		s1.print();
		s2.print();
		s3.print();
		s4.print();
		s5.print();
		s6.print();
		
		
		sc.close();
		
	}

}
