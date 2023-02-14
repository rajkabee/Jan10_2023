package com.example.SwingGUI.layouts;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CardLayoutExample2 extends JFrame implements ActionListener{
	CardLayout layout;
	JPanel panel; 
	//JButton button;
	public CardLayoutExample2() {
		panel = new JPanel();
		layout = new CardLayout();
		panel.setLayout(layout);
		JButton button= new JButton("Next");
		JButton button2= new JButton("Previous");
		button.addActionListener(this);
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layout.previous(panel);
			}
		});
		JLabel label1 = new JLabel("One");
		JLabel label2 = new JLabel("Two");
		JLabel label3 = new JLabel("Three");
		panel.add(label1);
		panel.add(label2);
		panel.add(label3);
		add(panel, BorderLayout.CENTER);
		add(button, BorderLayout.EAST);
		add(button2, BorderLayout.WEST);
		
		setBounds(200,100,800,500);
		setVisible(true);
		
	}
	
	public void actionPerformed(ActionEvent e) {
		layout.next(panel);
	}
	
	public static void main(String[] args) {
		CardLayoutExample2 app = new CardLayoutExample2();
	}
}
