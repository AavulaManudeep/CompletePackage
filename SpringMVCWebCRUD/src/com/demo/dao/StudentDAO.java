/**
 * 
 */
package com.demo.dao;

import java.util.List;

import com.demo.pojoclasses.Student;

/**
 * @author manu
 *
 */
public interface StudentDAO {
	void save(Student student);
	List<Student> list();

}
