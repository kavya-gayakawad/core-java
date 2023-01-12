package com.xworkz.lak.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MedicalShop {
	@Autowired
	private String shopName;
	@Autowired
	private int price;
	@Autowired
	private char gender;
	@Autowired
	private double gst;
	@Autowired
	private float dosage;
	@Autowired
	private short workers;
	@Autowired
	private long mobileNo;
	@Autowired
	private byte noOfShops;
	@Autowired
	private boolean expireDate;
	
	
	@Override
	public String toString() {
		return "MedicalShop [shopName=" + shopName + ", price=" + price + ", gender=" + gender + ", gst=" + gst
				+ ", dosage=" + dosage + ", workers=" + workers + ", mobileNo=" + mobileNo + ", noOfShops=" + noOfShops
				+ ", expireDate=" + expireDate + "]";
	}
	
	
	
	

}
