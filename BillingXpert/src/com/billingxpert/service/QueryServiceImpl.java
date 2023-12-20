package com.billingxpert.service;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.billingxpert.dao.CommonDAO;

public class QueryServiceImpl implements QueryService {

	@Override
	public boolean insertQuery(String query) {
		// TODO Auto-generated method stub
		Connection connection = CommonDAO.getConnection();
		
		try {
			Statement s = connection.createStatement();
			s.execute(query);
//			System.out.println("Successfully Executed");
		}
		catch(SQLException sqExp ) {
			sqExp.printStackTrace();
		}
		return false;
	}

	@Override
	public ResultSet readQuery(String query) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updateQuery(String query) {
		// TODO Auto-generated method stub
		return false;
	}

}
