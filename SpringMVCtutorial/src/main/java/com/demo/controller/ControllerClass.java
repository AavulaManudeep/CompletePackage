/**
 * 
 */
package com.demo.controller;

import java.util.Locale;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.demo.pojos.Student;
import com.demo.service.Studentservice;
//import com.sun.org.apache.bcel.internal.generic.NEW;

/**
 * @author manu
 *
 */
@Controller
public class ControllerClass {
	
	@Autowired
	private Studentservice studentservice;
	
	@GetMapping("/")
	public String studentForm(Locale locale,Model model)
	{
		System.out.println("Hello");
		model.addAttribute("student", new Student());
		model.addAttribute("students", studentservice.list());
		return "StudentForm";
	}
	
	@PostMapping("/saveStudents")
	public String savestudent(@ModelAttribute("student") @Valid Student student,BindingResult result,Model model)
	{
		
		if(result.hasErrors())
		{
			model.addAttribute("students", studentservice.list());
			return "StudentForm";
		}
		
		studentservice.save(student);
		return "redirect:/";
	}
  
}
