package com.srusti.service;

import java.io.File;

import javax.servlet.ServletContext;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.srusti.controller.constants.SampleCons;

@Service
public class FolderService 
{
	private static Logger LOG= Logger.getLogger(FolderService.class);
	@Autowired
	private ServletContext context;
	public void createFolders(String name,int id)
	{
		String temp=SampleCons.MEDIA_PATH+File.separator+File.separator;
		String temp1=SampleCons.MEDIA_PATH+name+"_"+id;
		File file= new File(context.getContextPath()+File.separator+temp);
		if(!file.exists())
		{
			LOG.info("creating media folders to the "+name+" customer");
			LOG.info(context.getContextPath()+File.separator+temp1+" wedding");
			File file1= new File(context.getRealPath(File.separator)+temp1);
			file1.mkdir();
			File file2= new File(context.getRealPath(File.separator)+temp1);
			file2.mkdir();
		}
		else
		{
			LOG.info("media folders to the "+name+" customer was not created");
		}
	}
}
