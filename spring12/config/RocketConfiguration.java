package com.xworkz.spring12.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.spring12")
public class RocketConfiguration {
	
	@Bean
	public Rocket rock() {
		
		System.out.println("registering rock methods");
		
		Rocket ro =new Rocket();
		return ro;
		
	}
	

}
