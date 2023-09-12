package com.xworkz.developer.app.repository;

import com.xworkz.developer.app.dto.DeveloperDTO;

public class DeveloperRepositoryimpl implements DeveloperRepository{
	
	private DeveloperDTO dtos[]=new DeveloperDTO[TOTAL_ITEM];
	private int increment;
	
	
	@Override
	public void save(DeveloperDTO dto) {
		System.out.println("Running save method in "+this.getClass().getSimpleName());
		if(increment<TOTAL_ITEM)
		{
			this.dtos[increment]=dto;
			System.out.println(dto+ " dto is saved at position "+increment);
			this.increment++;
		}
		else
		{
			System.err.println("Storage is full, cannot save..");
		}
		
	}
	
	@Override
	public boolean isExist(DeveloperDTO dto)
	{
		for(int index=0; index<increment;index++)
		{
			DeveloperDTO exist=this.dtos[index];
			if(exist!=null && exist.equals(dto))
			{
				System.out.println("dto is already exist..");
				return true;
			}
		}
		
		return false;
	}

	@Override
	public DeveloperDTO findByName(String name) {
		System.out.println("Running findByName in "+this.getClass().getSimpleName());
		for(int index=0; index<increment; index++)
		{
			DeveloperDTO dto=this.dtos[index];
			if(dto.getName().equals(name))
			{
				System.out.println("Dto is found with name");
				return dto;
			}
			else
			{
				System.err.println("No dto matched..");
			}
		}
		return null;
	}
	
	@Override
	public DeveloperDTO findByWorkingFor(String name)
	{
		System.out.println("Running findByWorkingFor in "+this.getClass().getSimpleName());
		for(int index=0; index<this.increment; index++)
		{
			DeveloperDTO workingFor=this.dtos[index];
			if(workingFor.getWorkingFor().equals(name))
			{
				System.out.println("Dto found with workingfor.");
				return workingFor;
			}
			
		}
		return null;

	}
	
	@Override
	public DeveloperDTO finyByDesignation(String name)
	{
		System.out.println("Running findByDesignation in "+this.getClass().getSimpleName());
		for(int index=0; index<increment; index++)
		{
			DeveloperDTO designation=this.dtos[index];
			if(designation.getDesignation().equals(name))
			{
				System.out.println("Dto found with Designation.");
				return designation;
			}
			
		}
		
		return null;
	}
	
	@Override
	public DeveloperDTO findByNameAndWorkingFor(String name,String workingFor)
	{
		System.out.println("Running findByNameAndWorkingFor in "+this.getClass().getSimpleName());
		for(int index=0; index<this.increment; index++)
		{
			DeveloperDTO finds=this.dtos[index];
			if(finds.getName().equals(name) && finds.getWorkingFor().equals(workingFor))
			{
				System.out.println("Dto found with name and workingFor");
				return finds;
			}
			
		}
		return null;
	}
	
	@Override
	public DeveloperDTO findByNameAndSalaryAndDesignation(String name,double salary,String designation)
	{
		System.out.println("Running findByNameAndSalaryAndDesigantion in "+this.getClass().getSimpleName());
		for(int index=0; index<this.increment; index++)
		{
			DeveloperDTO finds=this.dtos[index];
			if(finds.getName().equals(name) && finds.getSalary()==salary && finds.getDesignation().equals(designation))
			{
				System.out.println("Dto found with name and salary and designation.");
				return finds;
			}
		}
		return null;
	}
	

}
