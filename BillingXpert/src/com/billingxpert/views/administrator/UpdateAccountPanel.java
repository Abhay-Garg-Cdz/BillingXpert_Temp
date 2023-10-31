package com.billingxpert.views.administrator;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.ListSelectionModel;
import javax.swing.border.LineBorder;
import java.awt.Color;

public class UpdateAccountPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 35452635L;
	private JTextField nameTextField;
	private JTextField accountGroupTextField;
	private JTextField openingBalanceTextField;
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

		JLabel accountGroupLabel = new JLabel("Account Group*");
		accountGroupLabel.setFont(new Font("Tempus Sans ITC", Font.BOLD, 20));
		accountGroupLabel.setBounds(30, 200, 160, 35);
		add(accountGroupLabel);

		accountGroupTextField = new JTextField();
		accountGroupLabel.setLabelFor(accountGroupTextField);
		accountGroupTextField.setFont(new Font("Segoe UI Variable", Font.PLAIN, 20));
		accountGroupTextField.setColumns(10);
		accountGroupTextField.setBounds(220, 200, 245, 35);
		add(accountGroupTextField);

		JLabel openingBalanceLabel = new JLabel("Opening Balance");
		openingBalanceLabel.setFont(new Font("Tempus Sans ITC", Font.BOLD, 20));
		openingBalanceLabel.setBounds(30, 295, 160, 35);
		add(openingBalanceLabel);

		openingBalanceTextField = new JTextField();
		openingBalanceLabel.setLabelFor(openingBalanceTextField);
		openingBalanceTextField.setFont(new Font("Segoe UI Variable", Font.PLAIN, 20));
		openingBalanceTextField.setColumns(10);
		openingBalanceTextField.setBounds(220, 295, 160, 35);
		add(openingBalanceTextField);

		JLabel addressLabel = new JLabel("Address");
		addressLabel.setFont(new Font("Tempus Sans ITC", Font.BOLD, 20));
		addressLabel.setBounds(30, 390, 160, 35);
		add(addressLabel);

		addressTextField = new JTextField();
		addressLabel.setLabelFor(addressTextField);
		addressTextField.setFont(new Font("Segoe UI Variable", Font.PLAIN, 20));
		addressTextField.setColumns(10);
		addressTextField.setBounds(220, 390, 600, 35);
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
		phoneNumberLabel.setBounds(560, 295, 100, 35);
		add(phoneNumberLabel);

		phoneNumberTextField = new JTextField();
		phoneNumberLabel.setLabelFor(phoneNumberTextField);
		phoneNumberTextField.setFont(new Font("Segoe UI Variable", Font.PLAIN, 20));
		phoneNumberTextField.setColumns(10);
		phoneNumberTextField.setBounds(675, 295, 270, 35);
		add(phoneNumberTextField);

		JButton updateButton = new JButton("Update");
		updateButton.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 25));
		updateButton.setBounds(445, 563, 171, 44);
		add(updateButton);

		JLabel stateLabel = new JLabel("State");
		stateLabel.setFont(new Font("Tempus Sans ITC", Font.BOLD, 20));
		stateLabel.setBounds(30, 485, 80, 35);
		add(stateLabel);

		JList stateList = new JList();
		stateList.setBorder(new LineBorder(new Color(0, 0, 0)));
		stateList.setBackground(SystemColor.text);
		stateLabel.setLabelFor(stateList);
		stateList.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 20));
		stateList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		stateList.setBounds(220, 485, 175, 35);
		add(stateList);

		JLabel pincodeLAbel = new JLabel("Pincode");
		pincodeLAbel.setFont(new Font("Tempus Sans ITC", Font.BOLD, 20));
		pincodeLAbel.setBounds(560, 485, 100, 35);
		add(pincodeLAbel);

		pincodeTextField = new JTextField();
		pincodeLAbel.setLabelFor(pincodeTextField);
		pincodeTextField.setFont(new Font("Segoe UI Variable", Font.PLAIN, 20));
		pincodeTextField.setColumns(10);
		pincodeTextField.setBounds(675, 485, 145, 35);
		add(pincodeTextField);

	}
}
