package com.xworkz.scientist.service;

import com.xworkz.scientist.dto.ScientistDTO;

public interface ScientistService {

	boolean validateAndSave(ScientistDTO dto);
}
