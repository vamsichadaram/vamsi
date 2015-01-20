package com.srusti.service;

import java.util.List;

import com.srusti.model.MediaModel;

public interface MediaService 
{
	public void save(MediaModel media);
	public MediaModel get(int id);
	public void remove(int id);
	public List<MediaModel> list();
}
