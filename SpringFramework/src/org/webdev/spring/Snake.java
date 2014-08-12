package org.webdev.spring;

public class Snake {
	private String type;
	private int length;
	private int age;
	
	/*Implementing constructor injection using overloaded constructors
	 * and using index to specify parameters or type to indicate the data type
	 * */
	
	public Snake(String type) {
		this.type = type;
	}

	public Snake(String type, int length) {
		this.type = type;
		this.length = length;
	}
	
	public Snake(String type, int length, int age) {
		this.type = type;
		this.length = length;
		this.age = age;
	}
	
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	public String getType() {
		return type;
	}
	
	
	/**
	 * @return the length
	 */
	public int getLength() {
		return length;
	}
	
	//This setter helps the property tag to set the value of the snake type, and this could be refered to as setter injection.
	/*public void setType(String type) {
		this.type = type;
	}*/

	public void display() {
		System.out.println(getType() + "s are big and poisonous snakes with average length of "
							+ getLength() + "ft, and especially if they're at least " + getAge() + "months of age");
	}

}
