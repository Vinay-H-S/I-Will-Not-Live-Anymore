package com.inheritance.casting.app.task5.boot;
import com.inheritance.casting.app.task5.app.*;

public class ShowroomRunner {

	public static void main(String[] args) {
		
		Showroom room=new Showroom();
		WatchShowroom room1=new WatchShowroom();
		MobileShowroom room2=new MobileShowroom();
		
		ShowroomUtil.shot(room);
		System.out.println("------------");
		ShowroomUtil.shot(room1);
		System.out.println("------------");
		ShowroomUtil.shot(room2);
		System.out.println("------------");
		
	}
}
