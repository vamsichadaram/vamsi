package com.srusti.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.srusti.dao.CustomerDao;
import com.srusti.dao.impl.LoginDao;
import com.srusti.dto.CustomerForm;
import com.srusti.model.CustomerModel;
import com.srusti.model.LoginModel;
import com.srusti.service.CustomerService;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService 
{
	@Autowired
	private CustomerDao dao;
	@Autowired
	private LoginDao loginDao;
	@Autowired
	private FolderService folderService;
	
	public void save(CustomerForm customer) 
	{
		CustomerModel customerModel= new CustomerModel();
		customerModel.setName(customer.getName());
		customerModel.setEmail(customer.getEmail());
		customerModel.setContact(customer.getContact());
		customerModel.setName(customer.getName());
		LoginModel login= new LoginModel();
		login.setUsername(customer.getUsername());
		login.setPassword(customer.getPassword());
		customerModel.setLoginModel(login);
		dao.save(customerModel);
		folderService.createFolders(customer.getName(), customerModel.getCustomerid());
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
