package com.tcmq.products.dao;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.tcmq.products.entity.impl.ImgProduct;

@Repository
public interface ImgProductDao  extends PagingAndSortingRepository<ImgProduct, String>{

}
