package com.tcmq.products.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.tcmq.products.entity.impl.Category;

@Repository
public interface CategoryDao extends PagingAndSortingRepository<Category, String>{
	
	@Query("Select c from Category as c where c.parentId = null")
	List<Category> getParentCategories();
	
	@Query("Select c from Category as c where c.parentId = ?1")
	List<Category> getChildrenCategories(Long parentId);
}
