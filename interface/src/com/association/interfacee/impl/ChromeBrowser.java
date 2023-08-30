package com.association.interfacee.impl;

import com.association.interfacee.app.Internet;

public class ChromeBrowser implements Internet {

	@Override
	public void connect() {
		System.out.println("invoking conncet() in Chrome Browser...");
	}

}
