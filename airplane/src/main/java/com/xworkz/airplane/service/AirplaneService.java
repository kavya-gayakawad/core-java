package com.xworkz.airplane.service;

import java.util.Set;

import javax.validation.ConstraintViolation;

import com.xworkz.airplane.dto.AirplaneDTO;

public interface AirplaneService {
	
	Set<ConstraintViolation<AirplaneDTO>>validateAndSave(AirplaneDTO dto);
	
	default AirplaneDTO findById(int id) {
	return null;
	}
}


