package com.xworkz.moon.app.service;

import com.xworkz.grocery.app.repository.JuiceRepository;

public class JuiceServiceimpl implements JuiceService {

	private JuiceRepository juiceRepository;

	public JuiceServiceimpl(JuiceRepository juiceRepository) {
		this.juiceRepository = juiceRepository;
	}

	@Override
	public boolean validateAndSave(String juice) {
		System.out.println("invoking validate and store to " + this.getClass().getSimpleName());
		if (juice != null && !juice.isEmpty() && juice.length() >= 3 && juice.length() <= 20) {
			System.out.println("Stored juice is valid ");
			if(!this.juiceRepository.isExist(juice))
			{
			this.juiceRepository.store(juice);
			return true;
			}
			else
			{
				System.err.println("juice name is already exist..");
			}
		} else {
			System.err.println("Stored valid is invalid, cannot save..");
		}
		return false;
	}

}
