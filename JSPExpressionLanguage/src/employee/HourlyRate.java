package employee;

import java.io.Serializable;

//import org.omg.CORBA.PRIVATE_MEMBER;

public class HourlyRate implements Serializable {
	 private String fname; //First Name
	 private String lname; //Last Name
	 private int employeeId; //Start year
	 private double hourlyrate; //Pay per Hour
	 private int hoursWorked;
	 private String email_Id;
	/**
	 * @return the fname
	 */
	/**
	 * @param fname
	 * @param lname
	 * @param employeeId
	 * @param hourlyRate
	 * @param hoursWorked
	 * @param email_Id
	 */
	public HourlyRate(String fname, String lname, int employeeId, double hourlyRate, int hoursWorked, String email_Id) {
		this.fname = fname;
		this.lname = lname;
		this.employeeId = employeeId;
		this.hourlyrate = hourlyRate;
		this.hoursWorked = hoursWorked;
		this.email_Id = email_Id;
	}
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
	 * @return the employeeId
	 */
	public int getEmployeeId() {
		return employeeId;
	}
	/**
	 * @param employeeId the employeeId to set
	 */
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	/**
	 * @return the hourlyrate
	 */
	public double getHourlyrate() {
		return hourlyrate;
	}
	/**
	 * @param hourlyrate the hourlyrate to set
	 */
	public void setHourlyrate(double hourlyrate) {
		this.hourlyrate = hourlyrate;
	}
	/**
	 * @return the hoursWorked
	 */
	public int getHoursWorked() {
		return hoursWorked;
	}
	/**
	 * @param hoursWorked the hoursWorked to set
	 */
	public void setHoursWorked(int hoursWorked) {
		this.hoursWorked = hoursWorked;
	}
	/**
	 * @return the email_Id
	 */
	public String getEmail_Id() {
		return email_Id;
	}
	/**
	 * @param email_Id the email_Id to set
	 */
	public void setEmail_Id(String email_Id) {
		this.email_Id = email_Id;
	}
	
	
}