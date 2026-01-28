package com.harsh.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class employee {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String gender;
	private int salary;
	
	@OneToMany (cascade = CascadeType.ALL)
	private List<Address> addresses;
	 


	public employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public employee( String name, String gender, int salary) {
		super();
//		this.id = id;
		this.name = name;
		this.gender = gender;
		this.salary = salary;
	}











	public List<Address> getAddresses() {
		return addresses;
	}



	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}



	@Override
	public String toString() {
		return "employee [id=" + id + ", name=" + name + ", gender=" + gender + ", salary=" + salary + "]";
	}



	
	
	
	

	
	
	
	
}
