package com.xworkz.doctor.app.repository;

import com.xworkz.doctor.app.dto.DoctorDTO;

public interface DoctorRepository {

	int TOTAL_ITEM=5;
	
	void save(DoctorDTO dto);
}
