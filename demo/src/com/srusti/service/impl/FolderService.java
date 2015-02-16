package com.srusti.service.impl;

import java.io.File;
import java.io.IOException;

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
			File file1= new File(context.getRealPath(File.separator)+temp1);
			file1.mkdir();
			File wedding= new File(context.getRealPath(File.separator)+temp1+File.separator+"wedding");
			wedding.mkdir();
			File bday= new File(context.getRealPath(File.separator)+temp1+File.separator+"birthday");
			bday.mkdir();
		}
		else
		{
			LOG.info("media folders to the "+name+" customer was not created");
		}
	}
	public void removeFolders(String name,int id) throws IOException
	{
		String temp1=SampleCons.MEDIA_PATH+name+"_"+id;
		File file1= new File(context.getRealPath(File.separator)+temp1);
		if(file1.exists())
		{
			delete(file1);
		}else LOG.info("Directory does not exist: "+file1.toString());
	}
	public static void delete(File file)
	    	throws IOException{
	 
	    	if(file.isDirectory()){
	 
	    		//directory is empty, then delete it
	    		if(file.list().length==0){
	 
	    		   file.delete();
	    		   System.out.println("Directory is deleted : " 
	                                                 + file.getAbsolutePath());
	 
	    		}else{
	 
	    		   //list all the directory contents
	        	   String files[] = file.list();
	 
	        	   for (String temp : files) {
	        	      //construct the file structure
	        	      File fileDelete = new File(file, temp);
	 
	        	      //recursive delete
	        	     delete(fileDelete);
	        	   }

	        	   if(file.list().length==0){
	           	     file.delete();
	        	     System.out.println("Directory is deleted : " 
	                                                  + file.getAbsolutePath());
	        	   }
	    		}
	 
	    	}else{
	    		file.delete();
	    		System.out.println("File is deleted : " + file.getAbsolutePath());
	    	}
	}
}
