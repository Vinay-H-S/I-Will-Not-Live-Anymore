package com.xworkz.abstractt.app;

public class Myntra extends OnlineShopping{

	@Override
	public void applyPromoCode() {
		System.out.println("Apply Promo Code.........");

	}

	@Override
	public void checkout() {
		System.out.println(" checkout Code.........");

	}

	@Override
	public void processPayment() {
		System.out.println(" processPayment Code.........");

	}

	@Override
	public void sendOrderConfirmation() {
		System.out.println("sendOrderConfirmation Code.........");

	}

	@Override
	public void viewCart() {
		System.out.println("viewCart Code.........");

	}
}
