package com.xworkz.kavya.controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.kavya.dto.BeverageDTO;
import com.xworkz.kavya.dto.ChatDTO;
import com.xworkz.kavya.dto.EducationDTO;
import com.xworkz.kavya.dto.FamilyDTO;
import com.xworkz.kavya.dto.MobileDTO;

@Component
@RequestMapping("/")
public class DisplayController {
	

@GetMapping("/takeEmail")
public String getEmail(Model model) {
	System.out.println("Running in email");
	model.addAttribute("email", "kavyagayakawad@gmail.com");
	return "index.jsp";
}

@GetMapping("/takeMobile")
public String getMobile(Model model) {
	System.out.println("Running in Mobile");
	model.addAttribute("mobile", "8217098567");
	return "index.jsp";
}

@GetMapping("/takeAdhar")
public String getAdhar(Model model) {
	System.out.println("Running in Adhar");
	model.addAttribute("adhar", "657843569834");
	return "index.jsp";
}

@GetMapping("/takeAge")
public String getAge(Model model) {
	System.out.println("Running in Age");
	model.addAttribute("age", "23");
	return "index.jsp";
}

@GetMapping("/takeDob")
public String getDOB(Model model) {
	System.out.println("Running in dateofbirth");
	model.addAttribute("birth", LocalDate.of(2000,11,17).atTime(7,30,59));
	return "index.jsp";
}

@GetMapping("/takeDS")
public String getDesiredSallery(Model model) {
	System.out.println("Running in DesiredSalary");
	model.addAttribute("salary", "4.5LPA");
	return "index.jsp";
}

@GetMapping("/takeBestFriendsList")
public String getBFL(Model model) {
	System.out.println("Running in BestFriendsList");
	List<String> ref = new ArrayList<String>();
	ref.add("Laxmi");
	ref.add("Akshata");
	ref.add("Nishma");
	ref.add("Brunda");
	ref.add("Priya");
	model.addAttribute("bfl", ref);
	return "index.jsp";
}

@GetMapping("/takeMVP")
public String getMVP(Model model) {
	System.out.println("Running in mostvisited place");
	List<String> ref = new ArrayList<String>();
	ref.add("Mysuru");
	ref.add("Horanadu");
	ref.add("Hampi");
	ref.add("Bagalkot");
	ref.add("Iskcon Temple");
	model.addAttribute("mvp", ref);
	return "index.jsp";
}

@GetMapping("/takeSkillSet")
public String getSkillSet(Model model) {
	System.out.println("Running in skill set");
	List<String> ref = new ArrayList<String>();
	ref.add("SQL");
	ref.add("Java");
	ref.add("HTML");
	ref.add("CSS ");
	ref.add("SPRING BOOT");
	model.addAttribute("skills", ref);
	return "index.jsp";
}

@GetMapping("/takeEdto")
public String getEducation(Model model) {
	System.out.println("Running in EDucationdto");
	EducationDTO dto = new EducationDTO();
	dto.setSchoolName("B.V.V.S Girls Highschool Bagalkot");
	dto.setDistrict("Bagalkot");
	dto.setHmName("Kiran");
	dto.setNoOfBusses("7");
	dto.setNoOfClasses("15");
	dto.setNoOfStudents("700");
	dto.setNoOfTeachers("30");
	dto.setPlace("Bagalkot");
	dto.setState("Karnataka");
	dto.setTaluk("Bagalkot");
	model.addAttribute("edto", dto);
	return "index.jsp";
}

@GetMapping("/takeFamily")
public String getFamily(Model model) {
	System.out.println("Running in familydto");
	FamilyDTO dto = new FamilyDTO();
	dto.setFamilyLives("Bagalkot");
	dto.setName("Kavya");
	dto.setFamilyName("Gayakawad");
	dto.setFatherName("Krishna");
	dto.setMotherName("Renuka");
	dto.setTotalMembers(5);
	dto.setColonyName("Sapthgiri");
	dto.setState("Karnataka");
	dto.setIndian(true);
	dto.setSiblings(2);

	model.addAttribute("fdto", dto);
	return "index.jsp";
}

@GetMapping("/takeMobileInfo")
public String getMobileInfo(Model model) {
	
	System.out.println("Running in mobileDto");
	MobileDTO dto = new MobileDTO();
	dto.setCamera(64D);
	dto.setModel("Vivo v11");
	dto.setNumber(7899728928L);
	dto.setPrice(17000D);
	dto.setStorage(128D);
	model.addAttribute("mdto", dto);
	return "index.jsp";
}
@GetMapping("/takeBeverage")
public String getBeverage(Model model) {
	System.out.println("running in beverage ");
	BeverageDTO dto=new BeverageDTO();
	dto.setJuice1("Grapes");
	dto.setJuice2("Mango");
	dto.setJuice3("Water melon");
	dto.setJuice4("Sapota");
	dto.setJuice5("Pomogranate");
	dto.setJuice6("Banana");
	dto.setJuice7("Dragon fruit");
	dto.setJuice8("Orange");
	model.addAttribute("bdto",dto);
	return "index.jsp";
}
@GetMapping("/takeChata")
public String getChat(Model model) {
	System.out.println("running in chat");
	ChatDTO dto=new ChatDTO();
	dto.setChat1("Samosa");
	dto.setChat2("Masalapuri");
	dto.setChat3("Dhai puri");
	dto.setChat4("Panipuri");
	dto.setChat5("Masala puri");
	dto.setChat6("Kachori");
	dto.setChat7("Bajji");
	dto.setChat8("Pava bhaji");
	dto.setChat9("Save puri");
	dto.setChat10("Gobi Manchuri");
	dto.setChat11("Pakoda");
	model.addAttribute("cdto",dto);
	return "index.jsp";
}
}