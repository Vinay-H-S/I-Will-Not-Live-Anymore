package com.association.interfacee.impl;

import com.association.interfacee.app.PassportVerification;

public class Custom{

	private PassportVerification verification;
	
	public void setVerification(PassportVerification verification) {
		this.verification = verification;
	}

	public void verifyCitizen() {
		System.out.println("invoking verifyCitizen() in Custom...");
		this.verification.verifyCitizen();
	}

}
