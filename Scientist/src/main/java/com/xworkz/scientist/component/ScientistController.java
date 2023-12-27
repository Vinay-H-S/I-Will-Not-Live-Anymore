package com.xworkz.scientist.component;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.ValidatorFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.scientist.dto.ScientistDTO;
import com.xworkz.scientist.service.ScientistService;

@Controller
@RequestMapping("/")
public class ScientistController {

	@Autowired
	private ScientistService scientistService;

	public ScientistController() {
		System.out.println("Created ScientistController");
	}

	@PostMapping("/science")
	public String scientistController(ScientistDTO dto, Model model, BindingResult bindingResult) {
		System.out.println("Scientsit Controller DTO :" + dto);
		model.addAttribute("dto", dto);
//		if (bindingResult.hasErrors()) {
//			List<ObjectError> errors = bindingResult.getAllErrors();
//			errors.forEach(err -> System.err.println(err.getObjectName() + " Message " + err.getDefaultMessage()));
//			model.addAttribute("err", errors);
//			return "scientist";	
//		} 
//		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
//		Set<ConstraintViolation<ScientistDTO>> voilation = factory.getValidator().validate(dto);
//		if (!voilation.isEmpty()) {
//			model.addAttribute("err", voilation);
//			return "scientist";
//		}
//
//		else {
//			boolean saved = this.scientistService.validateAndSave(dto);
//			if (saved) {
//				model.addAttribute("msg", "Scientist Data is Saved Successfully...!");
//			} else {
//				model.addAttribute("msg", "Scientist Data is not Saved ");
//			}
//		}

		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Set<ConstraintViolation<ScientistDTO>> violation = factory.getValidator().validate(dto);
		if(!violation.isEmpty()) {
			model.addAttribute("err", violation);
			return "scientist";
		}
		else
		{
			boolean saved =this.scientistService.validateAndSave(dto);
			if(saved) {
				model.addAttribute("msg", "Scientist Data is Saved Successfully..");
			}else {
				model.addAttribute("msg", "Scienttist Data is not Saved..");
			}
		}

		return "scientistSuccess";
	}

}
