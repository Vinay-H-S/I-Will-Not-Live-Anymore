package com.xworkz.classes;

import java.time.Clock;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class StringRunner {

	public static void main(String[] args) {
	
		System.out.println("\n");
		System.out.println("-----------------------------------STRING BUFFER----------------------------------------");
		System.out.println("\n");
		
		StringBuffer string=new StringBuffer();
		StringBuffer ref=string.append('C');
		StringBuffer ref1=string.append(5);
		StringBuffer ref2=string.reverse();
		StringBuffer ref3=string.append(15230);
		StringBuffer ref4=string.delete(0, 1);
		
		System.out.println("Append :"+ref);
		System.out.println("Append :"+ref1);
		System.out.println("Reverse :"+ref2);
		System.out.println("Append :"+ref3);
		System.out.println("Delete :"+ref4);
		
		System.out.println("\n");
		System.out.println("-----------------------------------STRING BUILDER----------------------------------------");
		System.out.println("\n");
		
		StringBuilder builder=new StringBuilder();
		String ref5=builder.toString();
		int ref6=builder.hashCode();
		Class ref7=builder.getClass();
		int ref8=builder.capacity();
		String ref9=builder.substring(5);
		System.out.println("To String :"+ref5);
		System.out.println("Hashcode :"+ref6);
		System.out.println("Class :"+ref7);
		System.out.println("Sub String"+ref8);
		System.out.println("Capacity :"+ref8);
		
		System.out.println("\n");
		System.out.println("-----------------------------------LOCAL DATE----------------------------------------");
		System.out.println("\n");
		
		System.out.println("now :"+LocalDate.now());
		System.out.println("of :"+LocalDate.of(1999, 7, 24));
		System.out.println("ofEpochDay :"+LocalDate.ofEpochDay("Date"));
		System.out.println("ofYearDay:"+LocalDate.ofYearDay(2023, 22));
		System.out.println("class :"+LocalDate.class);
		
		System.out.println("\n");
		System.out.println("-----------------------------------LOCAL DATE TIME----------------------------------------");
		System.out.println("\n");
		
		System.out.println("Now:"+LocalDateTime.now());
		System.out.println("of :"+LocalDateTime.of(2023,10,22,10,20));
		System.out.println("LocalDateTime.ofInstant & ZoneId.systemDefault :"+LocalDateTime.ofInstant(Instant.now(),ZoneId.systemDefault()));
		System.out.println("Clock.systemUTC :"+LocalDateTime.now(Clock.systemUTC()));
		System.out.println("Class :"+LocalDateTime.class);
	}

}
