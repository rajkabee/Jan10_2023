package com.example.J2SE.jdbc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public abstract class AbstractDao<T> implements Dao<T> {

	String url = "jdbc:mysql://localhost:3306/school";
	String username = "root";
	String password = "root";
	Connection con;
	@Override
	public void connect() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");		//Driver Registration
		con = DriverManager.getConnection(url, username, password);
		System.out.println("Connected to the database!");
	}
	
	@Override
	public void disconnect() throws ClassNotFoundException, SQLException {
		con.close();
	}
}
