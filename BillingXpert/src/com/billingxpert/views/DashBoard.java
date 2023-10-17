package com.billingxpert.views;

import java.awt.EventQueue;

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
		frameDashBoard.setBounds(100, 100, 1050, 500);
		frameDashBoard.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameDashBoard.getContentPane().setLayout(null);

		NavBar panel = new NavBar();
		panel.setBounds(0, 0, 1050, 45);
		frameDashBoard.getContentPane().add(panel);
		frameDashBoard.setVisible(true);

	}
}
