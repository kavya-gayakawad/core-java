package com.xworkz.soldier.dto;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString

public class SoldierDto extends AbstractAuditDto {
	
	@NotNull
	@NotBlank
	
	@Size(min=3, max=15)
	private String name;
	@Max(1000)
	@Min(0)
	private int id;
	@NotNull
	@NotBlank
	@Size(min=3, max=30)
	private String battalion;
	@NotNull
	@NotBlank
	@Size(min=20, max=200)
	private String country;
	@NotNull
	@NotBlank
	@Size(min=5,max=20)
	private String rank;
	
	

}
