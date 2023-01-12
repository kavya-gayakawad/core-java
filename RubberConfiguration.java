package com.xworkz.lak.configuration;

import java.awt.Window.Type;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan("com.xworkz.lak")
public class RubberConfiguration {
	public RubberConfiguration() {
		
	}	
		@Bean
		public String toName() {
			return "Doms";
		}
		@Bean
		public Type type() {
			return Type.NORMAL;
		}
		@Bean 
		public Integer price() {
			int rubber = 20;
			return rubber;
		}
		
		@Bean
		public String color() {
			return "Red";
		}
		
		@Bean
		public String shape() {
			return "circle";
		}
		
		@Bean
		public boolean stolen() {
			return true;
		}
		
		@Bean
		public Integer size() {
			return 5;
		}
	}


