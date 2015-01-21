package com.srusti.model.components;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.srusti.model.MediaModel;

@Entity
@Table(name="banners")
public class BannerComponent 
{
	@Id
	@GeneratedValue
	@Column(name="bid")
	private int id;
	@Column
	private String name;
	@Column
	private String decription;
	@Column
	@OneToMany(cascade = CascadeType.ALL)
	@JoinTable(name="banner_media",joinColumns={@JoinColumn(name="bid")},inverseJoinColumns={@JoinColumn(name="mid")})
	private List<MediaModel> media;
	
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
	public String getDecription() {
		return decription;
	}
	public void setDecription(String decription) {
		this.decription = decription;
	}
	public List<MediaModel> getMedia() {
		return media;
	}
	public void setMedia(List<MediaModel> media) {
		this.media = media;
	}
	@Override
	public String toString() {
		return "BannerComponent [id=" + id + ", name=" + name + ", decription="
				+ decription + ", media=" + media + "]";
	}
	
}
