package com.nothingtothetable.ballparkdatabase.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/ballparkdatabase")
public class BallparkDatabaseController {
	String message;
	
	@RequestMapping(method=RequestMethod.GET)
	public ModelAndView getToolRoot() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("ballparkdatabase");
		return mav;
	}
}

