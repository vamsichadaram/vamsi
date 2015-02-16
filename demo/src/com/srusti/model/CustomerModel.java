package com.srusti.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="customers")
public class CustomerModel 
{
	@Id
	@GeneratedValue
	@Column
	private int customerid;
	@Column
	private String name;
	@Column
	private String contact;
	@Column
	private String email;
	@Column
	private boolean active;
	@Column
	private String username;
	@Column
	private String password;
	
	@OneToMany(mappedBy="customer")
	private Set<PictureModel> pictures;
	
	public int getCustomerid() {
		return customerid;
	}
	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public Set<PictureModel> getPictures() {
		return pictures;
	}
	public void setPictures(Set<PictureModel> pictures) {
		this.pictures = pictures;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
