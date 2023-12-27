package com.xworkz.controller;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.ValidatorFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.dto.SongDTO;
import com.xworkz.service.SongService;

@Controller
@RequestMapping("/")
public class SongController {

	@Autowired
	private SongService service;

	public SongController() {
		System.out.println("Created SongController..");
	}

	@PostMapping("/music")
	public String songController(SongDTO dto, Model model) {
		System.out.println("Song Controller DTO :" + dto);
		model.addAttribute("dto", dto);
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Set<ConstraintViolation<SongDTO>> violation = factory.getValidator().validate(dto);
		if (!violation.isEmpty()) {
			model.addAttribute("err", violation);
			return "song";
		} else {
			boolean saved = this.service.validateAndSave(dto);
			if (saved) {
				model.addAttribute("msg", "Song Details Saved Successfully..");
			} else {
				model.addAttribute("msg", "Song details not saved..");
			}
		}

		return "songSuccess";
	}
}
