package com.xworkz.engineer.app.repository;

import com.xworkz.engineer.app.dto.EngineerDTO;

public interface EngineerRepository {
	
	int TOTAL_ITEM=10;
	
	void save(EngineerDTO dto);
	
	default boolean isExist(EngineerDTO dto)
	{
		return false;
	}
	

}
