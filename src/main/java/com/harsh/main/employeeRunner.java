package com.harsh.main;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.MutationQuery;
import org.hibernate.query.Query;

import com.harsh.confi.empConfiguration;
import com.harsh.entity.Address;
import com.harsh.entity.employee;



public class employeeRunner {

	public static void main(String[] args) {
		

 employee emp = new employee();
 
 emp.setName("harsh");
 emp.setGender("m");
 emp.setSalary(200000);
 
      
 Address add1=new Address();
 add1.setCity("bareilly");
 add1.setState("up");
 add1.setEmployee(emp);
 
 Address add2=new Address();
 add2.setCity("badaun");
 add2.setState("up");
 add2.setEmployee(emp);

 
 Address add3=new Address();
 add3.setCity("sajahapur");
 add3.setState("up");
 add3.setEmployee(emp);

 
 
 ArrayList<Address> listofAddresses = new ArrayList<>();
 
 listofAddresses.add(add1);
 listofAddresses.add(add2);
 listofAddresses.add(add3);
 
emp.setAddresses(listofAddresses); 
 
 
 
 
 
 
 
// emp.setAddress(add);
//
// add.setEmployee(emp);
 
      
      
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
	
//	session.persist(add1);
//	session.persist(add2);
//	session.persist(add3);

//     session.persist(emp);
      
//      remove data........
    
//       emp= session.get(employee.class, 1);
//     session.remove(emp);
      
//      update data........
//      emp=session.get(employee.class, 1);
//      emp.setName("harsh mishra");
//      emp.setSalary(500);
      
      
//      select data.......
//     add=session.find(Address.class, 1);
//     System.out.println(add);
//      System.out.println(add.getEmployee());
	
	
	Address add=session.find(Address.class, 1);
	System.out.println(add);
	System.out.println(add.getEmployee());

      
      tx.commit();
      
	}

	
}
