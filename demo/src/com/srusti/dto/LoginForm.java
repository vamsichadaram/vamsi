package com.srusti.dto;

public class LoginForm 
{
	private String username;
	private String password;
	private boolean user;
	private boolean success;
	
	public LoginForm(String username,String password,boolean user,boolean success)
	{
		this.username= username;
		this.password= password;
		this.user= user;
		this.success=success;
	}
	public boolean isSuccess() {
		return success;
	}
	public void setSuccess(boolean success) {
		this.success = success;
	}
	public boolean isUser() {
		return user;
	}
	public void setUser(boolean user) {
		this.user = user;
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
