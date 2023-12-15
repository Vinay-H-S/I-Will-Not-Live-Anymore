package com.xworkz.boot;

import com.xworkz.dto.CitizenTypeDTO;
import com.xworkz.dto.constants.LowerAndUpperLimitAge;

public class CitizenRunner {

	public static void main(String[] args) {
		
		CitizenTypeDTO citizenTypeDTO=new CitizenTypeDTO();
		citizenTypeDTO.setCitizenType("Indian");
		citizenTypeDTO.setAgeLimit(LowerAndUpperLimitAge.EIGHTEEN_PLUS);
		System.out.println(citizenTypeDTO);
		System.out.println("No of peoples :"+LowerAndUpperLimitAge.EIGHTEEN_PLUS.getPeoples());

	}

}
