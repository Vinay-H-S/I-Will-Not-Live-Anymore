package com.xworkz.crud.app.repository;

public class PincodeRepositoryimpl implements PincodeRepository {

	private int pincodes[] = new int[TOTAL_PINCODE];
	private int position;

	@Override
	public void list(int pincode) {
		System.out.println("invoking list data in " + this.getClass().getSimpleName());
		if (position < TOTAL_PINCODE) {
			this.pincodes[position] = pincode;
			System.out.println("Stored " + pincode + " at position " + this.position);
			this.position++;
		} else {
			System.err.println("Stored pincode is more than total pincode..");
		}

	}

	@Override
	public boolean isExist(int pincode) {
		for (int index = 0; index < this.position; index++) {
			int temp = this.pincodes[index];
			if (temp != 0 && temp == pincode) {
				System.err.println("Pincode is already exist..");
				return true;
			}
		}
		return false;
	}
}