package com.srusti.service;

import java.util.List;

import com.srusti.model.components.LinkComponent;

public interface LinkService 
{
	void save(LinkComponent link);
	LinkComponent get(int id);
	List<LinkComponent> list();
	void remove(int id);
}
