package com.xworkz.bar.component;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class Click {

	public Click() {
		System.out.println("Created Click...");
	}
	
	@RequestMapping("/click")
	public String onClick() {
		System.out.println("Clickedddd...");
		return "Index.jsp";
	}

}
