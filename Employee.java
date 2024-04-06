package com.sorting;

public class Employee implements Comparable<Employee> {
    int id;
    String name;
    int salary;
	public Employee(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public int compareTo(Employee employee) {
		return this.id - employee.id;
		/* if (salary == employee.salary)
			return 0;
		else if (salary > employee.salary) 
			return 1;
		else 
			return -1; */
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
    
   
}
