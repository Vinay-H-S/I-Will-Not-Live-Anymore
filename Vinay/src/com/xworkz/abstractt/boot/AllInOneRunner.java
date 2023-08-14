package com.xworkz.abstractt.boot;

import com.xworkz.abstractt.app.*;

public class AllInOneRunner {

	public static void main(String[] args) {


		Trip adventures=new AdventureTrip();
		adventures.manaliTrip();
		adventures.mumbaiTrip();
		adventures.keralaTrip();
		adventures.rajasthanTrip();
		
		System.out.println("\n");
		System.out.println("---------------------");
		System.out.println("\n");
		
		adventures.paragliding();
		adventures.rollerCoster();
		adventures.skyDiving();
		adventures.bungeeJump();
		adventures.watergames();
		System.out.println("\n");
		
		Gmail gmail = new Email();
		gmail.sendMail();
		gmail.receiveMail();
		gmail.archive();
		gmail.createMail();
		gmail.attachFiles();
		
		System.out.println("\n");
		System.out.println("-------------");
		System.out.println("\n");
		
		gmail.formatBody();
		gmail.forward();
		gmail.markAsRead();
		gmail.markAsUnread();
		gmail.replyToSender();
		System.out.println("\n");
		
		MicroWave microWave = new Oven();

		microWave.adjustTimer();
		microWave.powerOff();
		microWave.powerOn();
		microWave.setTemperature();
		microWave.stopTimer();
		
		System.out.println("\n");
		System.out.println("-------------------");
		System.out.println("\n");
		
		microWave.bake();
		microWave.displayStatus();
		microWave.lightOff();
		microWave.lightOn();
		microWave.preHeat();
		System.out.println("\n");
		
		OnlineShopping onlineShopping = new Myntra();

		onlineShopping.applyPromoCode();
		onlineShopping.checkout();
		onlineShopping.processPayment();
		onlineShopping.sendOrderConfirmation();
		onlineShopping.viewCart();
		
		System.out.println("\n");
		System.out.println("----------------------");
		System.out.println("\n");
		
		onlineShopping.browseProduct();
		onlineShopping.addToCart();
		onlineShopping.removeFromCart();
		onlineShopping.searchProduct();
		onlineShopping.viewProductDetails();
		
		Mobile xiaomi = new Mobile();
		xiaomi.volumeUp();
		xiaomi.volumeDown();
		System.out.println(xiaomi.powerOn());
		System.out.println(xiaomi.powerOff());
		xiaomi.switchToGame();
		System.out.println("\n");
		xiaomi.setFavChannel();

	}

}
