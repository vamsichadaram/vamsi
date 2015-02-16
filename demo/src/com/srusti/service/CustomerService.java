package com.srusti.service;

import java.io.IOException;
import java.util.List;

import com.srusti.dto.CustomerForm;
/*import com.srusti.dto.CustomerForm;*/
import com.srusti.model.CustomerModel;

public interface CustomerService 
{
	void save(CustomerForm customer);
	void update(CustomerModel customer);
	CustomerModel getCustomer(final int id);
	List<CustomerModel> getCustomersList();
	List<CustomerModel> getActiveCustomersList();
	List<CustomerModel> getInActiveCustomersList();
	void remove(final int id) throws IOException;
}
