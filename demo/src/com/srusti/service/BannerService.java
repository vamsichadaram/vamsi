package com.srusti.service;

import java.util.List;

import com.srusti.model.components.BannerComponent;

public interface BannerService 
{
	void save(BannerComponent banner);
	BannerComponent get(int id);
	List<BannerComponent> list();
	void remove(int id);
}
