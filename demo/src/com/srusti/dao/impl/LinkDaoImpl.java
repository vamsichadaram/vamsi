package com.srusti.dao.impl;

import java.util.Collections;
import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.srusti.dao.LinkDao;
import com.srusti.model.components.LinkComponent;

@Repository("linkDao")
@Transactional
public class LinkDaoImpl implements LinkDao 
{
	@Autowired
	private SessionFactory session;
	private static final Logger LOG= Logger.getLogger(LinkDaoImpl.class);
	public void save(LinkComponent link) 
	{
		LOG.info("at dao");
		session.getCurrentSession().save(link);
		LinkComponent link2=(LinkComponent) session.getCurrentSession().get(LinkComponent.class, 1);
		System.out.println(link2.toString());
	}

	public LinkComponent get(int id) 
	{
		LinkComponent link=(LinkComponent) session.getCurrentSession().get(LinkComponent.class, id);
		return link;
	}

	@SuppressWarnings("unchecked")
	public List<LinkComponent> list() 
	{
		List<LinkComponent> links=session.getCurrentSession().createQuery("From LinkComponent").list();
		if(links.isEmpty())
		{
			return Collections.EMPTY_LIST;
		}
		return links;
	}

	public void remove(int id) 
	{
		LinkComponent link=(LinkComponent) session.getCurrentSession().get(LinkComponent.class, id);
		session.getCurrentSession().delete(link);
	}

}
