package com.xworkz.bridge.service;

import java.util.Set;

import javax.validation.ConstraintViolation;

import org.springframework.stereotype.Service;

import com.xworkz.bridge.dto.BridgeDTO;


public interface BridgeService {
	
	Set<ConstraintViolation<BridgeDTO>>validateAndSave(BridgeDTO dto);
	
	default BridgeDTO findById(int id) {
	return null;
	
}

}


