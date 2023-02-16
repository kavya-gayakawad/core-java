package com.xworkz.valentine.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.valentine.dto.ValentineDTO;
import com.xworkz.valentine.service.ValentineService;

@Controller
@RequestMapping("/valentine")

public class ValentineController {
	
	@Autowired
	private ValentineService valentineService;
	
	private List<String> places = Arrays.asList("Cubbon Park","BTM","Lal Bagh","JP Nagar","Indra Nagar");
	private List<String> gifts = Arrays.asList("Teddy","Chocolate","I-Phone","Saree");
	

	 public ValentineController() {
	System.out.println("created " + this.getClass().getSimpleName());	
				
			}
 @GetMapping
	public String onValentine(Model model) {
	 System.out.println("running onValentine Get method");
	 model.addAttribute("places", places);
	 model.addAttribute("gifts", gifts);
	return "Valentine";
	 
 }


@PostMapping
public String onValentine(Model model, ValentineDTO dto) {
	System.out.println("running onValentine Post method" + dto);
	
	
	Set<ConstraintViolation<ValentineDTO>> violations = valentineService.validateAndSave(dto);
	
	if(violations.isEmpty()) {
		System.out.println("no violation in controller go to success page");
		
		return "ValentineSuccess";
	}

		model.addAttribute("places", places);
		model.addAttribute("gifts", gifts);
		model.addAttribute("error", violations);
		model.addAttribute("dto", dto);
	    System.out.println("violation in controller");
        return "Valentine";
	


}
}

