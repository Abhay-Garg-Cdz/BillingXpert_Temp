package com.billingxpert.views.administrator;

import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import com.billingxpert.main.Main;
import com.billingxpert.service.QueryServiceFactory;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AddUnitPanel extends JPanel {

	// bound -- 470*290

	private static final long serialVersionUID = 354231L;
	private JTextField nameTextField;

	public AddUnitPanel() {
		setBorder(new LineBorder(SystemColor.windowBorder, 5, true));
		setBackground(SystemColor.controlLtHighlight);
		setLayout(null);

		JLabel tagLabel = new JLabel("Add Unit");
		tagLabel.setForeground(SystemColor.textHighlight);
		tagLabel.setFont(new Font("Monospaced", Font.BOLD | Font.ITALIC, 35));
		tagLabel.setBounds(116, 10, 201, 47);
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
		addButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//INSERT INTO `billing_xpert`.`unit` (`uniqueIdUnit`, `unitName`) VALUES ('101', '1 Ltr');
				String query = "INSERT INTO `billing_xpert`.`unit` (`uniqueIdUnit`, `unitName`) VALUES ('"+Main.fs.uniqueIdUnit+"', '"+nameTextField.getText()+"');";
				Main.fs.uniqueIdUnit++;
				QueryServiceFactory.getQueryService().insertQuery(query);
			}
		});
		addButton.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 25));
		addButton.setBounds(146, 216, 171, 44);
		add(addButton);
	}

}
