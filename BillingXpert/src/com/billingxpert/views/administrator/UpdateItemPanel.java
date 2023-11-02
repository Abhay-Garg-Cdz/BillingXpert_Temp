package com.billingxpert.views.administrator;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.JTextField;
import javax.swing.JButton;


public class UpdateItemPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 25743L;
	private JTextField nameTextField;
	private JTextField itemGroupTextField;
	private JTextField unitTextField;
	private JTextField openingQuantityTextField;
	private JTextField hsnTextField;
	private JTextField salesPriceTextField;
	private JTextField purchasePriceTextField;

	/**
	 * Create the panel.
	 */
	public UpdateItemPanel() {
		setBackground(SystemColor.info);
		setLayout(null);

		JLabel tagLabel = new JLabel("Update Item");
		tagLabel.setForeground(SystemColor.textHighlight);
		tagLabel.setFont(new Font("Monospaced", Font.BOLD | Font.ITALIC, 35));
		tagLabel.setBounds(422, 10, 254, 55);
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

		JLabel itemGroupLabel = new JLabel("Item Group*");
		itemGroupLabel.setFont(new Font("Tempus Sans ITC", Font.BOLD, 20));
		itemGroupLabel.setBounds(30, 200, 160, 35);
		add(itemGroupLabel);

		itemGroupTextField = new JTextField();
		itemGroupLabel.setLabelFor(itemGroupTextField);
		itemGroupTextField.setFont(new Font("Segoe UI Variable", Font.PLAIN, 20));
		itemGroupTextField.setColumns(10);
		itemGroupTextField.setBounds(220, 200, 245, 35);
		add(itemGroupTextField);

		JLabel unitLabel = new JLabel("Unit");
		unitLabel.setFont(new Font("Tempus Sans ITC", Font.BOLD, 20));
		unitLabel.setBounds(30, 295, 160, 35);
		add(unitLabel);

		unitTextField = new JTextField();
		unitLabel.setLabelFor(unitTextField);
		unitTextField.setFont(new Font("Segoe UI Variable", Font.PLAIN, 20));
		unitTextField.setColumns(10);
		unitTextField.setBounds(220, 295, 160, 35);
		add(unitTextField);

		JLabel openingQuantityLabel = new JLabel("Opening Quantity");
		openingQuantityLabel.setFont(new Font("Tempus Sans ITC", Font.BOLD, 20));
		openingQuantityLabel.setBounds(30, 390, 180, 35);
		add(openingQuantityLabel);

		openingQuantityTextField = new JTextField();
		openingQuantityLabel.setLabelFor(openingQuantityTextField);
		openingQuantityTextField.setFont(new Font("Segoe UI Variable", Font.PLAIN, 20));
		openingQuantityTextField.setColumns(10);
		openingQuantityTextField.setBounds(220, 390, 160, 35);
		add(openingQuantityTextField);

		JLabel hsnLabel = new JLabel("HSN");
		hsnLabel.setFont(new Font("Tempus Sans ITC", Font.BOLD, 20));
		hsnLabel.setBounds(560, 105, 75, 35);
		add(hsnLabel);

		hsnTextField = new JTextField();
		hsnLabel.setLabelFor(hsnTextField);
		hsnTextField.setFont(new Font("Segoe UI Variable", Font.PLAIN, 20));
		hsnTextField.setColumns(10);
		hsnTextField.setBounds(675, 105, 270, 35);
		add(hsnTextField);

		JLabel salesPriceLabel = new JLabel("Sales Price");
		salesPriceLabel.setFont(new Font("Tempus Sans ITC", Font.BOLD, 20));
		salesPriceLabel.setBounds(560, 200, 116, 35);
		add(salesPriceLabel);

		salesPriceTextField = new JTextField();
		salesPriceLabel.setLabelFor(salesPriceTextField);
		salesPriceTextField.setFont(new Font("Segoe UI Variable", Font.PLAIN, 20));
		salesPriceTextField.setColumns(10);
		salesPriceTextField.setBounds(675, 200, 270, 35);
		add(salesPriceTextField);

		JLabel purchasePriceLabel = new JLabel("Purchase Price");
		purchasePriceLabel.setFont(new Font("Tempus Sans ITC", Font.BOLD, 20));
		purchasePriceLabel.setBounds(516, 295, 149, 35);
		add(purchasePriceLabel);

		purchasePriceTextField = new JTextField();
		purchasePriceLabel.setLabelFor(purchasePriceTextField);
		purchasePriceTextField.setFont(new Font("Segoe UI Variable", Font.PLAIN, 20));
		purchasePriceTextField.setColumns(10);
		purchasePriceTextField.setBounds(675, 295, 270, 35);
		add(purchasePriceTextField);

		JButton saveButton = new JButton("Update");
		saveButton.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 25));
		saveButton.setBounds(435, 458, 171, 44);
		add(saveButton);

	}
}
