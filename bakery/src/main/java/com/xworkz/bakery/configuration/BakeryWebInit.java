package com.xworkz.bakery.configuration;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class BakeryWebInit extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer{
	
	public BakeryWebInit() {
System.out.println("created "+this.getClass().getSimpleName());	
}

	@Override
	protected Class<?>[] getRootConfigClasses() {
    System.out.println("running getRootConfigClasses");		
    return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
    System.out.println("running getServletConfigClasses");	
    Class[] ref = {BakeryConfiguration.class};
    return ref;
	}

	@Override
	protected String[] getServletMappings() {
    System.out.println("running getServletMappings");	
    String[] str = {"/"};
    return str;
	}
	
	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		System.out.println("running configureDefaultServletHandling");	
		configurer.enable();
	}

}
