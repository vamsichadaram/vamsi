package com.srusti.dao.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.srusti.dao.CustomerDao;
import com.srusti.model.CustomerModel;
import com.srusti.service.impl.FolderService;

@Repository
@Transactional
public class CustomerDaoImpl implements CustomerDao
{
	private static final Logger LOG= Logger.getLogger(CustomerDaoImpl.class);
	
	@Autowired
	private SessionFactory session;
	@Autowired
	private FolderService folderService;
	
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
	
	@Override
	@SuppressWarnings("unchecked")
	public CustomerModel getCustomer(String username)
	{
		List<CustomerModel> customers= new ArrayList<CustomerModel>();
		customers= session.getCurrentSession().createQuery("from LoginModel where username=?").setParameter(0, username).list();
		if(customers.size()>0)
		{
			return customers.get(0);
		}else return null;
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
	
	@SuppressWarnings("unchecked")
	@Override
	public CustomerModel getCustomer(CustomerModel customer)
	{
		Criteria crit= session.getCurrentSession().createCriteria(CustomerModel.class);
		crit.add(Restrictions.eq("username", customer.getUsername()));
		crit.add(Restrictions.eq("password", customer.getPassword()));
		List<CustomerModel> customers= crit.list();
		if(customers.size()>0)
		{
			return customers.get(0);
		}
		else return null;
	}
}
