package com.xworkz.classes;

import java.util.Date;
import java.time.Clock;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.TemporalAccessor;

public class MagicRunner {
	
	


	public static void main(String[] args) {
		
		String string="Dinosaur";
		int ref=string.codePointAt(1);
		int ref1=string.codePointCount(1, 8);
		int ref2=string.hashCode();
		int ref3=string.compareToIgnoreCase("Dinosau");
		boolean ref4=string.contains("Dinosaur");
		String ref5=string.concat(" appeared during".concat(" the").concat(" triassic Period"));
		int ref6=string.charAt(2);
		String[] ref7=string.split("Jurassic Park");
		String[] ref8=string.split("Jurassic Park", 7);
		int ref9=string.compareTo("Rhinosaur");
		String ref10=string.substring(4);
		String ref11=string.substring(0, 8);
		boolean ref12=string.isEmpty();		
		int ref13=string.length();		
		boolean ref14=string.startsWith("D");
		boolean ref15=string.endsWith("r");
		boolean ref16=string.equalsIgnoreCase("Dino");
		boolean ref17=string.equals("Dinosaur");
		String ref18=string.toUpperCase();
		String ref19=string.toLowerCase();
		int ref21=string.indexOf(8);
		int ref22=string.indexOf("Dinosaur");
		int ref23=string.indexOf(1, 8);
		int ref24=string.indexOf("Dinosaur", 8);
		String ref25=string.trim();
		
		System.out.println("codePointAt :"+ref);
		System.out.println("codePointCount :"+ref1);
		System.out.println("hashCode :"+ref2);
		System.out.println("compareToIgnoreCase :"+ref3);
		System.out.println("contains :"+ref4);
		System.out.println("concat :"+ref5);
		System.out.println("charAt :"+ref6);
		System.out.println("split :"+ref7);
		System.out.println("split :"+ref8);
		System.out.println("compareTo :"+ref9);
		System.out.println("substring :"+ref10);
		System.out.println("substring :"+ref11);
		System.out.println("isEmpty :"+ref12);
		System.out.println("length :"+ref13);
		System.out.println("startsWith :"+ref14);
		System.out.println("endsWith :"+ref15);
		System.out.println("equalsIgnoreCase :"+ref16);
		System.out.println("equals :"+ref17);
		System.out.println("toUpperCase :"+ref18);
		System.out.println("toLowerCase :"+ref19);
		System.out.println("indexOf :"+ref21);
		System.out.println("indexOf :"+ref22);
		System.out.println("indexOf :"+ref23);
		System.out.println("indexOf :"+ref24);
		System.out.println("trim :"+ref25);
		
		System.out.println("\n");
		System.out.println("-----------------------------------DATE---------------------------------------------");
		System.out.println("\n");
		
		Date date=new Date();
		
		String ref26=date.toString();
		boolean ref27=date.after(date);
		boolean ref28=date.before(date);
		int ref29=date.compareTo(date);
		boolean ref30=date.equals(ref26);
		
		System.out.println("toString :"+ref26);
		System.out.println("after :"+ref27);
		System.out.println("before :"+ref28);
		System.out.println("compareTo :"+ref29);
		System.out.println("equals :"+ref30);
		
		System.out.println("\n");
		System.out.println("-----------------------------------THREAD----------------------------------------");
		System.out.println("\n");
		
		Thread thread=new Thread();
		boolean ref31=thread.equals(thread);
		long ref32=thread.getId();
		String ref33=thread.getName();		
		StackTraceElement[] ref34=thread.getStackTrace();
		ThreadGroup ref35=thread.getThreadGroup();
		
		System.out.println("equals :"+ref31);
		System.out.println("getId :"+ref32);
		System.out.println("getName :"+ref33);
		System.out.println("getStackTrace :"+ref34);
		System.out.println("getThreadGroup :"+ref35);
		
		System.out.println("\n");
		System.out.println("-----------------------------------LOCAL DATE----------------------------------------");
		System.out.println("\n");
		
		System.out.println("now :"+LocalDate.now());
		System.out.println("of :"+LocalDate.of(1999, 7, 24));
		System.out.println("ofEpochDay :"+LocalDate.ofEpochDay(ref32));
		System.out.println("ofYearDay:"+LocalDate.ofYearDay(2023, 22));
		System.out.println("class :"+LocalDate.class);
		
		System.out.println("\n");
		System.out.println("-----------------------------------SYSTEM----------------------------------------");
		System.out.println("\n");
		
		System.out.println("currentTimeMillis :"+System.currentTimeMillis());
		System.out.println("lineSeparator :"+System.lineSeparator());
		System.out.println("nanoTime :"+System.nanoTime());
		System.out.println("clearProperty :"+System.clearProperty("System"));
		System.out.println("Class :"+System.class);
		
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
