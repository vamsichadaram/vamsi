package com.srusti.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.srusti.dto.PictureForm;
import com.srusti.service.impl.PictureServiceImpl;

@Controller
@RequestMapping("/picture")
public class PictureController 
{
	@Autowired
	private PictureServiceImpl service;
	@RequestMapping("/form/{customerid}/{category}")
	public String add(@PathVariable("customerid")int customerid,@PathVariable("category") String category,Model model)
	{
		PictureForm form= new PictureForm();
		form.setCustomerid(customerid);
		form.setCategory(category);
		model.addAttribute("picture", form);
		model.addAttribute("pictures", service.getbyidcat(customerid, category));
		return "forms/pictureForm";
	}
	@RequestMapping(value="/save", method=RequestMethod.POST,headers = "content-type=multipart/*")
	public String save(@RequestParam("customerid")int customerid,@RequestParam("category")String category,@RequestParam("files")List<MultipartFile> files) throws IOException
	{
		PictureForm pictureForm= new PictureForm();
		pictureForm.setCustomerid(customerid);
		pictureForm.setCategory(category);
		pictureForm.setFiles(files);
		service.save(pictureForm);
		return "redirect:/picture/form/"+customerid+"/"+category+"";
	}
}
