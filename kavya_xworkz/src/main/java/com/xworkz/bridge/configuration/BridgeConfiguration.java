package com.xworkz.bridge.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan("com.xworkz.bridge")
public class BridgeConfiguration {
	
	public BridgeConfiguration() {
    System.out.println("created " + this.getClass().getSimpleName());
	}
	
	
	@Bean
	public ViewResolver viewResolver() {
	System.out.println("register view resolver");
	return new InternalResourceViewResolver("/", ".jsp");
	}
	
	@Bean
	public LocalContainerEntityManagerFactoryBean localContainerEntityManagerFactoryBean() {
	System.out.println("Running localcontainerentity manger factory bean");
   return new LocalContainerEntityManagerFactoryBean();
	}

}
