package com.xworkz.project.configuration;

import org.springframework.beans.factory.annotation.Autowired;

public class Elevator {

	private Perfume perfume;
	
	@Autowired
	public Elevator(Perfume perfume) {
		System.out.println("Created Elevator....");
		this.perfume = perfume;
		System.out.println("Perfume :" + this.perfume);
	}
}
