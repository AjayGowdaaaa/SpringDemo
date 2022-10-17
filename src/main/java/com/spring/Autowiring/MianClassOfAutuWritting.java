package com.spring.Autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MianClassOfAutuWritting {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Annotation.xml");

		Human human = context.getBean("humanHeart", Human.class);
		human.function();

	}

}
