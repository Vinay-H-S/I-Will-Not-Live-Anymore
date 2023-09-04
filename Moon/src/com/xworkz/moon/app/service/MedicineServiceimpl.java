package com.xworkz.moon.app.service;

import com.xworkz.medicine.app.repository.MedicineRepository;

public class MedicineServiceimpl implements MedicineService{
	
	private MedicineRepository medicineRepository;
	
	public MedicineServiceimpl(MedicineRepository medicineRepository) {
		this.medicineRepository=medicineRepository;
	}
	
	@Override
	public boolean list(String names) {
		System.out.println("invoking validate and save "+this.getClass().getSimpleName());
		if(names!=null && !names.isEmpty() && names.length()>=3 && names.length()>=0)
		{
			System.out.println("Medicine names is valid..");
			this.medicineRepository.list(names);
		}
		else
		{
			System.err.println("Medicine names is invalid, cannot save..");
		}
		return false;
	}

}
