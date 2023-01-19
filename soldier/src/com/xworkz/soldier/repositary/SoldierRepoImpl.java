package com.xworkz.soldier.repositary;

import com.xworkz.soldier.dto.SoldierDto;

public class SoldierRepoImpl implements SoldierRepo {
	public SoldierRepoImpl() {
		System.out.println("Created soldierrepoImpl using No-arg Const..");
	}

	@Override
	public boolean save(SoldierDto dto) {
		System.out.println("Running save");
		System.out.println("Dto"+ dto);
		return false;
	}

}
