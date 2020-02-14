/**
 * 
 */
package com.demo.mainmethod;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author manu
 *
 */
@SpringBootApplication
@ComponentScan({"com.demo.controllers"})
public class App {
	
	public static void main(String[] args)
	{
		
		SpringApplication.run(App.class,args);
	}
	
	

}
