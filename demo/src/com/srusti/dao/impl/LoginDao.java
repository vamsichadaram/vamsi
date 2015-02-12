package com.srusti.dao.impl;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.srusti.dto.LoginForm;
import com.srusti.model.LoginModel;


@Repository
public class LoginDao 
{
	@Autowired
	private SessionFactory session;
	
	public void save(LoginModel model)
	{
		session.getCurrentSession().saveOrUpdate(model);
	}
	@SuppressWarnings("unchecked")
	public LoginForm check(LoginForm login)
	{
		try {
			MessageDigest md5 = MessageDigest.getInstance("MD5");
			md5.update(login.getPassword().getBytes());
			byte[] bytes= md5.digest();
			StringBuilder sb = new StringBuilder();
	        for(int i=0; i< bytes.length ;i++)
	        {
	            sb.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
	        }
	        String pwdhash= sb.toString();
	        LoginModel loginmodel=new LoginModel();
	        loginmodel.setUsername(login.getUsername());
	        loginmodel.setPassword(pwdhash);
	        login.setPassword(pwdhash);
	        
	        Criteria crit= session.getCurrentSession().createCriteria(LoginModel.class);
	        crit.add(Restrictions.eqProperty("username", loginmodel.getUsername()));
	        crit.add(Restrictions.eqProperty("password", loginmodel.getPassword()));
	        List<LoginModel> logins= crit.list();
	        if(logins.size()>0)
	        {
	        	String role=logins.get(0).getRole();
	        	login.setSuccess(true);
	        	if(role=="admin")
	        	{
	        		login.setUser(false);
	        	}
	        	else login.setUser(false);
	        }
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				return login;
	}
}
