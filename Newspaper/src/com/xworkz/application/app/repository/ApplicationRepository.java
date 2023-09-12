package com.xworkz.application.app.repository;

import com.xworkz.application.app.dto.ApplicationDTO;

public interface ApplicationRepository {

	int TOTAL_APP=10;
	
	void save(ApplicationDTO dto);
	
	default boolean isExist(ApplicationDTO dto)
	{
		return true;
	}
	
	default ApplicationDTO findByName(String name)
	{
		return null;
	}
	default ApplicationDTO findByNameAndDevelopedBy(String name,String developedBy)
	{
		return null;
	}
}
