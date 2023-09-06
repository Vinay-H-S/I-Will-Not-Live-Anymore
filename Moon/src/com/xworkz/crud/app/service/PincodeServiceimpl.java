package com.xworkz.crud.app.service;

import com.xworkz.crud.app.repository.PincodeRepository;

public class PincodeServiceimpl implements PincodeService {

	private PincodeRepository pincodeRepository;

	public PincodeServiceimpl(PincodeRepository pincodeRepository) {
		this.pincodeRepository = pincodeRepository;
	}

	@Override
	public boolean validateAndSave(int pincode) {
		System.out.println("invoking validate and save " + this.getClass().getSimpleName());
		if (pincode != 0 && pincode >= 100000 && pincode <= 9999999) {
			System.out.println("Pincode is valid..");
			if (!this.pincodeRepository.isExist(pincode)) {
				this.pincodeRepository.list(pincode);
				return true;
			}

		} else {
			System.out.println("Stored pincode is more than total pincode..");
		}
		return false;
	}
}
