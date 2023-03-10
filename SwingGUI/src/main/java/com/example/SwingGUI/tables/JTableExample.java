package com.example.SwingGUI.tables;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class JTableExample extends JFrame{
	
	public JTableExample(){
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setDefaultCloseOperation(3);
		//setLayout(null);
		String[] colHeaders= {"Sn.", "Name", "Email", "Active"};
		String[][] data= {
				{"1", "Sulav Chaudhary", "sulav@gmail.com","True"},
				{"2", "Rakshya Dangol", "rakshya@gmail.com", "True"},
				{"3", "Sabindra Maharjan", "sabindra@gmail.com", "False"},
				{"4", "Sangam Subedi", "sangam@gmail.com", "False"},
				{"5", "Sagar Pokhrel", "sagar@gmail.com", "True"},
				{"6", "Shuva Rai", "shuva@gmail.com", "False"},	
		};
		JTable table = new JTable(data, colHeaders);
		JScrollPane sPane = new JScrollPane(table);
		add(sPane);
		
		setVisible(true);
	}
	public static void main(String[] args) {
		new JTableExample();
	}
}
