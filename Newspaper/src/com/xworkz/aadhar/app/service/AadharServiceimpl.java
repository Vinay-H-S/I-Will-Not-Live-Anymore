package com.xworkz.aadhar.app.service;

import com.xworkz.aadhar.app.dto.AadharDTO;
import com.xworkz.aadhar.app.repository.AadharRepository;

public class AadharServiceimpl implements AadharService{
	
	private AadharRepository aadharRepository;
	
	public AadharServiceimpl(AadharRepository aadharRepository)
	{
		this.aadharRepository=aadharRepository;
	}
	
	@Override
	public boolean validateAndSave(AadharDTO dto)
	{
		System.out.println("runnig validate and save in "+this.getClass().getSimpleName());
		if(dto!=null)
		{
			System.out.println("Dto is valid, can save..");
			String name=dto.getName();
			long aadharno=dto.getAadharno();
			String state=dto.getState();
			if(name!=null && state!=null)
			{
				System.out.println("Name and State is valid");
			}
			else
			{
				System.err.println("Name and State is invalid");
			}
			if(aadharno<8945631254521254L)
			{
				System.out.println("Aadhar number is valid");
			}
			else
			{
				System.err.println("Aadhar number is invalid, cannot save.");
			}
			this.aadharRepository.save(dto);
			return true;
		}
		else
		{
			System.err.println("Dto is invalid, cannot save..");
		}
		return false;
	}

}
