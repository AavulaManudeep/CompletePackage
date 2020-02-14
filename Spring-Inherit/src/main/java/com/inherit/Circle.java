/**
 * 
 */
package com.inherit;

/**
 * @author manu
 *
 */
public class Circle implements Shape
{
	private Point pointA;
	
	public Circle() {
		
	}

	/**
	 * @return the pointA
	 */
	public Point getPointA() {
		return pointA;
	}

	/**
	 * @param pointA the pointA to set
	 */
	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("This is Circle:"+"PointA:X ==> "+ pointA.getX()+ "PointA:X ==> "+ pointA.getY());
		
	}

}
