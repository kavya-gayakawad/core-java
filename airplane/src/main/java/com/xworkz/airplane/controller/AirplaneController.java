package com.xworkz.airplane.controller;

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
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.airplane.dto.AirplaneDTO;
import com.xworkz.airplane.service.AirplaneService;
@Controller
@RequestMapping("/")
public class AirplaneController {
	
	@Autowired
	private AirplaneService airplaneService;
	
private List<String> types = Arrays.asList("IndiGo","British airway","Antonov An-32","Air India","Boeing 737","Airbus A380","Boeing 777");
private List<String> countries=Arrays.asList("India","USA","Japan","Malaysia","China","Nepal","Canada","Australia");

	public AirplaneController() {
	System.out.println("created " +this.getClass().getSimpleName());
	}
	
	@GetMapping("/airplane")
	public String onAirplane(Model model) {
	System.out.println("Running onAirplane on get method");
	model.addAttribute("types", types);
	model.addAttribute("countries", countries);
	return "Airplane";
		
	}

	
	@GetMapping("/airplaneSearch")
	public String onSearch(@RequestParam int id, Model model) {
		System.out.println("Running onSearch in get method." + id);
		AirplaneDTO dto=this.airplaneService.findById(id);
		if(dto !=null) {
		model.addAttribute("dto", dto);
		}
		else {
		model.addAttribute("message", "data not found");
		}
		return "AirplaneSearch";
	}
	
    @PostMapping("/airplane")
    public String onAirplane(AirplaneDTO dto, Model model) {
    	System.out.println("Running onAirplane on post method " + dto);
    	Set<ConstraintViolation<AirplaneDTO>> violations = airplaneService.validateAndSave(dto);
    	if(violations.isEmpty()) {
    	System.out.println("No violations in controller go to success page..");
    	return "Airplane";
    	}
    	model.addAttribute("types", types);
    	model.addAttribute("countries", countries);
    	model.addAttribute("error", violations);
    	model.addAttribute("dto", dto);
    	System.out.println("Violations in controller");
    	return "Airplane";
    }
	
	

}
