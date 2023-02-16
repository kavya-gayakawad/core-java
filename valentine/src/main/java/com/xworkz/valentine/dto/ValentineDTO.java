package com.xworkz.valentine.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Data;

@Data

public class ValentineDTO {
	@Size(min = 3, max=20, message = "Name cannot be less than 3 or greater than 20") 
	private String name;
	@Size(min = 3, max=20, message = "Valentine cannot be less than 3, greater than 20")
	private String valentineName;
	@NotBlank(message ="Place should be selected")
	private String place;
	@NotBlank(message ="Gift should be selected")
	private String gift;
	

}
