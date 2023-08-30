package com.association.interfacee.impl;

import com.association.interfacee.app.PoliceStation;

public class SubInspector {

	private PoliceStation police;
	
	public void setPolice(PoliceStation police) {
		this.police = police;
	}
	
	public void service()
	{
		System.out.println("invoking service() in Sub-Inspector..");
		this.police.service();
	}
}
