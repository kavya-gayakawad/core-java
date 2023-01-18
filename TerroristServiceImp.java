package com.xworkz.terrorist.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.ValidatorFactory;
import javax.xml.validation.Validator;

import com.xworkz.terrorist.dto.TerroristDTO;

public class TerroristServiceImp implements TerroristService {
	
	@Override
	public boolean validateAndSave(TerroristDTO dto) {
		System.out.println("started validate save");
		System.out.println("DTO passes"+dto);
		
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		 Validator validator = factory.getValidator();
		 
		 Set<ConstraintViolation<TerroristDTO>>constraintViolations = validator.validate(dto);
		 
		 if(!constraintViolations.isEmpty()) {
			 System.out.println("Error in data");
			 
			 constraintViolations.forEach(ele->System.out.println(ele.getMessage()));
			 
		 }
		 return false;
		 
		 
		 
		
		
	}

}
