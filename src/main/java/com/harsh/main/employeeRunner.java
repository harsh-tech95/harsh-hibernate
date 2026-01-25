package com.harsh.main;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.MutationQuery;
import org.hibernate.query.Query;

import com.harsh.confi.empConfiguration;
import com.harsh.entity.Address;
import com.harsh.entity.employee;



public class employeeRunner {

	public static void main(String[] args) {
		

 employee emp = new employee("Harsh mishra","male",200000);
      
 Address add=new Address( "Bareilly","Uttar Predesh");
 
 emp.setAddress(add);
      
      
 Session session =  empConfiguration.getSessionFactory().openSession();
	Transaction tx = session.beginTransaction();
      
//      String hql="update employee set name= :upname where id=:id";
//      
//  MutationQuery query =    session.createMutationQuery(hql);
// 
// query.setParameter("upname","Prem dixit");
// query.setParameter("id", 1);
// 
// query.executeUpdate();
      

//		Query<employee> query =  session.createQuery("From employee",employee.class);
//		
//		
//   
//      System.out.println(query.list());
	
	
	
//     save data........
	
	session.persist(add);
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
