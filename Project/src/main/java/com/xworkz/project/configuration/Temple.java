package com.xworkz.project.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Temple {

	private Generator generator;
	private Tile tile;
	private Elevator elevator;
	
	@Autowired
	public Temple(Generator generator,Tile tile,Elevator elevator) {
		System.out.println("Created Temple...");
		this.generator=generator;
		this.tile=tile;
		this.elevator=elevator;
		System.out.println("Generator,Tile,Elevator :"+this.generator+this.tile+this.elevator);	
	}

}
