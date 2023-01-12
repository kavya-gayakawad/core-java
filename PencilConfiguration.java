package com.xworkz.lak.configuration;

import java.awt.Window.Type;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.lak")
public class PencilConfiguration {
	
	public PencilConfiguration() {
		
	}
	@Bean
	public String toName() {
		return "Nataraj";
		
	}
	
    @Bean
    public Type type() {
    	return Type.NORMAL;
    	
    }
    
    @Bean
    public Integer price() {
    	int penci = 20;
    	return penci;
    }
    
    @Bean
    public String color() {
    	return "Red";
    }
    
    @Bean boolean sharp() {
    	return true;
    }
    
    @Bean boolean stolen() {
    	return true;
    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
