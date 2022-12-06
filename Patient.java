package com.xworkz.hospital.hospitalapp;

import com.xworkz.hospital.hospitalapp.constant.Gender;

import lombok.Getter;
import lombok.Setter;


@Setter
@Getter

public class Patient {
	private	String patientName;
	private String address;
	private Gender gender;
	private int age;



	
//	public Patient(String patientName, String address, Gender  gender, int age) {
//         this.patientName=patientName;
//         this.address=address;
//         this.gender=gender;
//         this.age=age;
//	}
	
	public Patient() {
		// TODO Auto-generated constructor stub
	}

	public void displayInfo() {
		System.out.println("Patient Name is: "+ this.patientName + "address is: "+this.address +"gender is: "+ this.gender+"age is: "+this.age);
	}

	public void setPatientName(String next) {
		// TODO Auto-generated method stub
		
	}

	public int getAge() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void setAge(int nextInt) {
		// TODO Auto-generated method stub
		
	}

	public void setGender(Gender valueOf) {
		// TODO Auto-generated method stub
		
	}

	public void setAddress(String next) {
		// TODO Auto-generated method stub
		
	}

	public void setAge1(int nextInt) {
		// TODO Auto-generated method stub
		
	}

	public String getPatientName() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getAddress1() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getGender() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getAddress2() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getAddress() {
		// TODO Auto-generated method stub
		return null;
	}

	public int getPatientAge() {
		// TODO Auto-generated method stub
		return 0;
	}

	public int getPatientAddress() {
		// TODO Auto-generated method stub
		return 0;
	}

	public int getPatientGender() {
		// TODO Auto-generated method stub
		return 0;
	}

}

