package com.association.interfacee.impl;

import com.association.interfacee.app.Army;

public class AirForce {

	private Army army;
	
	public void setArmy(Army army) {
		this.army = army;
	}
	
	public void protect()
	{
		System.out.println("invoking protect() in AirForce...");
		this.army.protect();
	}
}
