package com.vamsi.sample;

import java.io.File;
import java.io.IOException;

public class Folders 
{
	private static final String SRC= "D:\\example";
	public static void main(String[] args) throws IOException 
	{
		File dir= new File(SRC);
		if(!dir.exists())
		{
			System.out.println("Directory does not exist.");
			System.exit(0);
		}
		else
		{
			delete(dir);
		}
	}
	public static void delete(File file)
	{
		if(file.isDirectory())
		{
			if(file.list().length==0)
			{
				file.delete();
				System.out.println("Directory is deleted: "+file.getAbsolutePath());
			}
			else
			{
				System.out.println("contains files/folders :"+file.list().length);
				
				String files[]= file.list();
				for(String temp: files)
				{
					File fd= new File(file,temp);
					delete(fd);
				}
				
				if(file.list().length==0)
				{
					file.delete();
					System.out.println("Directory is deleted: "+file.getAbsolutePath());
				}
			}
		}
		else
		{
			file.delete();
			System.out.println("File is deleted: "+file.getAbsolutePath());
		}
	}
}
