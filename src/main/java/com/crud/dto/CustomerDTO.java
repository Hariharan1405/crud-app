package com.crud.dto;

public class CustomerDTO {

	private int customerId;
	
	private String customerName;
	
	private String customerEmailId;
	
	private int phoneNumber;

	/**
	 * @param customerId
	 * @param customerName
	 * @param customerEmailId
	 * @param phoneNumber
	 */
	public CustomerDTO(int customerId, String customerName, 
						String customerEmailId, int phoneNumber) {
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerEmailId = customerEmailId;
		this.phoneNumber = phoneNumber;
	}
	
	public CustomerDTO() {
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
		return "CustomerDTO [customerId=" + customerId + ", customerName=" 
				+ customerName + ", customerEmailId="
				+ customerEmailId + ", phoneNumber=" + phoneNumber + "]";
	}
	
	
}
