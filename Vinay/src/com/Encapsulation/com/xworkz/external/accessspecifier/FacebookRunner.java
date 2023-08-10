package com.xworkz.external.accessspecifier;
import com.xworkz.internal.accessspecifier.*;


public class FacebookRunner {
	public static void main(String[] args) {
		FaceBook facebook=new Facebook();
		facebook.setFaceBookID("Jeevan K");
		facebook.setEmail("jeevanmoriya5@gmail.com");
		facebook.setNumber(8310308343);
		facebook.setPasswrod("jeevan@5");
		facebook.setLanguage("Kannada");
		facebook.setTheme("Dark");
		facebook.setSince(2004);
		facebook.setNoOfFriends(35);
		facebook.setNoOfPosts(20);
		facebook.setFounder("Mark Zuckerberg");
		facebook.setNoOfLikes(150);
		facebook.setAccountType("Private");
		facebook.setNoOfComments(50);
		facebook.setProfilePic(true);
		System.out.println(facebook.getFaceBookID());
		System.out.println(facebook.getEmail());
		System.out.println(facebook.getNumber());
		System.out.println(facebook.getPasswrod());
		System.out.println(facebook.getLanguage());
		System.out.println(facebook.getTheme());
		System.out.println(facebook.getSince());
		System.out.println(facebook.getNoOfFriends());
		System.out.println(facebook.getNoOfPosts());
		System.out.println(facebook.getFounder());
		System.out.println(facebook.getNoOfLikes());
		System.out.println(facebook.getAccountType());
		System.out.println(facebook.getNoOfComments());
		System.out.println(facebook.isProfilePic());
	}

}
