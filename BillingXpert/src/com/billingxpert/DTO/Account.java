package com.billingxpert.DTO;

public class Account {

	public static int uniqueIdAccount;
	private String accountName;
	private String accountGroup;
	private double openingBalance;
	private String address;
	private String gstin;
	private String emailId;
	private String phoneNumber;

	public Account() {
		super();
	}

	public Account(String accountName, String accountGroup, String gstin) {
		super();
		this.accountName = accountName;
		this.accountGroup = accountGroup;
		this.gstin = gstin;
	}

	public Account(String accountName, String accountGroup, double openingBalance, String gstin) {
		super();
		this.accountName = accountName;
		this.accountGroup = accountGroup;
		this.openingBalance = openingBalance;
		this.gstin = gstin;
	}

	public Account(String accountName, String accountGroup, double openingBalance, String gstin, String emailId,
			String phoneNumber) {
		super();
		this.accountName = accountName;
		this.accountGroup = accountGroup;
		this.openingBalance = openingBalance;
		this.gstin = gstin;
		this.emailId = emailId;
		this.phoneNumber = phoneNumber;
	}

	public Account(String accountName, String accountGroup, double openingBalance, String address, String gstin,
			String emailId, String phoneNumber) {
		super();
		this.accountName = accountName;
		this.accountGroup = accountGroup;
		this.openingBalance = openingBalance;
		this.address = address;
		this.gstin = gstin;
		this.emailId = emailId;
		this.phoneNumber = phoneNumber;
	}

	public int getuniqueIdAccount() {
		return uniqueIdAccount;
	}

	public String getaccountName() {
		return accountName;
	}

	public String getAccountGroup() {
		return accountGroup;
	}

	public double getOpeningBalance() {
		return openingBalance;
	}

	public String getAddress() {
		return address;
	}

	public String getgstin() {
		return gstin;
	}

	public String getEmailId() {
		return emailId;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public static void setUniqueIdAccount(int uniqueIdAccount) {
		Account.uniqueIdAccount = uniqueIdAccount;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public void setAccountGroup(String accountGroup) {
		this.accountGroup = accountGroup;
	}

	public void setOpeningBalance(double openingBalance) {
		this.openingBalance = openingBalance;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setGstin(String gstin) {
		this.gstin = gstin;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	

}
