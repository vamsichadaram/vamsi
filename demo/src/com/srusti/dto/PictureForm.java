package com.srusti.dto;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;


public class PictureForm 
{
	private int customerid;
	private String category;
	private List<MultipartFile> files;
	
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	
	public int getCustomerid() {
		return customerid;
	}
	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}
	public List<MultipartFile> getFiles() {
		return files;
	}
	public void setFiles(List<MultipartFile> files) {
		this.files = files;
	}
}
