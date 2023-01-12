package com.xworkz.lak.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Hardware {
	@Autowired
	@Qualifier("name")
	private String name;
	@Autowired
	@Qualifier("id")
	private int id;
	@Autowired
	private int gstNo;
	@Autowired
	@Qualifier("ownerName")
	private String ownerName;
	@Autowired
	private String address;
	
	
	@Override
	public String toString() {
		return "Hardware [name=" + name + ", id=" + id + ", gstNo=" + gstNo + ", ownerName=" + ownerName + ", address="
				+ address + "]";
	}
	
	

}
