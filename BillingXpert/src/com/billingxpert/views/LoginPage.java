package com.billingxpert.views;

//import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Image;
import javax.swing.ImageIcon;
import java.awt.EventQueue;
import java.awt.Font;
//import java.awt.image.*;

//import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
//import javax.swing.SwingConstants;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class LoginPage extends JFrame {

	/**
	 * 
	 */
//	private JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					new LoginPage();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LoginPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 600);
		setResizable(false);
		setTitle("Login");
		setLocationRelativeTo(null);
		JLabel welcome = new JLabel("Login");
		welcome.setFont(new Font("Segoe Print", Font.BOLD | Font.ITALIC, 50));
		Container container = this.getContentPane();
		container.setLayout(null);
		welcome.setBounds(177, 215, 170, 78);
		container.add(welcome);

//		JLabel imgLabel = new JLabel("");
//		ImageIcon image_1 = new ImageIcon(ClassLoader.getSystemResource("res/images/billingXpert.jpg"));
//		Image image_2 = image_1.getImage().getScaledInstance(100, 50, Image.SCALE_DEFAULT);
//		imgLabel.setIcon(new ImageIcon(image_2));
//		imgLabel.setBounds(177, 200, 138, 74);
//		getContentPane().add(imgLabel);

		textField = new JTextField();
		textField.setBounds(208, 327, 236, 32);
		getContentPane().add(textField);
		textField.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("UserID :");
		lblNewLabel_1.setFont(new Font("Segoe UI Variable", Font.BOLD | Font.ITALIC, 22));
		lblNewLabel_1.setBounds(68, 321, 96, 32);
		getContentPane().add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel(" Password :");
		lblNewLabel_2.setFont(new Font("Segoe UI Variable", Font.BOLD | Font.ITALIC, 22));
		lblNewLabel_2.setBounds(68, 384, 127, 25);
		getContentPane().add(lblNewLabel_2);

		passwordField = new JPasswordField();
		passwordField.setBounds(208, 386, 236, 32);
		getContentPane().add(passwordField);

		JButton btnNewButton = new JButton("Login");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setBounds(76, 474, 145, 42);
		getContentPane().add(btnNewButton);

		JButton btnNewButton_1 = new JButton("Register\r\n");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_1.setBounds(268, 474, 145, 42);
		getContentPane().add(btnNewButton_1);

		JLabel imageLabel = new JLabel();
		imageLabel.setBounds(144, 27, 203, 178);
		ImageIcon image_1 = new ImageIcon(ClassLoader.getSystemResource("res/images/billingXpert.png"));
		Image image_2 = image_1.getImage().getScaledInstance(225, 150, Image.SCALE_DEFAULT);
		imageLabel.setIcon(new ImageIcon(image_2));
		getContentPane().add(imageLabel);
		setVisible(true);
	}
}