package com.xworkz.airplane.repository;

import com.xworkz.airplane.entity.AirplaneEntity;

public interface AirplaneRepository {
	
	boolean save(AirplaneEntity entity);

	default AirplaneEntity findById(int id) {
		return null;
	}
	
	

}
