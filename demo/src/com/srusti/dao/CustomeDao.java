package com.srusti.dao;

import java.util.List;

import com.srusti.model.CustomerModel;

public interface CustomeDao 
{
	public void save(CustomerModel customer);
	public CustomerModel get(int id);
	public void remove(int id);
	public List<CustomerModel> list();
}
