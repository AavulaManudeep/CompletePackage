/**
 * 
 */
package com.demo.pojos;

/**
 * @author manu
 *
 */
public class Students {

	private long studentid;
	
	private String studentname;
	
	private String studentmessage;

	/**
	 * 
	 */
	public Students() {
		super();
	}

	/**
	 * @param studentid
	 * @param studentname
	 * @param studentmessage
	 */
	public Students(long studentid, String studentname, String studentmessage) {
		super();
		this.studentid = studentid;
		this.studentname = studentname;
		this.studentmessage = studentmessage;
	}

	/**
	 * @return the studentid
	 */
	public long getStudentid() {
		return studentid;
	}

	/**
	 * @param studentid the studentid to set
	 */
	public void setStudentid(long studentid) {
		this.studentid = studentid;
	}

	/**
	 * @return the studentname
	 */
	public String getStudentname() {
		return studentname;
	}

	/**
	 * @param studentname the studentname to set
	 */
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}

	/**
	 * @return the studentmessage
	 */
	public String getStudentmessage() {
		return studentmessage;
	}

	/**
	 * @param studentmessage the studentmessage to set
	 */
	public void setStudentmessage(String studentmessage) {
		this.studentmessage = studentmessage;
	}
	
	
  }
