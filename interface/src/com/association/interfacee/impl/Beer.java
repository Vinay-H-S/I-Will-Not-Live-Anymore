package com.association.interfacee.impl;

import com.association.interfacee.app.WineShop;

public class Beer implements WineShop {

	private WineShop wineshop;
	
	@Override
	public void drinkBeer() {
		System.out.println("invoking drinkBeer() in Wineshop...");
		this.wineshop.drinkBeer();
	}

	public void setWineshop(WineShop wineshop) {
		this.wineshop = wineshop;
	}
}
