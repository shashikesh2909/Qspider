package collection;

import java.util.Comparator;

public class SortingStudent implements Comparator<Student>
{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return 0;
	}
}

class SortSidStudent implements Comparator<Student>
{
	@Override
	public int compare(Student o1, Student o2) {
		if(o1.sid > o2.sid)
			return 1 ;
		if(o1.sid < o2.sid)
			return -1 ;
		else return 0;
	}

}

class SortSnameStudent implements Comparator<Student>
{

	@Override
	public int compare(Student o1, Student o2) {
		return o1.sname.compareTo(o2.sname);
	}

}

class SortAgeStudent implements Comparator<Student>
{
	@Override
	public int compare(Student o1, Student o2) {
		if(o1.age > o2.age)
		return 1;
		else if(o1.age < o2.age)
			return -1 ;
		else return 0 ;
	}
	
}