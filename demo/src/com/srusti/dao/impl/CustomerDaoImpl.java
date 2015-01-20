package com.srusti.dao.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.srusti.dao.CustomerDao;
import com.srusti.model.CustomerModel;

@Repository("customerDao")
public class CustomerDaoImpl implements CustomerDao
{
	private static final Logger LOG= Logger.getLogger(CustomerDaoImpl.class);
	private SessionFactory session;
	
	public void save(CustomerModel customer) 
	{
		session.getCurrentSession().save(customer);
		LOG.info("Customer saved into database successfully.....");
	}

	public CustomerModel getCustomer(int id) 
	{
		LOG.info("Getting customer with the id= "+id);
		return (CustomerModel) session.getCurrentSession().get(CustomerModel.class,id);
	}

	@SuppressWarnings("unchecked")
	public List<CustomerModel> getCustomersList() 
	{
		return session.getCurrentSession().createQuery("From Customer").list();
	}

	public void remove(int id) 
	{
		CustomerModel customer=(CustomerModel) session.getCurrentSession().get(CustomerModel.class,id);
		session.getCurrentSession().delete(customer);
	}

}
