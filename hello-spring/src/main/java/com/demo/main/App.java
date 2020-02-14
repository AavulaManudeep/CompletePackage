/**
 * 
 */
package com.demo.main;

import org.omg.CORBA.portable.ApplicationException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.demo.bean.AccountBean;

/**
 * @author manu
 *
 */
public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		AccountBean bean = (AccountBean) context.getBean("account");
		System.out.println(bean);
		bean.deposit(1500);
		System.out.println(bean);
	}

}
