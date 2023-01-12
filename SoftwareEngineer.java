package com.xworkz.lak.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component

public class SoftwareEngineer {
	@Autowired
	@Qualifier("name")
	private String name;
	@Autowired
	@Qualifier("salary")
	private int salary;
	@Autowired
	private String companyName;
	@Autowired
	private int experience;
	
	
	@Override
	public String toString() {
		return "SoftwareEngineer [name=" + name + ", salary=" + salary + ", companyName=" + companyName
				+ ", experience=" + experience + "]";
	}
	
	

}
