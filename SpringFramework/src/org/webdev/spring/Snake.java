package org.webdev.spring;

public class Snake {
	private String type;
	
	public String getType() {
		return type;
	}
	
	
	//This setter helps the property tag to set the value of the snake type, and this could be refered to as setter injection.
	public void setType(String type) {
		this.type = type;
	}

	public void display() {
		System.out.println(getType() + "s are big and poisonous snakes!");
	}

}
