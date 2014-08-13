package org.webdev.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Animal {
	//Application context can be used instead of bean factory, since it has more functionality anyway.
	static ApplicationContext context; 
	
	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext("spring.xml");
		Mammals mammals = (Mammals) context.getBean("mammal");
		mammals.display();
		

	}

}