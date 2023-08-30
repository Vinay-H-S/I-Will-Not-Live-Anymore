package com.association.interfacee.impl;

import com.association.interfacee.app.Internet;

public class Browser {

	private Internet internet;
	
	public void setInternet(Internet internet) {
		this.internet = internet;
	}
	
	public void connect()
	{
		System.out.println("invoking search() in Browser..");
		this.internet.connect();
	}
}
