package com.xworkz.movie.bean;

import org.springframework.stereotype.Component;

@Component
public class Movie {
  
	private Director director;
	private CameraMan cameraman;
	
	public Movie() {
		System.out.println("creating movie constructor");
	}
	public Director refOfDirector() {
		Director director = new Director();
		return director;
		
	}
	public CameraMan refOfCameraMan() {
		CameraMan cameraMan = new CameraMan();
		return cameraMan;
		
	}

}
