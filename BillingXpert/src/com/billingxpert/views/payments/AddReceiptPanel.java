package com.billingxpert.views.payments;

import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;

public class AddReceiptPanel extends JPanel {

	private static final long serialVersionUID = 64654845L;

	private JTextField voucherNumberTextField;
	private JTextField dCtextField_1;
	private JTextField dCtextField_2;
	private JTextField dCtextField_3;
	private JTextField dCtextField_4;
	private JTextField accountTextField_1;
	private JTextField accountTextField_2;
	private JTextField accountTextField_3;
	private JTextField accountTextField_4;
	private JTextField debitTextField_1;
	private JTextField debitTextField_2;
	private JTextField debitTextField_3;
	private JTextField debitTextField_4;
	private JTextField creditTextField_1;
	private JTextField creditTextField_2;
	private JTextField creditTextField_3;
	private JTextField creditTextField_4;
	private JTextField narrationTextField_1;
	private JTextField narrationTextField_2;
	private JTextField narrationTextField_3;
	private JTextField narrationTextField_4;

	Font fontSegoe = new Font("Segoe UI Variable", Font.PLAIN, 20);
	Font fontTempus = new Font("Tempus Sans ITC", Font.BOLD, 20);
	/**
	 * Create the panel.
	 */
	public AddReceiptPanel() {
		setBackground(Color.LIGHT_GRAY);
		setLayout(null);



		JLabel tagLabel = new JLabel("Add Receipt Voucher");
		tagLabel.setForeground(SystemColor.textHighlight);
		tagLabel.setFont(new Font("Monospaced", Font.BOLD | Font.ITALIC, 35));
		tagLabel.setBounds(217, 10, 415, 55);
		add(tagLabel);

		JLabel dateLabel = new JLabel("Date");
		dateLabel.setFont(fontTempus);
		dateLabel.setBounds(30, 105, 75, 35);
		add(dateLabel);

		voucherNumberTextField = new JTextField();
		voucherNumberTextField.setFont(fontSegoe);
		voucherNumberTextField.setBounds(495, 103, 107, 35);
		add(voucherNumberTextField);
		voucherNumberTextField.setColumns(10);

		JFormattedTextField dateFormattedTextField = new JFormattedTextField();
		dateLabel.setLabelFor(dateFormattedTextField);
		dateFormattedTextField.setFont(fontSegoe);
		dateFormattedTextField.setBounds(116, 108, 167, 35);
		add(dateFormattedTextField);

		JLabel voucherNumberLabel = new JLabel("Vch No.");
		voucherNumberLabel.setLabelFor(voucherNumberTextField);
		voucherNumberLabel.setFont(fontTempus);
		voucherNumberLabel.setBounds(371, 105, 75, 35);
		add(voucherNumberLabel);

		JButton saveButton = new JButton("Save");
		saveButton.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 25));
		saveButton.setBounds(333, 342, 171, 44);
		add(saveButton);

		JPanel receiptPanel = new JPanel();
		receiptPanel.setBounds(10, 163, 825, 169);
		add(receiptPanel);
		receiptPanel.setLayout(null);


		CompoundBorder c = new CompoundBorder(new MatteBorder(2, 0, 2, 0, new Color(0, 0, 0)), new LineBorder(new Color(0, 0, 0)));


		JLabel lblSNo = new JLabel("S No.");
		lblSNo.setBorder(c);
		lblSNo.setFont(fontTempus);
		lblSNo.setBounds(0, 0, 50, 35);
		receiptPanel.add(lblSNo);

		JLabel lblDc = new JLabel("D/C");
		lblDc.setFont(fontTempus);
		lblDc.setBorder(c);
		lblDc.setBounds(50, 0, 60, 35);
		receiptPanel.add(lblDc);

		JLabel accountLabel = new JLabel("Account");
		accountLabel.setFont(fontTempus);
		accountLabel.setBorder(c);
		accountLabel.setBounds(110, 0, 235, 35);
		receiptPanel.add(accountLabel);

		JLabel debitLabel = new JLabel("Debit (Rs.)");
		debitLabel.setFont(fontTempus);
		debitLabel.setBorder(c);
		debitLabel.setBounds(345, 0, 130, 35);
		receiptPanel.add(debitLabel);

		JLabel creditLabel = new JLabel("Credit (Rs.)");
		creditLabel.setFont(fontTempus);
		creditLabel.setBorder(c);
		creditLabel.setBounds(475, 0, 132, 35);
		receiptPanel.add(creditLabel);

		JLabel narrationLabel = new JLabel("Short Narration");
		narrationLabel.setFont(fontTempus);
		narrationLabel.setBorder(c);
		narrationLabel.setBounds(607, 0, 218, 35);
		receiptPanel.add(narrationLabel);

		JLabel lblSNo_1 = new JLabel("1");
		lblSNo_1.setFont(new Font("Tempus Sans ITC", Font.BOLD, 18));
		lblSNo_1.setBounds(0, 34, 50, 35);
		lblSNo_1.setBorder(c);
		receiptPanel.add(lblSNo_1);
		JLabel lblSNo_2 = new JLabel("2");
		lblSNo_2.setFont(fontTempus);
		lblSNo_2.setBounds(0, 68, 50, 35);
		lblSNo_2.setBorder(c);
		receiptPanel.add(lblSNo_2);
		JLabel lblSNo_3 = new JLabel("3");
		lblSNo_3.setFont(fontTempus);
		lblSNo_3.setBounds(0, 102, 50, 35);
		lblSNo_3.setBorder(c);
		receiptPanel.add(lblSNo_3);
		JLabel lblSNo_4 = new JLabel("4");
		lblSNo_4.setFont(fontTempus);
		lblSNo_4.setBounds(0, 135, 50, 35);
		lblSNo_4.setBorder(c);
		receiptPanel.add(lblSNo_4);

		dCtextField_1 = new JTextField();
		dCtextField_1.setFont(fontSegoe);
		dCtextField_1.setColumns(10);
		dCtextField_1.setBounds(50, 34, 60, 35);
		receiptPanel.add(dCtextField_1);

		dCtextField_2 = new JTextField();
		dCtextField_2.setFont(fontSegoe);
		dCtextField_2.setColumns(10);
		dCtextField_2.setBounds(50, 68, 60, 35);
		receiptPanel.add(dCtextField_2);

		dCtextField_3 = new JTextField();
		dCtextField_3.setFont(fontSegoe);
		dCtextField_3.setColumns(10);
		dCtextField_3.setBounds(50, 102, 60, 35);
		receiptPanel.add(dCtextField_3);

		dCtextField_4 = new JTextField();
		dCtextField_4.setFont(fontSegoe);
		dCtextField_4.setColumns(10);
		dCtextField_4.setBounds(50, 137, 60, 33);
		receiptPanel.add(dCtextField_4);

		accountTextField_1 = new JTextField();
		accountTextField_1.setFont(fontSegoe);
		accountTextField_1.setColumns(10);
		accountTextField_1.setBounds(110, 34, 235, 35);
		receiptPanel.add(accountTextField_1);

		accountTextField_2 = new JTextField();
		accountTextField_2.setFont(fontSegoe);
		accountTextField_2.setColumns(10);
		accountTextField_2.setBounds(110, 68, 235, 35);
		receiptPanel.add(accountTextField_2);

		accountTextField_3 = new JTextField();
		accountTextField_3.setFont(fontSegoe);
		accountTextField_3.setColumns(10);
		accountTextField_3.setBounds(110, 102, 235, 35);
		receiptPanel.add(accountTextField_3);

		accountTextField_4 = new JTextField();
		accountTextField_4.setFont(fontSegoe);
		accountTextField_4.setColumns(10);
		accountTextField_4.setBounds(110, 135, 235, 35);
		receiptPanel.add(accountTextField_4);

		debitTextField_1 = new JTextField();
		debitTextField_1.setFont(fontSegoe);
		debitTextField_1.setColumns(10);
		debitTextField_1.setBounds(345, 34, 130, 35);
		receiptPanel.add(debitTextField_1);

		debitTextField_2 = new JTextField();
		debitTextField_2.setFont(fontSegoe);
		debitTextField_2.setColumns(10);
		debitTextField_2.setBounds(345, 68, 130, 35);
		receiptPanel.add(debitTextField_2);

		debitTextField_3 = new JTextField();
		debitTextField_3.setFont(fontSegoe);
		debitTextField_3.setColumns(10);
		debitTextField_3.setBounds(345, 102, 130, 35);
		receiptPanel.add(debitTextField_3);

		debitTextField_4 = new JTextField();
		debitTextField_4.setFont(fontSegoe);
		debitTextField_4.setColumns(10);
		debitTextField_4.setBounds(345, 135, 130, 35);
		receiptPanel.add(debitTextField_4);

		creditTextField_1 = new JTextField();
		creditTextField_1.setFont(fontSegoe);
		creditTextField_1.setColumns(10);
		creditTextField_1.setBounds(475, 35, 132, 35);
		receiptPanel.add(creditTextField_1);

		creditTextField_2 = new JTextField();
		creditTextField_2.setFont(fontSegoe);
		creditTextField_2.setColumns(10);
		creditTextField_2.setBounds(475, 68, 132, 35);
		receiptPanel.add(creditTextField_2);

		creditTextField_3 = new JTextField();
		creditTextField_3.setFont(fontSegoe);
		creditTextField_3.setColumns(10);
		creditTextField_3.setBounds(475, 102, 132, 35);
		receiptPanel.add(creditTextField_3);

		creditTextField_4 = new JTextField();
		creditTextField_4.setFont(fontSegoe);
		creditTextField_4.setColumns(10);
		creditTextField_4.setBounds(475, 135, 132, 35);
		receiptPanel.add(creditTextField_4);

		narrationTextField_1 = new JTextField();
		narrationTextField_1.setFont(fontSegoe);
		narrationTextField_1.setColumns(10);
		narrationTextField_1.setBounds(607, 34, 219, 35);
		receiptPanel.add(narrationTextField_1);

		narrationTextField_2 = new JTextField();
		narrationTextField_2.setFont(fontSegoe);
		narrationTextField_2.setColumns(10);
		narrationTextField_2.setBounds(607, 67, 219, 35);
		receiptPanel.add(narrationTextField_2);

		narrationTextField_3 = new JTextField();
		narrationTextField_3.setFont(fontSegoe);
		narrationTextField_3.setColumns(10);
		narrationTextField_3.setBounds(607, 101, 219, 35);
		receiptPanel.add(narrationTextField_3);

		narrationTextField_4 = new JTextField();
		narrationTextField_4.setFont(fontSegoe);
		narrationTextField_4.setColumns(10);
		narrationTextField_4.setBounds(607, 134, 219, 35);
		receiptPanel.add(narrationTextField_4);





	}
}
