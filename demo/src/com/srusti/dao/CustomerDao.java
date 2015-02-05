package com.srusti.dao;

import java.util.List;

import com.srusti.model.CustomerModel;

public interface CustomerDao 
{
	void save(CustomerModel customer);
	CustomerModel getCustomer(final int id);
	List<CustomerModel> getCustomersList();
	List<CustomerModel> getActiveCustomersList();
	List<CustomerModel> getInactiveCustomersList();
	void remove(final int id);
}
