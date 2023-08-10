package com.xworkz.external.accessspecifier;
import com.xworkz.internal.accessspecifier.*;


public class WhatsappRunner {
	
	public static void main(String[] args) 
	{
	
	Whatsapp whatsapp=new Whatsapp();
	
	whatsapp.setFounder("Jan Koum");
	whatsapp.setSince(2009);
	whatsapp.setUsers("2.78 billion");
	whatsapp.setScan("QR code");
	whatsapp.setpay("money");
	whatsapp.setChat("friends");
	whatsapp.IsInstall(true);
	whatsapp.setVoicecail("contacts");
	whatsapp.setVideocall("contacts");
	whatsapp.setSize(50);
	whatsapp.setDownloader("playstore");
	whatsapp.setShare(5);
	whatsapp.setNoOfEmployes(10000);
	whatsapp.setLanguages("android");
	
	System.out.println(whatsapp.getFounder());
	System.out.println(whatsapp.getSince());
	System.out.println(whatsapp.getUsers());
	System.out.println(whatsapp.getScan());
	System.out.println(whatsapp.getPay());
	System.out.println(whatsapp.getChat());
	System.out.println(whatsapp.IsInstall());
	System.out.println(whatsapp.getVoicecall());
	System.out.println(whatsapp.getVideocall());
	System.out.println(whatsapp.getSize());
	System.out.println(whatsapp.getDownloader());
	System.out.println(whatsapp.getShare());
	System.out.println(whatsapp.getNoOfEmployes());
	System.out.println(whatsapp.getLanguages());
	}
}
	
	
	
	


