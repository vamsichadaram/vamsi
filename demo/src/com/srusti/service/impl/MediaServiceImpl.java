package com.srusti.service.impl;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletContext;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.srusti.controller.constants.SampleCons;
import com.srusti.dao.MediaDao;
import com.srusti.dto.MediaForm;
import com.srusti.model.components.MediaComponent;
import com.srusti.service.MediaService;

@Service
public class MediaServiceImpl implements MediaService
{
	private static final Logger LOG= Logger.getLogger(MediaServiceImpl.class);
	@Autowired
	private ServletContext context;
	@Autowired
	private MediaDao dao;
	public void save(MediaForm mediaform) throws IOException
	{
		String fileName= null;
		MediaForm media = (MediaForm) mediaform;
		MediaComponent model1= new MediaComponent();
		model1.setName(media.getName());
		model1.setAlt(media.getAlt());
		model1.setDecription(media.getDecription());
		model1.setTitle(media.getTitle());
		for(int i=0;i<mediaform.getFile().size();i++)
		{
			fileName= mediaform.getFile().get(i).getOriginalFilename();
			LOG.info("uploading....."+fileName);
			File dir= new File(context.getRealPath(File.separator)+SampleCons.MEDIA_PATH);
			File filedup= new File(context.getRealPath(File.separator)+SampleCons.MEDIA_PATH+fileName);
			if(dir.isDirectory())
			{
				LOG.info("uploading data "+mediaform.getFile().get(i).getBytes().toString());
				FileUtils.writeByteArrayToFile(filedup, mediaform.getFile().get(i).getBytes());
			}else LOG.info("directory does not exists");
			if(filedup.exists())
			{
				model1.setPath(SampleCons.MEDIA_PATH+fileName);
				dao.save(model1);
			}else LOG.info("cannot upload file: "+fileName);
		}
	}

	public MediaComponent get(int id) 
	{
		return dao.get(id);
	}

	public void remove(int id) 
	{
		dao.remove(id);
	}

	public List<MediaComponent> list() 
	{
		return dao.list();
	}

}
