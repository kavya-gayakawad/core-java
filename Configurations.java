package com.xworkz.kla.configuration;

import java.awt.Window.Type;
import java.time.LocalDate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.kla")
public class Configurations {
	public Configurations() {
		System.out.println("creating constr...");
	}
	@Bean
	public String paperName() {
		return "Vijayvani";
	}
	@Bean
	public int paperId() {
		return 141;
	}
	@Bean
	public String paperOwnerName() {
		return "Sankeshwar";
	}
	
	@Bean
	public String paperLanguage() {
		return "Kannada";
	}
	@Bean
	public int paperPrice() {
		return 10;
	}
	@Bean
	public String engineName() {
		return "AutomobileEngine";
	}
	@Bean
	public String engineType() {
		return Type.gasoline;
	}
	@Bean
	public int engineNumber() {
		return 235;
	}
	
	@Bean
	public int engineVersion() {
		return 5;
	}
	
	@Bean
	public String engineCompany() {
		return "Suzaki";
	}
	@Bean
	public String snakeName() {
		return "Anakonda";
	}
	@Bean
	public int snakeLength() {
		return 10;
	}
	@Bean
	public String snakeColor() {
		return "Gray";
	}
	@Bean
	public Type snakeType() {
		return Type.NORMAL;
	}
	@Bean
	public boolean snakePoisonous() {
		return true;
	}
	@Bean
	public String ghostName() {
		return "christoper";
	}
	@Bean
	public String ghostColor() {
		return "white";
	}
	@Bean
	public double ghostWeight() {
		return 59.2;
	}
	@Bean
	public int  ghostHeight() {
		return 6;
	}
	@Bean
	public long ghostPhoneNo() {
		return 8217097557L;
	}
	@Bean
	public long ghostAadharNo() {
		return 556170975573L;
	}
	@Bean
	public String ghostPlace() {
		return "Goa";
	}
	@Bean
	public LocalDate ghostDateOfDeath() {
		return LocalDate.of(2020, 03, 06);
	}
	@Bean
	public String ghostGender() {
		return "Male";
	}
	@Bean
	public char ghostBloodGroup() {
		return 'A';
	}
	@Bean
	public double ghostPancardNo() {
		return 658981;
	}
	@Bean
	public String ghostFather() {
		return "Inbaraj";
	}
	@Bean
	public String ghostMother() {
		return "Mery";
	}
	@Bean
	public String ghostWife() {
		return "Sofii";
	}
	@Bean
	public String ghostSon() {
		return "Sangili";
	}
	@Bean
	public LocalDate ghostDateOfBirth() {
		return LocalDate.of(1991, 03, 05);
	}
	@Bean
	public boolean ghostSuicide() {
		return false;
	}
	@Bean
	public String ghostDressColor() {
		return "White";
	}
	@Bean
	public float ghostNailLength() {
		return 5.3f;
	}
	
	@Bean
	public String ghostQualification() {
		return "M.tech";
	}
	
	
	
	

	





}
