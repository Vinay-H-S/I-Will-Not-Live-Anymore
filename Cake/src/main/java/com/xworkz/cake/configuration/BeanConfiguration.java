package com.xworkz.cake.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan("com.xworkz.cake")
@EnableWebMvc
public class BeanConfiguration {

	public BeanConfiguration() {
		System.out.println("Created BeanCOnfiguration...");
	}
	
	@Bean
	public ViewResolver resolver() {
		System.out.println("Running ViewReslover");
		ViewResolver resolver=new InternalResourceViewResolver("/",".jsp");
		return resolver;
	}
}


