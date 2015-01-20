package com.srusti.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.srusti.dao.BannerDao;
import com.srusti.model.components.BannerComponent;
import com.srusti.service.BannerService;

@Repository("bannerService")
public class BannerServiceImpl implements BannerService
{
	@Autowired
	private BannerDao dao;
	
	public void save(BannerComponent banner) 
	{
		dao.save(banner);
	}

	public BannerComponent get(int id) 
	{
		return dao.get(id);
	}

	public List<BannerComponent> list() 
	{
		return dao.list();
	}

	public void remove(int id) 
	{
		dao.remove(id);
	}
	
}
