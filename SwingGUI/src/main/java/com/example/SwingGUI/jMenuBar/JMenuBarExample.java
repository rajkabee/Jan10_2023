package com.example.SwingGUI.jMenuBar;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import com.example.SwingGUI.Window;

public class JMenuBarExample {
	public static void main(String[] args) {
		Window window = new Window();
		window.setLayout(new FlowLayout());
		MyMenuBar menubar = new MyMenuBar();
		window.setJMenuBar(menubar);
		window.setVisible(true);
	}
}
