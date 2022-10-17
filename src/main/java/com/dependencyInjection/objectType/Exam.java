package com.dependencyInjection.objectType;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext(" ObjectType.xml");
		System.out.println("Bean xml loaded");
		Student std1 = context.getBean("std1", Student.class);
		std1.cheating();
		
		
	}

}
 