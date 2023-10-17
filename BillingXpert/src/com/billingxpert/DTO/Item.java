package com.billingxpert.DTO;

public class Item {

	public static int uniqueIdItem;
	private String itemName;
	private ItemGroup itemGroup;
	private String unit;
	private int openingQuantity;
	private String hsn;
	private double salesPrice;
	private double purchasePrice;

	public Item() {
		super();
	}

	public Item(String itemName, ItemGroup itemGroup, String unit) {
		super();
		this.itemName = itemName;
		this.itemGroup = itemGroup;
		this.unit = unit;
	}

	public Item(String itemName, ItemGroup itemGroup, String unit, int openingQuantity, String hsn, double salesPrice,
			double purchasePrice) {
		super();
		this.itemName = itemName;
		this.itemGroup = itemGroup;
		this.unit = unit;
		this.openingQuantity = openingQuantity;
		this.hsn = hsn;
		this.salesPrice = salesPrice;
		this.purchasePrice = purchasePrice;
	}

	public int getUniqueIdItem() {
		return uniqueIdItem;
	}

	public String getItemName() {
		return itemName;
	}

	public ItemGroup getItemGroup() {
		return itemGroup;
	}

	public String getUnit() {
		return unit;
	}

	public int getOpeningQuantity() {
		return openingQuantity;
	}

	public String getHsn() {
		return hsn;
	}

	public double getSalesPrice() {
		return salesPrice;
	}

	public double getPurchasePrice() {
		return purchasePrice;
	}

}
