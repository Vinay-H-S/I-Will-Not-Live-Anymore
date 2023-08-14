package com.xworkz.abstractt.app;

public class Oven extends MicroWave{

	@Override
	public void adjustTimer() {
		System.out.println("Implementing adjustTimer abstract method in Sub Class");

	}

	@Override
	public void powerOff() {
		System.out.println("Implementing Power Off abstract method in Sub Class");

	}

	@Override
	public void powerOn() {
		System.out.println("Implementing PowerOn abstract method in Sub Class");

	}

	@Override
	public void setTemperature() {
		System.out.println("Implementing Set Temperature abstract method in Sub Class");

	}

	@Override
	public void stopTimer() {
		System.out.println("Implementing Stop Timer abstract method in Sub Class");

	}
}
