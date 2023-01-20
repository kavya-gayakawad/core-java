package com.xworkz.soldier.repositary;

import org.springframework.stereotype.Component;

import com.xworkz.soldier.dto.MissileDto;

@Component
public class MissileRepoImpl implements MissileRepo {
	

	@Override
	public boolean save(MissileDto missileDto) {
		System.out.println("running save in repoimpl");
		System.out.println("missileDto"+missileDto);
		
		return false;
	}

}
