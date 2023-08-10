package com.xworkz.external.accessspecifier;

import com.xworkz.internal.accessspecifier.Irctc;

public class IrctcRunner {
	
	public static void main(String[] args) 
	{
	
		Irctc irctc=new Irctc();
	
		irctc.setOwner("Indian Railways");
		irctc.setSince(1999);
		irctc.setUsers("58 billion");
		irctc.setBook("tickets");
		irctc.setcancel("tickets");
		irctc.setTatkal("time limit");
		irctc.IsInstall(true);
		irctc.setBerths("LB MB UB");
		irctc.setConfirmation("CNF tickets");
		irctc.setSize(45);
		irctc.setDownloader("playstore");
		irctc.setAddpassenger("Details");
		irctc.setPNRstatus(1234567890);
		irctc.setLanguages("android");
	
	System.out.println(irctc.getOwner());
	System.out.println(irctc.getSince());
	System.out.println(irctc.getUsers());
	System.out.println(irctc.getBook());
	System.out.println(irctc.getCancel());
	System.out.println(irctc.getTatkal());
	System.out.println(irctc.IsInstall());
	System.out.println(irctc.getBerths());
	System.out.println(irctc.getConfirmation());
	System.out.println(irctc.getSize());
	System.out.println(irctc.getDownloader());
	System.out.println(irctc.getAddpassenger());
	System.out.println(irctc.getPNRstatus());
	System.out.println(irctc.getLanguages());
	}
}
