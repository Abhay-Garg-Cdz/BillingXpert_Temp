package com.billingxpert.views;

import javax.swing.JPanel;
import javax.swing.JMenu;
import java.awt.Font;
import java.rmi.server.ExportException;

import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.border.EtchedBorder;

public class NavBar extends JPanel {

	/**
	 * Create the panel.
	 */
	// Instance Block
	JMenuBar mainMenuBar;

	{
		setLayout(null);
		setBounds(0, 0, 1045, 50);
		mainMenuBar = new JMenuBar();
		mainMenuBar.setBounds(5, 5, 1035, 43);
		mainMenuBar.setFont(new Font("Book Antiqua", Font.BOLD | Font.ITALIC, 25));
		add(mainMenuBar);
	}

	public NavBar() {
		setBorder(new CompoundBorder(new LineBorder(new Color(0, 0, 0)), new EtchedBorder(EtchedBorder.LOWERED, null, null)));

		admininstrationMenu();
		transactionsMenu();
		paymentsMenu();
		displayMenu();
		exportsMenu();
		aboutMenu();
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
		addAccountMenuItem.setFont(new Font("Book Antiqua", Font.BOLD, 22));
		accountMenu.add(addAccountMenuItem);

		JMenuItem updateAccountMenuItem = new JMenuItem("Update");
		updateAccountMenuItem.setFont(new Font("Book Antiqua", Font.BOLD, 22));
		accountMenu.add(updateAccountMenuItem);

		JMenuItem listAccountMenuItem = new JMenuItem("List");
		listAccountMenuItem.setFont(new Font("Book Antiqua", Font.BOLD, 22));
		accountMenu.add(listAccountMenuItem);

		// AccountGroup Menu

		JMenu accountGroupMenu = new JMenu("Account Group");
		accountGroupMenu.setFont(new Font("Book Antiqua", Font.BOLD, 22));
		administrationMenu.add(accountGroupMenu);

		JMenuItem addAccountGroupMenuItem = new JMenuItem("Add");
		addAccountGroupMenuItem.setFont(new Font("Book Antiqua", Font.BOLD, 22));
		accountGroupMenu.add(addAccountGroupMenuItem);

		JMenuItem updateAccountGroupMenuItem = new JMenuItem("Update");
		updateAccountGroupMenuItem.setFont(new Font("Book Antiqua", Font.BOLD, 22));
		accountGroupMenu.add(updateAccountGroupMenuItem);

		JMenuItem listAccountGroupMenuItem = new JMenuItem("List");
		listAccountGroupMenuItem.setFont(new Font("Book Antiqua", Font.BOLD, 22));
		accountGroupMenu.add(listAccountGroupMenuItem);

		// Item Menu

		JMenu itemMenu = new JMenu("Item");
		itemMenu.setFont(new Font("Book Antiqua", Font.BOLD, 22));
		administrationMenu.add(itemMenu);

		JMenuItem addItemMenuItem = new JMenuItem("Add");
		addItemMenuItem.setFont(new Font("Book Antiqua", Font.BOLD, 22));
		itemMenu.add(addItemMenuItem);

		JMenuItem updateItemMenuItem = new JMenuItem("Update");
		updateItemMenuItem.setFont(new Font("Book Antiqua", Font.BOLD, 22));
		itemMenu.add(updateItemMenuItem);

		JMenuItem listItemMenuItem = new JMenuItem("List");
		listItemMenuItem.setFont(new Font("Book Antiqua", Font.BOLD, 22));
		itemMenu.add(listItemMenuItem);

		// ItemGroup Menu
		JMenu itemGroupMenu = new JMenu("Item Group");
		itemGroupMenu.setFont(new Font("Book Antiqua", Font.BOLD, 22));
		administrationMenu.add(itemGroupMenu);

		JMenuItem addItemGroupMenuItem = new JMenuItem("Add");
		addItemGroupMenuItem.setFont(new Font("Book Antiqua", Font.BOLD, 22));
		itemGroupMenu.add(addItemGroupMenuItem);

		JMenuItem updateItemGroupMenuItem = new JMenuItem("Update");
		updateItemGroupMenuItem.setFont(new Font("Book Antiqua", Font.BOLD, 22));
		itemGroupMenu.add(updateItemGroupMenuItem);

		JMenuItem listItemGroupMenuItem = new JMenuItem("List");
		listItemGroupMenuItem.setFont(new Font("Book Antiqua", Font.BOLD, 22));
		itemGroupMenu.add(listItemGroupMenuItem);

		// Unit Menu

		JMenu unitMenu = new JMenu("Unit");
		unitMenu.setFont(new Font("Book Antiqua", Font.BOLD, 22));
		administrationMenu.add(unitMenu);

		JMenuItem addUnitMenuItem = new JMenuItem("Add");
		addUnitMenuItem.setFont(new Font("Book Antiqua", Font.BOLD, 22));
		unitMenu.add(addUnitMenuItem);

		JMenuItem updateUnitMenuItem = new JMenuItem("Update");
		updateUnitMenuItem.setFont(new Font("Book Antiqua", Font.BOLD, 22));
		unitMenu.add(updateUnitMenuItem);

		JMenuItem listUnitMenuItem = new JMenuItem("List");
		listUnitMenuItem.setFont(new Font("Book Antiqua", Font.BOLD, 22));
		unitMenu.add(listUnitMenuItem);

		// Financial Year Menu
		JMenuItem financialYearMenuItem = new JMenuItem("Financial Year");
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
				addSalesMenuItem.setFont(new Font("Book Antiqua", Font.BOLD, 22));
				salesMenu.add(addSalesMenuItem);

				JMenuItem updateSalesMenuItem = new JMenuItem("Update");
				updateSalesMenuItem.setFont(new Font("Book Antiqua", Font.BOLD, 22));
				salesMenu.add(updateSalesMenuItem);

				JMenuItem listSalesMenuItem = new JMenuItem("List");
				listSalesMenuItem.setFont(new Font("Book Antiqua", Font.BOLD, 22));
				salesMenu.add(listSalesMenuItem);

				// AccountGroup Menu

				JMenu purchaseMenu = new JMenu("Purchase");
				purchaseMenu.setFont(new Font("Book Antiqua", Font.BOLD, 22));
				transactionsMenu.add(purchaseMenu);

				JMenuItem addPurchaseMenuItem = new JMenuItem("Add");
				addPurchaseMenuItem.setFont(new Font("Book Antiqua", Font.BOLD, 22));
				purchaseMenu.add(addPurchaseMenuItem);

				JMenuItem updatePurchaseMenuItem = new JMenuItem("Update");
				updatePurchaseMenuItem.setFont(new Font("Book Antiqua", Font.BOLD, 22));
				purchaseMenu.add(updatePurchaseMenuItem);

				JMenuItem listPurchaseMenuItem = new JMenuItem("List");
				listPurchaseMenuItem.setFont(new Font("Book Antiqua", Font.BOLD, 22));
				purchaseMenu.add(listPurchaseMenuItem);

				// Item Menu

				JMenu salesReturnMenu = new JMenu("Sales Return");
				salesReturnMenu.setFont(new Font("Book Antiqua", Font.BOLD, 22));
				transactionsMenu.add(salesReturnMenu);

				JMenuItem addSalesReturnMenuItem = new JMenuItem("Add");
				addSalesReturnMenuItem.setFont(new Font("Book Antiqua", Font.BOLD, 22));
				salesReturnMenu.add(addSalesReturnMenuItem);

				JMenuItem updateSalesReturnMenuItem = new JMenuItem("Update");
				updateSalesReturnMenuItem.setFont(new Font("Book Antiqua", Font.BOLD, 22));
				salesReturnMenu.add(updateSalesReturnMenuItem);

				JMenuItem listSalesReturnMenuItem = new JMenuItem("List");
				listSalesReturnMenuItem.setFont(new Font("Book Antiqua", Font.BOLD, 22));
				salesReturnMenu.add(listSalesReturnMenuItem);

				// ItemGroup Menu
				JMenu purchaseReturnMenu = new JMenu("Purchase Return");
				purchaseReturnMenu.setFont(new Font("Book Antiqua", Font.BOLD, 22));
				transactionsMenu.add(purchaseReturnMenu);

				JMenuItem addPurchaseReturnMenuItem = new JMenuItem("Add");
				addPurchaseReturnMenuItem.setFont(new Font("Book Antiqua", Font.BOLD, 22));
				purchaseReturnMenu.add(addPurchaseReturnMenuItem);

				JMenuItem updatePurchaseReturnMenuItem = new JMenuItem("Update");
				updatePurchaseReturnMenuItem.setFont(new Font("Book Antiqua", Font.BOLD, 22));
				purchaseReturnMenu.add(updatePurchaseReturnMenuItem);

				JMenuItem listPurchaseReturnMenuItem = new JMenuItem("List");
				listPurchaseReturnMenuItem.setFont(new Font("Book Antiqua", Font.BOLD, 22));
				purchaseReturnMenu.add(listPurchaseReturnMenuItem);

				
	}
	
	
	private void paymentsMenu() {
		
		// Payments Menu Bar

		JMenu paymentsMenu = new JMenu("Payments");
		paymentsMenu.setFont(new Font("Book Antiqua", Font.BOLD | Font.ITALIC, 24));
//		paymentsMenu.setBounds(0, 0, 55, 48);
		mainMenuBar.add(paymentsMenu);

		//  Receipts Menu

		JMenu receiptMenu = new JMenu("Receipt");
		receiptMenu.setFont(new Font("Book Antiqua", Font.BOLD, 22));
		paymentsMenu.add(receiptMenu);

		JMenuItem addreceiptMenuItem = new JMenuItem("Add");
		addreceiptMenuItem.setFont(new Font("Book Antiqua", Font.BOLD, 22));
		receiptMenu.add(addreceiptMenuItem);

		JMenuItem updateReceiptMenuItem = new JMenuItem("Update");
		updateReceiptMenuItem.setFont(new Font("Book Antiqua", Font.BOLD, 22));
		receiptMenu.add(updateReceiptMenuItem);

		JMenuItem listReceiptMenuItem = new JMenuItem("List");
		listReceiptMenuItem.setFont(new Font("Book Antiqua", Font.BOLD, 22));
		receiptMenu.add(listReceiptMenuItem);

		// Payments(Inner) Menu

		JMenu paymentMenu = new JMenu("Payments");
		paymentMenu.setFont(new Font("Book Antiqua", Font.BOLD, 22));
		paymentsMenu.add(paymentMenu);

		JMenuItem addPaymentMenuItem = new JMenuItem("Add");
		addPaymentMenuItem.setFont(new Font("Book Antiqua", Font.BOLD, 22));
		paymentMenu.add(addPaymentMenuItem);

		JMenuItem updatePaymentMenuItem = new JMenuItem("Update");
		updatePaymentMenuItem.setFont(new Font("Book Antiqua", Font.BOLD, 22));
		paymentMenu.add(updatePaymentMenuItem);

		JMenuItem listPaymentMenuItem = new JMenuItem("List");
		listPaymentMenuItem.setFont(new Font("Book Antiqua", Font.BOLD, 22));
		paymentMenu.add(listPaymentMenuItem);
		
	}
	
	
	private void displayMenu() {
		
		//Display Menu
		
		JMenu displayMenu = new JMenu("Display");
		displayMenu.setFont(new Font("Book Antiqua", Font.BOLD | Font.ITALIC, 24));
//		displayMenu.setBounds(0, 0, 55, 48);
		mainMenuBar.add(displayMenu);
		
		JMenuItem dayBookMenuItem = new JMenuItem("Day Book");
		dayBookMenuItem.setFont(new Font("Book Antiqua", Font.BOLD, 22));
		displayMenu.add(dayBookMenuItem);
		
		JMenuItem ledgerMenuItem = new JMenuItem("Ledger");
		ledgerMenuItem.setFont(new Font("Book Antiqua", Font.BOLD, 22));
		displayMenu.add(ledgerMenuItem);
		
//		JMenuItem expenditureMenuItem = new JMenuItem("List");
//		expenditureMenuItem.setFont(new Font("Book Antiqua", Font.BOLD, 22));
//		displayMenu.add(expenditureMenuItem);
		
		
	}
	
