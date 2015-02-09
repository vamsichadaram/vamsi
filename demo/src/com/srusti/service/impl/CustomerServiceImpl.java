package com.srusti.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.srusti.dao.CustomerDao;
import com.srusti.model.CustomerModel;
import com.srusti.service.CustomerService;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService 
{
	@Autowired
	private CustomerDao dao;
	
	public void save(CustomerModel customer) 
	{
		dao.save(customer);
		
	}

	public void update(CustomerModel customer) 
	{
		dao.save(customer);
	}

	public CustomerModel getCustomer(int id) 
	{
		return dao.getCustomer(id);
	}

	public List<CustomerModel> getCustomersList() 
	{
		return dao.getCustomersList();
	}

	public void remove(int id) 
	{
		dao.remove(id);
	}

	@Override
	public List<CustomerModel> getActiveCustomersList() 
	{
		return dao.getActiveCustomersList();
	}

	@Override
	public List<CustomerModel> getInActiveCustomersList() 
	{
		return dao.getInactiveCustomersList();
	}

}
