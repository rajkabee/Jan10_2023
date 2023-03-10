package com.example.J2SE.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ReadAllFromTable {
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		String url = "jdbc:mysql://localhost:3306/school";
		String username = "root";
		String password = "root";
		Class.forName("com.mysql.cj.jdbc.Driver");		//Driver Registration
		Connection con = DriverManager.getConnection(url, username, password);
		System.out.println("Connected to the database!");
		String query = "select * from students";
		PreparedStatement pstm = con.prepareStatement(query); 
		List<Student> students = new ArrayList<>();
		ResultSet rs = pstm.executeQuery();
		Student st;
		while(rs.next()) {
			st = new Student();
			st.setId(rs.getInt("id"));
			st.setName(rs.getString("name"));
			st.setEmail(rs.getString("email"));
			st.setActive(rs.getBoolean("active"));
			students.add(st);		
		}
		students.forEach(System.out::println);
		
		con.close();
	}
}
