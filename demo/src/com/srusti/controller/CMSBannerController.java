package com.srusti.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.srusti.model.components.BannerComponent;
import com.srusti.service.BannerService;

@Controller
@RequestMapping("/banner")
public class CMSBannerController 
{
	private static final Logger LOG= Logger.getLogger(CMSBannerController.class);
	@Autowired
	private BannerService service;
	
	@RequestMapping("/form")
	public String bannerForm(Model model)
	{
		model.addAttribute("bannerComponent", new BannerComponent());
		return "bannerForm";
	}
	@RequestMapping(value="/save", method=RequestMethod.POST)
	public void save(@ModelAttribute("bannerComponent")BannerComponent banner)
	{
		service.save(banner);
		LOG.info(banner.getName()+" saved successfully");
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
