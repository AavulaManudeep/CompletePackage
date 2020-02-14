/**
 * 
 */
package com.accountdetails;

/**
 * @author manu
 *
 */
public class Loans {
	
	private long mortgage=0;
	private long personal=0;
	private long car=0;
	private long student=0;
	/**
	 * @return the mortgage
	 */
	public long getMortgage() {
		return mortgage;
	}
	/**
	 * @param mortgage the mortgage to set
	 */
	public void setMortgage(long mortgage) {
		this.mortgage = mortgage;
	}
	/**
	 * @return the personal
	 */
	public long getPersonal() {
		return personal;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Loans [mortgage=" + mortgage + ", personal=" + personal + ", car=" + car + ", student=" + student + "]";
	}
	/**
	 * 
	 */
	public Loans() {
		super();
	}
	/**
	 * @param mortgage
	 * @param personal
	 * @param car
	 * @param student
	 */
	public Loans(long mortgage, long personal, long car, long student) {
		super();
		this.mortgage = mortgage;
		this.personal = personal;
		this.car = car;
		this.student = student;
	}
	/**
	 * @param personal the personal to set
	 */
	public void setPersonal(long personal) {
		this.personal = personal;
	}
	/**
	 * @return the car
	 */
	public long getCar() {
		return car;
	}
	/**
	 * @param car the car to set
	 */
	public void setCar(long car) {
		this.car = car;
	}
	/**
	 * @return the student
	 */
	public long getStudent() {
		return student;
	}
	/**
	 * @param student the student to set
	 */
	public void setStudent(long student) {
		this.student = student;
	}
	
}
  