	private void  exportsMenu() {
		
				//Exports Menu
		
				JMenu exportsMenu = new JMenu("Exports/Print");
				exportsMenu.setFont(new Font("Book Antiqua", Font.BOLD | Font.ITALIC, 24));
				exportsMenu.setBounds(0, 0, 55, 48);
				mainMenuBar.add(exportsMenu);
				
				JMenuItem ledgerMenuItem = new JMenuItem("Ledger");
				ledgerMenuItem.setFont(new Font("Book Antiqua", Font.BOLD, 22));
				exportsMenu.add(ledgerMenuItem);
				
				JMenuItem stockStatusMenuItem = new JMenuItem("Stock Status");
				stockStatusMenuItem.setFont(new Font("Book Antiqua", Font.BOLD, 22));
				exportsMenu.add(stockStatusMenuItem);
				
				JMenuItem accountListMenuItem = new JMenuItem("Account List");
				accountListMenuItem.setFont(new Font("Book Antiqua", Font.BOLD, 22));
				exportsMenu.add(accountListMenuItem);
				
				
				JMenuItem itemListMenuItem = new JMenuItem("Item List");
				itemListMenuItem.setFont(new Font("Book Antiqua", Font.BOLD, 22));
				exportsMenu.add(itemListMenuItem);
			
	}
	
	
	private void aboutMenu() {
		
		//About Menu
		
		JMenu aboutMenu = new JMenu("About");
		aboutMenu.setFont(new Font("Book Antiqua", Font.BOLD | Font.ITALIC, 24));
		aboutMenu.setBounds(0, 0, 55, 48);
		mainMenuBar.add(aboutMenu);
		
		JMenuItem helpMenuItem = new JMenuItem("Help");
		helpMenuItem.setFont(new Font("Book Antiqua", Font.BOLD, 22));
		aboutMenu.add(helpMenuItem);
		
		JMenuItem aboutMenuItem = new JMenuItem("About");
		aboutMenuItem.setFont(new Font("Book Antiqua", Font.BOLD, 22));
		aboutMenu.add(aboutMenuItem);
		
		JMenuItem exitMenuItem = new JMenuItem("Exit");
		exitMenuItem.setFont(new Font("Book Antiqua", Font.BOLD, 22));
		aboutMenu.add(exitMenuItem);
				
	}
}
