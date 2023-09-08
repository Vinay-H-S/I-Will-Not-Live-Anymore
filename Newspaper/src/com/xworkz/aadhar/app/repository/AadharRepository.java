package com.xworkz.aadhar.app.repository;

import com.xworkz.aadhar.app.dto.AadharDTO;

public interface AadharRepository {

	int TOTAL_NO=5;
	
	void save(AadharDTO dto);
	
}
