package com.xworkz.movie.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sun.tools.javac.api.DiagnosticFormatter.Configuration;
import com.xworkz.movie.bean.Battery;
import com.xworkz.movie.bean.Camera;
import com.xworkz.movie.bean.CameraMan;
import com.xworkz.movie.bean.Director;
import com.xworkz.movie.bean.Experience;
import com.xworkz.movie.bean.Movie;

public class Tester {
	public static void main(String args[]) {
		
		ApplicationContext container =new AnnotationConfigApplicationContext(Configuration.class);
		Battery battery = container.getBean(Battery.class);
		System.out.println(battery.hashCode()+"hashcode of capacity using battery");
		
		Camera refOfCamera = container.getBean(Camera.class);
		System.out.println(refOfCamera.lense2().hashCode()+"hashcode of lense using Camera");
		
		System.out.println(refOfCamera.refOfBattery().hashCode()+"hashcode of Battery using Camera");

		CameraMan cameraMan = container.getBean(CameraMan.class);
		System.out.println(cameraMan.camera().hashCode()+"hashcode of Camera using CameraMan");
		
		Experience refOfExperience = container.getBean(Experience.class);
		System.out.println(refOfExperience.skills().hashCode()+"hashcode of skill using Experience");
		
		
		Director refOfDirector = container.getBean(Director.class);
		System.out.println(refOfDirector.refOfExperience().hashCode()+"hashcode of Experience using Director");
		
		
		Movie refOfMovie = container.getBean(Movie.class);
		System.out.println(refOfMovie.refOfCameraMan().hashCode()+"hashcode of CameraMan using Movie");
		
		System.out.println(refOfMovie.refOfDirector().hashCode()+"hashcode of Director using Movie");

		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
