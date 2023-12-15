package com.xworkz.app.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import org.springframework.context.annotation.Configuration;

import com.xworkz.app.bean.AdelaideStrikers;
import com.xworkz.app.bean.BribaneHeat;
import com.xworkz.app.bean.HobartHurricanes;
import com.xworkz.app.bean.MebourneStars;
import com.xworkz.app.bean.MelbourneRenegades;
import com.xworkz.app.bean.PerthScorchers;
import com.xworkz.app.bean.SydenyThunders;
import com.xworkz.app.bean.SydneySixers;

@Configuration
@ComponentScan("com.xworkz.app")
public class BeanConfiguration {

	public BeanConfiguration() {
		System.out.println("Created BeanConfiguration");
	}
	
	@Bean
	public SydenyThunders sydeny() {
		SydenyThunders sydenyThunders=new SydenyThunders();
		return sydenyThunders;
	}
	
	@Bean
	public HobartHurricanes Hobart() {
		HobartHurricanes hobartHurricanes=new HobartHurricanes();
		return hobartHurricanes;
	}
	
	@Bean
	public MebourneStars stars() {
		MebourneStars mebourneStars=new MebourneStars();
		return mebourneStars;
	}
	
	@Bean
	public AdelaideStrikers strikers() {
		AdelaideStrikers adelaideStrikers=new AdelaideStrikers();
		return adelaideStrikers;
	}
	
	@Bean
	public BribaneHeat heat() {
		BribaneHeat bribaneHeat=new BribaneHeat();
		return bribaneHeat;
	}
	
	@Bean
	public PerthScorchers perth() {
		PerthScorchers perthScorchers=new PerthScorchers();
		return perthScorchers;
	}
	
	@Bean
	public MelbourneRenegades melbourne() {
		MelbourneRenegades melbourneRenegades=new MelbourneRenegades();
		return melbourneRenegades;
	}
	
	@Bean
	public SydneySixers sixers() {
		SydneySixers sixers=new SydneySixers();
		return sixers;
	}
}
