package com.xworkz.task.impl;

import com.xworkz.task.app.PG;

public class PGRule implements PG {

	@Override
	public void timings(int time) {
		System.out.println("invoking timing method in PG");
	}

	@Override
	public void payment(String advance) {
		System.out.println("invoking pyment method in PG");
	}

	@Override
	public void noFoodWeast(float paid) {
		System.out.println("invoking noFoodWeast method in PG");
	}

}
