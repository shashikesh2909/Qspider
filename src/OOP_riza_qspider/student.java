package OOP_riza_qspider;

public class student 
{
	static String school_name = "Delhi public school";
	int sid ;
	String name ;
	int age ;
	double perc ;
	
	public  void display ()
	{
		System.out.println(sid + "\t"+ name +"\t" + age + "\t" + perc + "\t"+ school_name );
	}

	public static void main(String[] args) 
	{
		student s1 = new student();
		student s2 = new student();
		student s3 = new student();
		student s4 = new student();
		
		s1.sid = 101 ;
		s1.name = "Ramesh";
		s1.age = 12 ;
		s1.perc = 85.2 ;
		
		s2.sid = 102 ;
		s2.name = "Suresh";
		s2.age = 14 ;
		s2.perc = 95.2 ;
		
		s3.sid = 103 ;
		s3.name = "Yogesh";
		s3.age = 13 ;
		s3.perc = 75.6 ;
		
		s4.sid = 104 ;
		s4.name = "Lankesh";
		s4.age = 14 ;
		s4.perc = 55.24 ;
		
		System.out.println("SID" + "\t"+ "SName" + "\t" + "Age" + "\t"+ "Perc" + "\t"+ "School Name");
		s1.display() ;
		s2.display() ;
		s3.display() ;
		s4.display() ;
	}
}
