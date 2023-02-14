package com.example.SwingGUI.jFrames;

import java.awt.Toolkit;

import javax.swing.JFrame;

public class App 
{
    public static void main( String[] args )
    {
    	JFrame frame = new JFrame("Dursikshya");
    	frame.setIconImage(Toolkit.getDefaultToolkit().createImage("logo.png"));
    	//frame.setTitle("Dursikshya");
    	//frame.setSize(800, 500);
    	frame.setBounds(200, 100, 800, 500);
    	//frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
    	//frame.setUndecorated(true);
    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	frame.setVisible(true);
    }
}
