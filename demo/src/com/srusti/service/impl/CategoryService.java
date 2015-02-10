package com.srusti.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.srusti.dao.impl.CategoryDaoImpl;
import com.srusti.model.CategoryModel;

@Service
public class CategoryService 
{
	@Autowired
	private CategoryDaoImpl dao;
	public void add(CategoryModel model)
	{
		dao.add(model);
	}
	public void getByName(String name)
	{
		
	}
	public List<CategoryModel> list()
	{
		return dao.list();
	}
}
