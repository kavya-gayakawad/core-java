package com.xworkz.spring12.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component

public class Season {
	
	private String name;
	private Integer duration;
	private String startingMonth;
	
	public Season() {
		
		System.out.println("creating season with spring");
	}
	
	@Value("winter")
	public void setName(String name) {
		this.name = name;
	}
	
	@Value("4")
	public void setDuration(Integer duration) {
		this.duration = duration;
	}
	@Value("nov")
	public void setStartingMonth(String startingMonth) {
		this.startingMonth = startingMonth;
	}
	
	public String getName() {
		return name;
	}
	
	public Integer getDuration() {
		return duration;
	}
	
	public String getStartingMonth() {
		return startingMonth;
	}
	
}
