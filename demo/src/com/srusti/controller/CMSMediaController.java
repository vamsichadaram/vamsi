package com.srusti.controller;

import java.io.IOException;

import javax.servlet.ServletContext;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import com.srusti.dto.MediaForm;
import com.srusti.service.MediaService;

@Controller
@RequestMapping("/media")
public class CMSMediaController 
{
	private static final Logger LOG= Logger.getLogger(CMSMediaController.class);
	@Autowired
	private MediaService service;
	@Autowired
	private ServletContext context;
	
	@RequestMapping("/form")
	public String mediaform(Model model)
	{
		model.addAttribute("mediaForm",new MediaForm());
		return "forms/MediaForm";
	}
	
	@RequestMapping("/save")
	public void save(@ModelAttribute("mediaForm") MediaForm mediaForm) throws IOException
	{
		
		 if (mediaForm instanceof MediaForm) 
		 {
			if(mediaForm.getFile().size()>0)
			{
				service.save(mediaForm);
				
			}else LOG.info("check the image.....");
			
		}else LOG.info("Not done.....");
	}
}
