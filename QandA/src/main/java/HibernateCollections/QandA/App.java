package HibernateCollections.QandA;

import java.util.ArrayList;

//import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.Transaction;;

//import com.demo.hbm.HibernateUtil;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       //System.out.println( "Hello World!" );
    	Session session=null;
    	Transaction transaction = null;
    	try {
    		session = HibernateUtil.getSessionFactory().openSession();
    		transaction = session.getTransaction();
    		transaction.begin();
    		Answers answers1 = new Answers();
    		answers1.setAnswername("Java is a Programming Language");
			answers1.setPostedby("Sinju");
			Answers answers2 = new Answers();
    		answers2.setAnswername("Java is a Paltform");
			answers2.setPostedby("Sai");
			Answers answers3 = new Answers();
    		answers3.setAnswername("Servele is an Interface");
			answers3.setPostedby("Gavi");
			Answers answers4 = new Answers();
    		answers4.setAnswername("Servelet is API");
			answers4.setPostedby("Pinky");
			
			ArrayList<Answers> list1 = new ArrayList<Answers>();
			list1.add(answers1);
			list1.add(answers2);
			
			ArrayList<Answers> list2 = new ArrayList<Answers>();
			list2.add(answers3);
			list2.add(answers4);
			
			Questions questions1 = new Questions();
			questions1.setQname("What is Java?");
			questions1.setAnswers(list1);
			
			Questions questions2 = new Questions();
			questions2.setQname("What is Servelet?");
			questions2.setAnswers(list2);
			
			 session.save(questions1);
	         session.save(questions2);
	         transaction.commit();

	         System.out.println("Records saved successfully");
			
			
		} catch (Throwable e) {
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
	      HibernateUtil.shutdown();
	   }
}
