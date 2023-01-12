package com.xworkz.lak.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.lak.bean.Hardware;
import com.xworkz.lak.bean.MedicalShop;
import com.xworkz.lak.bean.Pencil;
import com.xworkz.lak.bean.Rubber;
import com.xworkz.lak.bean.Software;
import com.xworkz.lak.bean.SoftwareEngineer;

public class Runner {

	public static void main(String[] args) {
		

		ApplicationContext container = new AnnotationConfigApplicationContext(MedicalShop.class);
		
		System.out.println(Arrays.toString(container.getBeanDefinitionNames()));
		
		Hardware ref = container.getBean(Hardware.class);
		System.out.println(ref);
		
		Rubber ref1 = container.getBean(Rubber.class);
		System.out.println(ref1);
		
		SoftwareEngineer ref2 = container.getBean(SoftwareEngineer.class);
		System.out.println(ref2);

		Pencil ref3 = container.getBean(Pencil.class);
		System.out.println(ref3);
		
		Software ref4 = container.getBean(Software.class);
		System.out.println(ref4);
	}

}
