package com.xworkz.dto.constants;

public enum LowerAndUpperLimitAge {

    EIGHTEEN_PLUS(98512254522L),TWENTY_FIVE_PLUS(263145221636L),FOURTY_PLUS(63125446264L),SIXTY_PLUS(451262565666L);
	
	private long peoples;
	
	private LowerAndUpperLimitAge(long peoples) {
		this.peoples=peoples;
	}
	
	public long getPeoples() {
		return peoples;
	}
}
