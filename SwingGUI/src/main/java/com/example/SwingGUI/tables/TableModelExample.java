package com.example.SwingGUI.tables;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class TableModelExample extends JFrame{
	
	public TableModelExample(){
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setDefaultCloseOperation(3);
		//setLayout(null);
		String[] colHeaders= {"Sn.", "Name", "Email", "Active"};
		List<Student> data= Arrays.asList(
				new Student(1, "Sulav Chaudhary", "sulav@gmail.com",true),
				new Student(2, "Rakshya Dangol", "rakshya@gmail.com", true),
				new Student(3, "Sabindra Maharjan", "sabindra@gmail.com", false),
				new Student(4, "Sangam Subedi", "sangam@gmail.com", false),
				new Student(5, "Sagar Pokhrel", "sagar@gmail.com", false),
				new Student(6, "Shuva Rai", "shuva@gmail.com", true)	
		);
		final ArrayList<Student> students = new ArrayList<Student>();
		data.forEach(st->students.add(st));
		MyTableModel model = new MyTableModel(students, colHeaders);
		JTable table = new JTable(model);
		JScrollPane sPane = new JScrollPane(table);
		add(sPane);
		
		setVisible(true);
	}
	public static void main(String[] args) {
		new TableModelExample();
	}
}
