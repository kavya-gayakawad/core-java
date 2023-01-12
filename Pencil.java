package com.xworkz.lak.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.sun.jdi.Type;

@Component
public class Pencil {
	@Autowired
	@Qualifier("name")
	private String name;
	@Autowired
	private Type type;
	@Autowired
	private int price;
	@Autowired
	@Qualifier("color")
	private String color;
	@Autowired
	private String sharp;
	@Autowired
	private boolean stolen;
	
	
	@Override
	public String toString() {
		return "Pencil [name=" + name + ", type=" + type + ", price=" + price + ", color=" + color + ", sharp=" + sharp
				+ ", stolen=" + stolen + "]";
	}
	
	
	
	

}
