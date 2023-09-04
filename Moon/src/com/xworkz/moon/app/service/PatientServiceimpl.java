package com.xworkz.moon.app.service;

import com.xworkz.patient.repository.PatientRepository;

public class PatientServiceimpl implements PatientService{
	
	private PatientRepository patientRepository;
	
	public PatientServiceimpl(PatientRepository patientRepository) {
		this.patientRepository=patientRepository;
	}
	
	@Override
	public boolean care(String names) {
		System.out.println("invoking validate and save "+this.getClass().getSimpleName());
		if(names!=null && !names.isEmpty() && names.length()>=3 && names.length()>=0)
		{
			System.out.println("Patient names is valid..");
			this.patientRepository.care(names);
		}
		else
		{
			System.err.println("Patient names is invalid, cannot save..");
		}

		return false;
	}

}
