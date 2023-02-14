import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;

public class MyWindow {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyWindow window = new MyWindow();
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
	public MyWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 976, 417);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel header = new JLabel("DURSIKSHYA",0);
		header.setForeground(new Color(0, 0, 128));
		header.setFont(new Font("Times New Roman", Font.BOLD, 36));
		header.setIcon(new ImageIcon("D:\\Eclipse Workspace nav 2022\\Java At 10, Jan 10 2023\\SwingApp\\logo.png"));
		frame.getContentPane().add(header, BorderLayout.NORTH);
	}

}
