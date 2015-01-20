package com.srusti.model.components;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="links")
public class LinkComponent 
{
	@Id
	@GeneratedValue
	private int id;
	@Column
	private String name;
	@Column
	private String description;
	@Column
	private String url;
	@Column
	private int node;
	
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	@Override
	public String toString() {
		return "LinkComponent [id=" + id + ", name=" + name + ", description="
				+ description + ", url=" + url + "]";
	}
}
