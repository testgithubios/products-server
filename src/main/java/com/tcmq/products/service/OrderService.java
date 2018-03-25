package com.tcmq.products.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tcmq.products.dao.OrderDao;
import com.tcmq.products.entity.impl.Order;

@RestController
@RequestMapping(value = "/api/order")
public class OrderService extends BaseService<Order, String>{

	public OrderService(OrderDao dao) {
		super();
		this.dao = dao;
	}
}
