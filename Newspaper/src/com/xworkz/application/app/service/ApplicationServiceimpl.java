package com.xworkz.application.app.service;

import com.xworkz.application.app.dto.ApplicationDTO;
import com.xworkz.application.app.repository.ApplicationRepository;

public class ApplicationServiceimpl implements ApplicationService{

	private ApplicationRepository applicationRepository;
	
	public ApplicationServiceimpl(ApplicationRepository applicationRepository)
	{
		this.applicationRepository=applicationRepository;
	}
	
	@Override
	public boolean validateAndSave(ApplicationDTO dto) {
		System.out.println("Running validateAndSave in "+this.getClass().getSimpleName());
		{
			if(dto!=null)
			{
				System.out.println("Dto is valid, can save");
				int id=dto.getId();
				String name=dto.getName();
				String developedBy=dto.getDevelopedBy();
				String developedAt=dto.getDevelopedAt();
				String version=dto.getVersion();
				if(id!=0 && id<=10000)
				{
					System.out.println("Id is valid, can save");
					
				}
				else
				{
					System.err.println("Id is invalid, cannot save");
					return false;
				}
				if(name!=null && !name.isEmpty() && name.length()>=3 && name.length()<=20 && developedBy!=null && !developedBy.isEmpty()
					&&	developedBy.length()>=3 && developedBy.length()<=20 && developedAt!=null && !developedAt.isEmpty() && developedAt.length()>=3
					&& developedAt.length()<20 && version!=null&& !version.isEmpty() && version.length()>=3 && version.length()<=20)
				{
					System.out.println("Name, DevelopedBy, DevelopedAt, and Version is valid, can save");
					
				}
				else
				{
					System.err.println("Name, DevelopedBy, DevelopedAt, and Version is invalid, cannot save");
					return false;
				}
					if(!this.applicationRepository.isExist(dto))
					{
						this.applicationRepository.save(dto);
						return true;
					}	
			}
			else
			{
				System.err.println("Dto is invalid, cannot save");
			}
		}
		return false;
	}

	@Override
	public ApplicationDTO findByName(String name) {
		System.out.println("Running findByName in "+this.getClass().getSimpleName());
		if(name!=null && !name.isEmpty() && name.length()>=3 && name.length()<=20)
		{
			ApplicationDTO findByName=this.applicationRepository.findByName(name);
			System.out.println("Name is valid, will find "+findByName);
			return findByName;
		}
		return null;
	}

	@Override
	public ApplicationDTO findByNameAndDevelopedBy(String name, String developedBy) {
		System.out.println("Running findByNameAndDevelopedBy in "+this.getClass().getSimpleName());
		if(name!=null && !name.isEmpty() && name.length()>=3 && name.length()<=20 && developedBy!=null && !developedBy.isEmpty()
			&&	developedBy.length()>=3 && developedBy.length()<=20)
		{
			ApplicationDTO findByNameAndDevelopedBy=this.applicationRepository.findByNameAndDevelopedBy(name, developedBy);
			System.out.println("Name and DevelopedBy is valid,will find "+findByNameAndDevelopedBy);
			return findByNameAndDevelopedBy;
		}
		return null;
	}
}
