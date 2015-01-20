package com.srusti.service;

import java.util.List;

import com.srusti.model.CustomerModel;

public interface CustomerService 
{
	void save(CustomerModel customer);
	void update(CustomerModel customer);
	CustomerModel getCustomer(final int id);
	List<CustomerModel> getCustomersList();
	void remove(final int id);
}
