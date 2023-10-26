package com.xworkz.dto;

public class BakeryDto {

	private String itemName;
	private String itemPrice;
	private String quantity;
	private String discount;
	private String gst;
	private String manfDate;
	private String expDate;

	public BakeryDto() {
		// TODO Auto-generated constructor stub
	}

	public BakeryDto(String itemName, String itemPrice, String quantity, String discount, String gst, String manfDate,
			String expDate) {
		super();
		this.itemName = itemName;
		this.itemPrice = itemPrice;
		this.quantity = quantity;
		this.discount = discount;
		this.gst = gst;
		this.manfDate = manfDate;
		this.expDate = expDate;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(String itemPrice) {
		this.itemPrice = itemPrice;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public String getDiscount() {
		return discount;
	}

	public void setDiscount(String discount) {
		this.discount = discount;
	}

	public String getGst() {
		return gst;
	}

	public void setGst(String gst) {
		this.gst = gst;
	}

	public String getManfDate() {
		return manfDate;
	}

	public void setManfDate(String manfDate) {
		this.manfDate = manfDate;
	}

	public String getExpDate() {
		return expDate;
	}

	public void setExpDate(String expDate) {
		this.expDate = expDate;
	}

	
}
