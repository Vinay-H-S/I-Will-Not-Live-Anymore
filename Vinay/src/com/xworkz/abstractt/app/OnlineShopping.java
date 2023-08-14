package com.xworkz.abstractt.app;

public abstract class OnlineShopping {

	public void browseProduct() {
		System.out.println("Calling browser  Method....");
	}

	public void searchProduct() {
		System.out.println("Calling searchProduct Method....");
	}

	public void viewProductDetails() {
		System.out.println("Calling viewProductDetails Method....");
	}

	public void addToCart() {
		System.out.println("Calling addToCart Method....");
	}

	public void removeFromCart() {
		System.out.println("Calling removeFromCart Method....");
	}

	public abstract void viewCart();

	public abstract void applyPromoCode();

	public abstract void checkout();

	public abstract void processPayment();

	public abstract void sendOrderConfirmation();

}
