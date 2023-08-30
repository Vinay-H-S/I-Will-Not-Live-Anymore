package com.association.interfacee.impl;

import com.association.interfacee.app.PoliceStation;

public class Constable implements PoliceStation {

	@Override
	public void service() {
		System.out.println("invoking service() in Constable..");
	}

}
