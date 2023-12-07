package com.billingxpert.service;

public class AccountServiceFactory {

	public static AccountServiceImpl accountService;
	static {
		accountService = new AccountServiceImpl();
	}
	public static AccountService getAccountService() {
		return accountService;
	}
}
