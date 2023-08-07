package com.method.overloading.app;

public class Stapler {

	public String brand;
	public double price;

	public void pin() {
		System.out.println("invoking pin of no-arg..");
		pin("Kangaro");
		pin(228);
	}

	public void pin(String brand) {
		System.out.println("invoking pin of String..");
		System.out.println("Brand :" + brand);
	}

	public void pin(double price) {
		System.out.println("invoking pin of double..");
		System.out.println("Price :" + price);
	}

	public void pin(String brand, double price) {
		System.out.println("invoking pin of String and double..");
		pin(brand);
		pin(price);
	}
}
