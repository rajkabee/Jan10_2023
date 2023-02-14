package com.example.SwingGUI.layouts;

import java.awt.GridLayout;

import javax.swing.JButton;

import com.example.SwingGUI.Window;

public class GridLayoutExample {
	public static void main(String[] args) {
		Window window = new Window();
		window.setLayout(new GridLayout(3,0));
		
		JButton btn1 = new JButton("button");
		JButton btn2 = new JButton("button");
		JButton btn3 = new JButton("button");
		JButton btn4 = new JButton("button");
		JButton btn5 = new JButton("button");
		JButton btn6 = new JButton("button");
		JButton btn7 = new JButton("button");
		JButton btn8 = new JButton("button");
		JButton btn9 = new JButton("button");
		JButton btn10 = new JButton("button");
		
		window.add(btn1);
		window.add(btn2);
		window.add(btn3);
		window.add(btn4);
		window.add(btn5);
		window.add(btn6);
		window.add(btn7);
		window.add(btn8);
		window.add(btn9);
		window.add(btn10);
		window.setVisible(true);
	}
}
