package com.xworkz.movie.bean;

import org.springframework.stereotype.Component;

@Component
public class Camera {

	private Battery battery;
	private Lense lense ;
	
	public Camera() {
		System.out.println("creating camera constructor");
		
	}
	public Lense lense2()
	{
		Lense lense =new Lense ();
		return lense;
	}
	public Battery refOfBattery() {
		Battery battery=new Battery();
		  return battery;
		  
	}
	}

