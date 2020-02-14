/**
 * 
 */
package com.inherit;

/**
 * @author manu
 *
 */
public class Triangle implements Shape{
	private Point pointA;
	private Point pointB;
	private Point pointC;
	
	public Triangle() {
		
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Triangle [pointA=" + pointA + ", pointB=" + pointB + ", pointC=" + pointC + "]";
	}
	/**
	 * @param pointA
	 * @param pointB
	 * @param pointC
	 */
	public Triangle(Point pointA, Point pointB, Point pointC) {
		super();
		this.pointA = pointA;
		this.pointB = pointB;
		this.pointC = pointC;
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
	/**
	 * @return the pointB
	 */
	public Point getPointB() {
		return pointB;
	}
	/**
	 * @param pointB the pointB to set
	 */
	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}
	/**
	 * @return the pointC
	 */
	public Point getPointC() {
		return pointC;
	}
	/**
	 * @param pointC the pointC to set
	 */
	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}
	//private Point pointC;
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("This is Triangle:"+"PointA:X ==> "+ pointA.getX()+ "PointA:X ==> "+ pointA.getY());
		System.out.println("This is Triangle:"+"PointB:X ==> "+ pointB.getX()+ "PointB:X ==> "+ pointB.getY());
		System.out.println("This is Triangle:"+"PointC:X ==> "+ pointC.getX()+ "PointC:X ==> "+ pointC.getY());
		
	}

}
