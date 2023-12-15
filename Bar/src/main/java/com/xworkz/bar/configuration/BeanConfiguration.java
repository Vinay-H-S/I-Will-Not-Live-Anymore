package com.xworkz.bar.configuration;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.bar")
public class BeanConfiguration {

	public BeanConfiguration() {
		System.out.println("Created BeanCOnfiguration...");
	}

	
	
	
}
