package com.xworkz.Politician.app.repository;

public class PoliticianRepositoryimpl implements PoliticianRepository {

	String[] names=new String[POLITICIANS_NAMES];
	int category;
	
	@Override
	public void list(String names) {
		System.out.println("invoking list in PoliticianRepositoryimpl..");
		if(category<POLITICIANS_NAMES)
		{
			this.names[category]=names;
			System.out.println("Stored "+names +" in position "+this.category);
			this.category++;
		}
		else
		{
			System.err.println("Stored names is more than total names...");
		}

		

	}

}
