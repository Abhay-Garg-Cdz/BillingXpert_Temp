package com.billingxpert.views;

import javax.swing.JFrame;
import javax.swing.JPanel;

import com.billingxpert.views.administrator.*;
import com.billingxpert.views.transactions.*;
import com.billingxpert.views.display.*;
import com.billingxpert.views.payments.*;
import com.billingxpert.views.exports.*;

import java.awt.SystemColor;

public class DashBoard extends JFrame {

	/**
		 * 
		 */
	private static final long serialVersionUID = 187452L;
	// private static JFrame frameDashBoard = new JFrame();
	public static JPanel activityPanel = new JPanel();
	public DashBoard thisFrame = this;
	boolean sessionExists = false;

	public DashBoard() {
		initialize();
	}

	/**
	 * Initialize the contents of the
	 */
	private void initialize() {

		getContentPane().setBackground(SystemColor.info);
		setResizable(false);
		setBounds(100, 75, 1050, 750);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);

		NavBar navbarPane = new NavBar(thisFrame);
		navbarPane.setBounds(0, 0, 1036, 50);
		getContentPane().add(navbarPane);
		navbarPane.setLayout(null);

		setVisible(true);

	}

	public static <E> void showPanel(int valueFromNavbar) {
		switch (valueFromNavbar) {

		case 1: // Add Account
			activityPanel.setVisible(false);
			activityPanel = new AddAccountPanel<E>();
			activityPanel.setBounds(0, 51, 1030, 660);
			break;
		case 2: // Update Account
			activityPanel.setVisible(false);
			activityPanel = new UpdateAccountPanel<E>();
			activityPanel.setBounds(0, 51, 1030, 660);
			break;

		case 3: // List Account
			activityPanel.setVisible(false);
//			activityPanel = new ListAccountPanel();
//			activityPanel.setBounds(0, 51, 1030, 660);
			break;

		case 4: // Add Account Group
			activityPanel.setVisible(false);
			activityPanel = new AddAccountGroupPanel();
			activityPanel.setBounds(0, 51, 470, 290);
			break;

		case 5: // Update Account Group
			activityPanel.setVisible(false);
			activityPanel = new UpdateAccountGroupPanel<E>();
			activityPanel.setBounds(0, 51, 470, 290);
			break;

		case 6: // List Account Group
			activityPanel.setVisible(false);
//			activityPanel = new ListAccountGroupPanel();
			activityPanel.setBounds(0, 51, 470, 290);
			break;

		case 7: // Add Item
			activityPanel.setVisible(false);
			activityPanel = new AddItemPanel();
			activityPanel.setBounds(0, 51, 1030, 660);
			break;

		case 8: // Update Item
			activityPanel.setVisible(false);
			activityPanel = new UpdateItemPanel();
			activityPanel.setBounds(0, 51, 1030, 660);
			break;

		case 9: // List Item
			activityPanel.setVisible(false);
//			activityPanel = new ListItemPanel();
//			activityPanel.setBounds(0, 51, 1030, 660);
			break;

		case 10: // Add Item Group
			activityPanel.setVisible(false);
			activityPanel = new AddItemGroupPanel();
			activityPanel.setBounds(0, 51, 470, 290);
			break;

		case 11: // Update Item Group
			activityPanel.setVisible(false);
			activityPanel = new UpdateItemGroupPanel<E>();
			activityPanel.setBounds(0, 51, 470, 290);
			break;

		case 12: // List Item Group
			activityPanel.setVisible(false);
//			activityPanel = new ListItemGroupPanel();
			activityPanel.setBounds(0, 51, 470, 290);
			break;

		case 13: // Add Unit
			activityPanel.setVisible(false);
			activityPanel = new AddUnitPanel();
			activityPanel.setBounds(0, 51, 470, 290);
			break;

		case 14: // Update Unit
			activityPanel.setVisible(false);
			activityPanel = new UpdateUnitPanel<E>();
			activityPanel.setBounds(0, 51, 470, 290);
			break;

		case 15: // List Unit
			activityPanel.setVisible(false);
//			activityPanel = new ListUnitPanel();
			activityPanel.setBounds(0, 51, 470, 290);
			break;

		case 16: // Financial Year
			activityPanel.setVisible(false);
//			activityPanel = new FinancialYear();
			activityPanel.setBounds(0, 51, 470, 290);
			break;

		case 17: // Add Sales
			activityPanel.setVisible(false);
			activityPanel = new AddSalesPanel();
			activityPanel.setBounds(0, 51, 1030, 660);
			break;
		case 18: // Update Sales
			activityPanel.setVisible(false);
			activityPanel = new UpdateSalesPanel();
			activityPanel.setBounds(0, 51, 1030, 660);
			break;

		case 19: // List Sales
			activityPanel.setVisible(false);
//			activityPanel = new ListSalesPanel();
//			activityPanel.setBounds(0, 51, 1030, 660);
			break;

		case 20: // Add Purchase
			activityPanel.setVisible(false);
			activityPanel = new AddPurchasePanel();
			activityPanel.setBounds(0, 51, 1030, 660);
			break;

		case 21: // Update Purchase
			activityPanel.setVisible(false);
			activityPanel = new UpdatePurchasePanel();
			activityPanel.setBounds(0, 51, 1030, 660);
			break;

		case 22: // List Purchase
			activityPanel.setVisible(false);
//			activityPanel = new ListPurchasePanel();
//			activityPanel.setBounds(0, 51, 1030, 660);
			break;

		case 23: // Add Sales Return
			activityPanel.setVisible(false);
			activityPanel = new AddSalesReturnPanel();
			activityPanel.setBounds(0, 51, 1030, 660);
			break;

		case 24: // Update Sales Return
			activityPanel.setVisible(false);
			activityPanel = new UpdateSalesReturnPanel();
			activityPanel.setBounds(0, 51, 1030, 660);
			break;

		case 25: // List Sales Return
			activityPanel.setVisible(false);
//			activityPanel = new ListSalesReturnPanel();
//			activityPanel.setBounds(0, 51, 1030, 660);
			break;

		case 26: // Add Purchase Return
			activityPanel.setVisible(false);
			activityPanel = new AddPurchaseReturnPanel();
			activityPanel.setBounds(0, 51, 1030, 660);
			break;

		case 27: // Update Purchase Return
			activityPanel.setVisible(false);
			activityPanel = new UpdatePurchaseReturnPanel();
			activityPanel.setBounds(0, 51, 1030, 660);
			break;

		case 28: // List Purchase Return
			activityPanel.setVisible(false);
//			activityPanel = new ListPurchaseReturnPanel();
//			activityPanel.setBounds(0, 51, 1030, 660);
			break;

		case 29: // Add Receipt
			activityPanel.setVisible(false);
			activityPanel = new AddReceiptPanel();
			activityPanel.setBounds(0, 51, 1030, 660);
			break;

		case 30: // Update Receipt
			activityPanel.setVisible(false);
			activityPanel = new UpdateReceiptPanel();
			activityPanel.setBounds(0, 51, 1030, 660);
			break;

		case 31: // List Receipt
			activityPanel.setVisible(false);
//			activityPanel = new ListReceiptPanel();
//			activityPanel.setBounds(0, 51, 1030, 660);
			break;

		case 32: // Add Payments
			activityPanel.setVisible(false);
			activityPanel = new AddPaymentsPanel();
			activityPanel.setBounds(0, 51, 1030, 660);
			break;

		case 33: // Update Payments
			activityPanel.setVisible(false);
			activityPanel = new UpdatePaymentsPanel();
			activityPanel.setBounds(0, 51, 1030, 660);
			break;

		case 34: // List Payments
			activityPanel.setVisible(false);
//			activityPanel = new ListPaymentsPanel();
//			activityPanel.setBounds(0, 51, 1030, 660);
			break;

		case 35: // DayBook
			activityPanel.setVisible(false);
			activityPanel = new DayBookPanel();
			activityPanel.setBounds(0, 51, 1030, 660);
			break;

		case 36: // Ledger
			activityPanel.setVisible(false);
			activityPanel = new LedgerPanel();
			activityPanel.setBounds(0, 51, 1030, 660);
			break;

		case 37: // Exports
			activityPanel.setVisible(false);
			activityPanel = new ExportLedgerPanel();
			activityPanel.setBounds(0, 51, 1030, 660);
			break;

		case 38: // Exports
			activityPanel.setVisible(false);
			activityPanel = new StockStatusPanel();
			activityPanel.setBounds(0, 51, 1030, 660);
			break;

		case 39: // Exports
			activityPanel.setVisible(false);
			activityPanel = new AccountListPanel();
			activityPanel.setBounds(0, 51, 1030, 660);
			break;

		case 40: // Exports
			activityPanel.setVisible(false);
			activityPanel = new ItemListPanel();
			activityPanel.setBounds(0, 51, 1030, 660);
			break;

		case 41: // Help
			activityPanel.setVisible(false);
			activityPanel = new Help();
			activityPanel.setBounds(0, 51, 1030, 660);
			break;

		case 42: // About
			activityPanel.setVisible(false);
			activityPanel = new About();
			activityPanel.setBounds(0, 51, 1030, 660);
			break;

		case 43: // Exit
			activityPanel.setVisible(false);
			activityPanel = new ExitDialogBox();
			activityPanel.setBounds(0, 51, 1030, 660);
			break;
		}
	}

	public void adding() {
		if (sessionExists == true) {
			getContentPane().add(activityPanel);
			System.out.println("Using Currently: -- " + activityPanel.getClass().getName());
			setVisible(true);
		}
	}

	public void refresh() {
		this.validate();
		this.repaint();

	}
}
