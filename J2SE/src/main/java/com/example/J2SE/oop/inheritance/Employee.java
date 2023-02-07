package com.example.J2SE.oop.inheritance;

public class Employee extends Person{
	int empId;
	String position;
	Float salary;
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", position=" + position + ", salary=" + salary 
				//+ ", national Id=" + super.NationalId+" , name="+super.name+", address="+super.address
				+super.toString()
				+ "]";
	}
	@Override
	public void greet(){
		System.out.println("Hi");
	}
	
}
