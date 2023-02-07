package com.example.J2SE.oop.abstraction;

public class App {
	public static void main(String[] args) {
		//AbstractDAO aDao=new AbstractDAO();
		ProductDAO pDao = new ProductDAO();
		pDao.connect();
		pDao.write();
		pDao.disconnect();
		EmployeeDAO eDao = new EmployeeDAO();
		eDao.connect();
		eDao.write();
		eDao.disconnect();
	}
}
