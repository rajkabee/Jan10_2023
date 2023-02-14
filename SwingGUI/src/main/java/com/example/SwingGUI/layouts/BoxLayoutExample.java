package com.example.SwingGUI.layouts;

import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

import com.example.SwingGUI.Window;

public class BoxLayoutExample extends JFrame{
	public BoxLayoutExample() {
		setBounds(200, 100, 800, 500);
		setDefaultCloseOperation(3);
		getContentPane().setLayout(new BoxLayout(getContentPane(), BoxLayout.LINE_AXIS));
		JButton btn1;
		for(int i=0; i<15; i++) {
			btn1 = new JButton("button"+(i+1));
			add(btn1);
		}
		
		
		
		setVisible(true);
	}
	public static void main(String[] args) {
		new BoxLayoutExample();
		
	}
}
