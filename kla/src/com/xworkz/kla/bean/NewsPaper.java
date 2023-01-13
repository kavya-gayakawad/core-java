package com.xworkz.kla.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class NewsPaper {
	
	@Autowired
	@Qualifier("paperId")
	private int id;
	@Autowired
	@Qualifier("paperLanguage")
	private String language;
	private String name;
	private String ownerName;
	private int price;
	
	@Autowired
	public NewsPaper(@Qualifier("paperName")String name, @Qualifier("paperOwnerName")String ownerName) {
		super();
		this.name = name;
		this.ownerName = ownerName;
	}


	@Override
	public String toString() {
		return "NewsPaper [id=" + id + ", language=" + language + ", name=" + name + ", ownerName=" + ownerName
				+ ", price=" + price + "]";
	}

	@Autowired
	@Qualifier("paperPrice")
	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
	

}
