package com.xworkz.kla.bean;

import java.awt.Window.Type;

import org.springframework.stereotype.Component;

@Component
public class Engine {
	
	private String name;
	private Type type;
	private int number;
	private int version;
	private String company;
	
	public Engine(String name, Type type, String company) {
		super();
		this.name = name;
		this.type = type;
		this.company = company;
	}
	
	@Override
	public String toString() {
		return "Engine [name=" + name + ", type=" + type + ", number=" + number + ", version=" + version + ", company="
				+ company + "]";
	}


	
	
	

}
