package model;

import java.io.Serializable;

public class EmployeeBean implements Serializable {
	 private String fname; //First Name
	 private String lname; //Last Name
	 private int startYear; //Start year
	 private double payrate; //Pay per Hour
	/**
	 * 
	 */
	/**
	 * @return the fname
	 */
	public String getFname() {
		return fname;
	}
	/**
	 * @param fname the fname to set
	 */
	public void setFname(String fname) {
		this.fname = fname;
	}
	/**
	 * @return the lname
	 */
	public String getLname() {
		return lname;
	}
	/**
	 * @param lname the lname to set
	 */
	public void setLname(String lname) {
		this.lname = lname;
	}
	/**
	 * @return the startYear
	 */
	public int getStartYear() {
		return startYear;
	}
	/**
	 * @param startYear the startYear to set
	 */
	public void setStartYear(int startYear) {
		this.startYear = startYear;
	}
	/**
	 * @return the payrate
	 */
	public double getPayrate() {
		return payrate;
	}
	/**
	 * @param payrate the payrate to set
	 */
	public void setPayrate(double payrate) {
		this.payrate = payrate;
	}
	/**
	 * @param fname
	 * @param lname
	 * @param startYear
	 * @param payrate
	 */
	public EmployeeBean(String fname, String lname, int startYear, double payrate) {
		this.fname = fname;
		this.lname = lname;
		this.startYear = startYear;
		this.payrate = payrate;
	}
	/**
	 * 
	 */
	public EmployeeBean() {
	}
	
}
