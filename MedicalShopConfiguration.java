package com.xworkz.lak.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.lak")
public class MedicalShopConfiguration {
	
	public MedicalShopConfiguration() {
		
	}	
		@Bean 
		public String shopName() {
			return "Priya";
	}
		@Bean
		public int price() {
			return 45;
			
	}
		@Bean
		public char gender() {
			return 'M';
	}
		@Bean double gst() {
			return 50.0;
	}
	    @Bean float dosage() {
	    	return 4.5f;
    }
	   @Bean short workers() {
		   return 3;
    }
	   
	  @Bean long mobileNo() {
		  return 7337665943l;
		  
   }
	  @Bean byte noOfShop() {
		  return 1;
  }
	  @Bean boolean expireDate() {
		  return true;
	  }
		
		

}
