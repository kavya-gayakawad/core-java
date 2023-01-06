package xworkz.com.stream;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.sun.jdi.Type;

import xworkz.com.stream.str.WeaponDTO;

public class WeaponDTORunner {
	public static void main(String args[]) {
		
	
		WeaponDTO dto=new  WeaponDTO("A1-47","rings of lord","Metal",170000,Type.AK47);
		WeaponDTO dto1=new  WeaponDTO("Tanker","longer world","alluminum",10000,Type.M413);
		WeaponDTO dto2=new  WeaponDTO("Rocket Launcer","Wrold war","Platinum",936000,Type.MA48);
		WeaponDTO dto3=new  WeaponDTO("F16-weapon","lord of rings","Gold",350000,Type.AK47);
		WeaponDTO dto4=new  WeaponDTO("Panzer","Netflix","Tagad",1021,Type.M416);
		WeaponDTO dto5=new  WeaponDTO("Machine guns","Arcadia Machine & Tool","Metal",910000,Type.AK56);
		WeaponDTO dto6=new  WeaponDTO("Submachine guns","FN Herstal","alluminum",911000,Type.M418);
		WeaponDTO dto7=new  WeaponDTO("Rifles","BUL Armory","Platinum",415000,Type.MA47);
		WeaponDTO dto8=new  WeaponDTO("Airgun","Zastava Arms","Gold",5160000,Type.AK41);
		WeaponDTO dto9=new  WeaponDTO("Rivolver","Intratec","Tagad",7161,Type.M416);
		WeaponDTO dto10=new  WeaponDTO("Shotgun","Intratec","Metal",610000,Type.AK47);
		WeaponDTO dto11=new  WeaponDTO("ArmaLite rifle","Steyr Arms","alluminum",4856000,Type.M415);
		WeaponDTO dto12=new  WeaponDTO("MG42","Wrold war","Platinum",243000,Type.MA47);
		WeaponDTO dto13=new  WeaponDTO("Luger pistol","Kimber","Gold",770000,Type.AK48);
		WeaponDTO dto14=new  WeaponDTO("Musket","JA Industries","Tagad",180000,Type.M416);
		WeaponDTO dto15=new  WeaponDTO("Akdal Ghost TR01","Hi-Point Firearms","Metal",310000,Type.AK49);
		WeaponDTO dto16=new  WeaponDTO("AMT AutoMag IV","Kahr Arms","alluminum",90000,Type.M412);
		WeaponDTO dto17=new  WeaponDTO("Astra 400","Mauser","Platinum",230000,Type.MA47);
		WeaponDTO dto18=new  WeaponDTO("Beretta 70","lord of rings","Gold",220000,Type.AK44);
		WeaponDTO dto19=new  WeaponDTO("Deer gun","Netflix","Tagad",450000,Type.M419);
		
		Collection<WeaponDTO> dtos = Stream.of(dto,dto1,dto2,dto3,dto4,dto,dto1,dto2,dto3,dto4,dto5,dto6,dto7,dto8,dto9,dto10,dto11,dto12,dto13,dto14,dto15,dto16,dto17,dto18,dto19).collect(Collectors.toSet());
		
		System.out.println("===Checking the Ascending order===");
		
		dtos.stream().sorted((a1,a2)->a1.getName().compareTo(a2.getName())).forEach(e->System.out.println(e));
		
		
		 System.out.println(System.lineSeparator());
		 System.out.println("====weapons madeOn and madeBy====");
	    dtos.stream().forEach(e->System.out.println("Made By"+e.getMadeBy()+" "+"Made on"+e.getMadeOn()));
		
	    
	    System.out.println(System.lineSeparator());
	    System.out.println("====weapons by name sorted in descending====");
		dtos.stream().sorted((a1,a2)->a2.getName().compareTo(a1.getName())).forEach(e->System.out.println(e.getName()));
		
		
	    System.out.println(System.lineSeparator());
	    System.out.println("====weapons by price greater then====");
		dtos.stream().sorted((a1,a2)->a1.getMadeBy().compareTo(a2.getMadeBy())).forEach(e->System.out.println(e.getMadeBy()));
		
		
	    System.out.println(System.lineSeparator());
	    System.out.println("===sortedBy madeOn=====");
		dtos.stream().sorted((a1,a2)->a1.getMadeOn().compareTo(a2.getMadeOn())).forEach(e->System.out.println(e.getMadeOn()));
		
		
	    System.out.println(System.lineSeparator());
	    System.out.println("====price ascending======");
	    dtos.stream().sorted((a1,a2)->Double.compare(a1.getPrice(),a2.getPrice())).forEach(e->System.out.println(e.getPrice()));
	    
	    
	    System.out.println(System.lineSeparator());
	    System.out.println("====price descending =====");
	    dtos.stream().sorted((a1,a2)->Double.compare(a2.getPrice(),a1.getPrice())).forEach(e->System.out.println(e.getPrice()));
	   
	    
	    System.out.println(System.lineSeparator());
	    System.out.println("===sortedBy madeOn=====");
		dtos.stream().sorted((a1,a2)->a1.getMadeOn().compareTo(a2.getMadeOn())).forEach(e->System.out.println(e.getMadeOn()));
		
		
	    System.out.println(System.lineSeparator());
	    System.out.println("====price ascending======");
	    dtos.stream().sorted((a1,a2)->Double.compare(a1.getPrice(),a2.getPrice())).forEach(e->System.out.println(e.getPrice()));
	    
	    
	    System.out.println(System.lineSeparator());
	    System.out.println("====price descending =====");
	    dtos.stream().sorted((a1,a2)->Double.compare(a2.getPrice(),a1.getPrice())).forEach(e->System.out.println(e.getPrice()));
	   
	    
	    System.out.println(System.lineSeparator());
	    System.out.println("====sort by madeOn and name asc order=====");
		dtos.stream().sorted((a1,a2)->a1.getName().compareTo(a2.getName())).forEach(e->System.out.println(e.getName()));
		dtos.stream().sorted((a1,a2)->a1.getMadeOn().compareTo(a2.getMadeOn())).forEach(e->System.out.println(e.getMadeOn()));
		
		
		
	    System.out.println(System.lineSeparator());
	    System.out.println("=====sort by type and madeby, name desc order ========");
		dtos.stream().sorted((a1,a2)->((Comparable<String>) a2.getType()).compareTo(a1.getType())).forEach(e->System.out.println(e.getType()));
		dtos.stream().sorted((a1,a2)->a2.getMadeBy().compareTo(a2.getMadeBy())).forEach(e->System.out.println(e.getMadeBy()));
			

	
	}

}
