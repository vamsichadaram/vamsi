package com.srusti.dto;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.srusti.model.CustomerModel;

public class PictureForm 
{
	private int id;
	private CustomerModel model;
	private List<MultipartFile> files;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public CustomerModel getModel() {
		return model;
	}
	public void setModel(CustomerModel model) {
		this.model = model;
	}
	public List<MultipartFile> getFiles() {
		return files;
	}
	public void setFiles(List<MultipartFile> files) {
		this.files = files;
	}
	@Override
	public String toString() {
		return "PictureForm [id=" + id + ", model=" + model + ", files="
				+ files + "]";
	}
}
