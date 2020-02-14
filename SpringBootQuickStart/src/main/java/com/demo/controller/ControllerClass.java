/**
 * 
 */
package com.demo.controller;


import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.pojos.Students;

/**
 * @author manu
 *
 */
@RestController
public class ControllerClass {
	
	@RequestMapping("/hello")
	public String sayHello()
	{
		
		return "Hello welcom to Spring-Boot";
	}
	
	@RequestMapping("/json")
	public List<Students> getStudents()
	{
		return Arrays.asList(
				new Students(50509703,"Manudeep","CS"),
				new Students(50509707,"sai","EE")
				
				
				);
	}

}
