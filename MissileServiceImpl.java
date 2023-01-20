package com.xworkz.soldier.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.xworkz.soldier.dto.MissileDto;
import com.xworkz.soldier.repositary.MissileRepo;
@Component
public class MissileServiceImpl implements MissileService {

	@Autowired
	private Validator validator;
	private MissileRepo missileRepo;

//	@Autowired
//	public MissileServiceImpl(MissileRepo missilerepo) {
//    this.missileRepo=missileRepo;
    
//	}

	@Override
	public boolean validateAndSave(MissileDto missileDto) {
		
		System.out.println("running validate and save");
		System.out.println("missileDto" +missileDto);
		
		Set<ConstraintViolation<MissileDto>> violations=this.validator.validate(missileDto);
		
		if(!violations.isEmpty()) {
			System.out.println("violations present");
			violations.forEach(c -> {System.out.println(c.getMessage());});
		    return true;
		}else {
			System.out.println("Data is valid ..+can save");
			boolean saved = this.missileRepo.save(missileDto);
			System.out.println("Saved "+saved);
			return saved;
		}
		




	}

}
