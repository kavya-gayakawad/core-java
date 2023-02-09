package com.xworkz.bakery.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.bakery.dto.BakeryDTO;
import com.xworkz.bakery.service.BakeryService;

@Controller
@RequestMapping("/")
public class BakeryController {

@Autowired
	private BakeryService service;
	
	public BakeryController() {
    System.out.println("created " + this.getClass().getSimpleName());	
}
	
@GetMapping("/bakery")

public String onBakery(BakeryDTO dto, Model model) {
	System.out.println("running in BakeryDTO " + dto);
	
	boolean save = this.service.validateAndSave(dto);
	System.out.println("Bakery dto saved:" + save);
	model.addAttribute("bdto", dto);
	return "index";
}


}
