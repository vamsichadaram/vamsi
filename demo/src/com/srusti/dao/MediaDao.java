package com.srusti.dao;

import java.util.List;
import com.srusti.model.MediaModel;

public interface MediaDao 
{
	public void save(MediaModel media);
	public MediaModel get(int id);
	public void remove(int id);
	public List<MediaModel> list();
}
