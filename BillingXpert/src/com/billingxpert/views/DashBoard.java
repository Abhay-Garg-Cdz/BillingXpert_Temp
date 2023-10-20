package com.billingxpert.views;


import javax.swing.JFrame;
import javax.swing.JPanel;

public class DashBoard {

	private JFrame frameDashBoard;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		new DashBoard();

	}

	/**
	 * Create the application.
	 */
	public DashBoard() {
		initialize();
	}

	/**
	 * Initialize the contents of the frameDashBoard.
	 */
	private void initialize() {
		frameDashBoard = new JFrame();
		frameDashBoard.setResizable(false);
		frameDashBoard.setBounds(100, 75, 1050, 750);
		frameDashBoard.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameDashBoard.getContentPane().setLayout(null);

		NavBar navbarPane = new NavBar();
//		navbarPane.setBounds(0, 0, 1036, 50);
		frameDashBoard.getContentPane().add(navbarPane);
		navbarPane.setLayout(null);
		
		JPanel functionPanel = new UpdateAccountPanel();
		functionPanel.setBounds(0, 51, 1036, 662);
		frameDashBoard.getContentPane().add(functionPanel);
		frameDashBoard.setVisible(true);
		
		
		

	}
}
