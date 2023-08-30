package com.association.interfacee.impl;

import com.association.interfacee.app.WineShop;

public class KingfisherPremium implements WineShop {

	@Override
	public void drinkBeer() {
		System.out.println("invoking drinkBeer() in Kingfisher Premium...");
	}

}
