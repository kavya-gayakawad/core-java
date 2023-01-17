package com.xworkz.interfac.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.interfac.Chrome;
import com.xworkz.interfac.FireBox;
import com.xworkz.interfac.configuration.Configurations;

public class Runner {

	public static void main(String[] args) {

		ApplicationContext container = new AnnotationConfigApplicationContext(Configurations.class);
		
		Chrome ch = container.getBean(Chrome.class);
		
		ch.browse();
		
		FireBox fb = container.getBean(FireBox.class);
		fb.browse();
	}

}
