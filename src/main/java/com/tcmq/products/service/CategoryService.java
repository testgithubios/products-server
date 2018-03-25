package com.tcmq.products.service;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tcmq.products.dao.CategoryDao;
import com.tcmq.products.entity.impl.Category;

@RestController
@RequestMapping(value = "/api/category")
public class CategoryService extends BaseService<Category, String>{
	
	private static final Logger LOG = Logger.getLogger(CategoryService.class);
	
	@Autowired
	CategoryDao categoryDao;
	
	public CategoryService(CategoryDao dao) {
		super();
		this.dao = dao;
	}
}
