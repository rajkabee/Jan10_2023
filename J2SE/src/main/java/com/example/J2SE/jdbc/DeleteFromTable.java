package com.example.J2SE.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteFromTable {
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		String url = "jdbc:mysql://localhost:3306/school";
		String username = "root";
		String password = "root";
		Class.forName("com.mysql.cj.jdbc.Driver");		//Driver Registration
		Connection con = DriverManager.getConnection(url, username, password);
		System.out.println("Connected to the database!");
		
		System.out.println("Enter the id of the student to be deleted: ");
		int id = new Scanner(System.in).nextInt();
		
		String query = "delete from students where id=?";
		PreparedStatement pstm = con.prepareStatement(query);
		pstm.setInt(1, id);
		
		int i = pstm.executeUpdate();
		
		if(i==1) {
			System.out.println("Student deleted from the table!");
		}
		
		con.close();
	}
}
