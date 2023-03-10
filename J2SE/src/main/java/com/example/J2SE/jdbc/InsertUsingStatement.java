package com.example.J2SE.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertUsingStatement {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String url = "jdbc:mysql://localhost:3306/school";
		String username = "root";
		String password = "root";
		Class.forName("com.mysql.cj.jdbc.Driver");		//Driver Registration
		Connection con = DriverManager.getConnection(url, username, password);
		System.out.println("Connected to the database!");
		
		String query = "insert into students (name, email, active) values "
				+ "('Sanjay Pajiyar', 'sanjay@gmail.com', true)";
		Statement stm = con.createStatement();
		int i = stm.executeUpdate(query);
		if(i==1) {
			System.out.println("Data inserted to the database!");
		}
		
		con.close();
	}
}
