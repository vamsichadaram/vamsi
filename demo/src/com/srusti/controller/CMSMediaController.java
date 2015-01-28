package com.srusti.controller;

import java.io.File;
import java.io.IOException;

import javax.servlet.ServletContext;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import com.srusti.controller.constants.SampleCons;
import com.srusti.dto.MediaForm;
import com.srusti.model.MediaModel;
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
		String fileName= null;
		 if (mediaForm instanceof MediaForm) {
			MediaForm media = (MediaForm) mediaForm;
			MediaModel model1= new MediaModel();
			model1.setName(media.getName());
			model1.setAlt(media.getAlt());
			model1.setDecription(media.getDecription());
			model1.setTitle(media.getTitle());
			if(mediaForm.getFile()!=null)
			{
				fileName= mediaForm.getFile().getOriginalFilename();
				LOG.info("uploading....."+fileName);
				
				File filedup= new File(context.getRealPath(File.separator)+SampleCons.MEDIA_PATH+fileName);
				if(filedup.isDirectory())
				{
					FileUtils.writeByteArrayToFile(filedup, mediaForm.getFile().getBytes());
				}
				if(filedup.exists())
				{
					model1.setPath(SampleCons.MEDIA_PATH+fileName);
					service.save(model1);
				}else LOG.info("cannot upload file: "+fileName);
			}
			else LOG.info("check the image.....");
			
		}else LOG.info("Not done.....");
	}
}
