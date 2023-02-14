package com.example.SwingGUI.layouts;

import java.awt.CardLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import com.example.SwingGUI.Window;

public class CardLayoutExample {
	static CardLayout layout;
	static Window window;
	static Container cPane; 
	public static void main(String[] args) {
		window = new Window();
		layout = new CardLayout();
		cPane = window.getContentPane();
		cPane.setLayout(layout);
		JButton btn1 = new JButton("One");
		JButton btn2 = new JButton("Two");
		JButton btn3 = new JButton("Three");
		btn1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				layout.next(cPane);
			}
		});
		btn2.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				layout.next(cPane);
			}
		});
		btn3.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				layout.next(cPane);
			}
		});
		window.add(btn1);
		window.add(btn2);
		window.add(btn3);
		window.setVisible(true);
	}
}
