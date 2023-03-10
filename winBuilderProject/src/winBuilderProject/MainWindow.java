package winBuilderProject;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;

public class MainWindow {

	private JFrame frame;
	private JTextField usernameField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindow window = new MainWindow();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 896, 502);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel headerPanel = new JPanel();
		headerPanel.setBackground(new Color(192, 192, 192));
		frame.getContentPane().add(headerPanel, BorderLayout.NORTH);
		
		JLabel header = new JLabel("Application Header");
		header.setFont(new Font("Times New Roman", Font.BOLD, 36));
		header.setForeground(new Color(0, 64, 128));
		headerPanel.add(header);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel formHeader = new JLabel("Form");
		formHeader.setHorizontalAlignment(SwingConstants.CENTER);
		formHeader.setFont(new Font("Calibri", Font.BOLD, 24));
		formHeader.setBounds(332, 11, 188, 54);
		panel.add(formHeader);
		
		usernameField = new JTextField();
		usernameField.setToolTipText("Username");
		usernameField.setFont(new Font("Calibri", Font.PLAIN, 14));
		usernameField.setBounds(332, 99, 188, 20);
		panel.add(usernameField);
		usernameField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setToolTipText("Password");
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 14));
		passwordField.setBounds(332, 130, 188, 20);
		panel.add(passwordField);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.setBackground(new Color(0, 128, 0));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton.setBounds(332, 161, 188, 31);
		panel.add(btnNewButton);
	}
}
