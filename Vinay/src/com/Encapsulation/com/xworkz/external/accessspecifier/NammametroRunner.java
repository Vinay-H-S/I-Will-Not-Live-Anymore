package com.xworkz.external.accessspecifier;
import com.xworkz.internal.accessspecifier.Nammametro;

public class NammametroRunner {

	public static void main(String[] args) 
	{
	
		 Nammametro  nammaMetro=new  Nammametro();
	
		 nammaMetro.setOwner("Bmrcl");
		 nammaMetro.setSince(2010);
		 nammaMetro.setUsers("70 lakhs");
		 nammaMetro.setBook("tickets");
		 nammaMetro.setcancel("tickets");
		 nammaMetro.setMap("route");
		 nammaMetro.IsInstall(true);
		 nammaMetro.setMetroCard("smartCard");
		 nammaMetro.setElectric("Electric type");
		 nammaMetro.setCoach(6);
		 nammaMetro.setDownloader("playstore");
		 nammaMetro.setCapacity(500);
		 nammaMetro.setLines("Green,Purple");
		 nammaMetro.setLanguages("android");
	
	System.out.println(nammaMetro.getOwner());
	System.out.println(nammaMetro.getSince());
	System.out.println(nammaMetro.getUsers());
	System.out.println(nammaMetro.getBook());
	System.out.println(nammaMetro.getCancel());
	System.out.println(nammaMetro.getMap());
	System.out.println(nammaMetro.IsInstall());
	System.out.println(nammaMetro.getmetroCard());
	System.out.println(nammaMetro.getElectric());
	System.out.println(nammaMetro.getCoach());
	System.out.println(nammaMetro.getDownloader());
	System.out.println(nammaMetro.getCapacity());
	System.out.println(nammaMetro.getLines());
	System.out.println(nammaMetro.getLanguages());
	}
}
