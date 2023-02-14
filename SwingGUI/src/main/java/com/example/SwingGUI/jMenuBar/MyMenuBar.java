package com.example.SwingGUI.jMenuBar;

import java.awt.FlowLayout;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MyMenuBar extends JMenuBar{
	public MyMenuBar() {
		setLayout(new FlowLayout(FlowLayout.LEFT));
		JMenuItem home = new JMenuItem("Home");
		JMenuItem products = new JMenuItem("Products");
		JMenuItem sales = new JMenuItem("Sales");
		JMenuItem purchase = new JMenuItem("Purchase");
		JMenuItem finance = new JMenuItem("Finance");
		JMenuItem aboutUs = new JMenuItem("About Us");
		JMenuItem conatct = new JMenuItem("Contact");
		JMenu services = new JMenu("Services");
		services.add(sales);
		services.add(purchase);
		services.add(finance);
		add(home);
		add(products);
		add(services);
		add(aboutUs);
		add(conatct);
	}
}
