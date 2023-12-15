package com.xworkz.project.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Microwave {

	private Bulb bulb;
	private Radio radio;
	
	@Autowired
	public Microwave(Bulb bulb,Radio radio) {
		System.out.println("Created Microwave....");
		this.bulb=bulb;
		this.radio=radio;
		System.out.println("Bulb & Radio :"+this.bulb+this.radio);
	}

}
