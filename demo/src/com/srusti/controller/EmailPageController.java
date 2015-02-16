package com.srusti.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.srusti.model.EmailModel;

@Controller
@RequestMapping("/email")
public class EmailPageController 
{
	@RequestMapping("/form")
	public String emailPage(Model model)
	{
		model.addAttribute("email",new EmailModel());
		return null;
	}
}
