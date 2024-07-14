package com.crud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.dto.CustomerSaveDTO;
import com.crud.entity.Customer;
import com.crud.repository.CustomerRepo;

@Service
public class CustomerSericeImpl implements CustomerService{

	@Autowired
	private CustomerRepo customerRepo;
	
	@Override
	public String addCustomer(CustomerSaveDTO customerSaveDTO) {
		Customer customer = new Customer(
				
				customerSaveDTO.getCustomerName(),
				customerSaveDTO.getCustomerEmailId(),
				customerSaveDTO.getPhoneNumber()
				);
		customerRepo.save(customer);
		return customer.getCustomerName();
	}


}
