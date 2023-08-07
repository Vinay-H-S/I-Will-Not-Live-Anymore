package com.method.overloading.app;

public class IronBox {

	public String brand;
	public double prize;

	public void iron() {
		System.out.println("invoking iron of no-arg..");
		iron("Bajaj");
		iron(1399);
	}

	public void iron(String brand) {
		System.out.println("invoking iron of String..");
		System.out.println("Brand :" +brand);
	}

	public void iron(double prize) {
		System.out.println("invoking iron of double...");
		System.out.println("Prize :" +prize);
	}

	public void iron(String brand, double prize) {
		System.out.println("invoking iron of String and double..");
		iron(brand);
		iron(prize);
	}
}
