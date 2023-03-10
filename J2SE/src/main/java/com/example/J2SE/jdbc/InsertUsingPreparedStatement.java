package com.example.J2SE.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertUsingPreparedStatement {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String url = "jdbc:mysql://localhost:3306/school";
		String username = "root";
		String password = "root";
		Class.forName("com.mysql.cj.jdbc.Driver");		//Driver Registration
		Connection con = DriverManager.getConnection(url, username, password);
		System.out.println("Connected to the database!");
		
		String query = "insert into students (name, email, active) "
				+ "values (?, ?, ?)";
		String name = "Subash Adhikari";
		String email = "subash@gmail.com";
		boolean active = true;
		PreparedStatement pstm = con.prepareStatement(query);
		pstm.setString(1, name);
		pstm.setString(2, email);
		pstm.setBoolean(3, active);
		int i = pstm.executeUpdate();
		if(i==1) {
			System.out.println("Data inserted to the database!");
		}
		
		con.close();
	}

}
