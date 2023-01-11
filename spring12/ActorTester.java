package com.xworkz.spring12;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.spring12.configuration.Actor;

public class ActorTester {

	public static void main(String[] args) {
		
		ApplicationContext ac = new AnnotationConfigApplicationContext(ActorConfiguration.class);
		System.out.println(Arrays.toString(ac.getBeanDefinitionNames()));

		
		Actor act = ac.getBean("act", Actor.class);
		
		System.out.println("Actor Name: " +act.getName());
		
		System.out.println("Actor language: " +act.getLanguage());
		
		System.out.println("Actor age: " +act.getAge());
		
		System.out.println();
		
		Actor act1 = ac.getBean("act1", Actor.class);
		
		System.out.println("Actor Name: " +act1.getName());
		
		System.out.println(("Actor Language: " +act1.getLanguage()));
		
		System.out.println("Actro Age: " + act1.getAge());
		
	}

}
