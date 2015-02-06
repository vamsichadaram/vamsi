package com.srusti.dto;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;


public class MediaForm 
{
	private int id;
	private String name;
	private String title;
	private String alt;
	private String decription;
	private List<MultipartFile> file;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAlt() {
		return alt;
	}
	public void setAlt(String alt) {
		this.alt = alt;
	}
	public String getDecription() {
		return decription;
	}
	public void setDecription(String decription) {
		this.decription = decription;
	}
	public List<MultipartFile> getFile() {
		return file;
	}
	public void setFile(List<MultipartFile> file) {
		this.file = file;
	}
	@Override
	public String toString() {
		return "MediaForm [id=" + id + ", name=" + name + ", title=" + title
				+ ", alt=" + alt + ", decription=" + decription + ", file="
				+ file + "]";
	}
	
}
