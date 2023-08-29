package com.xworkz.association.app;

public class Mobile {

	private String brand;
	private double price;
	private int ram;
	private Charger chargeSpeed;
	private String color;
	
	public Mobile(String brand) {
		this.brand=brand;	
		}
	
	public void setChargeSpeed(Charger chargerSpeed)
	{
		this.chargeSpeed=chargerSpeed;
	}
	
	public void specification(int ram)
	{
		this.ram=ram;
	}
	
	public void offer(double price)
	{
		this.price=price;
	}
	
	public void buy()
	{
		System.out.println("invoking buy in Mobile...");
		this.chargeSpeed.chargeMobile();
		this.chargeSpeed.rechargeableBattery();
		this.chargeSpeed.quickCharger();
		this.chargeSpeed.wirelessCharger();
	}
}
