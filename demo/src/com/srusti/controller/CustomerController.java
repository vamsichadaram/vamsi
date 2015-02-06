package com.srusti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.srusti.model.CustomerModel;
import com.srusti.service.CustomerService;

@Controller
@RequestMapping("/customer")
public class CustomerController 
{
	@Autowired
	private CustomerService service;
	
	@RequestMapping("/form")
	public String cform(Model model)
	{
		return "customerForm";
	}
	
	@RequestMapping("/edit/{id}")
	public String edit(@PathVariable("id")int id,Model model)
	{
		model.addAttribute("customer",get(id));
		return "customerForm";
	}
	@RequestMapping("/get")
	public CustomerModel get(@RequestParam("id") int id)
	{
		return service.getCustomer(id);
	}
	@RequestMapping(value="/save", method=RequestMethod.POST)
	public String save(CustomerModel customer)
	{
		service.save(customer);
		return "redirect:list";
	}
	@RequestMapping("/remove")
	public void remove(@RequestParam("id") int id)
	{
		service.remove(id);
	}
	@RequestMapping("/list")
	public String list(Model model)
	{
		model.addAttribute("customers",service.getCustomersList());
		return "customersList";
	}
	@RequestMapping("/active")
	public String activelist(Model model)
	{
		model.addAttribute("customers",service.getCustomersList());
		return "customersList";
	}
	@RequestMapping("/inactive")
	public String inActivelist(Model model)
	{
		model.addAttribute("customers",service.getCustomersList());
		return "customersList";
	}
}
