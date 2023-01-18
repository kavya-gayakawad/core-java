package com.xworkz.terrorist.boot;

import com.xworkz.terrorist.dto.TerroristDTO;
import com.xworkz.terrorist.service.TerroristServiceImp;

public class Runner {

	public static void main(String[] args) {
		TerroristDTO dto = new TerroristDTO("madhu", 65,"female",false,false,"Bombing","thaliban");
		
		TerroristServiceImp impl = new TerroristServiceImp();
		impl.validateAndSave(dto);
		System.out.println(dto.getName());

	}

}
