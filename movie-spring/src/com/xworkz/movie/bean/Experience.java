package com.xworkz.movie.bean;

import org.springframework.stereotype.Component;

@Component
public class Experience {

	private Skill skill;
	
	public Experience() {
		System.out.println("creating experience constructor");
		
	}
	public Skill skills() {
		Skill skill = new Skill();
		return skill;
	}
}
