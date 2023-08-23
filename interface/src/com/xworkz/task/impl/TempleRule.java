package com.xworkz.task.impl;

import com.xworkz.task.app.Temple;

public class TempleRule implements Temple {

	@Override
	public String queue(String line) {
		System.out.println("invoking queue method in TempleImpliments");
		return null;
	}

	@Override
	public boolean dressCode(String ethnicwere) {
		System.out.println("invoking dresscode method in TempleImpliments");
		return false;
	}

	@Override
	public void silence(String maintenance) {
		System.out.println("invoking silence method in TempleImpliments");

	}
}
