package com.billingxpert.views.administrator;

import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.billingxpert.DTO.Item;
import com.billingxpert.service.ItemServiceFactory;

public class AddItemPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 354132L;
	private JTextField nameTextField;
	private JTextField unitTextField;
	private JTextField hsnTextField;

	/**
	 * Create the panel.
	 */
	public AddItemPanel() {
		setBackground(SystemColor.info);
		setLayout(null);

		JLabel tagLabel = new JLabel("Add Item");
		tagLabel.setForeground(SystemColor.textHighlight);
		tagLabel.setFont(new Font("Monospaced", Font.BOLD | Font.ITALIC, 35));
		tagLabel.setBounds(220, 10, 180, 55);
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

		JLabel unitLabel = new JLabel("Unit");
		unitLabel.setFont(new Font("Tempus Sans ITC", Font.BOLD, 20));
		unitLabel.setBounds(30, 231, 160, 35);
		add(unitLabel);

		unitTextField = new JTextField();
		unitLabel.setLabelFor(unitTextField);
		unitTextField.setFont(new Font("Segoe UI Variable", Font.PLAIN, 20));
		unitTextField.setColumns(10);
		unitTextField.setBounds(220, 229, 160, 35);
		add(unitTextField);

		JLabel hsnLabel = new JLabel("HSN");
		hsnLabel.setFont(new Font("Tempus Sans ITC", Font.BOLD, 20));
		hsnLabel.setBounds(30, 169, 75, 35);
		add(hsnLabel);

		hsnTextField = new JTextField();
		hsnLabel.setLabelFor(hsnTextField);
		hsnTextField.setFont(new Font("Segoe UI Variable", Font.PLAIN, 20));
		hsnTextField.setColumns(10);
		hsnTextField.setBounds(220, 167, 270, 35);
		add(hsnTextField);

		JButton saveButton = new JButton("Save");
		saveButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Item item = new Item();
				item.setItemName(nameTextField.getText());
				item.setUnit(unitTextField.getText());
				item.setHsn(hsnTextField.getText());
				
				ItemServiceFactory.getItemService().addItem(item);
				
				}
		});
		saveButton.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 25));
		saveButton.setBounds(220, 315, 171, 44);
		add(saveButton);

	}
}
