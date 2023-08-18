package com.xworkz.equals.app;

public class Mechanic {

	private String name;
	private String service;
	private String serviceName;
	private double price;
	private boolean serviceDone;
	private String clientName;
	
	public Mechanic() {
	}

	public Mechanic(String name, String service, String serviceName, double price, boolean serviceDone,
			String clientName) {
		super();
		this.name = name;
		this.service = service;
		this.serviceName = serviceName;
		this.price = price;
		this.serviceDone = serviceDone;
		this.clientName = clientName;
	}
	
	@Override
	public String toString() {
		
		return "Name :"+name+"Service :"+service+"Service Name :"+serviceName+"Price :"+price+"Service DOne :"+serviceDone+"Client Name :"+clientName;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj!=null)
		{
			System.out.println("obj is equals to null...");
			if(obj instanceof Mechanic)
			{
				System.out.println("obj is instance of Mechanic..");
				Mechanic mechanic=(Mechanic)obj;
				if(mechanic.name.equals(name)&&mechanic.service.equals(service)&&mechanic.serviceName.equals(serviceName)&&mechanic.price==price)
				{
					System.out.println("object and properties is same..");
				}
				else
				{
					System.out.println("object and properties is not same..");
				}
			}
			else
			{
				System.out.println("obj is not of Mechanic..");
			}
		}
		else
		{
			System.out.println("obj is not equals to null...");
		}
		return false;
	}
}
