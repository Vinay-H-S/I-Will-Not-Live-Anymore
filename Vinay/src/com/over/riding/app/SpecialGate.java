package com.over.riding.app;

public class SpecialGate extends Gate{

	@Override
	public void close()
	{
		System.out.println("invoking close in Special Gate...");
	}
}
