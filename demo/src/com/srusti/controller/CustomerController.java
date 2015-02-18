package com.srusti.controller;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.srusti.dto.CustomerForm;
import com.srusti.model.CustomerModel;
import com.srusti.service.CustomerService;
import com.srusti.service.impl.CategoryService;

@Controller
@RequestMapping("/customer")
public class CustomerController 
{
	private static final Logger LOG= Logger.getLogger(CustomerController.class);
	@Autowired
	private CustomerService service;
	
	@Autowired
	private CategoryService categoryService;
	
	@RequestMapping("/form")
	public String cform(Model model)
	{
		model.addAttribute("customer", new CustomerForm());
		return "forms/customerForm";
	}
	
	@RequestMapping("/home")
	public String customerhome()
	{
		return "";
	}
	
	@RequestMapping("/edit/{id}")
	public String edit(@PathVariable("id")int id,Model model)
	{
		CustomerModel customer= get(id);
		model.addAttribute("customers",customer);
		model.addAttribute("categories", categoryService.list());
		return "customer";
	}
	@RequestMapping("/delete/{id}")
	public String delete(@PathVariable("id")int id,Model model) throws IOException
	{
		
		service.remove(id);
		return "redirect:/customer/list";
	}
	@RequestMapping("/get")
	public CustomerModel get(@RequestParam("id") int id)
	{
		return service.getCustomer(id);
	}
	@RequestMapping(value="/save", method=RequestMethod.POST)
	public String save(CustomerForm customer)
	{
		LOG.info("customer id"+customer.getCustomerid());
		service.save(customer);
		return "redirect:/customer/list";
	}
	@RequestMapping("/remove")
	public void remove(@RequestParam("id") int id) throws IOException
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
		model.addAttribute("customers",service.getActiveCustomersList());
		return "customersList";
	}
	@RequestMapping(value="/inactive", produces="application/json")
	public String inActivelist(Model model)
	{
		model.addAttribute("customers",service.getInActiveCustomersList());
		return "customersList";
	}
}
