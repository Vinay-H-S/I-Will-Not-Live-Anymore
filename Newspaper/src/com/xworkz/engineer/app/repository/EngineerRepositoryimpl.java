package com.xworkz.engineer.app.repository;

import com.xworkz.engineer.app.dto.EngineerDTO;

public class EngineerRepositoryimpl implements EngineerRepository{

	private EngineerDTO dtos[]=new EngineerDTO[TOTAL_ITEM];
	private int position;
	
	@Override
	public void save(EngineerDTO dto) {
		System.out.println("Running save in "+this.getClass().getSimpleName());
		if(position<TOTAL_ITEM)
		{
			this.dtos[position]=dto;
			System.out.println(dto+"dto is saved at position "+this.position);
			this.position++;
		}
		else
		{
			System.err.println("Strorage is full");
		}
	}
	
	@Override
	public boolean isExist(EngineerDTO dto) {
		for(int index=0; index<this.position; index++)
		{
			EngineerDTO exist=this.dtos[index];
			if(exist!=null && exist.equals(dto))
			{
				System.out.println("Dto is already exist.");
				return true;
			}
		}
		return EngineerRepository.super.isExist(dto);
	}

}
