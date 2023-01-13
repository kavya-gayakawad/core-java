package com.xworkz.kla.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.kla.bean.Engine;
import com.xworkz.kla.bean.Ghost;
import com.xworkz.kla.bean.NewsPaper;
import com.xworkz.kla.bean.Snake;
import com.xworkz.kla.configuration.Configurations;

public class Tester {

	public static void main(String[] args) {
		ApplicationContext container = new AnnotationConfigApplicationContext(Configurations.class);
        System.out.println(Arrays.toString(container.getBeanDefinitionNames()));
        
        NewsPaper ref = container.getBean(NewsPaper.class);
        System.out.println(ref);
        
        Engine ref1 = container.getBean(Engine.class);
        System.out.println(ref1);
        
        Snake ref2 = container.getBean(Snake.class);
        System.out.println(ref2);
        
        Ghost ref3 = container.getBean(Ghost.class);
        System.out.println(ref3);
        
        
	}

}
