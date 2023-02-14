package com.example.SwingGUI.jFrames;

import java.awt.Toolkit;

import javax.swing.JFrame;

public class MyFrame extends JFrame{
	public MyFrame(){
		setTitle("Dursikshya");
    	setIconImage(Toolkit.getDefaultToolkit().createImage("logo.png"));
    	//setTitle("Dursikshya");
    	//setSize(800, 500);
    	setBounds(200, 100, 800, 500);
    	//setExtendedState(JFrame.MAXIMIZED_BOTH);
    	//setUndecorated(true);
    	setVisible(true);
	}
	
	public static void main(String[] args) {
		JFrame frame = new MyFrame();
	}
}
