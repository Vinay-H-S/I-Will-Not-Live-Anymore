package com.xworkz.project.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.project")
public class BeanConfiguration {

	public BeanConfiguration() {
		System.out.println("Created BeanConfiguration.....");
	}

	@Bean
	public Bottle bottle() {
		Bottle bottle=new Bottle();
		return bottle;
	}
	
	@Bean
	public Bulb bulb() {
		Bulb bulb=new Bulb();
		return bulb;
	}
	
	@Bean
	public Perfume perfume() {
		Perfume perfume=new Perfume();
		return perfume;
	}
	
	@Bean
	public Generator generator() {
		Generator generator=new Generator();
		return generator;
	}
	
	@Bean
	public Elevator elevator(Perfume perfume) {
		Elevator elevator=new Elevator(perfume);
		return elevator;
	}
}
