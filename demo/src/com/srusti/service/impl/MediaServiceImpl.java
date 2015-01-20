package com.srusti.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.srusti.dao.MediaDao;
import com.srusti.model.MediaModel;
import com.srusti.service.MediaService;

@Service
public class MediaServiceImpl implements MediaService
{
	@Autowired
	private MediaDao dao;
	public void save(MediaModel media)
	{
		dao.save(media);
	}

	public MediaModel get(int id) 
	{
		return dao.get(id);
	}

	public void remove(int id) 
	{
		dao.remove(id);
	}

	public List<MediaModel> list() 
	{
		return dao.list();
	}

}
