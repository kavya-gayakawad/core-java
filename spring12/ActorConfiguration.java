package com.xworkz.spring12;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import com.xworkz.spring12.configuration.Actor;

@Component
@ComponentScan("com.xworkz.spring12")

public class ActorConfiguration {
	
	public ActorConfiguration() {
		System.out.println("Default constructor");
	}
	
	@Bean
	public Actor act() {
		System.out.println("registering actor method object with spring");
		Actor act = new Actor("RishabSetti", "Kannada", 37);
		return act;
		
	}
	
	@Bean
	public Actor act1() {
		Actor ac = new Actor("Sudeep", "Kannada", 45);
		return ac;
	}

}
