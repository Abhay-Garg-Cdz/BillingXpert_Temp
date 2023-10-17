package com.billingxpert.dao;

import java.io.Serializable;

import com.billingxpert.DTO.Account;
import com.billingxpert.DTO.AccountGroup;
import com.billingxpert.DTO.Item;
import com.billingxpert.DTO.ItemGroup;
import com.billingxpert.DTO.Unit;

public class LoaderFields implements Serializable{

	private static final long serialVersionUID = 464134L;
	private int uniqueIdAccount = Account.uniqueIdAccount;
	private int uniqueIdAccountGroup = AccountGroup.uniqueIdAccountGroup;
	private int uniqueIdItem = Item.uniqueIdItem;
	private int uniqueIdItemGroup = ItemGroup.uniqueIdItemGroup;
	private int uniqueIdUnit = Unit.uniqueIdUnit;
	
	public void initiateValues(LoaderFields initiate) {
		Account.uniqueIdAccount = initiate.uniqueIdAccount;
		AccountGroup.uniqueIdAccountGroup = initiate.uniqueIdAccountGroup;
		Item.uniqueIdItem = initiate.uniqueIdItem;
		ItemGroup.uniqueIdItemGroup = initiate.uniqueIdItemGroup;
		Unit.uniqueIdUnit = initiate.uniqueIdUnit;
	}
	
}
