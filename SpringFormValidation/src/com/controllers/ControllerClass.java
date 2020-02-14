/**
 * 
 */
package com.controllers;

import java.awt.List;
import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.pojos.StudentRegistartionForm;

/**
 * @author manu
 *
 */
@Controller
@RequestMapping("manu")
public class ControllerClass {
	
	
	@ModelAttribute()
	public void mymajors(Model model1)
	{
		
		ArrayList<String> majors = new ArrayList<String>();
		majors.add("Computer Science");
		majors.add("Graphic Design");
		majors.add("Engineering");
		model1.addAttribute("Major",majors);
	}
	
	@RequestMapping(value="registration", method=RequestMethod.GET)
	public ModelAndView getRegistrationform()
	{
		
		ModelAndView model1 = new ModelAndView("registrationform");
		return model1;
	}
	

	@RequestMapping(value="submitregistration", method=RequestMethod.POST)
	public ModelAndView getSubmitform(@ModelAttribute("studendetails") StudentRegistartionForm student, BindingResult result )
	{
		
		if(result.hasErrors())
			
		{
			ModelAndView model1 = new ModelAndView("registrationform");
			return model1;
		}
		ModelAndView model1 = new ModelAndView("registrationformresult");
		
		
		return model1;
	}

}
