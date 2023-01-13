package com.xworkz.kla.bean;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Ghost {
	@Autowired
	@Qualifier("ghostName")
	private String name;
	@Autowired
	@Qualifier("ghostColor")
	private String color;
	@Autowired
	@Qualifier("ghostWeight")
	private double weight;
	@Autowired
	@Qualifier("ghostHeight")
	private int height;
	@Autowired
	@Qualifier("ghostPhoneNo")
	private long phoneNo;
	@Autowired
	@Qualifier("ghostAadharCardNo")
	private long aadharCardNo;
	@Autowired
	@Qualifier("ghostPlace")
	private String place;
	@Autowired
	@Qualifier("ghostDateOfDeath")
	private LocalDate dateOfDeath;
	@Autowired
	@Qualifier("ghostGender")
	private String gender;
	@Autowired
	private char bloodGroup;
	@Autowired
	@Qualifier("ghostPanCardNo")
	private double panCardNo;
	private String father; 
	private String mother; 
	private String wife; 
	private String son; 
	private LocalDate dateOfBirth;
	private boolean suicide;
	private String dressColor;
	private float nailLength;
	private String qualification;
	
	

	@Autowired
	public Ghost(@Qualifier("ghostpancardNo")double panCardNo, @Qualifier("ghostFather") String father,
			@Qualifier("ghostMother")String mother, @Qualifier("ghostWife") String wife, @Qualifier("ghostSon")String son,
			@Qualifier("ghostdateOfBirth")LocalDate dateOfBirth,boolean suicide, @Qualifier("ghostdressColor")String dressColor,
			float nailLength, @Qualifier("ghostQualification")String qualification) {
		super();
		this.panCardNo = panCardNo;
		this.father = father;
		this.mother = mother;
		this.wife = wife;
		this.son = son;
		this.dateOfBirth = dateOfBirth;
		this.suicide = suicide;
		this.dressColor = dressColor;
		this.nailLength = nailLength;
		this.qualification = qualification;
	}
	@Override
	public String toString() {
		return "Ghost [name=" + name + ", color=" + color + ", weight=" + weight + ", height=" + height + ", phoneNo="
				+ phoneNo + ", aadharCardNo=" + aadharCardNo + ", place=" + place + ", dateOfDeath=" + dateOfDeath
				+ ", gender=" + gender + ", bloodGroup=" + bloodGroup + ", panCardNo=" + panCardNo + ", father="
				+ father + ", mother=" + mother + ", wife=" + wife + ", son=" + son + ", dateOfBirth=" + dateOfBirth
				+ ", suicide=" + suicide + ", dressColor=" + dressColor + ", nailLength=" + nailLength
				+ ", qualification=" + qualification + "]";
	}
	
	
}
