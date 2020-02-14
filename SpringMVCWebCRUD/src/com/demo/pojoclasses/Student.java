/**
 * 
 */
package com.demo.pojoclasses;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

/**
 * @author manu
 *
 */
@Entity
@Table(name="StudentMVC")
public class Student implements Serializable{
	
	@Id
	private long student_id;
	
	@Column
	@Size(max = 20, min = 3, message = "{Student.student_Name.invalid}")
	private String student_Name;
	
	@Column
	@Size(max = 20, min = 3, message = "{Student.email_id.invalid}")
	private String email_id;
	
	@Column
	private Date dateofbirth;
	
	@Column
	private String major;

	/**
	 * 
	 */
	public Student() {
		super();
	}

	/**
	 * @param student_id
	 * @param student_Name
	 * @param email_id
	 * @param dateofbirth
	 * @param major
	 */
	public Student(long student_id, String student_Name, String email_id, Date dateofbirth, String major) {
		super();
		this.student_id = student_id;
		this.student_Name = student_Name;
		this.email_id = email_id;
		this.dateofbirth = dateofbirth;
		this.major = major;
	}

	/**
	 * @return the student_id
	 */
	public long getStudent_id() {
		return student_id;
	}

	/**
	 * @param student_id the student_id to set
	 */
	public void setStudent_id(long student_id) {
		this.student_id = student_id;
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
	 * @return the dateofbirth
	 */
	public Date getDateofbirth() {
		return dateofbirth;
	}

	/**
	 * @param dateofbirth the dateofbirth to set
	 */
	public void setDateofbirth(Date dateofbirth) {
		this.dateofbirth = dateofbirth;
	}

	/**
	 * @return the major
	 */
	public String getMajor() {
		return major;
	}

	/**
	 * @param major the major to set
	 */
	public void setMajor(String major) {
		this.major = major;
	}
	

}
