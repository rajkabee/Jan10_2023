package com.example.SwingGUI;

import java.awt.Toolkit;

import javax.swing.JFrame;

public class Window extends JFrame{
	public Window(){
		setTitle("Dursikshya");
    	setIconImage(Toolkit.getDefaultToolkit().createImage("logo.png"));
    	//setTitle("Dursikshya");
    	//setSize(800, 500);
    	setBounds(200, 100, 800, 500);
    	//setExtendedState(JFrame.MAXIMIZED_BOTH);
    	//setUndecorated(true);
    	
	}
}
