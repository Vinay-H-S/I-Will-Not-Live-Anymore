package com.xworkz.external.accessspecifier;
import com.xworkz.internal.accessspecifier.*;

public class LinkdinRunner {

	 LinkedIn linkedIn = new LinkedIn();
		
		linkedIn.setAccess("Public");
		linkedIn.setChat("Text");
		linkedIn.setConnections(350);
		linkedIn.setCreatorMode("Off");
		linkedIn.setEducation("BE/EEE");
		linkedIn.setExperience(false);
		linkedIn.setLikes(100);
		linkedIn.setName("Jeevan K");
		linkedIn.setNetwork("Open access");
		linkedIn.setNotification(true);
		linkedIn.setPosts(5);
		linkedIn.setProfilePic(true);
		linkedIn.setSupports(30);
		linkedIn.setSince(2022);
		
		System.out.println(linkedIn.getAccess());
		System.out.println(linkedIn.getChat());
		System.out.println(linkedIn.getConnections());
		System.out.println(linkedIn.getCreatorMode());
		System.out.println(linkedIn.getEducation());
		System.out.println(linkedIn.getLikes());
		System.out.println(linkedIn.getName());
		System.out.println(linkedIn.getNetwork());
		System.out.println(linkedIn.getPosts());
		System.out.println(linkedIn.getSince());
		System.out.println(linkedIn.getSupports());
		System.out.println(linkedIn.isExperience());
		System.out.println(linkedIn.isNotification());
		System.out.println(linkedIn.isProfilePic());

	}
	}
