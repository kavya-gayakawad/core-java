package com.xworkz.lak.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.lak")
public class SoftwareEngineerConfiguration {
	public SoftwareEngineerConfiguration() {
		
	}
	
	@Bean
	public String name(){
	return "Akshata";
	
	}
	@Bean
	public Integer salary() {
		return 40000;
	}
	@Bean
	public String companyName() {
		return "Wiproo";
	}
	@Bean 
	public Integer experience() {
		return 2;
	}
}
