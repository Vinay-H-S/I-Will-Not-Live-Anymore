package com.xworkz.dto;

import com.xworkz.dto.constants.BasePrice;

public class TrainDTO {

	private BasePrice destination;
	private int trainNO;

	@Override
	public String toString() {
		return "TrainDTO [destination=" + destination + ", trainNO=" + trainNO + "]";
	}

	public void setDestination(BasePrice destination) {
		this.destination = destination;
	}

	public BasePrice getDestination() {
		return destination;
	}

	public void setTrainNO(int trainNO) {
		this.trainNO = trainNO;
	}

}
