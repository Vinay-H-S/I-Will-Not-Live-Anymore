package com.xworkz.project.configuration;

import org.springframework.stereotype.Component;

@Component
public class Stamp {
	
	private Bottle bottle;

	public Stamp(Bottle bottle) {
		System.out.println("Created Stamp..");
		this.bottle=bottle;
		System.out.println("Bottle :"+this.bottle);
	}

}
