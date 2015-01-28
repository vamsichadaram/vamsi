package com.srusti.dao;

import java.util.List;

import com.srusti.model.components.MediaComponent;

public interface MediaDao 
{
	public void save(MediaComponent media);
	public MediaComponent get(int id);
	public void remove(int id);
	public List<MediaComponent> list();
}
