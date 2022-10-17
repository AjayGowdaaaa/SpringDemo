package com.spring.constructorInjection;

public class Student {

	private int id;
	private String name;

	//Constructor
	public Student(int id, String name) {
		super();
		System.out.println("Constructor Call to initialize Name and Id");
		this.id = id;
		this.name = name;
	}
	
	//Constructor OverLoading for Name
	public Student(String name) {
		super();
		System.out.println("Constructor Call to initializeonly  Name ");
		this.name = name;	
	}
	
	//Constructor OverLoading for ID
	public Student(int id) {
		super();
		System.out.println("Constructor Call to initialize only Id");
		this.id = id;	
	}
	
	//To Display Student Details
	void displayStudent() {
		System.out.println("Student Id  = " + id + "	Student name = "+name);
	}

	
}
