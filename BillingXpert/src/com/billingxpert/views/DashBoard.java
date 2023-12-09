package com.billingxpert.views;

import java.awt.SystemColor;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JPanel;

import com.billingxpert.main.Main;
import com.billingxpert.utils.Loader;
import com.billingxpert.views.administrator.AddAccountPanel;
import com.billingxpert.views.administrator.AddItemPanel;
import com.billingxpert.views.administrator.AddUnitPanel;
import com.billingxpert.views.administrator.UpdateAccountPanel;
import com.billingxpert.views.administrator.UpdateItemPanel;
import com.billingxpert.views.display.DayBookPanel;
import com.billingxpert.views.display.LedgerPanel;
import com.billingxpert.views.payments.AddPaymentsPanel;
import com.billingxpert.views.payments.AddReceiptPanel;
import com.billingxpert.views.payments.UpdatePaymentsPanel;
import com.billingxpert.views.payments.UpdateReceiptPanel;
import com.billingxpert.views.transactions.AddPurchasePanel;
import com.billingxpert.views.transactions.AddSalesPanel;
import com.billingxpert.views.transactions.UpdatePurchasePanel;
import com.billingxpert.views.transactions.UpdateSalesPanel;



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
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosed(WindowEvent e) {
				try {
					Loader.serializeFields(Main.fs);
//					System.out.println("Exit...");
					System.exit(EXIT_ON_CLOSE);
				} catch (IOException ed) {
					// TODO Auto-generated catch block
					ed.printStackTrace();
				}
			}
			@Override
			public void windowDeactivated(WindowEvent e) {    // Executes when an error occurs and abortion of program
				try {  
					Loader.serializeFields(Main.fs);
//					System.out.println("Exit 2...");
					System.exit(EXIT_ON_CLOSE);
				} catch (IOException ed) {
					// TODO Auto-generated catch block
					ed.printStackTrace();
				}
			}
			@Override
			public void windowClosing(WindowEvent e) {     // Executes When window is closed by user
				try {
					Loader.serializeFields(Main.fs);
//					System.out.println("Exit 3...");
					System.exit(EXIT_ON_CLOSE);
				} catch (IOException ed) {
					// TODO Auto-generated catch block
					ed.printStackTrace();
				}
			}
		});
		initialize();
	}

	/**
	 * Initialize the contents of the
	 */
	private void initialize() {

		getContentPane().setBackground(SystemColor.info);
		setResizable(false);
		setBounds(100, 75, 1050, 750);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
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

		case 7: // Add Item
			activityPanel.setVisible(false);
			activityPanel = new AddItemPanel();
			activityPanel.setBounds(0, 51, 588, 412);
			break;

		case 8: // Update Item
			activityPanel.setVisible(false);
			activityPanel = new UpdateItemPanel();
			activityPanel.setBounds(0, 51, 588, 412);
			break;

		case 9: // List Item
			activityPanel.setVisible(false);
//			activityPanel = new ListItemPanel();
//			activityPanel.setBounds(0, 51, 588, 412);
			break;

		case 13: // Add Unit
			activityPanel.setVisible(false);
			activityPanel = new AddUnitPanel();
			activityPanel.setBounds(0, 51, 470, 290);
			break;


		case 15: // List Unit
			activityPanel.setVisible(false);
//			activityPanel = new ListUnitPanel();
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
//			System.out.println("Using Currently: -- " + activityPanel.getClass().getName());
			setVisible(true);
		}
	}

	public void refresh() {
		this.validate();
		this.repaint();

	}
}
