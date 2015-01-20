package com.srusti.service;

import java.util.List;

import com.srusti.model.components.ParagraphComponent;

public interface ParagraphService 
{
	void save(ParagraphComponent para);
	ParagraphComponent get(int id);
	List<ParagraphComponent> list();
	void remove(int id);
}
