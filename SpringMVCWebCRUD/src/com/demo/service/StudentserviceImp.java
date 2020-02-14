/**
 * 
 */
package com.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.StudentDAO;
import com.demo.pojoclasses.Student;

/**
 * @author manu
 *
 */
@Service
public class StudentserviceImp implements Studentservice{

	@Autowired
	private StudentDAO studentdao;
	@org.springframework.transaction.annotation.Transactional
	public void save(Student student) {
		// TODO Auto-generated method stub
		
		
	}

	@org.springframework.transaction.annotation.Transactional(readOnly=true)
	public List<Student> list() {
		// TODO Auto-generated method stub
		return studentdao.list();
	}

}
