package com.xworkz.dto;

import com.xworkz.dto.constants.PriceAndDiscount;

public class MovieTicketDTO {

	private String movieName;
	private PriceAndDiscount seatType;

	@Override
	public String toString() {
		return "MovieTicket [movieName=" + movieName + ", seatType=" + seatType + "]";
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public void setSeatType(PriceAndDiscount seatType) {
		this.seatType = seatType;
	}
}
