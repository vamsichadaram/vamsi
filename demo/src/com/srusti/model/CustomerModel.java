package com.srusti.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

//Entity annotation used identify pojo class as a persistence(which can be saved in database) object
@Entity
// It will create a table with the mentioned name
@Table(name="customers")
public class CustomerModel 
{
	//@Id is the primary key in a table
	@Id
	//it will generate at time of saving an object
	@GeneratedValue
	private int id;
	//@Column will define column with the variable name
	@Column
	private String name;
	@Column
	private String contact;
	@Column
	private String email;
	@Column
	private boolean active;
	
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
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
	@Override
	public String toString() {
		return "CustomerModel [id=" + id + ", name=" + name + ", contact="
				+ contact + ", email=" + email + ", active=" + active + "]";
	}
}
