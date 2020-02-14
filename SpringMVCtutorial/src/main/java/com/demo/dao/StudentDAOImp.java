/**
 * 
 */
package com.demo.dao;



import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.demo.pojos.Student;

/**
 * @author manu
 *
 */
@Repository
public class StudentDAOImp implements StudentDAO{
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public void save(Student student) {
		
		sessionFactory.getCurrentSession().save(student);
	}

	public List<Student> list() {
		@SuppressWarnings("unchecked")
		TypedQuery<Student> query = sessionFactory.getCurrentSession().createQuery("from Student");
		return query.getResultList();
	}
	
	

}
