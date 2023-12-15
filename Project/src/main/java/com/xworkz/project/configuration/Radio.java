package com.xworkz.project.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Radio {

	private Generator generator;
	
	@Autowired
	public Radio(Generator generator) {
		System.out.println("Created Generator......");
		this.generator=generator;
		System.out.println("Generator :"+this.generator);
	}

}
