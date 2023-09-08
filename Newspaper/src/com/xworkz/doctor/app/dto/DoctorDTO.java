package com.xworkz.doctor.app.dto;

import java.io.Serializable;

public class DoctorDTO implements Serializable{

	private String name;
	private String specialization;
	
	public DoctorDTO() {
		
	}

	@Override
	public String toString() {
		return "DoctorDTO [name=" + name + ", specialization=" + specialization + "]";
	}

	public DoctorDTO(String name, String specialization) {
		super();
		this.name = name;
		this.specialization = specialization;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
}
