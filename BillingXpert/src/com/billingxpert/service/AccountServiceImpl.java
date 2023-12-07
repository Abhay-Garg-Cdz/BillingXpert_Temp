package com.billingxpert.service;

import com.billingxpert.DTO.Account;
import com.billingxpert.dao.CommonDAO;
import com.billingxpert.main.Main;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class AccountServiceImpl implements AccountService {

	@Override
	public boolean addAccount(Account account) {
		
		Connection connection = CommonDAO.getConnection();
		
		
		//INSERT INTO `billing_xpert`.`account` (`uniqueIdAccount`, `accountName`, `accountgroup`, `openingbalance`, `address`, `gstin`, `emailId`, `phoneno`) VALUES ('82', 'Abhay Garg', 'Sundry Creditors', '5000', 'Muradnagar', ')AKH01', 'abhayagg@gmail.com', '76055133');
		int accountId = Main.fs.uniqueIdAccount;
		String query = "INSERT INTO `billing_xpert`.`account` (`uniqueIdAccount`, `accountName`, `accountgroup`, `openingbalance`, `address`, `gstin`, `emailId`, `phoneno`) VALUES ('"+accountId+"', '"+account.getaccountName()+"', '"+account.getAccountGroup()+"', '"+account.getOpeningBalance()+"', '"+account.getAddress()+"', '"+account.getgstin()+"', '"+account.getEmailId()+"', '"+account.getPhoneNumber()+"');";
		try {
			Statement s = connection.createStatement();
			s.execute(query);
//			System.out.println("Successfully Executed");
		}
		catch(SQLException sqExp ) {
			sqExp.printStackTrace();
		}
		Main.fs.uniqueIdAccount++;
		
		return false;
	}

	@Override
	public boolean updateAccount(Account account) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Account viewAccount(Account account) {
		// TODO Auto-generated method stub
		return null;
	}

}
