package com.xworkz.equals.app;

public class Minister {

	private String name;
	private int period;
	private String vidhanasabha;
	private String partyName;
	
	public Minister() {
		
	}

	public Minister(String name, int period, String vidhanasabha, String partyName) {
		super();
		this.name = name;
		this.period = period;
		this.vidhanasabha = vidhanasabha;
		this.partyName = partyName;
	}
	
	@Override
	public String toString() {		
		
		return "Name :"+name+"Period :"+period+"VidhanaSabha :"+vidhanasabha+"Party Name :"+partyName;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj != null) {
			System.out.println("obj is not null");
			if (obj instanceof Minister) {
				System.out.println("object is instance of minister");
				Minister min = (Minister) obj;
				if (min.name.equals(this.name)) {
					System.out.println("object and properties are same");
					return true;
				} else
				{
					System.err.println("object and properties are not same");
				}
			} 
			else 
			{
				System.err.println("object is not of Minister");
			}
		} 
		else
		{
			System.err.println("obj is null");
		}
		return false;
	}
	
}
