package com.spring.constructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentMainClass {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("constructorConfig.xml");
		Student ajay = context.getBean("ajay", Student.class);
		ajay.displayStudent();

		Student anil = context.getBean("anil", Student.class);
		anil.displayStudent();

		Student ashok = context.getBean("ashok", Student.class);
		ashok.displayStudent();

		Student arun = context.getBean("arun", Student.class);
		arun.displayStudent();

	}
}
