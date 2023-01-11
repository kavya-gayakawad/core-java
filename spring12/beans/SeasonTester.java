package com.xworkz.spring12.beans;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.spring12.ActorConfiguration;

public class SeasonTester {

	public static void main(String[] args) {

		ApplicationContext ac = new AnnotationConfigApplicationContext(ActorConfiguration.class);
		System.out.println(Arrays.toString(ac.getBeanDefinitionNames()));

		Season sea = application.getBean("season", Season.class);
		
		System.out.println(sea);
		
		System.out.println(sea.getName());

		System.out.println(sea.getDuration());
		
		System.out.println(sea.getStartingMonth());
	
	
	Season sea1 = application.getBean("sea", Season.class);
	
	System.out.println(sea1);
	
	System.out.println(sea1.getName());

	System.out.println(sea1.getDuration());
	
	System.out.println(sea1.getStartingMonth());
}
	

}
