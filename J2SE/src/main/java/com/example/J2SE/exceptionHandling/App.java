package com.example.J2SE.exceptionHandling;

import java.sql.SQLException;

public class App {
	public static void main(String[] args) {
		DAO dao = new DAO();
		try {
			dao.connect();
		} catch (SQLException e) {
			
			System.out.println(e.getMessage());
			//System.out.println("Could not connect to the database at the moment!");
		}
	}
}
