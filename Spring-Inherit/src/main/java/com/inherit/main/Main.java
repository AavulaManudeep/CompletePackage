/**
 * 
 */
package com.inherit.main;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.inherit.Shape;

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
		//Resource resource = new ClassPathResource("applicationcontext.xml");
		XmlBeanFactory factory = new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
		@SuppressWarnings("resource")
		//ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Shape shape = (Shape) factory.getBean("triangle");
		shape.draw();

	}

}
