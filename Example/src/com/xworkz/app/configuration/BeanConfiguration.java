package com.xworkz.app.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.app")
public class BeanConfiguration {

	public BeanConfiguration() {
		System.out.println("Created BeanConfiguration....");
	}

}
