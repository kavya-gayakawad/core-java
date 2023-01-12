package com.xworkz.lak.configuration;

import java.time.LocalDate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan("com.xworkz.lak")
public class SoftwareConfiguration {
	public SoftwareConfiguration() {
		
	}	
		@Bean
		public String name() {
			return "java";
	}
		@Bean
		public double version() {
			return 1.8;
	}
	   @Bean
	   public String developer() {
		   return "laxmi";
   }
	   @Bean
	   public LocalDate date() {
		   return LocalDate.of(2023, 01, 10);
  }
	   @Bean
	   public boolean free() {
		   return false;
	   }

}
