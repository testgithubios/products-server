package com.tcmq.products.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tcmq.products.dao.ProductDao;
import com.tcmq.products.entity.impl.Product;

@RestController
@RequestMapping(value = "/api/product")
public class ProductService extends BaseService<Product, String>{

	public ProductService(ProductDao dao) {
		super();
		this.dao = dao;
	}
}
