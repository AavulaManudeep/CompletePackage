/**
 * 
 */
package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.demo.pojoclasses.Student;

/**
 * @author manu
 *
 */
public interface Studentservice {
	
	void save(Student student);
	List<Student> list();

}
