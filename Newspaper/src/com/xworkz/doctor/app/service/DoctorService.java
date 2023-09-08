package com.xworkz.doctor.app.service;

import com.xworkz.doctor.app.dto.DoctorDTO;

public interface DoctorService {

	boolean validateAndSave(DoctorDTO dto);
	
}
