package org.webdev.spring;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

public class Carnivore implements Mammals{
	private MammalAtrr dog;
	private MammalAtrr cat;
	
	
	
	
	
	/**
	 * @return the dog
	 */
	public MammalAtrr getDog() {
		return dog;
	}



	/**
	 * @param dog the dog to set
	 */
	@Resource(name="dog")
	public void setDog(MammalAtrr dog) {
		this.dog = dog;
	}


	/**
	 * @return the cat
	 */
	public MammalAtrr getCat() {
		return cat;
	}


	/**
	 * @param cat the cat to set
	 */
	@Resource(name="cat")
	public void setCat(MammalAtrr cat) {
		this.cat = cat;
	}
	
	@Override
	public void display() {
		System.out.println("Dispaying Carnivores:");
		System.out.println("Depending on the dog type it size might vary from " + getDog().getSize()
							+ "lbs to very big"); 
		System.out.println("Depending on the cat type it size might vary from " + getCat().getSize()
				+ "lbs to very big"); 
		
	}
	
	
	@PostConstruct
	public void initCarnivore() {
		System.out.println("Initialized carnivore");
	}
	
	@PreDestroy
	public void destroyCarnivore() {
		System.out.println("Destroying carnivore");
	}



}
