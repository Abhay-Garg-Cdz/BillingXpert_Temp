package com.billingxpert.dao;

import java.io.Serializable;

import com.billingxpert.DTO.Account;
import com.billingxpert.DTO.AccountGroup;
import com.billingxpert.DTO.Item;
import com.billingxpert.DTO.ItemGroup;
import com.billingxpert.DTO.Unit;

public class LoaderFields implements Serializable {

	private static final long serialVersionUID = 464134L;
	public   int uniqueIdAccount;
	public  int uniqueIdAccountGroup;
	public  int uniqueIdItem;
	public  int uniqueIdItemGroup;
	public  int uniqueIdUnit;
	
//	private int uniqueIdAccount = 101;
//	private int uniqueIdAccountGroup = 01;
//	private int uniqueIdItem = 101;
//	private int uniqueIdItemGroup = 01;
//	private int uniqueIdUnit = 01;

//	public void initiateValues(LoaderFields initiate) {
//		Account.uniqueIdAccount = initiate.uniqueIdAccount;
//		AccountGroup.uniqueIdAccountGroup = initiate.uniqueIdAccountGroup;
//		Item.uniqueIdItem = initiate.uniqueIdItem;
//		ItemGroup.uniqueIdItemGroup = initiate.uniqueIdItemGroup;
//		Unit.uniqueIdUnit = initiate.uniqueIdUnit;
//	}

}
