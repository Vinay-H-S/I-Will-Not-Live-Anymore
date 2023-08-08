package com.over.riding.app;

public class StandardMic extends Mic {
	
	@Override
	public void signal() {
		System.out.println("invoking signal in Standard Mic..");
	}

}
