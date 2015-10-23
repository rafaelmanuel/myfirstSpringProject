package com.wear.library;

public class Item {
	
	private String itemId;
	private String itemName;
	private String desc;
	private int quantity ;
	private double price;
	private double discount;
	
	
	public Item(String itemId, String itemName, String desc, int quantity, double price, double discount) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.desc = desc;
		this.quantity = quantity;
		this.price = price;
		this.discount = discount;
	}


	public String getItemId() {
		return itemId;
	}


	public void setItemId(String itemId) {
		this.itemId = itemId;
	}


	public String getItemName() {
		return itemName;
	}


	public void setItemName(String itemName) {
		this.itemName = itemName;
	}


	public String getDesc() {
		return desc;
	}


	public void setDesc(String desc) {
		this.desc = desc;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public double getDiscount() {
		return discount;
	}


	public void setDiscount(double discount) {
		this.discount = discount;
	}

	
}
