package com.inheritance.examples.app;

public class HumpbackWhale extends SeiWhale {
	public int length = 30000;
	public int mass = 16;

	public void displayinfo4() {

		System.out.println("Whale length :" + length);
		System.out.println("Whale Mass :" + mass);
	}

	public void megapetra() {
		System.out.println("no arg const of Megapetra");
	}

}
