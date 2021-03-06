package com.concretepage.controller;
import java.io.FileNotFoundException;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.concretepage.User;
import com.concretepage.validators.UserValidator;
@Controller
@RequestMapping("/myworld")
public class MyWorldController {
	@Autowired
	private UserValidator userValidator;
	@RequestMapping(value="signup", method = RequestMethod.GET)
	public ModelAndView user(){
		return new ModelAndView("user","user",new User());
	}
	@InitBinder
	public void dataBinding(WebDataBinder binder) {
		binder.addValidators(userValidator);
	}
	@RequestMapping(value="save", method = RequestMethod.POST)
	public String createUser(@ModelAttribute("user") @Valid User user,BindingResult result, ModelMap model) 
			                                                throws FileNotFoundException {
	    if(result.hasErrors()) {
	    	return "user";
	    }
	    if(user.getName().equals("exception")) {
	        throw new FileNotFoundException("Error found.");	
	    }
	    System.out.println("Name:"+ user.getName());
	    System.out.println("Date of Birth:"+ user.getDob());
		return "success";
	}	
}