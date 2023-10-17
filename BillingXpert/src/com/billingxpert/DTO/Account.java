package com.billingxpert.DTO;

public class Account {

	public static int uniqueIdAccount;
	private String accountName;
	private AccountGroup accountGroup;
	private double openingBalance;
	private String address;
	private String gstin;
	private String emailId;
	private int phoneNumber;

	public Account() {
		super();
	}

	public Account(String accountName, AccountGroup accountGroup, String gstin) {
		super();
		this.accountName = accountName;
		this.accountGroup = accountGroup;
		this.gstin = gstin;
	}

	public Account(String accountName, AccountGroup accountGroup, double openingBalance, String gstin) {
		super();
		this.accountName = accountName;
		this.accountGroup = accountGroup;
		this.openingBalance = openingBalance;
		this.gstin = gstin;
	}

	public Account(String accountName, AccountGroup accountGroup, double openingBalance, String gstin, String emailId,
			int phoneNumber) {
		super();
		this.accountName = accountName;
		this.accountGroup = accountGroup;
		this.openingBalance = openingBalance;
		this.gstin = gstin;
		this.emailId = emailId;
		this.phoneNumber = phoneNumber;
	}

	public Account(String accountName, AccountGroup accountGroup, double openingBalance, String address, String gstin,
			String emailId, int phoneNumber) {
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

	public AccountGroup getAccountGroup() {
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

	public int getPhoneNumber() {
		return phoneNumber;
	}

}
