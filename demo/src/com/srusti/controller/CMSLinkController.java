package com.srusti.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.srusti.model.components.LinkComponent;
import com.srusti.service.LinkService;

@Controller
@RequestMapping("/link")
public class CMSLinkController 
{
	private static final Logger LOG= Logger.getLogger(CMSLinkController.class);
	@Autowired
	private LinkService service;
	@RequestMapping(value="/form")
	public ModelAndView linkform()
	{
		LOG.info("returning to form");
		return new ModelAndView("linkform","linkComponent",new LinkComponent());
	}
	@RequestMapping(value="/save", method=RequestMethod.POST)
	@ResponseBody
	public void save(@ModelAttribute LinkComponent linkComponent)
	{
		LOG.info("saving "+linkComponent.toString());
		if(linkComponent!=null)
		{
			LOG.info("saving customer");
			service.save(linkComponent);
		}
	}
	@RequestMapping("/get")
	public LinkComponent get(int id)
	{
		return service.get(id);
	}
	@RequestMapping("/remove")
	public void remove(int id)
	{
		service.remove(id);
	}
	@RequestMapping("/list")
	public List<LinkComponent> list()
	{
		return service.list();
	}
}
