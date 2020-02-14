/**
 * 
 */
package com.springmvcpractice;

import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author manu
 *
 */

@Controller
@RequestMapping("upper")
public class HelloWorld {
		
		@RequestMapping("/sayhello")
		public ModelAndView testHello() {
			
			String data = "Welcome to Spring MVC!";
			
			return new ModelAndView("hello", "sampleMessage", data);
		
			
		}
		@RequestMapping("/saybye")
		public ModelAndView testbye()
		{
			
			String data1 = "Bye See you later";
			
			return new ModelAndView("bye", "byemessage",data1);
		}
			
	

}
