/**
 * 
 */
package com.demo.service;

import java.util.List;

//import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.demo.dao.StudentDAO;
import com.demo.pojos.Student;

/**
 * @author manu
 *
 */
@Service
public class StudentserviceImp implements Studentservice{
	
	@Autowired
	private StudentDAO studentDAO;
	
	@Transactional
	public void save(Student student) {
		studentDAO.save(student);
		
		
	}
	 @Transactional(readOnly=true)
	public List<Student> list() {
		
		return studentDAO.list();
	}

}
