package com.xworkz.dto;

import com.xworkz.dto.constants.LowerAndUpperLimitAge;

public class CitizenTypeDTO {

	private String citizenType;
	private LowerAndUpperLimitAge ageLimit;

	@Override
	public String toString() {
		return "CitizenTypeDTO [citizenType=" + citizenType + ", ageLimit=" + ageLimit + "]";
	}

	public void setCitizenType(String citizenType) {
		this.citizenType = citizenType;
	}

	public void setAgeLimit(LowerAndUpperLimitAge ageLimit) {
		this.ageLimit = ageLimit;
	}

}
