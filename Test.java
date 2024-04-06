package com.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Test {

	public static void main(String[] args) {
		ArrayList<Employee>a1=new ArrayList<>();
		a1.add(new Employee(109,"Jaydeep",50000));
		a1.add(new Employee(105,"deepak",150000));
		a1.add(new Employee(102,"deep",75000));
        
		Collections.sort(a1);
		
		for (Employee employee : a1) {
			System.out.println("ID: "+employee.getId()+
					           " Name:"+employee.getName()+
					            "Salary"+employee.getSalary());
		}
	}

}
