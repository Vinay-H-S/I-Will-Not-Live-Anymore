package com.xworkz.doctor.app.repository;

import com.xworkz.doctor.app.dto.DoctorDTO;

public class DoctorRepositoryimpl implements DoctorRepository{

	private DoctorDTO dtos[]=new DoctorDTO[TOTAL_ITEM];
	private int increment;
	
	@Override
	public void save(DoctorDTO dto) {
	System.out.println("running save in "+this.getClass().getSimpleName());
	if(increment<TOTAL_ITEM)
	{
		this.dtos[increment]=dto;
		System.out.println(dto);
		this.increment++;
	}
	else
	{
		System.err.println("Dto is cannot be save..");
	}
	}
	

}
