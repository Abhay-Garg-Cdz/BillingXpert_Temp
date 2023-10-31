package com.billingxpert.views.administrator;

import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import java.awt.Color;

public class AddAccountGroupPanel extends JPanel {

	// bound -- 470*290

	private static final long serialVersionUID = 2586L;
	private JTextField nameTextField;

	public AddAccountGroupPanel() {
		setBorder(new LineBorder(SystemColor.windowBorder, 5, true));
		setBackground(SystemColor.controlLtHighlight);
		setLayout(null);

		JLabel tagLabel = new JLabel("Add Account Group");
		tagLabel.setForeground(SystemColor.textHighlight);
		tagLabel.setFont(new Font("Monospaced", Font.BOLD | Font.ITALIC, 35));
		tagLabel.setBounds(58, 10, 366, 47);
		add(tagLabel);

		JLabel nameLabel = new JLabel("Name*");
		nameLabel.setFont(new Font("Tempus Sans ITC", Font.BOLD, 20));
		nameLabel.setBounds(41, 110, 82, 40);
		add(nameLabel);

		nameTextField = new JTextField();
		nameLabel.setLabelFor(nameTextField);
		nameTextField.setFont(new Font("Segoe UI Variable", Font.PLAIN, 20));
		nameTextField.setBounds(160, 112, 201, 33);
		add(nameTextField);
		nameTextField.setColumns(10);

		JButton addButton = new JButton("Add");
		addButton.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 25));
		addButton.setBounds(146, 216, 171, 44);
		add(addButton);
	}

}
