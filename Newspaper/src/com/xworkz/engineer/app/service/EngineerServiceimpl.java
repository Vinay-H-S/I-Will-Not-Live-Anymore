package com.xworkz.engineer.app.service;

import com.xworkz.engineer.app.dto.EngineerDTO;
import com.xworkz.engineer.app.repository.EngineerRepository;

public class EngineerServiceimpl implements EngineerService{

	private EngineerRepository engineerRepository;
	
	public EngineerServiceimpl(EngineerRepository engineerRepository) {
		this.engineerRepository=engineerRepository;
	}
	
	@Override
	public boolean validateAndSave(EngineerDTO dto) {
		System.out.println("Running validateAndSave in "+this.getClass().getSimpleName());
		if(dto!=null)
		{
			System.out.println("Dto is valid, can save.");
			int id=dto.getId();
			String name=dto.getName();
			String collegeName=dto.getCollegeName();
			if(id!=0 && id<=10000)
			{
				System.out.println("Id is valid,can save");
			}
			else
			{
				System.err.println("Id is invalid, cannot save");
			}
			if(name!=null && !name.isEmpty() && name.length()>=3 && name.length()<=20 && 
					collegeName!=null && !collegeName.isEmpty() && collegeName.length()>=3 && collegeName.length()<=20)
			{
				System.out.println("Name and CollegeName is valid, can save..");
			}
			else
			{
				System.err.println("Name and CollegeName is invalid, cannot save.");
			}
			if(!this.engineerRepository.isExist(dto))
			{
				this.engineerRepository.save(dto);
				return true;
			}
			
		}
		else
		{
			System.err.println("Dto is invalid, cannot save..");
		}
		
		return false;
	}
	
}
