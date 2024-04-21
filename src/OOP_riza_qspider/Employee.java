package OOP_riza_qspider;

import java.util.Scanner;

public class Employee {
	
	String company_name = "INFOSYS" ;
	int eid ;
	String ename ;
	double sal ; 
	int deptno ;
	char gender ;
	
	Employee()
	{
		
	}
	
	Employee(int eid , String ename)
	{
		if(eid > 9999 || eid <=0 )
		{
			this.eid = 1000 ;
		}
		else 
		{
			this.eid = eid ;
		}
		this.ename=  ename ;
	}
	
	Employee(int eid, String ename,double sal)
	{
		if(eid > 9999 || eid <=0 )
		{
			this.eid = 1000 ;
		}
		else 
		{
			this.eid = eid ;
		}
		
		if (sal>= 750000 && sal <= 900000)
		{
			this.sal = sal - sal*0.1 ;
		}
		else if (sal >= 900000 && sal <= 1200000)
		{
			this.sal = sal - sal*0.15 ;
		}
		else if (sal>= 1200000 && sal <= 1500000)
		{
			this.sal = sal - sal*0.2 ;
		}
		else if (sal>= 150000)
		{
			this.sal = sal - sal*0.3 ;
		}
		else 
		{
			this.sal = sal;
		}
		this.ename = ename ;
	}
		
	Employee(int eid, String ename,double sal,int deptno)
	{
		
		
		if(eid > 1000)
		{
			this.eid = 1000 ;
		}
		
		if (sal>= 750000 && sal <= 900000)
		{
			this.sal = sal - sal*0.1 ;
		}
		else if (sal >= 900000 && sal <= 1200000)
		{
			this.sal = sal - sal*0.15 ;
		}
		else if (sal>= 1200000 && sal <= 1500000)
		{
			this.sal = sal - sal*0.2 ;
		}
		else if (sal>= 150000)
		{
			this.sal = sal - sal*0.3 ;
		}
		else
		{
			this.sal = sal ;
		}
		
		if (deptno < 9 || deptno > 100 || deptno%5 !=0 )
		{
			this.deptno = 10;
		}
		else
		{
			this.deptno = deptno ;
		}
	}
	
	Employee(int eid, String ename,double sal,int deptno,char gender)
	{
		this(eid,ename,sal,deptno);
		
		if (gender != 'M' || gender !='F'||gender != 'm' || gender !='f')
		{
			this.gender = 'T';
		}
		else
		{
			this.gender = gender ;
		}
		
	}
	
	public void display()
	{
		System.out.println(this.eid + "\t" + this.ename + "\t" + this.sal +"\t" + this.deptno +"\t"+ this.gender + "\t" + company_name);
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter Employee ID: ");
		int id = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Employee Name: ");
		String name = sc.nextLine();
		System.out.println("Enter Employee sal: ");
		double salary = sc.nextDouble() ; 
		System.out.println("Enter Employee Department number : ");
		int dno = sc.nextInt() ;
		System.out.println("Enter Employee Gender : ");
		char gen = sc.next().charAt(0);
		
		Employee e1 = new Employee();
		
		Employee e2 = new Employee(id,name);
		
		Employee e3 = new Employee (id,name,salary);
		
		Employee e4 = new Employee (id,name,salary,dno);
		
		Employee e5 = new Employee (id,name,salary,dno,gen);
		
		System.out.println("Non parametrised constructor");

		e1.display();
		System.out.println("id and name constructor");

		e2.display();
		System.out.println("id , name, salary");

		e3.display();
		System.out.println("id, name , salary , department");

		e4.display();
		System.out.println("id , name , salary , depatno , gender ");

		e5.display();
		
		sc.close();
				
	}

}
