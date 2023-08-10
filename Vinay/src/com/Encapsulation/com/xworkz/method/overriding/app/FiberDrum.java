package com.over.riding.app;

public class FiberDrum extends Drum{

	@Override
	public void store()
	{
		System.out.println("invoking Drum in Fiber Drum...");
	}
}
