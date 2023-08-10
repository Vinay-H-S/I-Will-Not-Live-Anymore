package com.xworkz.external.accessspecifier;

import com.xworkz.internal.accessspecifier.NammaYatri;

public class NammaYatriRunner {
	
	public static void main(String[] args) 
	{
	
		NammaYatri  nammaYatri=new  NammaYatri();
		
		nammaYatri.setOwner("Vimal Kumar");
		nammaYatri.setSince(2014);
		nammaYatri.setUsers("40lakhs");
		nammaYatri.setBook("AUTO");
		nammaYatri.setcancel("AUTO");
		nammaYatri.setName("NAMMA YATRI AUTO");
		nammaYatri.IsInstall(true);
		nammaYatri.setKm(21);
		nammaYatri.setElectric("Electric type");
		nammaYatri.setseatingRow(1);
		nammaYatri.setDownloader("playstore");
		nammaYatri.setCapacity(3);
		nammaYatri.setLocation("BENGALURU");
		nammaYatri.setLanguages("android");
	
	System.out.println(nammaYatri.getOwner());
	System.out.println(nammaYatri.getSince());
	System.out.println(nammaYatri.getUsers());
	System.out.println(nammaYatri.getBook());
	System.out.println(nammaYatri.getCancel());
	System.out.println(nammaYatri.getName());
	System.out.println(nammaYatri.IsInstall());
	System.out.println(nammaYatri.getKm());
	System.out.println(nammaYatri.getElectric());
	System.out.println(nammaYatri.getSeatingRows());
	System.out.println(nammaYatri.getDownloader());
	System.out.println(nammaYatri.getCapacity());
	System.out.println(nammaYatri.getLocation());
	System.out.println(nammaYatri.getLanguages());
	}
}
