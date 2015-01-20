package com.srusti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.srusti.model.components.BannerComponent;
import com.srusti.service.BannerService;

@Controller
@RequestMapping("/banner")
public class CMSBannerController 
{
	@Autowired
	private BannerService service;
	
	@RequestMapping(value="/save", method=RequestMethod.POST)
	public void save(BannerComponent banner)
	{
		service.save(banner);
	}
	@RequestMapping("/get")
	public BannerComponent get(int id)
	{
		return service.get(id);
	}
	@RequestMapping("/remove")
	public void remove(int id)
	{
		service.remove(id);
	}
	@RequestMapping("/list")
	public List<BannerComponent> list()
	{
		return service.list();
	}
}
