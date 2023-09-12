package com.xworkz.application.app.service;

import com.xworkz.application.app.dto.ApplicationDTO;

public interface ApplicationService {

	boolean validateAndSave(ApplicationDTO dto);
	
	ApplicationDTO findByName(String name);
	
	ApplicationDTO findByNameAndDevelopedBy(String name,String developedBy);
}
