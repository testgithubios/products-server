package com.tcmq.products.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tcmq.products.dao.OrderItemsDao;
import com.tcmq.products.entity.impl.OrderItems;

@RestController
@RequestMapping(value = "/api/orderItems")
public class OrderItemsService extends BaseService<OrderItems, String>{

	public OrderItemsService(OrderItemsDao dao) {
		super();
		this.dao = dao;
	}
}
