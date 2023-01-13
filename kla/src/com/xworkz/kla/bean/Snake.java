package com.xworkz.kla.bean;

import java.awt.Window.Type;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Snake {
	
	private String name;
	private int length;
	@Autowired
	@Qualifier("snakeColor")
	private String color;
	private Type type;
	private boolean poisonous;
	
	@Autowired
	public Snake(@Qualifier("snakeName")String name, Type type, boolean poisonous) {
		super();
		this.name = name;
		this.type = type;
		this.poisonous = poisonous;
	}


	@Override
	public String toString() {
		return "Snake [name=" + name + ", length=" + length + ", color=" + color + ", type=" + type + ", poisonous="
				+ poisonous + "]";
	}
	
	
	
	

}
