package com.over.riding.boot;

import com.over.riding.app.*;

public class AllInOneRunner {

	public static void main(String[] args) {
		
		System.out.println("----------TICKET-----------");
		Ticket slip=new GeneralTicket();
		slip.travel();
		System.out.println("\n");
		
		System.out.println("----------GATE-----------");
		
		Gate iron=new SpecialGate();
		iron.close();
		System.out.println("\n");
		
		System.out.println("----------DINOSAUR-----------");
		
		Dinosaur run=new BigDinosaur();
		run.Hunt();
		System.out.println("\n");
		
		System.out.println("----------FLEX-----------");
		
		Flex news=new ColorFlex();
		news.information();
		System.out.println("\n");
		
		System.out.println("----------MIC-----------");
		
		Mic recive=new StandardMic();
		recive.signal();
		System.out.println("\n");
		
		System.out.println("----------DRUM-----------");
		
		Drum drum=new FiberDrum();
		drum.store();
		System.out.println("\n");
		
		System.out.println("----------THEATER-----------");
		Theater movie=new PVRTheater();
		movie.screen();
		System.out.println("\n");
		
		System.out.println("----------AMOEBA-----------");
		
		Amoeba fly=new BrainEatingAmoeba();
		fly.anywhere();
		

	}
	
	
}
