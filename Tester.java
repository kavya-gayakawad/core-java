package com.xworkz.lak.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.lak.bean.MedicalShop;

public class Tester {

	public static void main(String[] args) {
		
		
		ApplicationContext container = new AnnotationConfigApplicationContext(MedicalShop.class);
		
		System.out.println(Arrays.toString(container.getBeanDefinitionNames()));
		
		MedicalShop ref=container.getBean(MedicalShop.class);
		System.out.println(ref);

	}

}
