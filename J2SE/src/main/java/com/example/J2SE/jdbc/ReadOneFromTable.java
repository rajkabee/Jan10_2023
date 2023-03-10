package com.example.J2SE.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ReadOneFromTable {
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		String url = "jdbc:mysql://localhost:3306/school";
		String username = "root";
		String password = "root";
		Class.forName("com.mysql.cj.jdbc.Driver");		//Driver Registration
		Connection con = DriverManager.getConnection(url, username, password);
		System.out.println("Connected to the database!");
		String query = "select * from students where id=?";
		PreparedStatement pstm = con.prepareStatement(query); 
		pstm.setInt(1, 5);
		ResultSet rs = pstm.executeQuery();
		Student st = new Student();
		if(rs.next()) {
			st.setId(rs.getInt("id"));
			st.setName(rs.getString("name"));
			st.setEmail(rs.getString("email"));
			st.setActive(rs.getBoolean("active"));
		}
		System.out.println(st);
		
		con.close();
	}
}
