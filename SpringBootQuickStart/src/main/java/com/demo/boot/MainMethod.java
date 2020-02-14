/**
 * 
 */
package com.demo.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author manu
 *
 */
@SpringBootApplication
@ComponentScan({"com.demo.controller"})
public class MainMethod {
	
	public static void main(String[] args)
	{
		SpringApplication.run(MainMethod.class, args);
		
	}

}
