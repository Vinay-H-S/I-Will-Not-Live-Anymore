package com.xworkz.task.app;

public class Pendent {

	private String brand;
	private boolean pureGold;
	private String claspType;
	private String metalType;
	private String gemType;
	private String stone;
	private int metalStamp;
	private int warranty;
	private String lustree;
	private double price;
	private String seller;
	
	public Pendent() {
		
	}

	public Pendent(String brand, boolean pureGold, String claspType, String metalType, String gemType, String stone,
			int metalStamp, int warranty, String lustree, double price, String seller) {
		super();
		this.brand = brand;
		this.pureGold = pureGold;
		this.claspType = claspType;
		this.metalType = metalType;
		this.gemType = gemType;
		this.stone = stone;
		this.metalStamp = metalStamp;
		this.warranty = warranty;
		this.lustree = lustree;
		this.price = price;
		this.seller = seller;
	}
	
	@Override
	public String toString() {
		
		return "Brand :"+brand+"Pure Gold :"+pureGold+"Clasp Type :"+claspType+"Metal Type :"+metalType+"Gem Type :"+gemType+"Stone :"+stone+"Metal Stamp :"+metalStamp+"Warranty :"+warranty+"Lustree :"+lustree+"Price :"+price+"Seller :"+seller;
	}
}
