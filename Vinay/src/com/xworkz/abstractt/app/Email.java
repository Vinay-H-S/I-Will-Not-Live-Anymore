package com.xworkz.abstractt.app;

public class Email extends Gmail{

	@Override
	public void sendMail() {
		System.out.println("Implementing send Mail abstract in Child Class.....");
	}

	@Override
	public void receiveMail() {

		System.out.println("Implementing Recieve Mail abstract in Child Class.....");
	}

	@Override
	public void createMail() {
		System.out.println("Implementing Create Mail abstract in Child Class.....");

	}

	@Override
	public void archive() {

		System.out.println("Implementing archive abstract in Child Class.....");
	}

	@Override
	public void attachFiles() {
		System.out.println("Implementing Attach Files abstract in Child Class.....");
	}

	@Override
	public void forward() {
		System.out.println("Calling Forward method in child class.....");
	}

	@Override
	public void formatBody() {
		System.out.println("Calling forrmatBody method in child class.....");
	}

	@Override
	public void markAsRead() {
		System.out.println("Calling Mark as read method in child class.....");
	}

	@Override
	public void markAsUnread() {
		System.out.println("Calling mark as Unread method in child class.....");
	}

	@Override
	public void replyToSender() {
		System.out.println("Calling reply to sender method in child class.....");
	}

}
