package com.xworkz.abstractt.app;

public abstract class Tv {

	public void setFavChannel() {
		System.out.println("Invokking SetFavChannel method....");
	}

	static void changeChannel() {
		System.out.println("Invokking changeChannel method....");
	}

	protected void connectToWiFi() {
		System.out.println("Invokking Connect to wifi  method....");
	}

	private final void switchToNetflix() {
		System.out.println("Invokking switch to Netflix method....");
	}

	void switchToAmazonPrime() {
		System.out.println("Invokking switch to AmazonPrime method....");
	}

	// Abstract Class Hold Abstract Method

	public abstract void volumeUp();

	abstract void volumeDown();

	public abstract boolean powerOn();

	public abstract boolean powerOff();

	public abstract void switchToGame();
}
