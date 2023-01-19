package com.xworkz.soldier.boot;

import com.xworkz.soldier.dto.SoldierDto;
import com.xworkz.soldier.service.SoldierService;
import com.xworkz.soldier.service.SoldierServiceImpl;

public class SoldierRunner {

	public static void main(String[] args) {
		
		SoldierDto dto = new SoldierDto("Laxmi", 1, "GoldenPg", "America","Topper");
		
		SoldierService service = new SoldierServiceImpl();
		service.validateAndSave(dto);

	}

}
