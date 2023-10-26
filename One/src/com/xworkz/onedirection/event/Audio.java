package com.xworkz.onedirection.event;



import com.xworkz.onedirection.exception.BlackPinkRuntimeException;
import com.xworkz.onedirection.exception.OneDirectionException;

public class Audio {

	public void song() throws OneDirectionException 
	{
		System.out.println("invoking song method");
		throw new OneDirectionException();
	}
	
	public void music()
	{
		System.out.println("invoking music method");
		throw new BlackPinkRuntimeException();
	}
	
}
