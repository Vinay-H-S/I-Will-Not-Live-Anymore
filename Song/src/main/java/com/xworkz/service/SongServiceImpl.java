package com.xworkz.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.dto.SongDTO;
import com.xworkz.repository.SongRepository;

@Service
public class SongServiceImpl implements SongService {

	@Autowired
	private SongRepository repository;
	
	public SongServiceImpl() {
		System.out.println("Created SongServiceImpl..");
	}

	@Override
	public boolean validateAndSave(SongDTO dto) {
		System.out.println("Running the validateAndSave..");
		System.out.println("Dto is Passed :"+dto);
		this.repository.save(dto);
		return true;
	}

}
