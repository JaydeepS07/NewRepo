package com.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Test01 {

	public static void main(String[] args) {
		ArrayList<Student>arrayList=new ArrayList<>();
		arrayList.add(new Student(11,"Jaydeep",55));
		arrayList.add(new Student(21,"Ritesh",35));
		arrayList.add(new Student(31,"Deepak",95));
		
		Collections.sort(arrayList,new NameComparator());
		
		for (Student student : arrayList) {
			System.out.println("ID: "+student.getId()+
					           " Name:"+student.getName()+
					            " Avg:"+student.getAvg());
		}

	}

}
