package com.tcmq.products.dao;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.tcmq.products.entity.impl.Order;

@Repository
public interface OrderDao extends PagingAndSortingRepository<Order, String>{

}
