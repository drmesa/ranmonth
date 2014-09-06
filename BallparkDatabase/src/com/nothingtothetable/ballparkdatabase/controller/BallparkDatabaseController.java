package com.nothingtothetable.ballparkdatabase.controller;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/ballparkdatabase")
public class BallparkDatabaseController {
	private static final Logger LOG = Logger.getLogger("BallparkDatabaseController");
	String message = "workworkwokr";
	
	@RequestMapping(method=RequestMethod.GET)
	public ModelAndView getToolRoot() {
		LOG.log(Level.SEVERE, "here? " + message);
		ModelAndView mav = new ModelAndView();
		mav.setViewName("ballparkdatabase");
		return mav;
	}
}

