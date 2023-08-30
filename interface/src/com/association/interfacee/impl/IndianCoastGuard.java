package com.association.interfacee.impl;

import com.association.interfacee.app.Army;

public class IndianCoastGuard implements Army {

	@Override
	public void protect() {
		System.out.println("invoking protect() in Indian Coast Guard...");
	}

}
