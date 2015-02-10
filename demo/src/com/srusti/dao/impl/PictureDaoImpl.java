package com.srusti.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.srusti.model.PictureModel;

@Repository
@Transactional
public class PictureDaoImpl 
{
	@Autowired
	private SessionFactory session;
	
	public void save(PictureModel model)
	{
		session.getCurrentSession().save(model);
	}
}
