/**
 * 
 */
package com.demo.jdbc;

import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.demo.hibernate.entity.Student;

import antlr.collections.List;

/**
 * @author manu
 *
 */
public class TestJdbc {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		
//		String url = "jdbc:mysql://localhost:3306/testdb?useSSL=false";
//		String user = "manu";
//		String pass = "nikonD3200";
//		try {
//			System.out.println("Connection Database :"+ url);
//			Connection myConnection= DriverManager.getConnection(url,user,pass);
//			System.out.println("Connection Sucessfull");
//			
//		} catch (Exception e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		}

		//Create Session Factory
		
		SessionFactory factory = new Configuration()
				                .configure("hibernate.cfg.xml")
				                .addAnnotatedClass(Student.class)
				                .buildSessionFactory();
		
		//Create Session
		 
		Session session = factory.getCurrentSession();
		org.hibernate.Transaction transaction =null;
		
		try {
			
			//use the session object to Save the Java Object
			
			 
			//Create Student Object 
			/*
			 * System.out.println("Creating the new student Object......"); Student
			 * tempStudent = new Student("Paul","Wall","paul@gmail.com"); Student
			 * tempStudent1 = new Student("Mary","Public","mary@gmail.com"); Student
			 * tempStudent2 = new Student("Bonita","Applebum","bonia@gmail.com"); //Start
			 * the Transaction
			 */				 
				 session.beginTransaction();
				
				//Save the Student Object
				 java.util.List <Student>theStudent = session.createQuery("from Student").list();
				 displayStudents(theStudent);
			/*
			 * session.save(tempStudent); 
			 * session.save(tempStudent1);
			 * session.save(tempStudent2);
			 */
				 
				 
				 //Query Student 
				 
				 
				 System.out.println("Save the new student Object......");
				//Commit the Transaction
				 transaction=session.getTransaction();
				 transaction.commit();
				 
			/*
			 * System.out.println("Saved Student. Generated id:"+tempStudent.getId());
			 * System.out.println("Saved Student. Generated id:"+tempStudent1.getId());
			 * System.out.println("Saved Student. Generated id:"+tempStudent2.getId());
			 */
				 //Get a new Session for Starting a Session
			/*
			 * session=factory.getCurrentSession(); session.beginTransaction(); //Retriving
			 * Student Details System.out.println("\nGetting Student Details:"+
			 * tempStudent.getId()); System.out.println("\nGetting Student Details:"+
			 * tempStudent1.getId()); System.out.println("\nGetting Student Details:"+
			 * tempStudent2.getId());
			 * 
			 * Student myStudent = session.get(Student.class,tempStudent.getId()); Student
			 * myStudent1 = session.get(Student.class,tempStudent1.getId()); Student
			 * myStudent2 = session.get(Student.class,tempStudent2.getId());
			 * System.out.println("\nGetting Student Details:"+ myStudent);
			 * System.out.println("\nG6tting Student Details:"+ myStudent1);
			 * System.out.println("\nGetting Student Details:"+ myStudent2);
			 */
				 
			/*
			 * transaction=session.getTransaction(); transaction.commit();
			 */
			 System.out.println("Done!");
			
		} finally {
			// TODO: handle finally clause
			factory.close();
		}
		
		
		
	}

	private static void displayStudents(java.util.List<Student> theStudent) {
		for(Student tempStudent : theStudent)
		 {
			System.out.println(tempStudent.getEmail()); 
		 }
	}

}
