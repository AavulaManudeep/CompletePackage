/**
 * 
 */
package com.demo.service;

import java.util.List;

import com.demo.pojos.Student;

/**
 * @author manu
 *
 */
public interface Studentservice {
	
	void save(Student student);
	List<Student> list();

}
