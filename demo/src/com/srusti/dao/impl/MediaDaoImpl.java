package com.srusti.dao.impl;

import java.util.Collections;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.srusti.dao.MediaDao;
import com.srusti.model.MediaModel;

@Repository("mediaDao")
@Transactional
public class MediaDaoImpl implements MediaDao 
{
	@Autowired
	private SessionFactory session;
	
	public void save(MediaModel media) 
	{
		session.getCurrentSession().save(media);
	}

	public MediaModel get(int id) 
	{
		MediaModel media= (MediaModel) session.getCurrentSession().get(MediaModel.class, id);
		return media;
	}

	public void remove(int id) 
	{
		MediaModel media= (MediaModel) session.getCurrentSession().get(MediaModel.class, id);
		session.getCurrentSession().delete(media);
	}

	@SuppressWarnings({ "unchecked" })
	public List<MediaModel> list() 
	{
		List<MediaModel> medias= session.getCurrentSession().createQuery("From MediaModel").list();
		if(medias.isEmpty())
		{
			return Collections.EMPTY_LIST;
		}
		return medias;
	}
	
}
