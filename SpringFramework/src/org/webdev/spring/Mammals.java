package org.webdev.spring;

public class Mammals {
	private Primate gibbons;
	private Primate gorilla;
	private Primate siamangs;
	private Primate bonobos;
	/**
	 * @return the gibbons
	 */
	public Primate getGibbons() {
		return gibbons;
	}
	/**
	 * @param gibbons the gibbons to set
	 */
	public void setGibbons(Primate gibbons) {
		this.gibbons = gibbons;
	}
	/**
	 * @return the gorilla
	 */
	public Primate getGorilla() {
		return gorilla;
	}
	/**
	 * @param gorilla the gorilla to set
	 */
	public void setGorilla(Primate gorilla) {
		this.gorilla = gorilla;
	}
	/**
	 * @return the siamangs
	 */
	public Primate getSiamangs() {
		return siamangs;
	}
	/**
	 * @param siamangs the siamangs to set
	 */
	public void setSiamangs(Primate siamangs) {
		this.siamangs = siamangs;
	}
	/**
	 * @return the bonobos
	 */
	public Primate getBonobos() {
		return bonobos;
	}
	/**
	 * @param bonobos the bonobos to set
	 */
	public void setBonobos(Primate bonobos) {
		this.bonobos = bonobos;
	}
	
	public void display() {
		System.out.println(getGibbons().getApes() + " are lesser apes found in Asia");
		System.out.println(getGorilla().getApes() + " are great apes found in Africa");
		System.out.println(getSiamangs().getApes() + " are lesser apes found in Asia");
		System.out.println(getBonobos().getApes() + " are lesser apes found in Africa");
		
	}
	
}
