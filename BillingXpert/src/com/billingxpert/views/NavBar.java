package com.billingxpert.views;

import javax.swing.JPanel;
import javax.swing.JMenu;
import java.awt.Font;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.border.EtchedBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class NavBar extends JPanel {

	/**
	 * 
	 */
	DashBoard dashBoardFrame;
	private static final long serialVersionUID = 198956L;

	/**
	 * Create the panel.
	 */
	// Instance Block
	JMenuBar mainMenuBar;

	{
		setLayout(null);
		setBounds(0, 0, 1039, 50);
		mainMenuBar = new JMenuBar();
		mainMenuBar.setBounds(5, 5, 1035, 43);
		mainMenuBar.setFont(new Font("Book Antiqua", Font.BOLD | Font.ITALIC, 25));
		add(mainMenuBar);
	}

	public NavBar(DashBoard dashBoardFrame) {
		setBorder(new CompoundBorder(new LineBorder(new Color(0, 0, 0)),
				new EtchedBorder(EtchedBorder.LOWERED, null, null)));

		admininstrationMenu();
		transactionsMenu();
		paymentsMenu();
		displayMenu();
		exportsMenu();
		aboutMenu();
		this.dashBoardFrame = dashBoardFrame;

	}

	private void admininstrationMenu() {

		// Administrator Menu Bar

		JMenu administrationMenu = new JMenu("Administrator");
		administrationMenu.setFont(new Font("Book Antiqua", Font.BOLD | Font.ITALIC, 24));
//		administrationMenu.setBounds(0, 0, , 48);
		mainMenuBar.add(administrationMenu);

		// Account Menu

		JMenu accountMenu = new JMenu("Account");
		accountMenu.setFont(new Font("Book Antiqua", Font.BOLD, 22));
		administrationMenu.add(accountMenu);

		JMenuItem addAccountMenuItem = new JMenuItem("Add");
		addAccountMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DashBoard.showPanel(1);
				refresher();
			}
		});
		addAccountMenuItem.setFont(new Font("Book Antiqua", Font.BOLD, 22));
		accountMenu.add(addAccountMenuItem);

		JMenuItem updateAccountMenuItem = new JMenuItem("Update");
		updateAccountMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DashBoard.showPanel(2);
				refresher();

			}
		});
		updateAccountMenuItem.setFont(new Font("Book Antiqua", Font.BOLD, 22));
		accountMenu.add(updateAccountMenuItem);

		JMenuItem listAccountMenuItem = new JMenuItem("List");
		listAccountMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DashBoard.showPanel(3);
				refresher();

			}
		});
		listAccountMenuItem.setFont(new Font("Book Antiqua", Font.BOLD, 22));
		accountMenu.add(listAccountMenuItem);

		// AccountGroup Menu

		JMenu accountGroupMenu = new JMenu("Account Group");
		accountGroupMenu.setFont(new Font("Book Antiqua", Font.BOLD, 22));
		administrationMenu.add(accountGroupMenu);

		JMenuItem addAccountGroupMenuItem = new JMenuItem("Add");
		addAccountGroupMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DashBoard.showPanel(4);
				refresher();

			}
		});
		addAccountGroupMenuItem.setFont(new Font("Book Antiqua", Font.BOLD, 22));
		accountGroupMenu.add(addAccountGroupMenuItem);

		JMenuItem updateAccountGroupMenuItem = new JMenuItem("Update");
		updateAccountGroupMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DashBoard.showPanel(5);
				refresher();

			}
		});
		updateAccountGroupMenuItem.setFont(new Font("Book Antiqua", Font.BOLD, 22));
		accountGroupMenu.add(updateAccountGroupMenuItem);

		JMenuItem listAccountGroupMenuItem = new JMenuItem("List");
		listAccountGroupMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DashBoard.showPanel(6);
				refresher();

			}
		});
		listAccountGroupMenuItem.setFont(new Font("Book Antiqua", Font.BOLD, 22));
		accountGroupMenu.add(listAccountGroupMenuItem);

		// Item Menu

		JMenu itemMenu = new JMenu("Item");
		itemMenu.setFont(new Font("Book Antiqua", Font.BOLD, 22));
		administrationMenu.add(itemMenu);

		JMenuItem addItemMenuItem = new JMenuItem("Add");
		addItemMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DashBoard.showPanel(7);
				refresher();

			}
		});
		addItemMenuItem.setFont(new Font("Book Antiqua", Font.BOLD, 22));
		itemMenu.add(addItemMenuItem);

		JMenuItem updateItemMenuItem = new JMenuItem("Update");
		updateItemMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DashBoard.showPanel(8);
				refresher();

			}
		});
		updateItemMenuItem.setFont(new Font("Book Antiqua", Font.BOLD, 22));
		itemMenu.add(updateItemMenuItem);

		JMenuItem listItemMenuItem = new JMenuItem("List");
		listItemMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DashBoard.showPanel(9);
				refresher();

			}
		});
		listItemMenuItem.setFont(new Font("Book Antiqua", Font.BOLD, 22));
		itemMenu.add(listItemMenuItem);

		// ItemGroup Menu
		JMenu itemGroupMenu = new JMenu("Item Group");
		itemGroupMenu.setFont(new Font("Book Antiqua", Font.BOLD, 22));
		administrationMenu.add(itemGroupMenu);

		JMenuItem addItemGroupMenuItem = new JMenuItem("Add");
		addItemGroupMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DashBoard.showPanel(10);
				refresher();

			}
		});
		addItemGroupMenuItem.setFont(new Font("Book Antiqua", Font.BOLD, 22));
		itemGroupMenu.add(addItemGroupMenuItem);

		JMenuItem updateItemGroupMenuItem = new JMenuItem("Update");
		updateItemGroupMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DashBoard.showPanel(11);
				refresher();

			}
		});
		updateItemGroupMenuItem.setFont(new Font("Book Antiqua", Font.BOLD, 22));
		itemGroupMenu.add(updateItemGroupMenuItem);

		JMenuItem listItemGroupMenuItem = new JMenuItem("List");
		listItemGroupMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DashBoard.showPanel(12);
				refresher();

			}
		});
		listItemGroupMenuItem.setFont(new Font("Book Antiqua", Font.BOLD, 22));
		itemGroupMenu.add(listItemGroupMenuItem);

		// Unit Menu

		JMenu unitMenu = new JMenu("Unit");
		unitMenu.setFont(new Font("Book Antiqua", Font.BOLD, 22));
		administrationMenu.add(unitMenu);

		JMenuItem addUnitMenuItem = new JMenuItem("Add");
		addUnitMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DashBoard.showPanel(13);
				refresher();

			}
		});
		addUnitMenuItem.setFont(new Font("Book Antiqua", Font.BOLD, 22));
		unitMenu.add(addUnitMenuItem);

		JMenuItem updateUnitMenuItem = new JMenuItem("Update");
		updateUnitMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DashBoard.showPanel(14);
				refresher();

			}
		});
		updateUnitMenuItem.setFont(new Font("Book Antiqua", Font.BOLD, 22));
		unitMenu.add(updateUnitMenuItem);

		JMenuItem listUnitMenuItem = new JMenuItem("List");
		listUnitMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DashBoard.showPanel(15);
				refresher();

			}
		});
		listUnitMenuItem.setFont(new Font("Book Antiqua", Font.BOLD, 22));
		unitMenu.add(listUnitMenuItem);

		// Financial Year Menu
		JMenuItem financialYearMenuItem = new JMenuItem("Financial Year");
		financialYearMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DashBoard.showPanel(16);
				refresher();

			}
		});
		financialYearMenuItem.setFont(new Font("Book Antiqua", Font.BOLD, 22));
		administrationMenu.add(financialYearMenuItem);

	}

	private void transactionsMenu() {

		// Transactions Menu Bar

		JMenu transactionsMenu = new JMenu("Transactions");
		transactionsMenu.setFont(new Font("Book Antiqua", Font.BOLD | Font.ITALIC, 24));
//				transactionsMenu.setBounds(0, 0, 55, 48);
		mainMenuBar.add(transactionsMenu);

		// Account Menu

		JMenu salesMenu = new JMenu("Sales");
		salesMenu.setFont(new Font("Book Antiqua", Font.BOLD, 22));
		transactionsMenu.add(salesMenu);

		JMenuItem addSalesMenuItem = new JMenuItem("Add");
		addSalesMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DashBoard.showPanel(17);
				refresher();

			}
		});
		addSalesMenuItem.setFont(new Font("Book Antiqua", Font.BOLD, 22));
		salesMenu.add(addSalesMenuItem);

		JMenuItem updateSalesMenuItem = new JMenuItem("Update");
		updateSalesMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DashBoard.showPanel(18);
				refresher();

			}
		});
		updateSalesMenuItem.setFont(new Font("Book Antiqua", Font.BOLD, 22));
		salesMenu.add(updateSalesMenuItem);

		JMenuItem listSalesMenuItem = new JMenuItem("List");
		listSalesMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DashBoard.showPanel(19);
				refresher();

			}
		});
		listSalesMenuItem.setFont(new Font("Book Antiqua", Font.BOLD, 22));
		salesMenu.add(listSalesMenuItem);

		// AccountGroup Menu

		JMenu purchaseMenu = new JMenu("Purchase");
		purchaseMenu.setFont(new Font("Book Antiqua", Font.BOLD, 22));
		transactionsMenu.add(purchaseMenu);

		JMenuItem addPurchaseMenuItem = new JMenuItem("Add");
		addPurchaseMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DashBoard.showPanel(20);
				refresher();

			}
		});
		addPurchaseMenuItem.setFont(new Font("Book Antiqua", Font.BOLD, 22));
		purchaseMenu.add(addPurchaseMenuItem);

		JMenuItem updatePurchaseMenuItem = new JMenuItem("Update");
		updatePurchaseMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DashBoard.showPanel(21);
				refresher();

			}
		});
		updatePurchaseMenuItem.setFont(new Font("Book Antiqua", Font.BOLD, 22));
		purchaseMenu.add(updatePurchaseMenuItem);

		JMenuItem listPurchaseMenuItem = new JMenuItem("List");
		listPurchaseMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DashBoard.showPanel(22);
				refresher();

			}
		});
		listPurchaseMenuItem.setFont(new Font("Book Antiqua", Font.BOLD, 22));
		purchaseMenu.add(listPurchaseMenuItem);

		// Item Menu

		JMenu salesReturnMenu = new JMenu("Sales Return");
		salesReturnMenu.setFont(new Font("Book Antiqua", Font.BOLD, 22));
		transactionsMenu.add(salesReturnMenu);

		JMenuItem addSalesReturnMenuItem = new JMenuItem("Add");
		addSalesReturnMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DashBoard.showPanel(23);
				refresher();

			}
		});
		addSalesReturnMenuItem.setFont(new Font("Book Antiqua", Font.BOLD, 22));
		salesReturnMenu.add(addSalesReturnMenuItem);

		JMenuItem updateSalesReturnMenuItem = new JMenuItem("Update");
		updateSalesReturnMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DashBoard.showPanel(24);
				refresher();

			}
		});
		updateSalesReturnMenuItem.setFont(new Font("Book Antiqua", Font.BOLD, 22));
		salesReturnMenu.add(updateSalesReturnMenuItem);

		JMenuItem listSalesReturnMenuItem = new JMenuItem("List");
		listSalesReturnMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DashBoard.showPanel(25);
				refresher();

			}
		});
		listSalesReturnMenuItem.setFont(new Font("Book Antiqua", Font.BOLD, 22));
		salesReturnMenu.add(listSalesReturnMenuItem);

		// ItemGroup Menu
		JMenu purchaseReturnMenu = new JMenu("Purchase Return");
		purchaseReturnMenu.setFont(new Font("Book Antiqua", Font.BOLD, 22));
		transactionsMenu.add(purchaseReturnMenu);

		JMenuItem addPurchaseReturnMenuItem = new JMenuItem("Add");
		addPurchaseReturnMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DashBoard.showPanel(26);
				refresher();

			}
		});
		addPurchaseReturnMenuItem.setFont(new Font("Book Antiqua", Font.BOLD, 22));
		purchaseReturnMenu.add(addPurchaseReturnMenuItem);

		JMenuItem updatePurchaseReturnMenuItem = new JMenuItem("Update");
		updatePurchaseReturnMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DashBoard.showPanel(27);
				refresher();

			}
		});
		updatePurchaseReturnMenuItem.setFont(new Font("Book Antiqua", Font.BOLD, 22));
		purchaseReturnMenu.add(updatePurchaseReturnMenuItem);

		JMenuItem listPurchaseReturnMenuItem = new JMenuItem("List");
		listPurchaseReturnMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DashBoard.showPanel(28);
				refresher();

			}
		});
		listPurchaseReturnMenuItem.setFont(new Font("Book Antiqua", Font.BOLD, 22));
		purchaseReturnMenu.add(listPurchaseReturnMenuItem);

	}

	private void paymentsMenu() {

		// Payments Menu Bar

		JMenu paymentsMenu = new JMenu("Payments");
		paymentsMenu.setFont(new Font("Book Antiqua", Font.BOLD | Font.ITALIC, 24));
//		paymentsMenu.setBounds(0, 0, 55, 48);
		mainMenuBar.add(paymentsMenu);

		// Receipts Menu

		JMenu receiptMenu = new JMenu("Receipt");
		receiptMenu.setFont(new Font("Book Antiqua", Font.BOLD, 22));
		paymentsMenu.add(receiptMenu);

		JMenuItem addreceiptMenuItem = new JMenuItem("Add");
		addreceiptMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DashBoard.showPanel(29);
				refresher();

			}
		});
		addreceiptMenuItem.setFont(new Font("Book Antiqua", Font.BOLD, 22));
		receiptMenu.add(addreceiptMenuItem);

		JMenuItem updateReceiptMenuItem = new JMenuItem("Update");
		updateReceiptMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DashBoard.showPanel(30);
				refresher();

			}
		});
		updateReceiptMenuItem.setFont(new Font("Book Antiqua", Font.BOLD, 22));
		receiptMenu.add(updateReceiptMenuItem);

		JMenuItem listReceiptMenuItem = new JMenuItem("List");
		listReceiptMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DashBoard.showPanel(31);
				refresher();

			}
		});
		listReceiptMenuItem.setFont(new Font("Book Antiqua", Font.BOLD, 22));
		receiptMenu.add(listReceiptMenuItem);

		// Payments(Inner) Menu

		JMenu paymentMenu = new JMenu("Payments");
		paymentMenu.setFont(new Font("Book Antiqua", Font.BOLD, 22));
		paymentsMenu.add(paymentMenu);

		JMenuItem addPaymentMenuItem = new JMenuItem("Add");
		addPaymentMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DashBoard.showPanel(32);
				refresher();

			}
		});
		addPaymentMenuItem.setFont(new Font("Book Antiqua", Font.BOLD, 22));
		paymentMenu.add(addPaymentMenuItem);

		JMenuItem updatePaymentMenuItem = new JMenuItem("Update");
		updatePaymentMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DashBoard.showPanel(33);
				refresher();

			}
		});
		updatePaymentMenuItem.setFont(new Font("Book Antiqua", Font.BOLD, 22));
		paymentMenu.add(updatePaymentMenuItem);

		JMenuItem listPaymentMenuItem = new JMenuItem("List");
		listPaymentMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DashBoard.showPanel(34);
				refresher();

			}
		});
		listPaymentMenuItem.setFont(new Font("Book Antiqua", Font.BOLD, 22));
		paymentMenu.add(listPaymentMenuItem);

	}

	private void displayMenu() {

		// Display Menu

		JMenu displayMenu = new JMenu("Display");
		displayMenu.setFont(new Font("Book Antiqua", Font.BOLD | Font.ITALIC, 24));
//		displayMenu.setBounds(0, 0, 55, 48);
		mainMenuBar.add(displayMenu);

		JMenuItem dayBookMenuItem = new JMenuItem("Day Book");
		dayBookMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DashBoard.showPanel(35);
				refresher();

			}
		});
		dayBookMenuItem.setFont(new Font("Book Antiqua", Font.BOLD, 22));
		displayMenu.add(dayBookMenuItem);

		JMenuItem ledgerMenuItem = new JMenuItem("Ledger");
		ledgerMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DashBoard.showPanel(36);
				refresher();

			}
		});
		ledgerMenuItem.setFont(new Font("Book Antiqua", Font.BOLD, 22));
		displayMenu.add(ledgerMenuItem);

