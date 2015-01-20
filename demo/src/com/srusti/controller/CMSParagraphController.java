package com.srusti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.srusti.model.components.ParagraphComponent;
import com.srusti.service.ParagraphService;

@Controller
@RequestMapping("/paragraph")
public class CMSParagraphController 
{
	@Autowired
	private ParagraphService service;
	@RequestMapping(value="/save", method=RequestMethod.POST)
	public void save(ParagraphComponent para)
	{
		service.save(para);
	}
	@RequestMapping("/get")
	public ParagraphComponent get(int id)
	{
		return service.get(id);
	}
	@RequestMapping("/remove")
	public void remove(int id)
	{
		service.remove(id);
	}
	@RequestMapping("/list")
	public List<ParagraphComponent> list()
	{
		return service.list();
	}
}
