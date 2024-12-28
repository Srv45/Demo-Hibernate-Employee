package com.jbk;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee {
	
	@Id
	private int emp_Id;
	private String name;
	private String email;
	private String mobile;
	private String address;

	public Employee() {

	}

	public Employee(int emp_Id, String name, String email, String mobile, String address) {
		super();
		this.emp_Id = emp_Id;
		this.name = name;
		this.email = email;
		this.mobile = mobile;
		this.address = address;
	}

	public int getEmp_Id() {
		return emp_Id;
	}

	public void setEmp_Id(int emp_Id) {
		this.emp_Id = emp_Id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [emp_Id=" + emp_Id + ", name=" + name + ", email=" + email + ", mobile=" + mobile
				+ ", address=" + address + "]";
	}

}
