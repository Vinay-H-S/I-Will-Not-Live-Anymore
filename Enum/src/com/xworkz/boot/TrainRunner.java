package com.xworkz.boot;

import com.xworkz.dto.TrainDTO;
import com.xworkz.dto.constants.BasePrice;

public class TrainRunner {

	public static void main(String[] args) {

		TrainDTO dto = new TrainDTO();
		dto.setDestination(BasePrice.ARASIKERE);
		dto.setTrainNO(256012);
		System.out.println(dto);
		System.out.println("BasePrice for Arasikere :"+BasePrice.ARASIKERE.getPrice());
	}
}
