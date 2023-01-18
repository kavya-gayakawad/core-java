package com.xworkz.terrorist.dto;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class TerroristDTO extends AbstractAudioDTO {
	public TerroristDTO(String string, int i, String string2, boolean b, boolean c, String string3, String string4) {
		// TODO Auto-generated constructor stub
	}
	@NotNull
	(message = "Name cannot be null")
	@NotEmpty
	(message = "Name cannot be empty")
	@Size
	(max = 20, min = 3, message ="Name should be between 3 to 20")
	
	private String name;
	@NotNull
	(message = "Name cannot be null")
	@Max(value = 120,message = "age should be less than 120")
	@Min(value =3,message = "age should be more than 3")
	
	private int age;
	@NotNull
	(message = "gender cannot be null")
	@Size
	(max =10,min =3,message = "gender should be between 3 to 20")
	
	private String gender;
	@NotNull
	(message = "prisoned cannot be null")
	
	private boolean prisoned;
	@NotNull
	(message = "alive cannot be null")
	
	private boolean alive;
	@NotNull
	(message= "specilization cannot be null")
	@NotEmpty
	(message = "specilization cannot be empty")
	@Size(max = 20,min=3,message = "specilization should be between 3 to 20")
	
	private String specilization;
	@NotNull
	(message = "organization cannot be null")
	@NotEmpty
	(message = "organization cannot be empty")
	@Size(max=20,min=3,message ="organization should be between 3 to 20")
	
	private String organization;

}
