/**
 * 
 */
package com.pojos;

import java.util.ArrayList;

import javax.xml.crypto.Data;


/**
 * @author manu
 *
 */
public class StudentRegistartionForm {
	
	private long student_id;
	
	private String student_Name;
	
	private String email_id;
	
	private Data dob;
	
	private ArrayList<String> majors;
	
	private StudentAddress studentaddress;

	/**
	 * 
	 */
	public StudentRegistartionForm() {
		super();
	}

	/**
	 * @param sudent_id
	 * @param student_Name
	 * @param email_id
	 * @param dob
	 * @param majors
	 * @param studentaddress
	 */
	public StudentRegistartionForm(long student_id, String student_Name, String email_id, Data dob,
			ArrayList<String> majors, StudentAddress studentaddress) {
		super();
		this.student_id = student_id;
		this.student_Name = student_Name;
		this.email_id = email_id;
		this.dob = dob;
		this.majors = majors;
		this.studentaddress = studentaddress;
	}

	/**
	 * @return the sudent_id
	 */
	public long getStudent_id() {
		return student_id;
	}

	/**
	 * @param sudent_id the sudent_id to set
	 */
	public void setStudent_id(long sudent_id) {
		this.student_id = sudent_id;
	}

	/**
	 * @return the student_Name
	 */
	public String getStudent_Name() {
		return student_Name;
	}

	/**
	 * @param student_Name the student_Name to set
	 */
	public void setStudent_Name(String student_Name) {
		this.student_Name = student_Name;
	}

	/**
	 * @return the email_id
	 */
	public String getEmail_id() {
		return email_id;
	}

	/**
	 * @param email_id the email_id to set
	 */
	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}

	/**
	 * @return the dob
	 */
	public Data getDob() {
		return dob;
	}

	/**
	 * @param dob the dob to set
	 */
	public void setDob(Data dob) {
		this.dob = dob;
	}

	/**
	 * @return the majors
	 */
	public ArrayList<String> getMajors() {
		return majors;
	}

	/**
	 * @param majors the majors to set
	 */
	public void setMajors(ArrayList<String> majors) {
		this.majors = majors;
	}

	/**
	 * @return the studentaddress
	 */
	public StudentAddress getStudentaddress() {
		return studentaddress;
	}

	/**
	 * @param studentaddress the studentaddress to set
	 */
	public void setStudentaddress(StudentAddress studentaddress) {
		this.studentaddress = studentaddress;
	}
	

}
