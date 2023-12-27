package com.xworkz.repository;

import org.springframework.stereotype.Repository;

import com.xworkz.dto.SongDTO;

@Repository
public class SongRepositoryImpl implements SongRepository {

	@Override
	public void save(SongDTO dto) {
		System.out.println("Running the Save");
	}

}
