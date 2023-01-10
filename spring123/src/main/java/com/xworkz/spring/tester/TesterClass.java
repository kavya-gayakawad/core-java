package com.xworkz.spring.tester;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.spring.configuration.SpringConfiguration;

public class TesterClass {

	public static void main(String[] args) {
		
		ApplicationContext spring = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		String[] beanNames = spring.getBeanDefinitionNames();
		System.out.println(Arrays.toString(beanNames));
		
		String refOfString = spring.getBean("email", String.class);
		System.out.println(refOfString.hashCode());
		
		String refOfStr = spring.getBean("chair", String.class);
		System.out.println(refOfStr.hashCode());
		
		String refOfSt = spring.getBean("home", String.class);
		System.out.println(refOfSt.hashCode());
		
		String refOfStrg = spring.getBean("bottle", String.class);
		System.out.println(refOfStrg.hashCode());
		
		String refOfStrng = spring.getBean("bag", String.class);
		System.out.println(refOfStrng.hashCode());
		
		Double refOfOn = spring.getBean("one", Double.class);
		System.out.println(refOfOn.hashCode());
		
		Double refOfTo = spring.getBean("one", Double.class);
		System.out.println(refOfTo.hashCode());
		
		Double refOfTh = spring.getBean("one", Double.class);
		System.out.println(refOfTh.hashCode());
		
		Double refOfFr = spring.getBean("one", Double.class);
		System.out.println(refOfFr.hashCode());
		
		Double refOfFv = spring.getBean("one", Double.class);
		System.out.println(refOfFv.hashCode());
		
		Boolean refOfAa = spring.getBean("a", Boolean.class);
		System.out.println(refOfAa.hashCode());
		
		Boolean refOfBa = spring.getBean("b", Boolean.class);
		System.out.println(refOfBa.hashCode());
		
		Boolean refOfCa = spring.getBean("c", Boolean.class);
		System.out.println(refOfCa.hashCode());
		
		Boolean refOfDa = spring.getBean("d", Boolean.class);
		System.out.println(refOfDa.hashCode());
		
		Boolean refOfEa = spring.getBean("e", Boolean.class);
		System.out.println(refOfEa.hashCode());
		
		StringBuffer refOfBuf = spring.getBean("buf", StringBuffer.class);
		System.out.println(refOfBuf.hashCode());
		
		StringBuffer refOfBuff = spring.getBean("buf1", StringBuffer.class);
		System.out.println(refOfBuff.hashCode());
		
		StringBuffer refOfBufr = spring.getBean("buf2", StringBuffer.class);
		System.out.println(refOfBufr.hashCode());
		
		StringBuffer refOfBf = spring.getBean("buf3", StringBuffer.class);
		System.out.println(refOfBf.hashCode());
		
		StringBuffer refOfBu = spring.getBean("buf4", StringBuffer.class);
		System.out.println(refOfBu.hashCode());
		
		StringBuilder refOfBl = spring.getBean("bul", StringBuilder.class);
		System.out.println(refOfBl.hashCode());
		
		StringBuilder refOfBl1 = spring.getBean("bul1", StringBuilder.class);
		System.out.println(refOfBl1.hashCode());
		
		StringBuilder refOfBl2 = spring.getBean("bul2", StringBuilder.class);
		System.out.println(refOfBl2.hashCode());
		
		StringBuilder refOfBl3 = spring.getBean("bul3", StringBuilder.class);
		System.out.println(refOfBl3.hashCode());
		
		StringBuilder refOfBl4 = spring.getBean("bul4", StringBuilder.class);
		System.out.println(refOfBl4.hashCode());
		
		ArrayList refOfColl = spring.getBean("arr", ArrayList.class);
		System.out.println(refOfColl.hashCode());
		
		Map refOfHs = spring.getBean("hash", HashMap.class );
		System.out.println(refOfHs.hashCode());
		
//		Bhashyamcircle bhashyamCircle = spring.getBean("Circle", BhashyamCircle.class);
		
		

	}

}
