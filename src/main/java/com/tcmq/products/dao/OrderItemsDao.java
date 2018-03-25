package com.tcmq.products.dao;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.tcmq.products.entity.impl.OrderItems;

@Repository
public interface OrderItemsDao extends PagingAndSortingRepository<OrderItems, String>{

}
