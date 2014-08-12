package org.webdev.spring;

public class Snake {
	private String type;
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void display() {
		System.out.println(getType() + "s is a big fat snake!");
	}

}
