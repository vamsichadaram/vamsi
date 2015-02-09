package com.vamsi.sample;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Component;

import com.vamsi.model.Department;
import com.vamsi.model.Employee;

@Component
public class TestApp 
{	
	public static void main(String[] args) 
	{	
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session= sf.openSession();
		session.beginTransaction();
		
		Department dpt= new Department();
		dpt.setDepartmentName("java");
		session.save(dpt);
		
		Employee emp= new Employee();
		emp.setName("vamsi");
		emp.setDepartment(dpt);
		session.save(emp);
		session.getTransaction().commit();
		session.close();
	}
}
