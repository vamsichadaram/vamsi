package com.srusti.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.srusti.dao.ParagraphDao;
import com.srusti.model.components.ParagraphComponent;
import com.srusti.service.ParagraphService;

@Service("paragraphService")
public class ParagraphServiceImpl implements ParagraphService 
{
	@Autowired
	private ParagraphDao dao;
	
	public void save(ParagraphComponent para) 
	{
		dao.save(para);
	}

	public ParagraphComponent get(int id) 
	{
		return dao.get(id);
	}

	public List<ParagraphComponent> list() 
	{
		return dao.list();
	}

	public void remove(int id) 
	{
		dao.remove(id);
	}
}
