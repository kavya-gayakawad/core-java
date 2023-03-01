package com.xworkz.bridge.service;

import java.util.Collections;
import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;

import com.xworkz.bridge.dto.BridgeDTO;

public interface BridgeService {
	
	Set<ConstraintViolation<BridgeDTO>>validateAndSave(BridgeDTO dto);
	
	default BridgeDTO findById(int id) {
	return null;
	
}
	default List <BridgeDTO>findByName(String name) {
		return Collections.emptyList();
		}

}


