package com.xworkz.service;

import com.xworkz.dto.SongDTO;

public interface SongService {

	boolean validateAndSave(SongDTO dto);
}
