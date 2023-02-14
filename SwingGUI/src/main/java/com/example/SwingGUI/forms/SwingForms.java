package com.example.SwingGUI.forms;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class SwingForms extends JFrame implements ActionListener{
	JTextField emailField;
	JTextField nameField;
	JRadioButton isActiveRadio;
	JRadioButton inActiveRadio;
	JPasswordField passwordField;
	JComboBox<String> educationField;
	public SwingForms() {
		setBounds(200,100,800,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel header = new JLabel("Form Header",0);
		header.setFont(new Font("algerian", 0, 38));
		add(header, "North");
		
		JPanel form = new JPanel();
		form.setBackground(Color.LIGHT_GRAY);
		form.setLayout(null);
		
		JLabel nameLabel = new JLabel("Name: ");
		nameLabel.setBounds(200, 50, 150, 20);
		form.add(nameLabel);
		
		nameField = new JTextField();
		nameField.setBounds(350, 50, 250, 20);
		form.add(nameField);
		
		JLabel emailLabel = new JLabel("Email: ");
		emailLabel.setBounds(200, 80, 150, 20);
		form.add(emailLabel);
		
		emailField = new JTextField();
		emailField.setBounds(350, 80, 250, 20);
		form.add(emailField);
		
		JLabel activeLabel = new JLabel("Active: ");
		activeLabel.setBounds(200, 110, 150, 20);
		form.add(activeLabel);
		
		isActiveRadio = new JRadioButton("Is Active");
		isActiveRadio.setBounds(350, 110, 100, 20);
		//isActiveRadio.defau
		form.add(isActiveRadio);
		
		inActiveRadio = new JRadioButton("Is Not Active");
		inActiveRadio.setBounds(500, 110, 100, 20);
		form.add(inActiveRadio);
		
		ButtonGroup activebg = new ButtonGroup();
		activebg.add(isActiveRadio);
		activebg.add(inActiveRadio);
		
		JLabel passwordLabel = new JLabel("Password: ");
		passwordLabel.setBounds(200, 140, 150, 20);
		form.add(passwordLabel);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(350, 140, 250, 20);
		form.add(passwordField);
		
		JLabel educationLabel = new JLabel("Education: ");
		educationLabel.setBounds(200, 170, 150, 20);
		form.add(educationLabel);
		
		String[] levels = {"SEE", "+2", "Bachelors", "Masters", "Doctorate"};
		educationField = new JComboBox<String>(levels);
		educationField.setBounds(350, 170, 150, 20);
		form.add(educationField);
		
		JButton submitButton = new JButton("Submit");
		submitButton.setForeground(Color.WHITE);
		submitButton.setBackground(new Color(0,150,0));
		submitButton.setBounds(250, 240, 300, 30);
		submitButton.setFont(new Font("Times new roman", 1, 18));
		submitButton.addActionListener(this);
		
		form.add(submitButton);
		add(form, "Center");
		setVisible(true);
	}
	public static void main(String[] args) {
		new SwingForms();
	}
	public void actionPerformed(ActionEvent e) {
		String name = nameField.getText();
		String email = emailField.getText();
		boolean isActive = isActiveRadio.isSelected();
		String password = new String(passwordField.getPassword());
		String education = educationField.getSelectedItem().toString();
		System.out.println(name+" "+email+" "+isActive+"password: "+password+" "+education);
	}
}
