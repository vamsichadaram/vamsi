package com.srusti.controller;

import java.io.File;
import java.io.IOException;

import javax.servlet.ServletContext;

import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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
	@Autowired
	private MediaService service;
	@Autowired
	private ServletContext context;
	@RequestMapping("/form")
	public String mediaform()
	{
		System.out.println(context.getRealPath(File.separator)+SampleCons.MEDIA_PATH);
		return "forms/MediaForm";
	}
	
	@RequestMapping("/save")
	public void save(@ModelAttribute MediaForm mediaForm) throws IOException
	{
		String fileName=mediaForm.getFile().getOriginalFilename();
		File file= new File(context.getRealPath(File.separator)+SampleCons.MEDIA_PATH+fileName);
		FileUtils.writeByteArrayToFile(file, mediaForm.getFile().getBytes());
		if(mediaForm!=null)
		{
			MediaModel model= new MediaModel();
			model.setName(mediaForm.getName());
			model.setAlt(mediaForm.getAlt());
			model.setDecription(mediaForm.getDecription());
			model.setTitle(mediaForm.getTitle());
			model.setPath("");
			service.save(model);
			service.save(model);
		}
	}
}
