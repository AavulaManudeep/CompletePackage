/**
 * 
 */
package com.demo.pets;

import com.demo.animals.WildAnimals;
import com.demo.inter.Animals;

/**
 * @author manu
 *
 */
public class Dog extends WildAnimals{

	/**
	 * 
	 */
	public Dog() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param name
	 * @param legs
	 * @param sound
	 */
	public Dog(String name, int legs, String sound) {
		super(name, legs, sound);
		// TODO Auto-generated constructor stub
	}

	public int getLegs()
	{
		return super.legs;
	}

}
