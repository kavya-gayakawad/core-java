package com.xworkz.bridge.configuration;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class BridgeWebInit extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer {
	
	public BridgeWebInit() {
    System.out.println("created " + this.getClass().getSimpleName());
	}

	@Override
	protected Class<?>[] getRootConfigClasses() {
    System.out.println("Running getRootConfigClasses");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
    System.out.println("Running getServletConfigClasses");
		return new Class[] {BridgeConfiguration.class};
	}

	@Override
	protected String[] getServletMappings() {
	System.out.println("Running getServletMappings");
		return new String[] {"/"};
	}
	
	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
	configurer.enable();
	}
	
	
	

}
