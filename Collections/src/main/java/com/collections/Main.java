/**
 * 
 */
package com.collections;

import java.util.Iterator;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.collections.course.CourseInfo;

/**
 * @author manu
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		@SuppressWarnings("resource")
		//Resource resource = new ClassPathResource("applicationcontext.xml");
		//XmlBeanFactory factory = new XmlBeanFactory(new ClassPathResource("applicationcontext.xml"));
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("applicationcontext.xml");
		Studentinfo student = (Studentinfo) context.getBean("details");
		@SuppressWarnings("unused")
		//CourseInfo info =(CourseInfo) student.getCoursework();
		Iterator<CourseInfo> itr = student.getCoursework().iterator();
		System.out.println(student);
		while (itr.hasNext()) {
			System.out.println(itr.next());
			
		}
		
		

	}

}
