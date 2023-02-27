package com.xworkz.bridge.dto;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class BridgeDTO {
	
	
	private int id;
	@Size(min=3, max=20, message="Company must be more than 3 and less than 20")
	private String name;
	@NotEmpty(message="Type must be selected")
	private String type;
	private int cost;
	@NotEmpty(message="location must be selected")
	private String location;
	
	private int noOfWorkers;

	
		
	}
	
	


