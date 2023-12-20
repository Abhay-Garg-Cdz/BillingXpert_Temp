package com.billingxpert.views.administrator;

import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.border.LineBorder;

public class UpdateAccountPanel<E> extends JPanel {

	/**
	 *
	 */
	private static final long serialVersionUID = 35452635L;
	private JTextField nameTextField;
	private JTextField addressTextField;
	private JTextField gstinTextField;
	private JTextField emailTextField;
	private JTextField phoneNumberTextField;
	private JTextField pincodeTextField;

	/**
	 * Create the panel.
	 */
	public UpdateAccountPanel() {
		setBackground(SystemColor.info);
		setLayout(null);

		JLabel tagLabel = new JLabel("Update Account");
		tagLabel.setForeground(SystemColor.textHighlight);
		tagLabel.setFont(new Font("Monospaced", Font.BOLD | Font.ITALIC, 35));
		tagLabel.setBounds(386, 10, 301, 55);
		add(tagLabel);

		JLabel nameLabel = new JLabel("Name*");
		nameLabel.setFont(new Font("Tempus Sans ITC", Font.BOLD, 20));
		nameLabel.setBounds(30, 105, 75, 35);
		add(nameLabel);

		nameTextField = new JTextField();
		nameLabel.setLabelFor(nameTextField);
		nameTextField.setFont(new Font("Segoe UI Variable", Font.PLAIN, 20));
		nameTextField.setBounds(220, 105, 270, 35);
		add(nameTextField);
		nameTextField.setColumns(10);

		JLabel addressLabel = new JLabel("Address");
		addressLabel.setFont(new Font("Tempus Sans ITC", Font.BOLD, 20));
		addressLabel.setBounds(30, 295, 160, 35);
		add(addressLabel);

		addressTextField = new JTextField();
		addressLabel.setLabelFor(addressTextField);
		addressTextField.setFont(new Font("Segoe UI Variable", Font.PLAIN, 20));
		addressTextField.setColumns(10);
		addressTextField.setBounds(220, 295, 600, 35);
		add(addressTextField);

		JLabel gstinLabel = new JLabel("GSTIN");
		gstinLabel.setFont(new Font("Tempus Sans ITC", Font.BOLD, 20));
		gstinLabel.setBounds(560, 105, 75, 35);
		add(gstinLabel);

		gstinTextField = new JTextField();
		gstinLabel.setLabelFor(gstinTextField);
		gstinTextField.setFont(new Font("Segoe UI Variable", Font.PLAIN, 20));
		gstinTextField.setColumns(10);
		gstinTextField.setBounds(675, 105, 270, 35);
		add(gstinTextField);

		JLabel emailLabel = new JLabel("Email ID");
		emailLabel.setFont(new Font("Tempus Sans ITC", Font.BOLD, 20));
		emailLabel.setBounds(560, 200, 80, 35);
		add(emailLabel);

		emailTextField = new JTextField();
		emailLabel.setLabelFor(emailTextField);
		emailTextField.setFont(new Font("Segoe UI Variable", Font.PLAIN, 20));
		emailTextField.setColumns(10);
		emailTextField.setBounds(675, 200, 270, 35);
		add(emailTextField);

		JLabel phoneNumberLabel = new JLabel("Phone No.");
		phoneNumberLabel.setFont(new Font("Tempus Sans ITC", Font.BOLD, 20));
		phoneNumberLabel.setBounds(30, 200, 100, 35);
		add(phoneNumberLabel);

		phoneNumberTextField = new JTextField();
		phoneNumberLabel.setLabelFor(phoneNumberTextField);
		phoneNumberTextField.setFont(new Font("Segoe UI Variable", Font.PLAIN, 20));
		phoneNumberTextField.setColumns(10);
		phoneNumberTextField.setBounds(220, 198, 270, 35);
		add(phoneNumberTextField);

		JButton updateButton = new JButton("Update");
		updateButton.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 25));
		updateButton.setBounds(386, 441, 171, 44);
		add(updateButton);

		JLabel stateLabel = new JLabel("State");
		stateLabel.setFont(new Font("Tempus Sans ITC", Font.BOLD, 20));
		stateLabel.setBounds(30, 375, 80, 35);
		add(stateLabel);

		JList<?> stateList = new JList<E>();
		stateList.setBorder(new LineBorder(new Color(0, 0, 0)));
		stateList.setBackground(SystemColor.text);
		stateLabel.setLabelFor(stateList);
		stateList.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 20));
		stateList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		stateList.setBounds(220, 375, 175, 35);
		add(stateList);

		JLabel pincodeLAbel = new JLabel("Pincode");
		pincodeLAbel.setFont(new Font("Tempus Sans ITC", Font.BOLD, 20));
		pincodeLAbel.setBounds(560, 375, 100, 35);
		add(pincodeLAbel);

		pincodeTextField = new JTextField();
		pincodeLAbel.setLabelFor(pincodeTextField);
		pincodeTextField.setFont(new Font("Segoe UI Variable", Font.PLAIN, 20));
		pincodeTextField.setColumns(10);
		pincodeTextField.setBounds(675, 375, 145, 35);
		add(pincodeTextField);

	}
}
