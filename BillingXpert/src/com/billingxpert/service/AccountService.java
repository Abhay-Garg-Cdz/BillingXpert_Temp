package com.billingxpert.service;

import com.billingxpert.DTO.Account;

public interface AccountService {

	public boolean addAccount(Account account);
	public boolean updateAccount(Account account);
	public Account viewAccount(Account account);	
}
