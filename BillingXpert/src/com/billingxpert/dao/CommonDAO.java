package com.billingxpert.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CommonDAO {
	
	public static Connection con;
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Connected.... to DB");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/billing_xpert","root","#Astic@123");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static Connection getConnection() {
		return con;
	}
}
