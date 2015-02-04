package com.srusti.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminPageController 
{
	@RequestMapping("/home")
	public String adminhome()
	{
		return "body";
	}
}
