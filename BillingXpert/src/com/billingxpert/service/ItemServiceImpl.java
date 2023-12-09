package com.billingxpert.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.billingxpert.DTO.Item;
import com.billingxpert.dao.CommonDAO;
import com.billingxpert.main.Main;

public class ItemServiceImpl implements ItemService {

	@Override
	public boolean addItem(Item item) {
		// TODO Auto-generated method stub
		
Connection connection = CommonDAO.getConnection();
		
		
		//INSERT INTO `billing_xpert`.`item` (`uniqueIdItem`, `itemName`, `unit`, `hsn`) VALUES ('101', '1 Ltr', 'Pcs.', '5432');
		int itemId = Main.fs.uniqueIdItem;
		String query = "INSERT INTO `billing_xpert`.`item` (`uniqueIdItem`, `itemName`, `unit`, `hsn`) VALUES ('"+itemId+"', '"+item.getItemName()+"', '"+item.getUnit()+"', '"+item.getHsn()+"'); ";		
		try {
			Statement s = connection.createStatement();
			s.execute(query);
//			System.out.println("Successfully Executed");
		}
		catch(SQLException sqExp ) {
			sqExp.printStackTrace();
		}
		Main.fs.uniqueIdItem++;
		
		return false;
		
	}

	@Override
	public boolean updateItem(Item item) {
		// TODO Auto-generated method stub
		return false;
	}

}
