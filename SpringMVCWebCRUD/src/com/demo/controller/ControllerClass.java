/**
 * 
 */
package com.demo.controller;

import java.util.Locale;

import javax.naming.Binding;
import javax.validation.Valid;

import org.apache.tomcat.jni.Local;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.demo.pojoclasses.Student;
import com.demo.service.Studentservice;

import javassist.expr.NewArray;

/**
 * @author manu
 *
 */
@Controller

public class ControllerClass {

	@Autowired
	private Studentservice studentservice;
	
	@GetMapping("/")
	public String infoform(Locale locale,Model model)
	{
		model.addAttribute("student", new Student());
		model.addAttribute("Students", studentservice.list());
		
		return "registration";
	}
	
	@PostMapping("/saveStudents")
	public String saveStudents(@ModelAttribute("student") @Valid Student student, BindingResult result,Model model)
	{
		

	      if (result.hasErrors()) {
	         
	         model.addAttribute("Students", studentservice.list());
	         
	         return "registration";
	      }

		studentservice.save(student);
		return "redirect:/";
		
	}
	 
}
