package com.srusti.dao.impl;

import java.util.Collections;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.srusti.model.CategoryModel;

@Repository
@Transactional
public class CategoryDaoImpl 
{
	@Autowired
	private SessionFactory session;
	public void add(CategoryModel model)
	{
		session.getCurrentSession().save(model);
	}
	public void getByName(String name)
	{
		
	}
	
	@SuppressWarnings("unchecked")
	public List<CategoryModel> list()
	{
		List<CategoryModel> list=session.getCurrentSession().createQuery("From CategoryModel").list();
		if(list.size()>0)
		{
			return list;
		}
		return Collections.EMPTY_LIST;
	}
}
