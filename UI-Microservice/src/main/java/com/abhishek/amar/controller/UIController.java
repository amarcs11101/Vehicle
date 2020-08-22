/**
 * 
 */
package com.abhishek.amar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Abhishek Amar
 *
 */
@Controller 
public class UIController {
	@Autowired
	RestTemplate restTemplate;

	@GetMapping(value = "/")
	public ModelAndView index() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("index");
		return modelAndView;
	}

	@GetMapping(value = "/view-bike")
	public ModelAndView showBikeView() { 
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("view-bike"); 
		return modelAndView;
	}

	@GetMapping(value = "/book-bike")
	public ModelAndView bookBike() { 
		ModelAndView modelAndView = new ModelAndView();  
		modelAndView.setViewName("book-bike");
		return modelAndView;
	}
}
