package com.xworkz.dto.constants;

public enum PriceAndDiscount {

	SILVER_CLASS(200, 15, "GHSKFI2125DHD"), GOLD_CLASS(250, 20, "GHSKFI2125DHD"),
	PREMIUM_CLASS(300, 32, "GHSKFI2125DHD");

	private int price,discount;
	private String gst;

	private PriceAndDiscount(int price, int discount, String gst) {
		this.price = price;
		this.discount=discount;
		this.gst=gst;
	}

	public int getPrice() {
		return price;
	}

	public int getDiscount() {
		return discount;
	}
	
	public String getGst() {
		return gst;
	}
}
