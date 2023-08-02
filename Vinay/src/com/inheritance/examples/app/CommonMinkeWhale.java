package com.inheritance.examples.app;

public class CommonMinkeWhale extends HumpbackWhale {
	public double length = 5.5;
	public int mass = 5600;

	public void displayinfo5() {
		System.out.println("Whale length :" + length);
		System.out.println("Whale Mass :" + mass);
	}

	public void actoro() {
		System.out.println("no arg const of Actoro");
	}
}
