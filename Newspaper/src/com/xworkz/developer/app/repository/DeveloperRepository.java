package com.xworkz.developer.app.repository;

import com.xworkz.developer.app.dto.DeveloperDTO;

public interface DeveloperRepository {

	int TOTAL_ITEM=10;
	
	void save(DeveloperDTO dto);
	
	default boolean isExist(DeveloperDTO dto)
	{
		return false;
	}
	
	default DeveloperDTO findByName(String name) {
		return null;
	}
	default DeveloperDTO findByWorkingFor(String name)
	{
		return null;
	}
	default DeveloperDTO finyByDesignation(String name) {
		return null;
	}
	
	default DeveloperDTO findByNameAndWorkingFor(String name,String workingFOr)
	{
		return null;
	}
	
	default DeveloperDTO findByNameAndSalaryAndDesignation(String name,double salary,String designation)
	
	{
		return null;
	}

	
}
