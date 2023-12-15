package com.xworkz.dto;

import com.xworkz.dto.constants.GstAndSerialNo;

public class VendorDTO {

	private GstAndSerialNo names;

	@Override
	public String toString() {
		return "VendorDTO [names=" + names + "]";
	}
	
	public void setNames(GstAndSerialNo names) {
		this.names = names;
	}
}
