package com.xworkz.abstractt.app;

public abstract class Gmail {

public abstract void sendMail();
	
	public abstract void receiveMail();
	
	public abstract void createMail();
	
	public abstract void attachFiles();
	
	public abstract void archive();
	
	public void markAsRead() {
		System.out.println("Mark as Read...");
	}
	
	public void forward() {
		System.out.println("Forward...");
	}
	
	public void formatBody() {
		System.out.println("Format body...");
	}
	
	public void markAsUnread() {
		System.out.println("Mark as UNRead...");
	}
	
	public void replyToSender() {
		System.out.println("Reply To sender...");
	}
	
}
