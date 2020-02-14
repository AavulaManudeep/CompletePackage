/**
 * 
 */
package com.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author manu
 *
 */
@RestController
public class ControllerClass {
	
	@GetMapping("/home")
	public ModelAndView mainpage()
	{
		
		return new ModelAndView("home");
	}

}
