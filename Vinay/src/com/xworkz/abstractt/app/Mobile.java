package com.xworkz.abstractt.app;

public class Mobile extends Tv{

	@Override
	public void volumeUp() {
		System.out.println("implementing volume Up method in sub Class");
	}

	@Override
	public void volumeDown() {
		System.out.println("implementing volume Down method in sub Class");
	}

	@Override
	public boolean powerOff() {
		return false;
	}

	@Override
	public boolean powerOn() {
		return true;
	}

	@Override
	public void switchToGame() {
		System.out.println("implementing Switch to game method in sub Class");
	}

}
