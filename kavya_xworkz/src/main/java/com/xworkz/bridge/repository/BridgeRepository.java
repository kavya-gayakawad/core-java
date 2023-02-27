package com.xworkz.bridge.repository;

import com.xworkz.bridge.entity.BridgeEntity;

public interface BridgeRepository {
	
	boolean save(BridgeEntity entity);
	
	default BridgeEntity findById(int id) {
		return null;
	}
	

}
