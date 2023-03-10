package com.example.SwingGUI.tables;

import java.util.ArrayList;

import javax.swing.table.DefaultTableModel;

public class MyTableModel extends DefaultTableModel{
	String[] cols;
	ArrayList<Student> students;
	
	public MyTableModel(ArrayList<Student> students, String[] cols) {
		this.students=students;
		this.cols=cols;
	}
	
	@Override
	public Class<?> getColumnClass(int col) {
		if(col==0) {
			return Integer.class;
		}
		else if(col==3) {
			return Boolean.class;
		}
		else {
			return String.class;
		}
	}
	@Override
	public int getColumnCount() {
		if(cols==null) {
			return 0;
		}
		else {
			return cols.length;
		}
	}
	
	@Override
	public String getColumnName(int col) {
		return cols[col];
	}
	
	@Override
	public int getRowCount() {
		if(students==null) {
			return 0;
		}
		else {
			return students.size();
		}
	}
	@Override
	public Object getValueAt(int row, int col) {
		if(col==0) {
			return students.get(row).getId();
		}
		else if(col==1) {
			return students.get(row).getName();
		}
		else if(col==2) {
			return students.get(row).getEmail();
		}
		else if(col==3) {
			return students.get(row).isActive();
		}
		else {
			return null;
		}
	}
	
}
