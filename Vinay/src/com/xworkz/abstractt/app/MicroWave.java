package com.xworkz.abstractt.app;

public abstract class MicroWave {

	public abstract void powerOn();

	public abstract void powerOff();

	public abstract void setTemperature();

	public abstract void adjustTimer();

	public abstract void stopTimer();

	public void lightOn() {
		System.out.println("Calling Light on Method......");
	}

	public void lightOff() {
		System.out.println("Calling Light Off Method......");
	}

	public void preHeat() {
		System.out.println("Calling Pre-Heat Method......");
	}

	public void bake() {
		System.out.println("Calling bake Method......");
	}

	public void displayStatus() {
		System.out.println("Calling display Status Method......");
	}
}
