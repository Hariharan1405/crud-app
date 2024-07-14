package com.crud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.dto.CustomerDTO;
import com.crud.dto.CustomerSaveDTO;
import com.crud.service.CustomerService;

@RestController
@CrossOrigin
@RequestMapping("/customer")
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	@PostMapping("/save")
	public String saveCustomer(@RequestBody CustomerSaveDTO customerSaveDTO) {
		String id = customerService.addCustomer(customerSaveDTO);
		return id;
	}

}
