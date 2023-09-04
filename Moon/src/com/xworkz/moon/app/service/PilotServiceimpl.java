package com.xworkz.moon.app.service;

import com.xworkz.pilot.app.repository.PilotRepository;

public class PilotServiceimpl implements PilotService{
	
	private PilotRepository pilotRepository;
	
	public PilotServiceimpl(PilotRepository pilotRepository) {
		this.pilotRepository=pilotRepository;
	}
	
	@Override
	public boolean list(String names) {
		System.out.println("invoking validate and save "+this.getClass().getSimpleName());
		if(names!=null && !names.isEmpty() && names.length()>=3 && names.length()>=0)
		{
			System.out.println("Pilot names is valid..");
			this.pilotRepository.list(names);
		}
		else
		{
			System.err.println("Pilot names is invalid, cannot save..");
		}

		return false;
	}

}
