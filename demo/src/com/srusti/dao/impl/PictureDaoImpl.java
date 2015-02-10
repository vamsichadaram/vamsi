package com.srusti.dao.impl;

import java.util.Collections;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.srusti.model.CustomerModel;
import com.srusti.model.PictureModel;
import com.srusti.service.CustomerService;

@Repository
@Transactional
public class PictureDaoImpl 
{
	@Autowired
	private SessionFactory session;
	@Autowired
	private CustomerService service;
	
	public void save(PictureModel model)
	{
		session.getCurrentSession().save(model);
	}
	
	public void list()
	{
		
	}
	@SuppressWarnings("unchecked")
	public List<PictureModel> getbyIdCategory(int customerid,String category)
	{
		CustomerModel customer=service.getCustomer(customerid);
		String query="From PictureModel where customer:customer and category:category";
		/*Criteria crit= session.getCurrentSession().createCriteria("From PictureModel");
		crit.add(Restrictions.eq("customer", customer));
		crit.add(Restrictions.eq("category",category));
		List<PictureModel> pictures= crit.list();*/
		List<PictureModel> pictures=session.getCurrentSession().createQuery(query).setParameter("customer", customer).setParameter("category", category).list();
		if(pictures.size()>0)
		{
			return pictures;
		}
		return Collections.EMPTY_LIST;
	}
}
