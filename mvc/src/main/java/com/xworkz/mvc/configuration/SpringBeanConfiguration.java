package com.xworkz.mvc.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.mvc")
public class SpringBeanConfiguration {
	
	public SpringBeanConfiguration() {
		System.out.println("created "+this.getClass().getSimpleName());
	}

}
