package com.sorting;

import java.util.Comparator;

public class SalaryComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		if (o1.avg == o2.avg)
		return 0;
		else if (o1.avg > o2.avg) 
		return 1;
		else 
		return -1;	
		
	}
    
}
