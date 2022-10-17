package com.spring.Autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Body {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("AutoWiring.xml");
		
		Human man =	context.getBean("man", Human.class);
		man.function();
		
		Human woman =	context.getBean("woman", Human.class);
		woman.function();
		
		Human man1 =	context.getBean("man1", Human.class);
		man1.function();
		
	}

}
