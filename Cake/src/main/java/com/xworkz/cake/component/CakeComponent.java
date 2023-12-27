package com.xworkz.cake.component;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.cake.dto.CakeDTO;

@Component
@RequestMapping("/")
public class CakeComponent {

	public CakeComponent() {
		System.out.println("Created CakeComponent...");
	}

	@RequestMapping("/wow")
	public String cakeComponent(@Valid CakeDTO cakeDTO, Model model,BindingResult bindingResult) {
		System.out.println(cakeDTO);
		model.addAttribute("msg", "Order Placed Successfully");
		model.addAttribute("dto",cakeDTO);
		System.out.println("Cake Dto is invalid :" + bindingResult.hasErrors());
		List<ObjectError> errors=bindingResult.getAllErrors();
		errors.forEach(err->System.err.println(err.getObjectName()+ " Message :"+err.getDefaultMessage()));
		model.addAttribute("objectErrors", errors);
		return "cake";
	}
}
