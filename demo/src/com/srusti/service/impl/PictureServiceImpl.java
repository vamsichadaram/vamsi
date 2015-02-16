package com.srusti.service.impl;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletContext;

import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.srusti.controller.constants.SampleCons;
import com.srusti.dao.impl.PictureDaoImpl;
import com.srusti.dto.PictureForm;
import com.srusti.model.CustomerModel;
import com.srusti.model.PictureModel;
import com.srusti.service.CustomerService;

@Service
public class PictureServiceImpl 
{
	@Autowired
	private PictureDaoImpl dao;
	@Autowired
	private CustomerService service;
	@Autowired
	private ServletContext context;
	private static final String SLASH= File.separator;
	public void save(PictureForm form) throws IOException
	{
		String fileName= null;
		if(form.getFiles().size()>0)
		{
			for(int i=0;i<form.getFiles().size();i++)
			{
				CustomerModel customer=service.getCustomer(form.getCustomerid());
				fileName=form.getFiles().get(i).getOriginalFilename();
				String fulpath=context.getRealPath(SLASH)+SampleCons.MEDIA_PATH+customer.getName()+"_"+customer.getCustomerid()+SLASH+form.getCategory()+SLASH+fileName;
				File dir= new File(context.getRealPath(SLASH)+SampleCons.MEDIA_PATH);
				File filedup= new File(fulpath);
				if(dir.isDirectory())
				{
					FileUtils.writeByteArrayToFile(filedup,form.getFiles().get(i).getBytes());
				}
				if(filedup.exists())
				{
					PictureModel model= new PictureModel();
					model.setCategory(form.getCategory());
					model.setCustomer(customer);
					model.setPath(customer.getName()+"_"+customer.getCustomerid()+SLASH+form.getCategory()+SLASH+fileName);
					dao.save(model);
				}
			}
		}
	}
	
	public List<PictureModel> getbyidcat(int customerid,String category)
	{
		return dao.getbyIdCategory(customerid, category);
	}
	
	public void removeByCustomer(int customerid)
	{
		dao.removeByCustomer(customerid);
	}
}
