package com.billingxpert.service;



public class ItemServiceFactory {

	public static ItemService itemService;
	static {
		itemService = new ItemServiceImpl();
	}
	public static ItemService getItemService() {
		return itemService;
	}
	
}
