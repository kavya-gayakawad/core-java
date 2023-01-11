package com.xworkz.spring12.config;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.spring12.ActorConfiguration;

public class RocketTester {

	public static void main(String[] args) {

		ApplicationContext ac = new AnnotationConfigApplicationContext(ActorConfiguration.class);
		System.out.println(Arrays.toString(ac.getBeanDefinitionNames()));

     Rocket refOfRocket =application.getBean("rocket", Rocket.class);
   
     System.out.println(refOfRocket.getBudget());
     System.out.println(refOfRocket.getName());

     System.out.println(refOfRocket.getCountry());

}

}
