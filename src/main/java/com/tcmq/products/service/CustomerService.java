package com.tcmq.products.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tcmq.products.dao.CustomerDao;
import com.tcmq.products.entity.impl.Customer;

@RestController
@RequestMapping(value = "/api/customer")
public class CustomerService extends BaseService<Customer, String>{

	public CustomerService(CustomerDao dao) {
		super();
		this.dao = dao;
	}
}
