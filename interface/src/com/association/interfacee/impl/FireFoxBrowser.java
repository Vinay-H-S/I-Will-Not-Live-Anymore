package com.association.interfacee.impl;

import com.association.interfacee.app.Internet;

public class FireFoxBrowser implements Internet {

	@Override
	public void connect() {
		System.out.println("invoking connect() in FireFox Browser...");
	}

}
