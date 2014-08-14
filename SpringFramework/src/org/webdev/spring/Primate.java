package org.webdev.spring;

public class Primate implements Mammals {
	private MammalAtrr gorilla;
	private MammalAtrr gibbons;
	
	
	/**
	 * @return the gorilla
	 */
	public MammalAtrr getGorilla() {
		return gorilla;
	}


	/**
	 * @param gorilla the gorilla to set
	 */
	public void setGorilla(MammalAtrr gorilla) {
		this.gorilla = gorilla;
	}


	/**
	 * @return the gibbons
	 */
	public MammalAtrr getGibbons() {
		return gibbons;
	}


	/**
	 * @param gibbons the gibbons to set
	 */
	public void setGibbons(MammalAtrr gibbons) {
		this.gibbons = gibbons;
	}


	@Override
	public void display() {
		System.out.println("Dispaying Primates:");
		System.out.println("Gorillas are the largest of all primates with size of " + getGorilla().getSize()
							+ "lbs with a distictive shape whereby the stomach is larger than their chest area"); 
		System.out.println("Male gibbons are slightly larger than females with size of " + getGibbons().getSize()
							+ "lbs"); 
		
	}
	
}

