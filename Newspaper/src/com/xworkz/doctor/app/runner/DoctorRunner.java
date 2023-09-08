package com.xworkz.doctor.app.runner;

import com.xworkz.doctor.app.dto.DoctorDTO;
import com.xworkz.doctor.app.repository.DoctorRepository;
import com.xworkz.doctor.app.repository.DoctorRepositoryimpl;
import com.xworkz.doctor.app.service.DoctorService;
import com.xworkz.doctor.app.service.DoctorServiceimpl;

public class DoctorRunner {

	public static void main(String[] args) {

		DoctorRepository doctorRepository=new DoctorRepositoryimpl();
		
		DoctorService doctorService=new DoctorServiceimpl(doctorRepository);
		
		DoctorDTO doctorDTO=new DoctorDTO("Harshith Kumar N R","Neurology");
		doctorService.validateAndSave(doctorDTO);
		

	}

}
