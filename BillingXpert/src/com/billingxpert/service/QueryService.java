package com.billingxpert.service;

import java.sql.ResultSet;

public interface QueryService {

	public boolean insertQuery(String query);
	public ResultSet readQuery(String query);
	public boolean updateQuery(String query);
}
