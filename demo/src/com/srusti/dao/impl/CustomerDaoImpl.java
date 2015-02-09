package com.srusti.dao.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.srusti.dao.CustomerDao;
import com.srusti.model.CustomerModel;

import java.util.*;

@Repository
@Transactional
public class CustomerDaoImpl implements CustomerDao
{
	private static final Logger LOG= Logger.getLogger(CustomerDaoImpl.class);
	
	@Autowired
	private SessionFactory session;
	
	public void save(CustomerModel customer) 
	{
		session.getCurrentSession().saveOrUpdate(customer);
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
		List<CustomerModel> customers= session.getCurrentSession().createQuery("From CustomerModel").list();
		if(customers.size()>0)
		{
			return customers;
		}
		else return Collections.EMPTY_LIST;
	}
	
	public void remove(int id) 
	{
		CustomerModel customer=(CustomerModel) session.getCurrentSession().get(CustomerModel.class,id);
		session.getCurrentSession().delete(customer);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<CustomerModel> getActiveCustomersList() 
	{
		String hql="from CustomerModel where active=:status";
		List<CustomerModel> customers= session.getCurrentSession().createQuery(hql).setParameter("status", true).list();
		if(customers.size()>0)
		{
			return customers;
		}
		return Collections.EMPTY_LIST;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<CustomerModel> getInactiveCustomersList() {
		String hql="from CustomerModel where active=:status";
		List<CustomerModel> customers= session.getCurrentSession().createQuery(hql).setParameter("status", false).list();
		if(customers.size()>0)
		{
			return customers;
		}
		return Collections.EMPTY_LIST;
	}

}
