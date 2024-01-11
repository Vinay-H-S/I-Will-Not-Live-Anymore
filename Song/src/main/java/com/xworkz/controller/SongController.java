package com.xworkz.controller;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.ValidatorFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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

	private static String UPLOADED_FOLDER = "D:\\Java-Examples\\Vini";

	@PostMapping("/go")
	public String fileUpload(@RequestParam("file") MultipartFile file, RedirectAttributes redirectAttributes) {
		if (file.isEmpty()) {
			redirectAttributes.addFlashAttribute("msg", "Please select the file to upload");
			return "upload";
		}

		try {
			byte[] bytes = file.getBytes();
			Path path = Paths.get(UPLOADED_FOLDER, file.getOriginalFilename());
			Files.write(path, bytes);
			redirectAttributes.addFlashAttribute("message",
					"You successfully uploaded '" + file.getOriginalFilename() + "'");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return "upload";
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
