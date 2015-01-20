package com.srusti.dao.impl;

import java.util.Collections;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.srusti.dao.ParagraphDao;
import com.srusti.model.components.ParagraphComponent;

@Repository("paragraphDao")
public class ParagraphDaoImp implements ParagraphDao 
{
	private SessionFactory session;
	public void save(ParagraphComponent para) 
	{
		session.getCurrentSession().save(para);
	}

	public ParagraphComponent get(int id) 
	{
		ParagraphComponent para=(ParagraphComponent) session.getCurrentSession().get(ParagraphComponent.class, id);
		return para;
	}

	@SuppressWarnings({"unchecked" })
	public List<ParagraphComponent> list() 
	{
		List<ParagraphComponent> paragraphs= session.getCurrentSession().createQuery("From ParagraphComponent").list();
		if(paragraphs.isEmpty())
		{
			return Collections.EMPTY_LIST;
		}
		else return paragraphs;
	}

	public void remove(int id) 
	{
		ParagraphComponent para=(ParagraphComponent) session.getCurrentSession().get(ParagraphComponent.class, id);
		session.getCurrentSession().delete(para);
	}

}
