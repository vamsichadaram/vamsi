package com.srusti.service;

import java.io.File;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.srusti.controller.constants.SampleCons;

@Service
public class FolderService 
{
	private static Logger LOG= Logger.getLogger(FolderService.class);
	public void createFolders(String name,int id)
	{
		String temp1=SampleCons.MEDIA_PATH+File.separator+name+"_"+id;
		File file= new File(temp1);
		if(!file.exists())
		{
			LOG.info("creating media folders to the "+name+" customer");
			file.mkdir();
			File file1= new File(File.separator+temp1+"wedding");
			file1.mkdir();
			File file2= new File(File.separator+temp1+"birthday");
			file2.mkdir();
		}
		else
		{
			LOG.info("media folders to the "+name+" customer was not created");
		}
	}
}
