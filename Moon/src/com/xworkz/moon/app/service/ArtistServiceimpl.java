package com.xworkz.moon.app.service;

import com.xworkz.artist.app.repository.ArtistRepository;

public class ArtistServiceimpl implements ArtistService {
	
	private ArtistRepository artistRepository;
	
	public ArtistServiceimpl(ArtistRepository artistRepository) {
		this.artistRepository=artistRepository;
	}

	@Override
	public boolean list(String names) {

		System.out.println("invoking validate and save "+this.getClass().getSimpleName());
		if(names!=null && !names.isEmpty() && names.length()>=0 && names.length()>=3)
		{
			System.out.println("Artist names is valid..");
			this.artistRepository.list(names);
		}
		else
		{
			System.out.println("Artist names is invalid, cannot save..");
		}
		
		return false;
	}

}
