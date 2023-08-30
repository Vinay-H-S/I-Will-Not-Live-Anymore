package com.association.interfacee.impl;

import com.association.interfacee.app.PassportVerification;

public class PassportNo1 implements PassportVerification {

	@Override
	public void verifyCitizen() {
		System.out.println("invoking verifyCitizen() in Passport No 1...");
	}

}
