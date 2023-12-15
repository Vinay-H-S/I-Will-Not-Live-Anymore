package com.xworkz.automobile.service;

import java.util.List;

import com.xworkz.automobile.dto.VehicleDTO;

public interface AutomobileService {

	void validateAndSaveVehicleDetails(VehicleDTO vehicleDTO);
	
	void validateAndSaveVehicleDetails(List<VehicleDTO> vehicleDTO1);
	
	void validateAndUpdateSaveVehicleDetails(VehicleDTO updateVehicles);
	
	void vlaidateAndUpdateSaveVehicleDetails(List<VehicleDTO> updateVehicles);
	
	List<VehicleDTO> fetchAllDetails();
	
}
