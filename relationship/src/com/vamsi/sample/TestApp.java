package com.vamsi.sample;

import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.vamsi.model.Department;
import com.vamsi.model.Employee;

public class TestApp 
{	
	public static void main(String[] args) 
	{	
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session= sf.openSession();
		session.beginTransaction();
		
		/*Department dpt1= new Department();
		dpt1.setDepartmentName("database");
		session.save(dpt1);
		
		Employee emp= new Employee();
		emp.setName("srinu");
		
		Employee emp2= new Employee();
		emp2.setName("mahesh");
		
		emp.setDepartment(dpt1);
		emp2.setDepartment(dpt1);
		session.save(emp);
		session.save(emp2);*/
		Integer i=4;
		long s= (long)i;
		Department dep=(Department) session.get(Department.class, s);
		Set<Employee> emps= dep.getEmployees();
		for(Employee e:emps)
		{
			System.out.println(e.getName());
		}
		session.getTransaction().commit();
		
		session.close();
	}
}
