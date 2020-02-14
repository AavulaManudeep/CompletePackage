/**
 * 
 */
package com.demo.animals;

import com.demo.inter.Animals;

/**
 * @author manu
 *
 */
public class WildAnimals implements Animals{

	/**
	 * 
	 */
	private String name;
	protected int legs;
	private String sound;
	
	/**
	 * @param name
	 * @param legs
	 * @param sound
	 */
	public WildAnimals(String name, int legs, String sound) {
		super();
		this.name = name;
		this.legs = legs;
		this.sound = sound;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the legs
	 */
	public int getLegs() {
		return legs;
	}

	/**
	 * @param legs the legs to set
	 */
	public void setLegs(int legs) {
		this.legs = legs;
	}

	/**
	 * @return the sound
	 */
	public String getSound() {
		return sound;
	}

	/**
	 * @param sound the sound to set
	 */
	public void setSound(String sound) {
		this.sound = sound;
	}

	public WildAnimals() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String sound() {
		// TODO Auto-generated method stub
		return sound;
	}

}
