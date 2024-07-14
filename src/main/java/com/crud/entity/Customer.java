package com.crud.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="customer_details")
public class Customer {
	
	@Id
	@Column(name ="customer_id", length=10)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int customerId;
	
	@Column(name ="customer_name", length=30)
	private String customerName;
	
	@Column(name ="cust_email", length=30)
	private String customerEmailId;
	
	@Column(name ="cust_phonenum", length=15)
	private int phoneNumber;
	
	public Customer(int customerId, String customerName, 
					String customerEmailId, int phoneNumber) {
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerEmailId = customerEmailId;
		this.phoneNumber = phoneNumber;
	}
	
	public Customer() {
	}
	
	public Customer(String customerName, 
			        String customerEmailId, int phoneNumber) {
		this.customerName = customerName;
		this.customerEmailId = customerEmailId;
		this.phoneNumber = phoneNumber;
	}
	

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerEmailId() {
		return customerEmailId;
	}

	public void setCustomerEmailId(String customerEmailId) {
		this.customerEmailId = customerEmailId;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" 
	            + customerName + ", customerEmailId="
				+ customerEmailId + ", phoneNumber=" + phoneNumber + "]";
	}
	
}
