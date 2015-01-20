package com.srusti.dao;

import java.util.List;

import com.srusti.model.components.LinkComponent;

public interface LinkDao 
{
	void save(LinkComponent link);
	LinkComponent get(int id);
	List<LinkComponent> list();
	void remove(int id);
}
