package com.tcmq.products.dao;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.tcmq.products.entity.impl.Customer;

@Repository
public interface CustomerDao extends PagingAndSortingRepository<Customer, String>{

}
