package com.nothingtothetable.ballparkdatabase.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.nothingtothetable.ballparkdatabase.domain.User;
import com.nothingtothetable.ballparkdatabase.persistence.UserMapper;

@Controller
@RequestMapping("/ballparkdatabase")
public class BallparkDatabaseController {
	private static final Logger LOG = Logger.getLogger("BallparkDatabaseController");
	String message = "workworkwokr";
	
	@Autowired
	UserMapper userMapper;
	
	@RequestMapping(method=RequestMethod.GET)
	public ModelAndView getToolRoot() {
		LOG.log(Level.SEVERE, "here? " + message);
		ModelAndView mav = new ModelAndView();
		mav.setViewName("ballparkdatabase");
		return mav;
	}
	
	@RequestMapping(value="/users", method=RequestMethod.GET, produces="application/json")
	public List<User> getUserNames() {
		List<User> userList = new ArrayList<User>();
		try {
		    System.out.println("Loading driver...");
		    Class.forName("com.mysql.jdbc.GoogleDriver");
		    System.out.println("Driver loaded!");
		} catch (ClassNotFoundException e) {
		    throw new RuntimeException("Cannot find the driver in the classpath!", e);
		}
		try {
			userList = userMapper.getAllUsers();
		} catch(Throwable t) {
			LOG.log(Level.SEVERE, "Could not get users. " + t.getMessage(), t);
		}
		
		return userList;
	}
}

