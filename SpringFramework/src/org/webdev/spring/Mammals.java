package org.webdev.spring;

import java.util.List;

public class Mammals {
	private List<Primate> primates;
	
	
	
	/**
	 * @return the primates
	 */
	public List<Primate> getPrimates() {
		return primates;
	}


	/**
	 * @param primates the primates to set
	 */
	public void setPrimates(List<Primate> primates) {
		this.primates = primates;
	}



	public void display() {
		for (Primate primate : primates) {
			System.out.println(primate.getApes() + " are all examples of apes.");
		}
		
	}
	
}
