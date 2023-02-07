package com.example.J2SE.oop.inheritance;

public class App {
	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.NationalId=2345213;
		emp.name="Ramesh Shrestha";
		emp.address="Samakhushi";
		emp.empId=132;
		emp.position="Accountant";
		emp.salary=45000f;
		System.out.println(emp);
		emp.greet();
	}
	
}
