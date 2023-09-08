package com.xworkz.aadhar.app.service;

import com.xworkz.aadhar.app.dto.AadharDTO;

public interface AadharService {

	boolean validateAndSave(AadharDTO dto);
}
