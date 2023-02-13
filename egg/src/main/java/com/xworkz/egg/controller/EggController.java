package com.xworkz.egg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.egg.dto.EggDTO;
import com.xworkz.egg.service.EggService;
@Controller
@RequestMapping("/")
public class EggController {

@Autowired
private EggService eggService;
	
	public EggController() {
		System.out.println("created " + this.getClass().getSimpleName());
	}
	
@GetMapping("egg")
  public String onOrder(EggDTO dto, Model model) {
	  System.out.println("running onOrder " + dto);
	  boolean save = this.eggService.validateAndSave(dto);
	  System.out.println("save: " + save);
	  return "Egg";
  }

	
	

}



