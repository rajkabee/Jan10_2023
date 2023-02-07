package com.example.J2SE.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateTableData {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String url = "jdbc:mysql://localhost:3306/school";
		String username = "root";
		String password = "root";
		Class.forName("com.mysql.cj.jdbc.Driver");		//Driver Registration
		Connection con = DriverManager.getConnection(url, username, password);
		System.out.println("Connected to the database!");
		
		String query = "update students set name=?, email=?, active=? where id=?";
		Student st = new Student(2, "Pratik Rai", "pratik@gmail.com", false);
		PreparedStatement pstm = con.prepareStatement(query);
		pstm.setString(1, st.getName());
		pstm.setString(2, st.getEmail());
		pstm.setBoolean(3, st.isActive());
		pstm.setInt(4, st.getId());
		int i = pstm.executeUpdate();
		if(i==1) {
			System.out.println("Data updated in the database!");
		}
		
		con.close();
	}

}
