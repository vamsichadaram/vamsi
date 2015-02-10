package com.srusti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.srusti.model.CategoryModel;
import com.srusti.service.impl.CategoryService;

@Controller
@RequestMapping("/category")
public class CategoryController 
{
	@Autowired
	private CategoryService service;
	
	@RequestMapping("/form")
	public String form(Model model)
	{
		model.addAttribute("categories", service.list());
		model.addAttribute("category", new CategoryModel());
		return "forms/categoryForm";
	}
	
	@RequestMapping("/save")
	public String save(CategoryModel model)
	{
		service.add(model);
		return "forms/categoryForm";
	}
}
