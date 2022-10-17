package com.spring.Autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {
	private Heart heart;
	

	public Human() {
		
	}

	
	public Human(Heart heart) {
		super();
		this.heart = heart;
		System.out.println(" Construcor of Human class called");
	}
	 
	 @Autowired 
	 @Qualifier("humanHeart")
	public void setHeart(Heart heart) {
		this.heart = heart;
		System.out.println("Setter Method of Heart Called");
	}

	public void function() {
		heart.pump();
		System.out.println("Name of the animal -->   "+ heart.getNameOfAnimal());
		System.out.println("Number of the heart -->  "+ heart.getNoOfHeart());
	}

}
