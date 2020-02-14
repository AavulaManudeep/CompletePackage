package com.demo.pojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;

@Entity
@Table(name="Students")
public class Student {
	
	@Id
	@GeneratedValue
	@Column(name="st_id")
	private int student_id;
	
	@Column(name="StudentName")
	 @Size(max = 20, min = 3, message = "{student.student_name.invalid}")
	private String student_name;
	
	@Column(name="EmailID")
	@Email(message = "{student.email_id.invalid}")
	private String email_id;

	/**
	 * 
	 */
	public Student() {
		super();
	}

	/**
	 * @param student_id
	 * @param student_name
	 * @param email_id
	 */
	public Student(int student_id, String student_name, String email_id) {
		super();
		this.student_id = student_id;
		this.student_name = student_name;
		this.email_id = email_id;
	}

	/**
	 * @return the student_id
	 */
	public int getStudent_id() {
		return student_id;
	}

	/**
	 * @param student_id the student_id to set
	 */
	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}

	/**
	 * @return the student_name
	 */
	public String getStudent_name() {
		return student_name;
	}

	/**
	 * @param student_name the student_name to set
	 */
	public void setStudent_name(String student_name) {
		this.student_name = student_name;
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

}
