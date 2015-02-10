package com.srusti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.srusti.model.CustomerModel;
import com.srusti.service.CustomerService;
import com.srusti.service.impl.CategoryService;
import com.srusti.service.impl.FolderService;

@Controller
@RequestMapping("/customer")
public class CustomerController 
{
	@Autowired
	private CustomerService service;
	@Autowired
	private FolderService folderService;
	@Autowired
	private CategoryService categoryService;
	
	@RequestMapping("/form")
	public String cform(Model model)
	{
		return "forms/customerForm";
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
	public String delete(@PathVariable("id")int id,Model model)
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
	public String save(CustomerModel customer)
	{
		service.save(customer);
		folderService.createFolders(customer.getName(), customer.getCustomerid());
		return "redirect:/customer/list";
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
	@RequestMapping(value="/inactive", produces="application/json")
	@ResponseBody
	public List<CustomerModel> inActivelist(Model model)
	{
		//model.addAttribute("customers",service.getCustomersList());
		return service.getCustomersList();
	}
}
