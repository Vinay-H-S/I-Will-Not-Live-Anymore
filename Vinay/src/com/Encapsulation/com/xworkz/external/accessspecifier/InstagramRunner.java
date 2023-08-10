package com.xworkz.external.accessspecifier;

import com.xworkz.internal.accessspecifier.Instagram;

public class InstagramRunner {
	public static void main(String[] args) 
	{
	
	Instagram instagram=new Instagram();
	
	instagram.setFounder("Kevin Systro,");
	instagram.setSince(2010);
	instagram.setUsers("2.78 billion");
	instagram.setBio("link");
	instagram.setpay("money");
	instagram.setChat("friends");
	instagram.IsInstall(true);
	instagram.setVoicecail("contacts");
	instagram.setVideocall("contacts");
	instagram.setSize(50);
	instagram.setDownloader("playstore");
	instagram.setShare(10);
	instagram.setNoOfEmployes(10000);
	instagram.setLanguages("android");
	
	System.out.println(instagram.getFounder());
	System.out.println(instagram.getSince());
	System.out.println(instagram.getUsers());
	System.out.println(instagram.getBio());
	System.out.println(instagram.getPay());
	System.out.println(instagram.getChat());
	System.out.println(instagram.IsInstall());
	System.out.println(instagram.getVoicecall());
	System.out.println(instagram.getVideocall());
	System.out.println(instagram.getSize());
	System.out.println(instagram.getDownloader());
	System.out.println(instagram.getShare());
	System.out.println(instagram.getNoOfEmployes());
	System.out.println(instagram.getLanguages());
	}
}
	
