package com.xworkz.soldier.repositary;

import org.springframework.stereotype.Component;

import com.xworkz.soldier.dto.ResortDto;
@Component
public class ResortRepoImpl implements ResortRepo {

	@Override
	public boolean save(ResortDto resortDto) {
		System.out.println("running save in repoimpl");
		System.out.println("resortDto"+resortDto);
		
		return false;
	}

}
