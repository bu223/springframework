package org.webdev.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Reptile {

	static ApplicationContext context; 
	
	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext("spring.xml");
		Snake snake = (Snake) context.getBean("snake");
		snake.display();
		

	}

}
