package com.xworkz.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan("com.xworkz")
@EnableWebMvc
public class BeanConfiguration {

	public BeanConfiguration() {
		System.out.println("Created BeanConfiguration..");
	}

	@Bean
	public ViewResolver resolver() {
		System.out.println("Created ViewResolver..");
		ViewResolver resolver = new InternalResourceViewResolver("/", ".jsp");
		return resolver;
	}
}
