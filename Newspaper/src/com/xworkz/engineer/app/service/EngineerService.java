package com.xworkz.engineer.app.service;

import com.xworkz.engineer.app.dto.EngineerDTO;

public interface EngineerService {

	boolean validateAndSave(EngineerDTO dto);
}
