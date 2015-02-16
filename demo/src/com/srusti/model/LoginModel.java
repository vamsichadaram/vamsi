package com.srusti.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="login")
public class LoginModel 
{
	@Id
	@GeneratedValue
	private int id;
	@Column
	private String username;
	@Column
	private String password;
	@Column
	private String role;
	@OneToOne
	@JoinColumn(name="customer_id")
	private CustomerModel customer;
	
	public LoginModel(int id,String username,String password,String role,CustomerModel customer)
	{
		this.id=id;
		this.username= username;
		this.password= password;
		this.role= role;
		this.customer= customer;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public CustomerModel getCustomer() {
		return customer;
	}
	public void setCustomer(CustomerModel customer) {
		this.customer = customer;
	}
	
}
