package com.spring.SetterInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.constructorInjection.Student;

public class EmployeeMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("setterConfig.xml");
		Employee ajay = context.getBean("ajay", Employee.class);
		System.out.println(ajay);

		Employee vijay = context.getBean("vijay", Employee.class);
		System.out.println(vijay);

		Employee ramesh = context.getBean("ramesh", Employee.class);
		System.out.println(ramesh);

	}

}
