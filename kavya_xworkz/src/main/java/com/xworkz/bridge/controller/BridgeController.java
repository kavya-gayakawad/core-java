package com.xworkz.bridge.controller;

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


import com.xworkz.bridge.dto.BridgeDTO;
import com.xworkz.bridge.service.BridgeService;

@Controller
@RequestMapping("/")
public class BridgeController {
	
	@Autowired
	private BridgeService bridgeService;
	
	private List<String> types = Arrays.asList("Suspension bridge", "Arch bridge", "Beam Bridge", "Truss bridge", "Cantilever bridge", "Girder bridge", "Tied-arch bridge");
	private List<String> locations= Arrays.asList("Pamban bridge", "Mahatma Gandhi setu", "Howrah bridge", "Jawahar setu", "Godavari arch bridge", "Digha bridge", "Nehru setu");
	
	public BridgeController() {
    System.out.println("created " + this.getClass().getSimpleName());
	}
	
	@GetMapping("/bridge")
	public String onBridge(Model model) {
	System.out.println("Running onBridge on get method");
	model.addAttribute("types", types);
	model.addAttribute("locations", locations);
	return "Bridge";
	}
	
	@GetMapping("/bridgeSearch")
	public String onSearch(@RequestParam int id, Model model) {
	System.out.println("Running onSearch in get method " + id);
	BridgeDTO dto=this.bridgeService.findById(id);
	if(dto!=null) {
	model.addAttribute("dto", dto);
	}
	else {
	model.addAttribute("message", "data not found");
	}
	return "BridgeSearch";
	}
	
	@PostMapping("/bridge")
	public String onBridge(BridgeDTO dto, Model model) {
		System.out.println("Running onBridge on post method " + dto);
	   	Set<ConstraintViolation< BridgeDTO>> violations = bridgeService.validateAndSave(dto);
	    if(violations.isEmpty()) {
		System.out.println("No violations in controller go to success page..");
		return "Bridge";
		}
		
		model.addAttribute("types", types);
		model.addAttribute("locations", locations);
		model.addAttribute("error", violations);
		model.addAttribute("dto", dto);
		System.out.println("Violations in controller");
		return "Bridge";
	}
	@GetMapping("/searchbyname")
	public String onSearchByName(@RequestParam String name, Model model) {
		
		System.out.println("running onSearchByName controller " +name);
		List<BridgeDTO> list=this.bridgeService.findByName(name);
		model.addAttribute("list", list);
		
		return "NameSearch";
	}
	
	
	
	

}
