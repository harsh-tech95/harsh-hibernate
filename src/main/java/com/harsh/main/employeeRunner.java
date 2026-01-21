package com.harsh.main;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.harsh.confi.empConfiguration;
import com.harsh.entity.employee;


public class employeeRunner {

	public static void main(String[] args) {
		

 employee emp = new employee("Harsh mishra","male",200000);
      
      
      
      
 Session session =  empConfiguration.getSessionFactory().openSession();
	Transaction tx = session.beginTransaction();
      
      
      

		
		
		
      
      
//     save data........
     session.persist(emp);
//      
//      remove data........
//     emp= session.get(employee.class, 1);
//     session.remove(emp);
      
      
//      update data........
//      emp=session.get(employee.class, 1);
//      emp.setName("harsh mishra");
//      emp.setSalary(500);
      
      
//      select data.......
//     emp= session.get(employee.class, 1);
//      System.out.println(emp);
      
      tx.commit();
      
	}

}
