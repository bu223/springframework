package org.webdev.spring;

import org.springframework.context.ApplicationEvent;

public class DisplayEvent extends ApplicationEvent {

	public DisplayEvent(Object source) {
		super(source);
		// TODO Auto-generated constructor stub
	}
	
	public String toString() {
		return "Display event happened";
	}

}
