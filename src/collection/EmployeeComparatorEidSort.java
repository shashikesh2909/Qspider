package collection;

import java.util.Comparator;

public class EmployeeComparatorEidSort implements Comparator<Employee>
{

	@Override
	public int compare(Employee o1, Employee o2) 
	{
		if(o1.eid>o2.eid)
		return 1;
		else if(o1.eid<o2.eid)
			return -1;
		else return 0 ;
	}

}
 