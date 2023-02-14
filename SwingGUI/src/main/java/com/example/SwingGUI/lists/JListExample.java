package com.example.SwingGUI.lists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;

import com.example.SwingGUI.Window;

public class JListExample {
	static JList<String> list1, list2;
	static JLabel label;
	
	public static void main(String[] args) {
		Window frame = new Window();
		frame.setLayout(null);
		String[] languages = {"Java", "Python", "PHP", "Javascript"};
		list1 = new JList<String>(languages);
		list1.setBounds(150, 100, 200, 100);
		frame.add(list1);
		String[] frameworks = {"Spring", "Django", "Laravel", "Angular"};
		list2 = new JList<String>(frameworks);
		list2.setBounds(450, 100, 200, 100);
		frame.add(list2);
		
		JButton button = new JButton("select");
		button.setBounds(200, 250, 400, 30);
		frame.add(button);
		button.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				String language = list1.getSelectedValue();
				String framework = list2.getSelectedValue();
				
				String text = "Selected Language: "+language+", Selected Framework: "+framework;
				label.setText(text);
			}
		});
		
		label = new JLabel("Hello");
		label.setBounds(100, 300, 600, 20);
		frame.add(label);
		
		frame.setVisible(true);
		
	}
}
