package com.over.riding.app;

public class GeneralTicket extends Ticket{

	@Override
	public void travel() {
		System.out.println("invoking travel in General Ticket...");
	}
}
