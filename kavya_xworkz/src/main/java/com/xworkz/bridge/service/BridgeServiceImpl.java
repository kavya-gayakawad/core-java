package com.xworkz.bridge.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.xworkz.bridge.dto.BridgeDTO;
import com.xworkz.bridge.entity.BridgeEntity;
import com.xworkz.bridge.repository.BridgeRepository;

@Service
public class BridgeServiceImpl implements BridgeService {
	@Autowired
	private BridgeRepository bridgeRepository;
	
	public BridgeServiceImpl() {
    System.out.println("created " + this.getClass().getSimpleName());
	}

	@Override
	public Set<ConstraintViolation<BridgeDTO>> validateAndSave(BridgeDTO dto) {
	System.out.println("Running validateAndSave in service");
	ValidatorFactory factory=Validation.buildDefaultValidatorFactory();
	Validator validator=factory.getValidator();
	
	Set<ConstraintViolation<BridgeDTO>> violations = validator.validate(dto);
	
    if(violations != null && !violations.isEmpty()) {
    System.out.println("Violations in dto " + dto);
    return violations;
    }
    
   
    else {
    System.out.println("There is no violations can save");
    BridgeEntity entity=new BridgeEntity();
    entity.setName(dto.getName());
    entity.setCost(dto.getCost());
    entity.setType(dto.getType());
    entity.setLocation(dto.getLocation());
    entity.setNoOfWorkers(dto.getNoOfWorkers());
    boolean saved=this.bridgeRepository.save(entity);
    System.out.println(saved);
    return Collections.emptySet();
    }
		
	}
	
	public BridgeDTO findById(int id) {
		if(id>0) {
		BridgeEntity entity = this.bridgeRepository.findById(id);
		if(entity !=null) {
		System.out.println("Entity found in service for id " + id);
		
		BridgeDTO dto = new BridgeDTO();
		dto.setId(entity.getId());
		dto.setNoOfWorkers(entity.getNoOfWorkers());
		dto.setName(entity.getName());
		dto.setCost(entity.getCost());
		dto.setType(entity.getType());
		dto.setLocation(entity.getLocation());
		return dto;
		

		}
		}
		return BridgeService.super.findById(id);
		
	}
		public List<BridgeDTO> findByName(String name){
		System.out.println("running findByName in service " + name);
		
		if(name!= null && !name.isEmpty()) {
			System.out.println("Name is valid ...calling repo...");
			List<BridgeEntity> entities=this.bridgeRepository.findByName(name);
			
			List<BridgeDTO> listOfDto = new ArrayList<BridgeDTO>();
			for(BridgeEntity entity:entities) {
				BridgeDTO dto = new BridgeDTO();
				dto.setId      (entity.getId());
				dto.setName    (entity.getName());
				dto.setCost    (entity.getCost());
				dto.setLocation(entity.getLocation());
				dto.setType    (entity.getType());
				dto.setNoOfWorkers(entity.getNoOfWorkers());
				listOfDto.add(dto);
			}
			
			System.out.println("size of dtos " +listOfDto.size());
			System.out.println("size of entities " + entities.size());
			return listOfDto;
			
		}else {
			System.out.println("Name is invalid");
		}
		
		return BridgeService.super.findByName(name);
		}
}


