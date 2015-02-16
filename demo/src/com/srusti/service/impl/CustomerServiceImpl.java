package com.srusti.service.impl;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.srusti.dao.CustomerDao;
import com.srusti.dto.CustomerForm;
/*import com.srusti.dto.CustomerForm;*/
import com.srusti.model.CustomerModel;
import com.srusti.service.CustomerService;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService 
{
	@Autowired
	private CustomerDao dao;
	
	@Autowired
	private FolderService folderService;
	@Autowired
	private PictureServiceImpl pictureService;
	
	public void save(CustomerForm customer) 
	{
		CustomerModel customerModel= new CustomerModel();
		customerModel.setName(customer.getName());
		customerModel.setEmail(customer.getEmail());
		customerModel.setContact(customer.getContact());
		customerModel.setName(customer.getName());
		customerModel.setUsername(customer.getUsername());
		customerModel.setUsername(customer.getPassword());
		dao.save(customerModel);
		folderService.createFolders(customer.getUsername(), customerModel.getCustomerid());
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

	public void remove(int id) throws IOException 
	{
		CustomerModel customer= dao.getCustomer(id);
		pictureService.removeByCustomer(id);
		folderService.removeFolders(customer.getUsername(), customer.getCustomerid());
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
