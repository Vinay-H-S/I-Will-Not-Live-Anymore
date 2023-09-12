package com.xworkz.developer.app.service;

import com.xworkz.developer.app.dto.DeveloperDTO;

public interface DeveloperService {

	boolean validateAndSave(DeveloperDTO dto);
	
	DeveloperDTO findByName(String name);
	
	DeveloperDTO findByWorkingFor(String name);
		
	DeveloperDTO findByDesignation(String name);
	
	DeveloperDTO findByNameAndWorkingFor(String name,String workingFor);
	
	DeveloperDTO findByNameAndSalaryAndDesigantion(String name,double salary,String designation);
	
}
