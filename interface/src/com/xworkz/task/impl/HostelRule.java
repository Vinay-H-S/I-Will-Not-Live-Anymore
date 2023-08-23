package com.xworkz.task.impl;

import com.xworkz.task.app.Hostel;

public class HostelRule implements Hostel {

	@Override
	public boolean DontUsePhones(String hostelName) {
		System.out.println("invoking hostel name and rules");
		return false;
	}

	@Override
	public boolean dontWasteFoods(String food) {
		System.out.println("invoking about foods");
		return false;
	}

	@Override
	public boolean cleanNess(String clean, int noOfStudents) {
		System.out.println("invoking about hostel cleanness");
		return false;
	}


}
