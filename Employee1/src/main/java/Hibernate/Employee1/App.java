package Hibernate.Employee1;

import org.hibernate.Session;
import org.hibernate.Transaction;

//import com.demo.hbm.HibernateUtil;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args) {
    	 Session session = null;
         Transaction transaction = null;
         try {
             session = Hibernateutil.getSessionFactory().openSession();
             transaction = session.getTransaction();
             transaction.begin();
             EmployeeEntity emp = new EmployeeEntity();
    		 emp.setEmail("demo-user@mail.com"); emp.setFirstName("demo");
    		 emp.setLastName("user");
    		  
    		 session.save(emp);
    		 transaction.commit();
         }
		/*
		 * Session session = Hibernateutil.getSessionFactory().openSession();
		 * session.beginTransaction();
		 * 
		 * // Add new Employee object EmployeeEntity emp = new EmployeeEntity();
		 * emp.setEmail("demo-user@mail.com"); emp.setFirstName("demo");
		 * emp.setLastName("user");
		 * 
		 * session.save(emp);
		 * 
		 * session.getTransaction().commit(); Hibernateutil.shutdown();
		 * 
		 */
         catch (Exception e) {
             if (transaction != null) {
                System.out.println("Transaction is being rolled back.");
                transaction.rollback();
             }
             e.printStackTrace();
          } finally {
             if (session != null) {
                session.close();
             }
          }
          Hibernateutil.shutdown();
    }
}
