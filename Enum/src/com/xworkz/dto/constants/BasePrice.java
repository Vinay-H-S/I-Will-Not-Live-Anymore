package com.xworkz.dto.constants;

public enum BasePrice {

	SHIVAMOGGA(110), BHADRAVATHI(95), ARASIKERE(65), MYSORE(160), DAVANAGERE(220);

	private int price;

	private BasePrice(int price) {
		this.price=price;
	}

	public int getPrice() {
		return price;
	}
}
