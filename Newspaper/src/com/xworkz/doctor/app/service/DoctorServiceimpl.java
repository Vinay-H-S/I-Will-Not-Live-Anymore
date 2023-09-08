package com.xworkz.doctor.app.service;

import com.xworkz.doctor.app.dto.DoctorDTO;
import com.xworkz.doctor.app.repository.DoctorRepository;

public class DoctorServiceimpl implements DoctorService{

	private DoctorRepository doctorRepository;
	
	public DoctorServiceimpl(DoctorRepository doctorRepository) {
		this.doctorRepository=doctorRepository;
	}
	
	@Override
	public boolean validateAndSave(DoctorDTO dto) {
		System.out.println("running validate and save in "+this.getClass().getSimpleName());
		if(dto!=null)
		{
			System.out.println("Dto is valid.");
			String name=dto.getName();
			String specialization=dto.getSpecialization();
			if(name!=null && specialization!=null)
			{
				System.out.println("Name and Specialization is valid");
			}
			else
			{
				System.err.println("Name and Specialization is invalid, cannot save.");
			}
			this.doctorRepository.save(dto);
			return true;
		}
		else
		{
			System.err.println("Dto is invalid, cannot save.");
		}
		return false;
	}
	

}
