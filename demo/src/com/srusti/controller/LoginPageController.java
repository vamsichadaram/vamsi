package com.srusti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.srusti.dao.impl.LoginDao;
import com.srusti.dto.LoginForm;

@Controller
@RequestMapping("/login")
public class LoginPageController 
{
	@Autowired
	private LoginDao loginDao;
	@RequestMapping("/form")
	public String login(Model model)
	{
		model.addAttribute("loginform", new LoginForm());
		return "loginForm";
	}
	@RequestMapping(value="/form", method=RequestMethod.POST)
	public String login2(LoginForm login)
	{
		LoginForm checked=loginDao.check(login);
		if(checked.isSuccess())
		{
			if(checked.isUser())
			{
				return "/demo/customer/home";
			}else return "/demo/admin/home";
		}
		return "loginForm";
	}
}