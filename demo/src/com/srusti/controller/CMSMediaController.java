package com.srusti.controller;

import java.io.File;
import java.io.IOException;

import javax.servlet.ServletContext;

import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

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
			model1.setPath("sample");
			if(mediaForm.getFile()!=null)
			{
				fileName= mediaForm.getFile().getOriginalFilename();
				File filedup= new File(context.getRealPath(File.separator)+SampleCons.MEDIA_PATH+fileName);
				FileUtils.writeByteArrayToFile(filedup, mediaForm.getFile().getBytes());
				service.save(model1);
			}
			else
			{
				System.out.println("unable to upload.....");
			}
		}
		 else
		 {
			 System.out.println("not done");
		 }
	}
}
