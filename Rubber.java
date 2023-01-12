package com.xworkz.lak.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.sun.jdi.Type;

@Component
public class Rubber {
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
	private String shape;
	@Autowired
	private boolean stolen;
	@Autowired
	private int size;
	
	
	@Override
	public String toString() {
		return "Rubber [name=" + name + ", type=" + type + ", price=" + price + ", color=" + color + ", shape=" + shape
				+ ", stolen=" + stolen + ", size=" + size + "]";
	}
	
	
	
	

}
