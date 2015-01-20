package com.srusti.controller;

import javax.servlet.ServletContext;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class HomePageController 
{
	private static final Logger LOG= Logger.getLogger(HomePageController.class);
	
	@RequestMapping("/sample")
	public String homePage()
	{
		LOG.info("returning to home page");
		return "home";
	}
}
