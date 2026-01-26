package com.harsh.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class employee {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String gender;
	private int salary;
	
	@OneToOne
	private Address address;
	 


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



	public Address getAddress() {
		return address;
	}



	public void setAddress(Address address) {
		this.address = address;
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
