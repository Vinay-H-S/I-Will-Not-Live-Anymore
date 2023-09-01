package com.xworkz.pilot.app.repository;

public class PilotRepositoryimpl implements PilotRepository {
	
	String[] names=new String[PILOT_LIST];
	int category;
	@Override
	public void list(String names) {
		System.out.println("invoking list in PilotRepositoryimpl..");
		if(category<PILOT_LIST)
		{
			this.names[category]=names;
			System.out.println("Stored "+names +" in position "+this.category);
			this.category++;
		}
		else
		{
			System.err.println("Stored names is more than Pilot list...");
		}
	}

}
