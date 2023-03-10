package com.example.J2SE.jdbc.dao;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Student {
	private int id;
	private String name;
	private String email;
	private boolean active;
}
