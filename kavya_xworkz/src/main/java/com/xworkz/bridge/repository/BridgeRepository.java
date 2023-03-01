package com.xworkz.bridge.repository;

import java.util.Collections;
import java.util.List;

import com.xworkz.bridge.entity.BridgeEntity;

public interface BridgeRepository {
	
	boolean save(BridgeEntity entity);
	
	default BridgeEntity findById(int id) {
		return null;
	}
	
	default List <BridgeEntity>findByName(String name) {
	return Collections.emptyList();
	}
	

}
