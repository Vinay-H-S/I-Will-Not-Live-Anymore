package com.xworkz.application.app.repository;

import com.xworkz.application.app.dto.ApplicationDTO;

public class ApplicationRepositoryimpl implements ApplicationRepository{
	
	private ApplicationDTO dtos[]=new ApplicationDTO[TOTAL_APP];
	private int increment;

	@Override
	public void save(ApplicationDTO dto) {
		System.out.println("Running save in "+this.getClass().getSimpleName());
		if(increment<TOTAL_APP)
		{
			this.dtos[increment]=dto;
			System.out.println(dto+" saved at position "+this.increment);
			this.increment++;
		}
		else
		{
			System.err.println("Storage is full..");
		}	
	}
	
	@Override
	public boolean isExist(ApplicationDTO dto) {
		for(int index=0; index<increment; index++)
		{
			ApplicationDTO exist=this.dtos[index];
			if(exist!=null && exist.equals(dto))
			{
				System.err.println("Dto is already exist..");
				return true;
			}
		}
		return ApplicationRepository.super.isExist(dto);
	}
	
	@Override
	public ApplicationDTO findByName(String name) {
		System.out.println("Running findByName in "+this.getClass().getSimpleName());
		for(int index=0; index<increment; index++)
		{
			ApplicationDTO findByName=this.dtos[index];
			if(findByName.getName().equals(name))
			{
				System.out.println("Name is found with dto");
				return findByName;
			}
			else
			{
				System.err.println("No dto matched");
			}
			
		}
		return ApplicationRepository.super.findByName(name);
	}
	
	@Override
	public ApplicationDTO findByNameAndDevelopedBy(String name, String developedBy) {
		System.out.println("Running findByNameAndDevelopedBy in "+this.getClass().getSimpleName());
		for(int index=0; index<increment; index++)
		{
			ApplicationDTO findByNameAndDevelopedBy=this.dtos[index];
			if(findByNameAndDevelopedBy.getName().equals(name) && findByNameAndDevelopedBy.getDevelopedBy().equals(developedBy))
			{
				System.out.println("Name and DevelopedBy is valid, can save");
				return findByNameAndDevelopedBy;
			}
			else
			{
				System.err.println("Name and DevelopedBy is invalid, cannot save");
			}
		}
		return ApplicationRepository.super.findByNameAndDevelopedBy(name, developedBy);
	}

}