//		JMenuItem expenditureMenuItem = new JMenuItem("List");
//		expenditureMenuItem.setFont(new Font("Book Antiqua", Font.BOLD, 22));
//		displayMenu.add(expenditureMenuItem);

	}

	private void exportsMenu() {

		// Exports Menu

		JMenu exportsMenu = new JMenu("Exports/Print");
		exportsMenu.setFont(new Font("Book Antiqua", Font.BOLD | Font.ITALIC, 24));
		exportsMenu.setBounds(0, 0, 55, 48);
		mainMenuBar.add(exportsMenu);

		JMenuItem ledgerMenuItem = new JMenuItem("Ledger");
		ledgerMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DashBoard.showPanel(37);
				refresher();

			}
		});
		ledgerMenuItem.setFont(new Font("Book Antiqua", Font.BOLD, 22));
		exportsMenu.add(ledgerMenuItem);

		JMenuItem stockStatusMenuItem = new JMenuItem("Stock Status");
		stockStatusMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DashBoard.showPanel(38);
				refresher();

			}
		});
		stockStatusMenuItem.setFont(new Font("Book Antiqua", Font.BOLD, 22));
		exportsMenu.add(stockStatusMenuItem);

		JMenuItem accountListMenuItem = new JMenuItem("Account List");
		accountListMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DashBoard.showPanel(39);
				refresher();

			}
		});
		accountListMenuItem.setFont(new Font("Book Antiqua", Font.BOLD, 22));
		exportsMenu.add(accountListMenuItem);

		JMenuItem itemListMenuItem = new JMenuItem("Item List");
		itemListMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DashBoard.showPanel(40);
				refresher();

			}
		});
		itemListMenuItem.setFont(new Font("Book Antiqua", Font.BOLD, 22));
		exportsMenu.add(itemListMenuItem);

	}

	private void aboutMenu() {

		// About Menu

		JMenu aboutMenu = new JMenu("About");
		aboutMenu.setFont(new Font("Book Antiqua", Font.BOLD | Font.ITALIC, 24));
		aboutMenu.setBounds(0, 0, 55, 48);
		mainMenuBar.add(aboutMenu);

		JMenuItem helpMenuItem = new JMenuItem("Help");
		helpMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DashBoard.showPanel(41);
				refresher();

			}
		});
		helpMenuItem.setFont(new Font("Book Antiqua", Font.BOLD, 22));
		aboutMenu.add(helpMenuItem);

		JMenuItem aboutMenuItem = new JMenuItem("About");
		aboutMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DashBoard.showPanel(42);
				refresher();

			}
		});
		aboutMenuItem.setFont(new Font("Book Antiqua", Font.BOLD, 22));
		aboutMenu.add(aboutMenuItem);

		JMenuItem exitMenuItem = new JMenuItem("Exit");
		exitMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DashBoard.showPanel(43);
				refresher();

			}
		});
		exitMenuItem.setFont(new Font("Book Antiqua", Font.BOLD, 22));
		aboutMenu.add(exitMenuItem);

	}

	public void refresher() {
		dashBoardFrame.sessionExists = true;
		dashBoardFrame.adding();
		dashBoardFrame.refresh();
		dashBoardFrame.sessionExists = false;
	}

//	public void actionPerformed(ActionEvent e) {
//		
//		if(e.getActionCommand().equals(""))
//		
//	}
}
