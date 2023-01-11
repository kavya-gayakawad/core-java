package com.xworkz.spring12.configuration;

import org.springframework.stereotype.Component;

@Component
public class Actor {
	
        private String name;
		private String language;
		private Integer age;
	
		public Actor(String name, String language, int age) {
			super();
			this.name = name;
			this.language = language;
			this.age = age;
	}
		public String getName() {
			return name;
		}
		
		public String getLanguage() {
			return language;
		}
	
		public Integer getAge() {
			return age;
		}
	

}
