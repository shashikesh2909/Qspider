package collection;

public class Student implements Comparable<Student>
{
	int sid ;
	String sname ;
	int age ;
	char gender ;
	double perc ;

	public Student ()
	{
		
	}
	
	public Student(int sid ,String sname,int age,char gender,double perc)
	{
		this.sid = sid ;
		this.sname = sname ;
		this.age = age ;
		this.gender = gender ;
		this.perc = perc ;
	}

	@Override
	public int compareTo(Student o) 
	{
		if(this.perc > o.perc)
			return 1;
		else if(this.perc < o.perc)
			return -1 ;
		else return 0 ;
	}
	
}
