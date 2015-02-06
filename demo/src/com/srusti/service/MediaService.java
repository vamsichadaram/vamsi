package com.srusti.service;

import java.io.IOException;
import java.util.List;

import com.srusti.dto.MediaForm;
import com.srusti.model.components.MediaComponent;

public interface MediaService 
{
	public void save(MediaForm mediaform) throws IOException;
	public MediaComponent get(int id);
	public void remove(int id);
	public List<MediaComponent> list();
}
