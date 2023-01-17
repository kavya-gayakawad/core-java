package com.xworkz.interfac.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.interfac")
public class Configurations {
	
	public Configurations() {
		System.out.println("Constructor is created");
	}

}
