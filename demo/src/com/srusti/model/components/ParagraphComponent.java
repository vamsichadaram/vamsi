package com.srusti.model.components;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Paragraph")
public class ParagraphComponent 
{
	@Id
	@GeneratedValue
	private int id;
	@Column
	private String name;
	@Column
	private String description;
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
	@Override
	public String toString() {
		return "ParagraphComponent [id=" + id + ", name=" + name
				+ ", description=" + description + "]";
	}
}
