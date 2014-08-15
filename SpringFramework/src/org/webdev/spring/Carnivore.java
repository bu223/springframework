package org.webdev.spring;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;

@Component
public class Carnivore implements Mammals, ApplicationEventPublisherAware{
	private MammalAtrr dog;
	private MammalAtrr cat;
	
	private ApplicationEventPublisher publisher;
	
	
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
		DisplayEvent displayEvent = new DisplayEvent(this);
		publisher.publishEvent(displayEvent);
	
	}
	
	
	@PostConstruct
	public void initCarnivore() {
		System.out.println("Initialized carnivore");
	}
	
	@PreDestroy
	public void destroyCarnivore() {
		System.out.println("Destroying carnivore");
	}

	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
		this.publisher = publisher;
		
	}



}
