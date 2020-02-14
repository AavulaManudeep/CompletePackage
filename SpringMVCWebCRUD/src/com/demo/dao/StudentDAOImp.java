/**
 * 
 */
package com.demo.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.demo.pojoclasses.Student;

/**
 * @author manu
 *
 */
@Repository
public class StudentDAOImp implements StudentDAO{
	
	@Autowired
	private SessionFactory sessionFactory;
	
	
	

	@Override
	public void save(Student student) {
		System.out.println("here");
		try {
		sessionFactory.getCurrentSession().save(student);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public List<Student> list() {
	
		TypedQuery<Student> query = sessionFactory.getCurrentSession().createQuery("from StudentMVC");
		return query.getResultList();
	}

}
