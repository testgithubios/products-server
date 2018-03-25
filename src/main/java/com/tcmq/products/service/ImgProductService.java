package com.tcmq.products.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tcmq.products.dao.ImgProductDao;
import com.tcmq.products.entity.impl.ImgProduct;

@RestController
@RequestMapping(value = "/api/imgProduct")
public class ImgProductService extends BaseService<ImgProduct, String>{

	public ImgProductService(ImgProductDao dao) {
		super();
		this.dao = dao;
	}
}
