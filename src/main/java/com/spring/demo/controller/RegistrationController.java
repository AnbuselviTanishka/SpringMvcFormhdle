package com.spring.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.demo.model.User;

@Controller
public class RegistrationController {

	@RequestMapping(value="/displayRegistrationPage",method=RequestMethod.GET)
	public String displayUserPage(Model model){
		User user = new User();
		user.setHiddenMsg("javainsimpleway");
		model.addAttribute("user", user);
		initializeFormValues(model);
		return "/registration";
	}
	

	@RequestMapping(value="/register",method=RequestMethod.POST)
	public String displayUserDetails(@ModelAttribute User user,Model model){
		model.addAttribute("user", user);
		return "/success";
	}
	
	private void initializeFormValues(Model model) {
		List<String> courses = new ArrayList<String>();
		courses.add("Java");
		courses.add("J2EE");
		courses.add("Spring");
		courses.add("Hibernate");
		courses.add("Jquery");
		model.addAttribute("courses", courses);
		
		List<String> genders = new ArrayList<String>();
		genders.add("Male");
		genders.add("Female");
		model.addAttribute("genders", genders);
		
		List<String> batches = new ArrayList<String>();
		batches.add("morning");
		batches.add("evening");
		model.addAttribute("batches", batches);
		
	}
}
