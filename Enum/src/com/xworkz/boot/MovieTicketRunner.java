package com.xworkz.boot;

import com.xworkz.dto.MovieTicketDTO;
import com.xworkz.dto.constants.PriceAndDiscount;

public class MovieTicketRunner {

	public static void main(String[] args) {

		MovieTicketDTO dto = new MovieTicketDTO();
		dto.setMovieName("Jurassic World");
		dto.setSeatType(PriceAndDiscount.GOLD_CLASS);
		System.out.println(dto);
		System.out.println("Gold class price:" + PriceAndDiscount.GOLD_CLASS.getPrice() + "\ndiscount :"
				+ PriceAndDiscount.GOLD_CLASS.getDiscount() + "%" + "\nGst No:" + PriceAndDiscount.GOLD_CLASS.getGst());
	}
}
