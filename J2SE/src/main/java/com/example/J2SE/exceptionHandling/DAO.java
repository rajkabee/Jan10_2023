package com.example.J2SE.exceptionHandling;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DAO {
	public void connect() throws SQLException {
		Connection con = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306", 
				"root","root"
				);
	}
}
