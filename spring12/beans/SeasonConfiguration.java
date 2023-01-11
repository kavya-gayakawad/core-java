package com.xworkz.spring12.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
@ComponentScan("com.xworkz.spring12")

public class SeasonConfiguration {
	
	@Bean
	public Season sea() {
		System.out.println("registering");
		
		Season season = new Season();
		season.setName("summer");
		
		season.setDuration(4);
		
		season.setStartingMonth("march");
		return season;
	}
	


}
