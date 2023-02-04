package com.xworkz.beach.controller;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.beach.dto.CasinoDTO;

@Component
@RequestMapping("/send")
public class CasinoController {
	
	public CasinoController() {
		System.out.println("created "+this.getClass().getSimpleName());
	}

@PostMapping
  public String gamble(CasinoDTO dto,Model model) {
	  System.out.println("running the gamble method"+dto);
	  
	  model.addAttribute("name",dto.getName());
	  model.addAttribute("cruise",dto.getCruise());
	  model.addAttribute("entryFees",dto.getEntryFees());
	  model.addAttribute("freeFood", dto.getFreeFood());
	  return "CasinoSucess.jsp";
  }
}
