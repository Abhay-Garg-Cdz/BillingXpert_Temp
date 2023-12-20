package com.billingxpert.DTO;

public class Account {

	public  int uniqueIdAccount;
	private String accountName;
	private double openingBalance;
	private String address;
	private String gstin;
	private String emailId;
	private String phoneNumber;

	public Account() {

	}

	public int getuniqueIdAccount() {
		return uniqueIdAccount;
	}

	public String getaccountName() {
		return accountName;
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


	public void setAccountName(String accountName) {
		this.accountName = accountName;
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
