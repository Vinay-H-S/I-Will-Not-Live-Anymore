package com.xworkz.scientist.service;

import org.springframework.stereotype.Service;

import com.xworkz.scientist.dto.ScientistDTO;

@Service
public class ScientistServiceimpl implements ScientistService {

	public ScientistServiceimpl() {
		System.out.println("Created ScientistServiceimpl.. ");
	}

	@Override
	public boolean validateAndSave(ScientistDTO dto) {
		System.out.println("Running the ValidateAndSave...");
		System.out.println("DTO is found :" + dto);

		return true;
	}

}
