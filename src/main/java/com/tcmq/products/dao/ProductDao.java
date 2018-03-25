package com.tcmq.products.dao;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.tcmq.products.entity.impl.Product;

@Repository
public interface ProductDao  extends PagingAndSortingRepository<Product, String>{

}
