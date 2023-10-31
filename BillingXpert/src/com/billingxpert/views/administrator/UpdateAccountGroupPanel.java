package com.billingxpert.views.administrator;

import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JList;
import javax.swing.UIManager;

public class UpdateAccountGroupPanel extends JPanel {

	// bound -- 530*410

	private static final long serialVersionUID = 25402L;
	private JTextField textField;

	public UpdateAccountGroupPanel() {
		setBorder(new LineBorder(SystemColor.windowBorder, 5, true));
		setBackground(SystemColor.controlLtHighlight);
		setLayout(null);

		JLabel tagLabel = new JLabel("Update Account Group");
		tagLabel.setForeground(SystemColor.textHighlight);
		tagLabel.setFont(new Font("Monospaced", Font.BOLD | Font.ITALIC, 35));
		tagLabel.setBounds(58, 10, 431, 47);
		add(tagLabel);

		JLabel nameLabel = new JLabel("Prev* Name");
		nameLabel.setFont(new Font("Tempus Sans ITC", Font.BOLD, 20));
		nameLabel.setBounds(41, 110, 112, 40);
		add(nameLabel);

		JButton updateButton = new JButton("Update");
		updateButton.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 25));
		updateButton.setBounds(209, 329, 171, 44);
		add(updateButton);

		JLabel nameLabel_1 = new JLabel("Name*");
		nameLabel_1.setFont(new Font("Tempus Sans ITC", Font.BOLD, 20));
		nameLabel_1.setBounds(41, 216, 82, 40);
		add(nameLabel_1);

		textField = new JTextField();
		textField.setFont(new Font("Segoe UI Variable", Font.PLAIN, 20));
		textField.setColumns(10);
		textField.setBounds(179, 218, 201, 33);
		add(textField);

		JList list = new JList();
		list.setBorder(UIManager.getBorder("List.focusCellHighlightBorder"));
		list.setBounds(182, 110, 201, 40);
		add(list);
	}
}
