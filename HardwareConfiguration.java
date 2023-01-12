package com.xworkz.lak.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
@Configuration
@ComponentScan("com.xworkz.lak")
public class HardwareConfiguration {
	
	public HardwareConfiguration() {
		
	}
	
	@Bean
	public String name() {
		return "Electronics";
		
	}
	@Bean
	public Integer id() {
		return 10;
	}
	@Bean 
	public Integer gstNo() {
		return 312;
	}
	@Bean
	public String ownerName() {
		return "laxmi";
	}
	@Bean
	public String address() {
		return "Mudhol";
	}

}
