package com.xworkz.external.accessspecifier;

import com.xworkz.internal.accessspecifier.Amazon;

public class AmazonRunner {
	public static void main(String[] args) 
	{
	
	Amazon amazon=new Amazon();
	
	amazon.setFounder("Jeff Bezos");
	amazon.setSince(1994);
	amazon.setUsers("58 billion");
	amazon.setScan("OR");
	amazon.setpay("money");
	amazon.setShoping("products");
	amazon.IsInstall(true);
	amazon.setGrocery("daily items");
	amazon.setCart("pre selected product");
	amazon.setSize(50);
	amazon.setDownloader("playstore");
	amazon.setOffers("for products");
	amazon.setNoOfEmployes(1541000);
	amazon.setLanguages("android");
	
	System.out.println(amazon.getFounder());
	System.out.println(amazon.getSince());
	System.out.println(amazon.getUsers());
	System.out.println(amazon.getScan());
	System.out.println(amazon.getPay());
	System.out.println(amazon.getShoping());
	System.out.println(amazon.IsInstall());
	System.out.println(amazon.getGrocery());
	System.out.println(amazon.getcart());
	System.out.println(amazon.getSize());
	System.out.println(amazon.getDownloader());
	System.out.println(amazon.getOffers());
	System.out.println(amazon.getNoOfEmployes());
	System.out.println(amazon.getLanguages());
	}
}
	
