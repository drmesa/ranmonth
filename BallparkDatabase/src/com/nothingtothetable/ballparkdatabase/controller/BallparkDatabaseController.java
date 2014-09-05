package com.nothingtothetable.ballparkdatabase.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/ballparkdatabase")
public class BallparkDatabaseController {
	String message;
	@RequestMapping(method=RequestMethod.GET)
	public String getRoot() {
		return "ballparkdatabase";
	}
}

/*
@RequestMapping(method=RequestMethod.GET)
	public String getToolRoot() {
		return "mfr/mfrTool";
	}
*/