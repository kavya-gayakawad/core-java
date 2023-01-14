package com.xworkz.movie.bean;

import org.springframework.stereotype.Component;

@Component
public class CameraMan {
  
	private Camera camera ;
	public CameraMan (){
		System.out.println("creating cameraman constructor");
		
	}
	public Camera camera() {
		Camera camera=new Camera() ;
		    return camera;
		    
	}
}
