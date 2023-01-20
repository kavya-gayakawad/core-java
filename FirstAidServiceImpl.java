package com.xworkz.soldier.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.soldier.dto.FirstAidDto;
import com.xworkz.soldier.repositary.FirstAidRepo;

@Component
public class FirstAidServiceImpl implements FirstAidService {
@Autowired

private Validator validator;
private FirstAidRepo firstAidRepo;



	@Override
	public boolean validateAndSave(FirstAidDto aidDto) {
	System.out.println("running validate and save");
	System.out.println("aidDto" +aidDto);
	
	Set<ConstraintViolation<FirstAidDto>> violations=this.validator.validate(aidDto);
	
	if(!violations.isEmpty()) {
		System.err.println("ther are validation erros..");
		violations.forEach(cv -> {System.out.println(cv.getMessage());});
	    return false;
	}else {
		System.out.println("Data is valid ..+can save");
		boolean saved = this.firstAidRepo.save(aidDto);
		System.out.println("Saved first aid"+saved);
		return saved;
	}
	}

}
