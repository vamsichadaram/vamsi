package com.srusti.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="media")
public class MediaModel 
{
	@Id
	@GeneratedValue
	@Column(name="mid")
	private int id;
	@Column
	private String name;
	@Column
	private String path;
	@Column
	private String title;
	@Column
	private String alt;
	@Column
	private String decription;
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
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
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
	@Override
	public String toString() {
		return "MediaModel [id=" + id + ", name=" + name + ", path=" + path
				+ ", title=" + title + ", alt=" + alt + ", decription="
				+ decription + "]";
	}
}
