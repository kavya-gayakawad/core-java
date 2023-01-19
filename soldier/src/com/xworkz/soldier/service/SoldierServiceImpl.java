package com.xworkz.soldier.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;


import com.xworkz.soldier.dto.SoldierDto;
import com.xworkz.soldier.repositary.SoldierRepo;

public class SoldierServiceImpl implements SoldierService {

	private SoldierRepo soldierRepo;
	
	public SoldierServiceImpl() {
		System.out.println("Constructed is created");
	}
	public void setSoldierRepo(SoldierRepo soldierRepo) {
		this.soldierRepo=soldierRepo;
	}
	@Override
	public boolean validateAndSave(SoldierDto dto) {
		
		System.out.println("started validate and save ");
		System.out.println("Dto passes"+dto);
		
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = (Validator) factory.getValidator();
		
		Set<ConstraintViolation<SoldierDto>> violations=validator.validate(dto);
		
		if(!violations.isEmpty()) {
			
			System.out.println("error is there");
			
			violations.forEach(c-> {System.out.println(c.getMessage());
			
		
		});
		return false;
		}
	else {
		System.out.println("Data is valid");
		boolean saved = soldierRepo.save(dto);
		System.out.println("Dto saved using repo"+saved);
		return saved;
	}

	}
}



	




	




