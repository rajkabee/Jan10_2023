package com.example.SwingGUI.layouts;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.util.concurrent.Flow;

import javax.swing.JButton;
import javax.swing.border.Border;

import com.example.SwingGUI.Window;

public class BorderLayoutExample {
	public static void main(String[] args) {
		Window window = new Window();
		//window.setLayout(new FlowLayout(FlowLayout.CENTER));
		//window.setLayout(new BorderLayout());
		JButton header = new JButton("Header");
		JButton leftSide = new JButton("Left Side");
		JButton rightSide = new JButton("Right Side");
		JButton content = new JButton("Content");
		JButton footer = new JButton("Footer");
		
		window.add(header, BorderLayout.NORTH);
		window.add(leftSide, BorderLayout.WEST);
		window.add(rightSide, BorderLayout.EAST);
		window.add(content, BorderLayout.CENTER);
		window.add(footer, BorderLayout.SOUTH);
		window.setVisible(true);
	}
}
