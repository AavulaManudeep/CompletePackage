/**
 * 
 */
package com.collections;

import java.util.*;
import com.collections.course.*;


/**
 * @author manu
 *
 */
public class Studentinfo {
	private int id;
	private String name;
	private String major;
	private List<CourseInfo> coursework;
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
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
	/**
	 * @return the coursework
	 */
	public List<CourseInfo> getCoursework() {
		return coursework;
	}
	/**
	 * @param coursework the coursework to set
	 */
	public void setCoursework(List<CourseInfo> coursework) {
		this.coursework = coursework;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Studentinfo [id=" + id + ", name=" + name + ", major=" + major +"]";
	}
	/**
	 * @param id
	 * @param name
	 * @param major
	 * @param coursework
	 */
	public Studentinfo(int id, String name, String major, List<CourseInfo> coursework) {
		super();
		this.id = id;
		this.name = name;
		this.major = major;
		this.coursework = coursework;
	}
	
	

}
