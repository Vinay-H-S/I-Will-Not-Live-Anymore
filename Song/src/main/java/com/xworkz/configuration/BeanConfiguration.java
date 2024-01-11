package com.xworkz.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.support.StandardServletMultipartResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@Configuration
@ComponentScan("com.xworkz")
@EnableWebMvc
public class BeanConfiguration {

	public BeanConfiguration() {
		System.out.println("Created BeanConfiguration..");
	}

	@Bean
	public InternalResourceViewResolver resolver() {
		System.out.println("Created ViewResolver..");
		InternalResourceViewResolver resolver = new InternalResourceViewResolver("/", ".jsp");
		resolver.setViewClass(JstlView.class);
		return resolver;
	}

	@Bean
	public MultipartResolver multipartResolver() {
		return new StandardServletMultipartResolver();
	}
}
