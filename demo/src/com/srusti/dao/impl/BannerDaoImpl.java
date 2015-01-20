package com.srusti.dao.impl;

import java.util.Collections;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.srusti.dao.BannerDao;
import com.srusti.model.components.BannerComponent;

@Repository("bannerDao")
public class BannerDaoImpl implements BannerDao
{
	private SessionFactory session;
	public void save(BannerComponent banner) 
	{
		session.getCurrentSession().save(banner);
	}

	public BannerComponent get(int id) 
	{
		BannerComponent banner=(BannerComponent) session.getCurrentSession().get(BannerComponent.class, id);
		return banner;
	}

	@SuppressWarnings("unchecked")
	public List<BannerComponent> list() 
	{
		List<BannerComponent> banners=session.getCurrentSession().createQuery("From BannerComponent").list();
		if(banners.isEmpty())
		{
			return Collections.EMPTY_LIST;
		}
		else return banners;
	}

	public void remove(int id) 
	{
		BannerComponent banner=(BannerComponent) session.getCurrentSession().get(BannerComponent.class, id);
		session.getCurrentSession().delete(banner);
	}
	
}
