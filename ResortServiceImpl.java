package com.xworkz.soldier.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.soldier.dto.ResortDto;
import com.xworkz.soldier.repositary.ResortRepo;

@Component
public class ResortServiceImpl implements ResortService {

		@Autowired
		private Validator validator;
		private ResortRepo resortRepo;

//		@Autowired
//		public MissileServiceImpl(MissileRepo missilerepo) {
//	    this.missileRepo=missileRepo;
	    
//		}
		@Override
		public boolean validateAndSave(ResortDto resortDto) {
		
			
			System.out.println("running validate and save");
			System.out.println("resortDto" +resortDto);
			
			Set<ConstraintViolation<ResortDto>> violations=this.validator.validate(resortDto);
			
			if(!violations.isEmpty()) {
				System.out.println("violations present");
				violations.forEach(c -> {System.out.println(c.getMessage());});
			    return true;
			}else {
				System.out.println("Data is valid ..+can save");
				boolean saved = this.resortRepo.save(resortDto);
				System.out.println("Saved "+saved);
				return saved;
			}
			




		}

	}


