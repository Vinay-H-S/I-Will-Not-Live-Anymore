package com.xworkz.app.dto;

public class TheaterDTO implements Comparable<TheaterDTO> {

	private String name;
	private String theaterOwner;
	private int noOfSeats;
	private int noOfScreen;

	public TheaterDTO() {
		// TODO Auto-generated constructor stub
	}

	public TheaterDTO(String name, String theaterOwner, int noOfSeats, int noOfScreen) {
		super();
		this.name = name;
		this.theaterOwner = theaterOwner;
		this.noOfSeats = noOfSeats;
		this.noOfScreen = noOfScreen;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTheaterOwner() {
		return theaterOwner;
	}

	public void setTheaterOwner(String theaterOwner) {
		this.theaterOwner = theaterOwner;
	}

	public int getNoOfSeats() {
		return noOfSeats;
	}

	public void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}

	public int getNoOfScreen() {
		return noOfScreen;
	}

	public void setNoOfScreen(int noOfScreen) {
		this.noOfScreen = noOfScreen;
	}

	@Override
	public String toString() {
		return "TheaterDTO [name=" + name + ", theaterOwner=" + theaterOwner + ", noOfSeats=" + noOfSeats
				+ ", noOfScreen=" + noOfScreen + "]";
	}

	@Override
	public int compareTo(TheaterDTO theaterDTO) {
		TheaterDTO current = this;
		if(current.noOfSeats==theaterDTO.noOfSeats) {
			return 0;
		}
		if (current.noOfSeats<theaterDTO.noOfSeats) {
			return 4;
		}
		if (current.noOfSeats>theaterDTO.noOfSeats) {
			return -7;
		}
		return 0;
	}
	

}
