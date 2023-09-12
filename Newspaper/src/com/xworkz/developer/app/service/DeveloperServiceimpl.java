package com.xworkz.developer.app.service;

import com.xworkz.developer.app.dto.DeveloperDTO;
import com.xworkz.developer.app.repository.DeveloperRepository;

public class DeveloperServiceimpl implements DeveloperService{
	
	private DeveloperRepository developerRepository;
	
	public DeveloperServiceimpl(DeveloperRepository developerRepository)
	{
		this.developerRepository=developerRepository;
	}
	
	@Override
	public boolean validateAndSave(DeveloperDTO dto)
	{
		System.out.println("Running validate and save in "+this.getClass().getSimpleName());
		if(dto!=null)
		{
			System.out.println("dto is valid, can save..");
			String name=dto.getName();
			int experience=dto.getExperience();
			double salary=dto.getSalary();
			String workingFor=dto.getWorkingFor();
			String designation=dto.getDesignation();
			boolean difficult=dto.getDifficult();
			if(name!=null && !name.isEmpty() && name.length()>=3 && name.length()<=20)
			{
				System.out.println("Name is valid, can save..");
			}
			else
			{
				System.err.println("Name is invalid, cannot save.");
				return false;
			}
			if(salary<50000 && experience<3)
			{
				System.out.println("Experience and salary is valid, can save.");
			}
			else
			{
				System.err.println("Salary and Experience is invalid, cannot save..");
				return false;
			}
			if(workingFor!=null && !workingFor.isEmpty() && workingFor.length()>=3 && workingFor.length()<=20)
			{
				System.out.println("WorkingFor is valid, can save");
			}
			else
			{
				System.err.println("WorkingFor is invalid, cannot save..");
			}
			if(designation!=null && !designation.isEmpty() && designation.length()>=3 && designation.length()<=20)
			{
				System.out.println("Designation is valid..");
			}
			else
			{
				System.err.println("Designation is invalid.");
				return false;
			}
			
			if(difficult!=false) {
				System.out.println("Software job is difficult..");
			}
			else
			{
				System.err.println("Software job is easy..");
			}
			if(!this.developerRepository.isExist(dto))
			{
				this.developerRepository.save(dto);
				return true;
			}
		}
		else
		{
			System.err.println("dto is invalid, cannot save..");
		}
		
		return false;
	}
	
	@Override
	public DeveloperDTO findByName(String name)
	{
		System.out.println("Running findByName in "+this.getClass().getSimpleName());
		if(name!=null && !name.isEmpty() && name.length()>=3 && name.length()<=20)
		{
			DeveloperDTO dto=this.developerRepository.findByName(name);
			System.out.println("Name is valid, will find."+dto);
			return dto;
		}
		else
		{
			System.err.println("Name is invalid...");
		}
		return null;
	}
	
	@Override
	public DeveloperDTO findByWorkingFor(String name)
	{
		System.out.println("Running findByWorkingFor in "+this.getClass().getSimpleName());
		if(name!=null && !name.isEmpty() && name.length()>=3 && name.length()<=20)
		{
			DeveloperDTO workingFor=this.developerRepository.findByWorkingFor(name);
			System.out.println("Working for is valid, will find "+workingFor);
			return workingFor;
		}
		else
		{
			System.err.println("Working for is invalid..");
		}
		return null;
	}
	
	@Override
	public DeveloperDTO findByDesignation(String name)
	{
		System.out.println("Running findByDesignation in "+this.getClass().getSimpleName());
		if(name!=null && !name.isEmpty() && name.length()>=3 && name.length()<=20)
		{
			DeveloperDTO designation=this.developerRepository.finyByDesignation(name);
			System.out.println("Designation is valid,will find"+designation);
			return designation;
		}
		else
		{
			System.err.println("Designation is invalid..");
		}
		return null;
	}

	
	@Override
	public DeveloperDTO findByNameAndSalaryAndDesigantion(String name, double salary, String designation) {
		System.out.println("Running findByNameAndDesignation in "+this.getClass().getSimpleName());
		if(name!=null && !name.isEmpty() && name.length()>=3 && name.length()<=20 && salary!=0 && salary<=50000 && designation !=null 
				&& !designation.isEmpty() && designation.length()>=3 && designation.length()<=20)
		{
			DeveloperDTO nameAndSalaryAndDesignation=this.developerRepository.findByNameAndSalaryAndDesignation(name, 
					salary, designation);
			System.out.println("Name and Salary and Designation is valid, will find "+nameAndSalaryAndDesignation);
			return nameAndSalaryAndDesignation;
		}
		else
		{
			System.err.println("Name and salary and designation is invalid..");
		}
		return null;
	}

	@Override
	public DeveloperDTO findByNameAndWorkingFor(String name, String workingFor) {
		System.out.println("Running findByNameAndWorkingFOr in "+this.getClass().getSimpleName());
		if(name!=null && !name.isEmpty() && name.length()>=3 && name.length()<=20 && workingFor!=null && !workingFor.isEmpty() && workingFor.length()>=3 && workingFor.length()<=20)
		{
			DeveloperDTO nameAndWorkingFor=this.developerRepository.findByNameAndWorkingFor(name, workingFor);
			System.out.println("Name and WorkingFor is valid, will find "+nameAndWorkingFor);
			return nameAndWorkingFor;
		}
		else
		{
			System.err.println("Name and WorkingFor is invalid.");
			
		}
		
		return null;
	}
	
	
	
}
